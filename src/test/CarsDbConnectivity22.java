package test;

import java.sql.*;
import java.util.ArrayList;

public class CarsDbConnectivity22 {

    public static ResultSet getTable(String query) throws SQLException {

        String username= "root";
        String password = "abcd1234";
        String dbName = "CarInfo";

        String url = "jdbc:mysql://localhost:3306/"+dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }

    public static void main(String[] args) throws SQLException {

        String query = "select * from cars.carInfo";
        ResultSet resultSet =getTable(query);

        ArrayList<ArrayList<Object>> airportInfo = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String nameOfAirport = resultSet.getString("name");
            String year = resultSet.getString("year");
            String price = resultSet.getString("price");

            ArrayList<Object> airports = new ArrayList<>();
            airports.add(id);
            airports.add(nameOfAirport);
            airports.add(year);
            airports.add(price);


            airportInfo.add(airports);
        }

        System.out.println(airportInfo);
    }
}
