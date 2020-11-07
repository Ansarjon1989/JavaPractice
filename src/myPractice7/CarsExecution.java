//package myPractice7;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class CarsExecution {
//
//    public static void main(String[] args) {
//
//        try {
//            String query = "select * from carInfo";
//            ResultSet resultSet = getTable(query);
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("nae");
//                int year = resultSet.getInt("year");
//                int price = resultSet.getInt("price");
//                System.out.println(id + " " + name + " " + year + " " + price);
//            }
//        } catch (Exception e ){
//            System.out.println("There was exception. please review :");
//            e.printStackTrace();
//        }finally {
//            try {
//                connection.close();
//                System.out.println("Connection close.");
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//            try {
//                statement.close();
//                System.out.println("Statement close.");
//            } catch (SQLException throwables) {
//                throwables.printStackTrace();
//            }
//        }
//
//
//    }
//}
