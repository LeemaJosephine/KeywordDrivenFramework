package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObjects {

	Properties p = new Properties();
    public Properties getObjectRepository() throws IOException{
        //Read object repository file
        InputStream stream = new FileInputStream(new File("C:\\Users\\Digital Suppliers\\eclipse-workspace\\KeywordDrivenProject\\src\\test\\java\\objects\\object.properties"));
        //load all objects
        p.load(stream);
         return p;
    }
}
