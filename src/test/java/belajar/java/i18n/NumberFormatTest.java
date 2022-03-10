package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest {
    @Test
    void testNumberFormat() {
        var numberFormat = java.text.NumberFormat.getInstance();
        var format = numberFormat.format(1000000.34);
        System.out.println(format);
    }

    @Test
    void testNumberFormatIndonesia() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = java.text.NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(1000000.34);
        System.out.println(format);
    }

    @Test
    void testNumberFormatParsing() {
        var indonesia = new Locale("in", "ID");
        var numberFormat = java.text.NumberFormat.getInstance(indonesia);
        var format = numberFormat.format(1000000.34);
        System.out.println(format);

        try {
            var parsing = numberFormat.parse("1000.000.000");
            System.out.println(parsing);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
