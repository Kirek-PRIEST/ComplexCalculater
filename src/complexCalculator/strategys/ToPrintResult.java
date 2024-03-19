package complexCalculator.strategys;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ToPrintResult {
    private static String decimal(double d, int toRound) { //устанавливает количество цифр после запятой
        BigDecimal result = new BigDecimal(d);
        result = result.setScale(toRound, RoundingMode.HALF_EVEN);
        return String.valueOf(result);
    }
    public static StringBuilder forResult(double p1, double p2, int numsAfterDot) {
        StringBuilder result;
        result = (new StringBuilder());
        if (p2 == 0) {
            result.append(decimal(p1, numsAfterDot));
        } else if (p2 == 1) {
            result.append(decimal(p1, numsAfterDot)).append("+").append("i");
        } else if (p2 > 1 || p2 > 0 && p2 < 1) {
            result.append(decimal(p1, numsAfterDot)).append("+").append(decimal(p2, numsAfterDot)).append("i");
        } else {
            result.append(decimal(p1, numsAfterDot)).append(decimal(p2, numsAfterDot)).append("i");
        }
        return result;
    }
}
