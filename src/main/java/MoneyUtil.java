import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyUtil {

    public static String format(double money) throws IllegalAccessException {
        return format(money, "$");
    }

    public static String format(double money, String symbol) throws IllegalAccessException {
        if (symbol == null) {
            throw new IllegalAccessException();
        }
        if (money < 0) {
            symbol = "-" + symbol;
            money = money * (-1);
        }
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_EVEN); // Decprecated, better use RoundingMode.HALF_EVEN
//        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, RoundingMode.HALF_EVEN);
        return symbol + rounded;
    }

}
