package utils;

import java.io.*;
import java.util.Properties;

public class ConfigPropertyReader {

    private static Properties properties;
    private static final String PATH = "config.properties";


    static {
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH));
            properties = new Properties();
            properties.load(bufferedReader);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }





    public static String getProperty(String key){
        return properties.getProperty(key);
    }

}


