import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @author xuhao
 * @date 2022/5/26-16:36
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        mystore();
        myload();

    }

    private static void myload() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileReader("src/main/resources/prop.txt"));
        System.out.println(prop);
    }

    private static void mystore() throws IOException {
        Properties prop=new Properties();
        prop.setProperty("xuhai", "23");
        prop.setProperty("xuhao", "23");
        prop.setProperty("xuhi", "26");
        FileWriter fr=new FileWriter("src/main/resources/prop.txt");
        prop.store(fr,null);
        fr.close();

    }
}
