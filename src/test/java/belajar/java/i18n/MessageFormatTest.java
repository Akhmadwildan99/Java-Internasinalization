package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class MessageFormatTest {
    @Test
    void testMessageFormat() {
        var local = new Locale("in", "ID");
        var resourceBundle = ResourceBundle.getBundle("message", local);
        var pattern = resourceBundle.getString("message");

        var message = new MessageFormat(pattern);
        var format = message.format(new Object[]{
               "Wildan",
               "Dufan"
        });

        System.out.println(format);
    }
}
