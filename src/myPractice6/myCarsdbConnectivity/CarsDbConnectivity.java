package myPractice6.myCarsdbConnectivity;

import java.sql.*;
import java.util.ArrayList;

public class CarsDbConnectivity {


    public static void main(String[] args) throws SQLException {


        String username= "root";
        String password = "abcd1234";
        String dbName = "Cars";
        String query = "select * from carInfo";
        String url = "jdbc:mysql://localhost:3306/"+dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        ArrayList<ArrayList<Object>> airportInfo = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int year = resultSet.getInt("year");
            int price = resultSet.getInt("price");

            ArrayList<Object> airports = new ArrayList<>();
            airports.add(id);
            airports.add(name);
            airports.add(year);
            airports.add(price);


            airportInfo.add(airports);
        }

        System.out.println(airportInfo);
    }
}
