package complexCalculator.strategys;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Adding implements Operations {

//    private double real1;
//    private double real2;
//    private double imagin1;
//   private double imagin2;
//    private int numsAfterDot;
//   // private double[] result;
//
//
//    public Adding() {
//        this.real1 = real1;
//        this.real2 = real2;
//        this.imagin1 = imagin1;
//        this.imagin2 = imagin2;
//        this.numsAfterDot = numsAfterDot;
//    }

    @Override
    public double[] calculate(double real1, double real2, double imagin1, double imagin2) {
        double p1 = real1 + real2;
        double p2 = imagin1 + imagin2;
        //result = new double[]{p1, p2};
//        System.out.println(ToPrintResult.forResult(p1, p2, numsAfterDot));
//        result = p1 + p2;
//        System.out.println(result);
        return new double[]{p1, p2};

    }

//    public double[] getResult() {
//        return result;
//    }




}
