package complexCalculator.calculate;

import complexCalculator.strategys.Multiplicating;

public class Multiplication extends Calculating {
    public Multiplication(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        this.operations = new Multiplicating(real1, real2, imagin1, imagin2, numsAfterDot);
    }
}
