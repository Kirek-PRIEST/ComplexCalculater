package complexCalculator.strategys;

public class Multiplicating implements Operations{

    @Override
    public double[] calculate(double real1, double real2, double imagin1, double imagin2) {
        double p1 = real1 * real2 - imagin1 * imagin2;
        double p2 = imagin1 * real2 + real1 * imagin2;
        return new double[]{p1, p2};
    }
}
