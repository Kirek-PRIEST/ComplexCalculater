public class Calculating {


    public  static String summ(double[] parts, double[] parts1) {
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
    public static String division (double[] parts, double[] parts1) {
        StringBuilder result;
        result = (new StringBuilder());
        if (((parts[1] * parts1[0] + parts[0]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2))) >= 0) {
            result.append((parts[0] * parts1[0] + parts[1]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2))).append(" + ")
                    .append((parts[1] * parts1[0] + parts[0]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2))).append("i");
            return String.valueOf(result);
        } else {
            result.append((parts[0] * parts1[0] + parts[1]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2)))
                    .append((parts[1] * parts1[0] + parts[0]* parts1[1]) / (Math.pow(parts1[0],2) + Math.pow(parts1[1], 2))).append("i");
        }
        return String.valueOf(result);
    }

}
