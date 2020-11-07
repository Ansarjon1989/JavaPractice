package myPractice6.airports.lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {

    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/myCarsdbConnectivity/lib/config_properties");

        properties.load(inputStream);

        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String dbName = properties.getProperty("dbName");

        System.out.println(username+" "+password+" "+dbName);


    }
}
