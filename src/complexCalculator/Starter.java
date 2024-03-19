package complexCalculator;

import java.util.Arrays;
import java.util.Scanner;

public class Starter {

    public void run() {
        Commands com;
        while (true) {
            String action = "";
            while (!isContain(action)) {
                System.out.println("Список доступных действий:");
                System.out.println(Arrays.toString(Commands.values()));
                action = prompt("Введите действие, которое хотите выполить с мнимыми числами").toUpperCase();
            }
            com = Commands.valueOf(action.toUpperCase());
            ComplexNumber num1 = new ComplexNumber(Double.parseDouble(prompt("Введите вещесвенную часть первого числа")), Double.parseDouble(prompt("Введите мнимую часть первого числа")));
            ComplexNumber num2 = new ComplexNumber(Double.parseDouble(prompt("Введите вещесвенную часть второго числа")), Double.parseDouble(prompt("Введите мнимую часть второго числа")));
            Controller controller = new Controller();
            int decimal = Integer.parseInt(prompt("Введите количество символов после запятой"));
            switch (com) {
                case ADD:
                    controller.adding(num1, num2, decimal);
                    break;
                case SUB:
                    controller.subtracting(num1, num2, decimal);
                    break;
                case MUL:
                    controller.multiplication(num1, num2, decimal);
                    break;
                case DIV:
                    controller.division(num1, num2, decimal);
                    break;
            }
        }
    }

    private static boolean isContain(String s) {
        for (Commands c : Commands.values()) {
            if (c.name().equals(s)) return true;
        }
        return false;
    }

    String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
//    private static boolean isNumeric(String strNum) {
//        if (strNum == null) {
//            return false;
//        }
//        try {
//            double d = Double.parseDouble(strNum);
//        } catch (NumberFormatException nfe) {
//            return false;
//        }
//        return true;
//        }
}
