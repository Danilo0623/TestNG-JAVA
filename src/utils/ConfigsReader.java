package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigsReader {
    public static void readProperties(String filePath){

        /**
         * This method reads any given property file
         *         @param filePath
         *          @return Properties
         */
        try {
                FileInputStream inputStream = new FileInputStream(filePath);
                Properties properties = new Properties();
                properties.load(inputStream);
                //browser = properties.get("browser").toString();
//                url = properties.get("url").toString();
//                username = properties.get("username").toString();
//                password = properties.get("password").toString();
//                inputStream.close();
            } catch (FileNotFoundException exception) {
                exception.printStackTrace();
            }catch (IOException e){
            e.printStackTrace();
        }
    }

}
