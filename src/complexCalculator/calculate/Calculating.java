package complexCalculator.calculate;

import complexCalculator.strategys.Operations;

public class Calculating {
    Operations operations;

    public double[] operation(double real1, double real2, double imagin1, double imagin2) {
        return operations.calculate(real1, real2, imagin1, imagin2);
    }
}