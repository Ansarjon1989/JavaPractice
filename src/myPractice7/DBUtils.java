package myPractice7;

import java.io.IOException;
import java.sql.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;
    private static ResultSet resultSet;


    public static ResultSet getTable(String query) throws SQLException, ClassNotFoundException, IOException {

        String username = FileUtils.getPropertyFromFile("src/myPractice7/lib/config.properties", "username");
        String password = FileUtils.getPropertyFromFile("src/myPractice7/lib/config.properties", "password");
        String dbName = FileUtils.getPropertyFromFile("src/myPractice7/lib/config.properties", "dbName");

        String url = "jdbc:mysql://localhost:3306/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
        resultSet = statement.executeQuery(query);


        return resultSet;
    }

    public static void main(String[] args) {

        try {
            String query = "select * from carInfo";
            ResultSet resultSet = getTable(query);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("nae");
                int year = resultSet.getInt("year");
                int price = resultSet.getInt("price");
                System.out.println(id + " " + name + " " + year + " " + price);
            }
            } catch (Exception e ){
            System.out.println("There was exception. please review :");
            e.printStackTrace();
        }finally {
            try {
                connection.close();
                System.out.println("Connection close.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            try {
                statement.close();
                System.out.println("Statement close.");
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
          
          
        }

    }
