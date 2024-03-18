
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
            ComplexNumber num1 = new ComplexNumber(Double.parseDouble(prompt("Введите вещесвенную часть числа")), Double.parseDouble(prompt("Введите мнимую часть числа")));
            ComplexNumber num2 = new ComplexNumber(Double.parseDouble(prompt("Введите вещесвенную часть числа")), Double.parseDouble(prompt("Введите мнимую часть числа")));
            Controller controller = new Controller();
            switch (com) {
                case ADD:
                    System.out.println(controller.adding(num1, num2));
                    break;
                case SUB:
                    System.out.println(controller.subtracting(num1, num2));
                    break;
                case MUL:
                    System.out.println(controller.multiplication(num1, num2));
                    break;
                case DIV:

                    System.out.println(controller.division(num1, num2));
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
}
