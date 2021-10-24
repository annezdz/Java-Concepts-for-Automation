package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestCase1 {

    public static void main(String[] args) throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src/config/object.properties");
        prop.load(fis);

        System.out.println(prop.get("name"));
        System.out.println(prop.get("age"));
        System.out.println(prop.get("course"));

        /* Antes do Page Object Pattern eram assim as automações, criava-se um properties com todos os xpath de cada pagina
        * e instanciava ele dessa forma */
    }
}
