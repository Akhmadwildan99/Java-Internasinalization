package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class LocaleTest {
    @Test
    void testLocal() {
        var language = "id";
        var country = "ID";
        var local = new Locale(language, country);

        System.out.println(local.getLanguage());
        System.out.println(local.getCountry());

        System.out.println(local.getDisplayLanguage());
        System.out.println(local.getDisplayCountry());
    }
}
