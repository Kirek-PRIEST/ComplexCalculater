package complexCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculating {


    public static String adding(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        double p1 = real1 + real2;
        double p2 = imagin1 + imagin2;
        return String.valueOf(forResult(p1, p2, numsAfterDot));
    }

    public static String subtraction(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        double p1 = real1 - real2;
        double p2 = imagin1 - imagin2;
        return String.valueOf(forResult(p1, p2, numsAfterDot));

    }

    public static String multiplication(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        double p1 = real1 * real2 - imagin1 * imagin2;
        double p2 = imagin1 * real2 + real1 * imagin2;

        return String.valueOf(forResult(p1, p2, numsAfterDot));
    }

    public static String division(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {

        double v = Math.pow(real2, 2) + Math.pow(imagin2, 2);
        double p1 = (real1 * real2 + imagin1 * imagin2) / v;
        double p2 = (imagin1 * real2 - real1 * imagin2) / v;
        return String.valueOf(forResult(p1, p2, numsAfterDot));

    }

    private static String decimal(double d, int toRound) { //устанавливает количество цифр после запятой
        BigDecimal result = new BigDecimal(d);
        result = result.setScale(toRound, RoundingMode.HALF_EVEN);
        return String.valueOf(result);
    }

    private static StringBuilder forResult(double p1, double p2, int numsAfterDot) {
        StringBuilder result;
        result = (new StringBuilder());
        if (p2 == 0) {
            result.append(decimal(p1, numsAfterDot));
        } else if (p2 == 1) {
            result.append(decimal(p1, numsAfterDot)).append(" + ").append("i");
        } else if (p2 > 1 || p2 > 0 && p2 < 1) {
            result.append(decimal(p1, numsAfterDot)).append(" + ").append(decimal(p2, numsAfterDot)).append("i");
        } else {
            result.append(decimal(p1, numsAfterDot)).append(decimal(p2, numsAfterDot)).append("i");
        }
        return result;
    }
}
