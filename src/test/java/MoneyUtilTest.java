import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void moneyTest() {
        System.out.println("A ver si funciona correctamente...");

        String money = MoneyUtil.format(1000);
//        Assert.assertEquals("$1000.0");
        Assert.assertEquals("$1000.00", money);

        System.out.println("Si, lo funciono bien...");
    }

    @Test
    public void negativeMoneyTest() {
        String money = MoneyUtil.format(-1000.0);
        Assert.assertEquals("-$1000.00", money);
    }

    @Test
    public void negativeEuroMoneyTest() {
        String money = MoneyUtil.format(-1000.0, "€");
        Assert.assertEquals("-€1000.00", money);
    }

    @Test
    public void euroMoneyTest() {
        String money = MoneyUtil.format(1000.0, "€");
        Assert.assertEquals("€1000.00", money);
    }

}
