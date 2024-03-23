package complexCalculator.calculate;

import complexCalculator.strategys.Divising;
import complexCalculator.strategys.Subtracting;

public class Division extends Calculating{
    public Division() {
        this.operations = new Divising();
    }
}
