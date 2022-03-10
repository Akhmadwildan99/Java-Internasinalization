package belajar.java.i18n;

import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class CurrencyTest {
    @Test
    void testCurrency() {
        var indonesia = new Locale("in", "ID");
        Currency currency = Currency.getInstance(indonesia);
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getNumericCode());
        System.out.println(currency.getSymbol());
    }

    @Test
    void testCurrencyUSA() {
        var america = new Locale("en", "US");
        Currency currency = Currency.getInstance(america);
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getNumericCode());
        System.out.println(currency.getSymbol());

        var duitAmerika = NumberFormat.getCurrencyInstance(america);
        String format = duitAmerika.format(100000000);
        System.out.println(format);
    }

    @Test
    void testCurrencyParse()  {
        var america = new Locale("en", "US");
        Currency currency = Currency.getInstance(america);
        System.out.println(currency.getDisplayName());
        System.out.println(currency.getNumericCode());
        System.out.println(currency.getSymbol());

        var duitAmerika = NumberFormat.getCurrencyInstance(america);
        String format = duitAmerika.format(100000000);
        System.out.println(format);

        Number parsing = null;
        try {
            parsing = duitAmerika.parse("1000,000,000");
        } catch (ParseException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        System.out.println(parsing);
    }

}
