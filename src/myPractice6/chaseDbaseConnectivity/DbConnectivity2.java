package myPractice6.chaseDbaseConnectivity;


import java.sql.*;
import java.util.ArrayList;

public class DbConnectivity2 {


    public static ResultSet getTable(String query) throws SQLException {

        String username = "root";
        String password = "abcd1234";
        String dbName = "Bank";
        String url = "jdbc:mysql://localhost:3306/" + dbName;

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

        String query = "SELECT * FROM bank.chase ";
        ResultSet resultSet = getTable(query);


        ArrayList<ArrayList<Object>> empInfo = new ArrayList<>();
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            String last_name = resultSet.getString("last_name");
            String salary = resultSet.getString("salary");

            ArrayList<Object> employee = new ArrayList<>();
            employee.add(id);
            employee.add(name);
            employee.add(last_name);
            employee.add(salary);

            empInfo.add(employee);
        }

        System.out.println(empInfo);

    }


}
