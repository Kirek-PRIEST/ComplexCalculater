package complexCalculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ToPrintResult {
    private static String decimal(double d, int toRound) { //устанавливает количество цифр после запятой
        BigDecimal result = new BigDecimal(d);
        result = result.setScale(toRound, RoundingMode.HALF_EVEN);
        return String.valueOf(result);
    }
    public static StringBuilder forResult(double[] resultArray, int numsAfterDot) {
        StringBuilder result;
        result = (new StringBuilder());
        if (resultArray[1] == 0) {
            result.append(decimal(resultArray[0], numsAfterDot));
        } else if (resultArray[1] == 1) {
            result.append(decimal(resultArray[0], numsAfterDot)).append("+").append("i");
        } else if (resultArray[1] > 1 || resultArray[1] > 0 && resultArray[1] < 1) {
            result.append(decimal(resultArray[0], numsAfterDot)).append("+").append(decimal(resultArray[1], numsAfterDot)).append("i");
        } else {
            result.append(decimal(resultArray[0], numsAfterDot)).append(decimal(resultArray[1], numsAfterDot)).append("i");
        }
        return result;
    }
}
