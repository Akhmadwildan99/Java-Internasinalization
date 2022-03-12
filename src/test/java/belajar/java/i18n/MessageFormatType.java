package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatType {
    @Test
    void testMessageFormatType() {
        var locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String result = messageFormat.format(new Object[]{
                "Wildan",
                new Date(),
                1000000
        });
        System.out.println(result);
    }

    @Test
    void testMessageFormatTypeIndonesia() {
        var locale = new Locale("in", "ID");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("message", locale);
        String pattern = resourceBundle.getString("status");

        MessageFormat messageFormat = new MessageFormat(pattern, locale);
        String result = messageFormat.format(new Object[]{
                "Wildan",
                new Date(),
                1000000
        });
        System.out.println(result);
    }
}
