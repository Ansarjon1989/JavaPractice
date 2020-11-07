package dataBase;


import java.io.IOException;
import java.sql.*;

public class DataBaseConnectivity2 {


    public static ResultSet getTable(String query) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "abcd1234";
        String dbName = "peoplentech";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }


    public static void main(String[] args) throws IOException, SQLException, ClassNotFoundException {

        String query = "select * from peoplentech.students";
        ResultSet resultSet = getTable(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");
            System.out.println(id + " " + name + " " + location);
        }
    }
}




