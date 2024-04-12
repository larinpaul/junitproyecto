import java.math.BigDecimal;

public class MoneyUtil {

    public static String format(double money) {
        BigDecimal rounded = BigDecimal.valueOf(money).setScale(2, BigDecimal.ROUND_HALF_EVEN); // Decprecated, better use RoundingMode.HALF_EVEN
        return "$" + rounded;
    }

}
