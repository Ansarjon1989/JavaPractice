package dataBase2;


import practice4.oop.classwork.Execution;

import java.io.IOException;
import java.sql.*;

public class DataBaseConnectivity {

    private static Connection connection;
    private static Statement statement;

    public static ResultSet getTable(String query) throws ClassNotFoundException, SQLException, IOException {


        String username = FileUtils.getPropertiyFilePath("src/dataBase/lib/config.properties","username");
        String password = FileUtils.getPropertiyFilePath("src/dataBase/lib/config.properties","password");
        String dbName = FileUtils.getPropertiyFilePath("src/dataBase/lib/config.properties","dbName");

        String url = "jdbc:mysql://localhost:3306/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

         connection = DriverManager.getConnection(url, username, password);
         statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }


    public static void main(String[] args)  {

        String query = "select * from peoplentech.students";
        try {
        ResultSet resultSet = getTable(query);
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String location = resultSet.getString("location");
            System.out.println(id + " " + name + " " + location);
        }

        }catch (Exception e ){
            System.out.println("There was an exception. Please review.");
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                System.out.println("comment : statement close");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                System.out.println("comment : connection close");
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}




