package complexCalculator.calculate;

import complexCalculator.strategys.Subtracting;

public class Subtraction extends Calculating {
    public Subtraction(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        this.operations = new Subtracting(real1, real2, imagin1, imagin2, numsAfterDot);

    }
}
