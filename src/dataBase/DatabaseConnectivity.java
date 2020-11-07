package dataBase;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnectivity {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String username = "root";
        String password = "abcd1234";
        String dbName = "peoplentech";
        String query = "select * from peoplentech.students";

        String url= "jdbc:mysql://localhost:3306/"+dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        ArrayList<ArrayList<Object>> allStudents = new ArrayList<>();

        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");

            ArrayList<Object> student = new ArrayList<>();
            student.add(id);
            student.add(name);
            student.add(location);

          allStudents.add(student);
        }

        System.out.println(allStudents);
    }
}
