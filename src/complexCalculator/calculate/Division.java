package complexCalculator.calculate;

import complexCalculator.strategys.Divising;
import complexCalculator.strategys.Subtracting;

public class Division extends Calculating{
    public Division(double real1, double real2, double imagin1, double imagin2, int numsAfterDot) {
        this.operations = new Divising(real1, real2, imagin1, imagin2, numsAfterDot);
    }
}
