package dataBase2;


import java.io.IOException;
import java.sql.*;

public class DBUtils {

    private static Connection connection;
    private static Statement statement;

    public static ResultSet getTableByQuery(String query) throws ClassNotFoundException, SQLException, IOException {


        String username = FileUtils.getPropertiyFilePath("src/dataBase/lib/config.properties", "username");
        String password = FileUtils.getPropertiyFilePath("src/dataBase/lib/config.properties", "password");
        String dbName = FileUtils.getPropertiyFilePath("src/dataBase/lib/config.properties", "dbName");

        String url = "jdbc:mysql://localhost:3306/" + dbName;

        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        return resultSet;
    }


    public static void cleanupDatabase() {
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





