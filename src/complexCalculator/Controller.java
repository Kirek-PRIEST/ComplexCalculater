package complexCalculator;

import java.util.Scanner;

public class Controller {
    public String adding(ComplexNumber number1, ComplexNumber number2){
        return Calculating.adding(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), Integer.parseInt(prompt()));
    }
    public String subtracting(ComplexNumber number1, ComplexNumber number2) {
        return Calculating.subtraction(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), Integer.parseInt(prompt()));
    }
    public String multiplication(ComplexNumber number1, ComplexNumber number2) {
        return Calculating.multiplication(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), Integer.parseInt(prompt()));
    }
    public String division(ComplexNumber number1, ComplexNumber number2) {
        return Calculating.division(number1.getReal(), number2.getReal(), number1.getImag(), number2.getImag(), Integer.parseInt(prompt()));
    }
    String prompt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество символов после запятой");
        return scanner.nextLine();
    }
}

