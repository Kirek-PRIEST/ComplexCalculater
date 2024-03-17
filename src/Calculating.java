import java.math.BigDecimal;
import java.math.RoundingMode;

public class Calculating {


    public  static String adding(double[] parts, double[] parts1) {
        StringBuilder result;

        result = (new StringBuilder());
        if (parts[1] + parts1[1] >= 0) {
            result.append(parts[0] + parts1[0]).append("+").append(parts[1] + parts1[1]).append("i");
            return String.valueOf(result);
        } else {
            result.append(parts[0] + parts1[0]).append(parts[1] + parts1[1]).append("i");
        }
        return String.valueOf(result);
    }
    public static String subtraction(double[] parts, double[] parts1) {
        StringBuilder result;
        result = (new StringBuilder());
        if (parts[1] - parts1[1] >= 0) {
            result.append(parts[0] - parts1[0]).append("+").append(parts[1] - parts1[1]).append("i");
            return String.valueOf(result);
        } else {
            result.append(parts[0] - parts1[0]).append(parts[1] - parts1[1]).append("i");
        }
        return String.valueOf(result);
    }
    public static String multiplication(double[] parts, double[] parts1) {
        StringBuilder result;
        result = (new StringBuilder());
        if ((parts[1] - parts1[0]) + (parts[0]* parts1[1]) >= 0) {
            result.append(parts[0] * parts1[0] - parts[1]* parts1[1]).append("+").append(parts[1] * parts1[0] + parts[0]* parts1[1]).append("i");
            return String.valueOf(result);
        } else {
            result.append(parts[0] * parts1[0] - parts[1]* parts1[1]).append((parts[1] * parts1[0]) + (parts[0]* parts1[1])).append("i");
        }
        return String.valueOf(result);
    }
    public static String division (double[] parts, double[] parts1, int numsAfterDot) {
        StringBuilder result;
        result = (new StringBuilder());
        double p1 =(parts[0] * parts1[0] + parts[1]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2));
        double p2 = (parts[1] * parts1[0] - parts[0]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2));
        if (p2 >= 0) {
            result.append(decimal(p1, numsAfterDot)).append(" + ").append(decimal(p2, numsAfterDot));
            return String.valueOf(result);
        } else {
            result.append(decimal(p1, numsAfterDot)).append(decimal(p2, numsAfterDot));
        }
        return String.valueOf(result);
    }
    private static String decimal(double d, int toRound){
        BigDecimal result = new BigDecimal(d);
        result = result.setScale(toRound, RoundingMode.HALF_EVEN);
        return String.valueOf(result);
    }
}
