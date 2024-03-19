package complexCalculator;

import complexCalculator.calculate.*;

public class Controller {
    public void adding(ComplexNumber number1, ComplexNumber number2, int decimal) {
        Calculating calculating = new Add(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
        calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);

    }

    public void subtracting(ComplexNumber number1, ComplexNumber number2, int decimal) {
        Calculating calculating = new Subtraction(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
        calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
    }

    public void multiplication(ComplexNumber number1, ComplexNumber number2, int decimal) {
        Calculating calculating = new Multiplication(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
        calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
    }

    public void division(ComplexNumber number1, ComplexNumber number2, int decimal) {
        Calculating calculating = new Division(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
        calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), decimal);
    }

}

