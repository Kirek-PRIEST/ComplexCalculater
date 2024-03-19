package complexCalculator.strategys;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Subtracting implements Operations {

    double real1;
    double real2;
    double imagin1;
    double imagin2;
    int numsAfterDot;

    public Subtracting(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        this.real1 = real1;
        this.real2 = real2;
        this.imagin1 = imagin1;
        this.imagin2 = imagin2;
        this.numsAfterDot = numsAfterDot;
    }

    @Override
    public void calculate(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        double p1 = real1 - real2;
        double p2 = imagin1 - imagin2;
        System.out.println(ToPrintResult.forResult(p1, p2, numsAfterDot));
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
