package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourcesBundleTest {
    @Test
    void testResourceBundle() {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message");
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    @Test
    void testResourceBundleI18n() {
        var indonesia = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", indonesia);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

    /**
     * Jika object locale dengan parameter bahasa dan negara, namaun
     * di dalam resource tidak terdapat file propertiesnya, maka
     * ResourceBundle akan mengambil data dari root file properties-nya,
     *
     * Dan seberapa banyak pun kita membuat object ResourceBundle dengan
     * parameter yang sama,
     * ResourceBundle akan megeksekusi hanya object yang pertama
     */
    @Test
    void testResourceBundleNotFound() {
        var USA = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", USA);
        System.out.println(resourceBundle.getString("hello"));
        System.out.println(resourceBundle.getString("goodbye"));
    }

}
