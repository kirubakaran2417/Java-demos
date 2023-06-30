package propertyDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyfilereader {

    public static String getProperty(String propertykey){
        FileInputStream fis=null;
        Properties prop=null;
        try {
           fis = new FileInputStream("D:\\Workspaces\\UK\\JavaDemos\\src\\main\\resources\\Configuration.properties");
            prop = new Properties();
            prop.load(fis);
        }catch(IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(propertykey);

    }
}
