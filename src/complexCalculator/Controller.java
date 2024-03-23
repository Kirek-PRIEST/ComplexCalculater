package complexCalculator;

import complexCalculator.calculate.*;

import java.lang.reflect.Type;

public class Controller {
    public double[] adding(ComplexNumber number1, ComplexNumber number2) {
        Calculating calculating = new Add();
        return calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag());
    }

    public double[] subtracting(ComplexNumber number1, ComplexNumber number2) {
        Calculating calculating = new Subtraction();
        return calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag());
    }

    public double[] multiplication(ComplexNumber number1, ComplexNumber number2) {
        Calculating calculating = new Multiplication();
        return calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag());
    }

    public double[] division(ComplexNumber number1, ComplexNumber number2) {
        Calculating calculating = new Division();
        return calculating.operation(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag());
    }

}

