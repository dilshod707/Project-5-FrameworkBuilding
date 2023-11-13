package misc.propertyreader;

import utils.ConfigPropertyReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

    public static void main(String[] args) throws IOException {
        //FileReader fr = new FileReader("/Users/Dave/IdeaProjects/Project-5-FrameworkBuilding/config.properties");
//        FileInputStream fis = new FileInputStream("config.properties");
//        Properties property = new Properties();
//        property.load(fis);
        BufferedReader bufferedReader = new BufferedReader(new FileReader("config.properties"));
        Properties property = new Properties();
        property.load(bufferedReader);

        String url = property.getProperty("url");
        System.out.println(property.getProperty("browser"));
        System.out.println(property.getProperty(url));
        System.out.println(ConfigPropertyReader.getProperty("implicit.wait"));

        String prop= ConfigPropertyReader.getProperty("url");

        System.out.println(prop);
        System.out.println(property);




    }
}
