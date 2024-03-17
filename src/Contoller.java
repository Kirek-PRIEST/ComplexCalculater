public class Contoller {
    private static double[] parts(String lex) {
        String[] parts = lex.substring(0, lex.length() - 1).split("(?<=\\d)");
        double[] result = new double[2];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
    public String adding(String firstLex, String secondLex){
        return Calculating.summ(parts(firstLex), parts(secondLex));

    }
    public String subtracting(String firstLex, String secondLex) {
        return Calculating.subtraction(parts(firstLex), parts(secondLex));
    }
    public String multiplication(String firstLex, String secondLex) {
        return Calculating.multiplication(parts(firstLex), parts(secondLex));
    }
    public String division(String firstLex, String secondLex) {
        return Calculating.division(parts(firstLex), parts(secondLex));
    }
}

