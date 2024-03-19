package complexCalculator.strategys;

public class Multiplicating implements Operations{
    double real1;
    double real2;
    double imagin1;
    double imagin2;
    int numsAfterDot;

    public Multiplicating(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        this.real1 = real1;
        this.real2 = real2;
        this.imagin1 = imagin1;
        this.imagin2 = imagin2;
        this.numsAfterDot = numsAfterDot;
    }

    @Override
    public void calculate(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        double p1 = real1 * real2 - imagin1 * imagin2;
        double p2 = imagin1 * real2 + real1 * imagin2;
        System.out.println(ToPrintResult.forResult(p1, p2, numsAfterDot));
    }
}
