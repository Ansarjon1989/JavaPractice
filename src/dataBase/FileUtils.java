package dataBase;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/dataBase/lib/config.properties");
        properties.load(inputStream);

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String dbName = properties.getProperty("dbName");

        System.out.println(username+" "+password+" "+dbName);



        Properties properties2 = new Properties();
        InputStream inputStream2 = new FileInputStream("src/dataBase/lib/test.properties");
        properties2.load(inputStream2);

        String id = properties2.getProperty("id");
        String name = properties2.getProperty("name");
        String address = properties2.getProperty("address");

        System.out.println(id+" "+name+" "+address);
    }
}
