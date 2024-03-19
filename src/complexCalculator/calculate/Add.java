package complexCalculator.calculate;

import complexCalculator.strategys.Adding;

public class Add extends Calculating {
    public Add(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        this.operations = new Adding(real1, real2, imagin1, imagin2, numsAfterDot);

    }


}
