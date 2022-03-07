package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
    @Test
    void testDateFormat() {
        String pattern = "EEEE dd MMMM yyyy";
        var dateFormat = new SimpleDateFormat(pattern);
        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    void testDateFormatIndonesia() {
        String pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);
        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    void testDateFormatJapan() {
        String pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);
        System.out.println(dateFormat.format(new Date()));
    }

    @Test
    void testDateFormatParseIndonesia() {
        String pattern = "EEEE dd MMMM yyyy";
        var indonesia = new Locale("in", "ID");
        var dateFormat = new SimpleDateFormat(pattern, indonesia);
        String format = dateFormat.format(new Date());
        System.out.println(format);

        Date parse = null;
        try {
            parse = dateFormat.parse("Senin 07 Maret 2022");
        } catch (ParseException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(parse);
    }

    @Test
    void testDateFormatParseJapan() throws ParseException {
        String pattern = "EEEE dd MMMM yyyy";
        var japan = new Locale("ja", "JP");
        var dateFormat = new SimpleDateFormat(pattern, japan);
        String format = dateFormat.format(new Date());
        System.out.println(format);

        Date parse = dateFormat.parse("月曜日 07 3月 2022");
        System.out.println(parse);
    }
}
