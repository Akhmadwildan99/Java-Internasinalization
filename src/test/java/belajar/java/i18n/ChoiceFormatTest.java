package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.ChoiceFormat;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class ChoiceFormatTest {
    @Test
    void testChoiceFormat() {
        var locale = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        var pattern = resourceBundle.getString("format");
        var messageFormat = new MessageFormat(pattern, locale);
        var format =messageFormat.format(new Object[]{-10000});
        System.out.println(format);
    }

    @Test
    void testChoiceFormatAmerica() {
        var locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        var pattern = resourceBundle.getString("format");
        var messageFormat = new MessageFormat(pattern, locale);
        var format =messageFormat.format(new Object[]{10000});
        System.out.println(format);
    }
}
