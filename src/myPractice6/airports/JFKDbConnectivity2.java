package myPractice6.airports;

import java.sql.*;
import java.util.ArrayList;

public class JFKDbConnectivity2 {

    public static ResultSet getTable(String query) throws SQLException {

        String username= "root";
        String password = "abcd1234";
        String dbName = "airport";

        String url = "jdbc:mysql://localhost:3306/"+dbName;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url,username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }

    public static void main(String[] args) throws SQLException {

        String query = "select * from airport.new_york_airport";
       ResultSet resultSet =getTable(query);

        ArrayList<ArrayList<Object>> airportInfo = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt("id");
            String nameOfAirport = resultSet.getString("name_of_airport");
            String terminal = resultSet.getString("terminal");
            String location = resultSet.getString("location");

            ArrayList<Object> airports = new ArrayList<>();
            airports.add(id);
            airports.add(nameOfAirport);
            airports.add(terminal);
            airports.add(location);


            airportInfo.add(airports);
        }

        System.out.println(airportInfo);
    }

}
