public class Calculating {


    public String summ(String firstLex, String secondLex) {
        StringBuilder result;
        int[] parts = parts(firstLex);
        int[] parts1 = parts(secondLex);
        result = (new StringBuilder());
        if (parts[1] + parts1[1] >= 0) {
            result.append(parts[0] + parts1[0]).append("+").append(parts[1] + parts1[1]).append("i");
            return String.valueOf(result);
        } else {
            result.append(parts[0] + parts1[0]).append(parts[1] + parts1[1]).append("i");
        }
        return String.valueOf(result);
    }
    public String subtracting(String firstLex, String secondLex) {
        StringBuilder result;
        int[] parts = parts(firstLex);
        int[] parts1 = parts(secondLex);
        result = (new StringBuilder());
        if (parts[1] - parts1[1] >= 0) {
            result.append(parts[0] - parts1[0]).append("+").append(parts[1] - parts1[1]).append("i");
            return String.valueOf(result);
        } else {
            result.append(parts[0] - parts1[0]).append(parts[1] - parts1[1]).append("i");
        }
        return String.valueOf(result);
    }
    private int[] parts(String lex) {
        String[] parts = lex.substring(0, lex.length() - 1).split("(?<=\\d)");
        int[] result = new int[2];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
            System.out.println(result[i]);
        }
        return result;
    }
}
