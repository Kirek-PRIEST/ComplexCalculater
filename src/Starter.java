
import java.util.Arrays;
import java.util.Scanner;

public class Starter {


    public void run() {
        Commands com;
        while (true) {
            String action = "";
            while (!isContain(action)){
                System.out.println("Список доступных действий:");
                System.out.println(Arrays.toString(Commands.values()));
                action = prompt("Введите действие, которое хотите выполить с мнимыми числами").toUpperCase();
            }
            com = Commands.valueOf(action.toUpperCase());
            String firstLex = prompt("Введите первое комплексное число (в формате a+bi):");
            String secondLex = prompt("Введите второе комплексное число (в формате a+bi): ");
            String numsAfterDot = prompt("Введите количество символов после запятой");
            Controller controller = new Controller();

            switch (com) {
                case ADD:
                    System.out.println(controller.adding(firstLex, secondLex));
                    break;
                case SUB:
                    System.out.println(controller.subtracting(firstLex, secondLex));
                    break;
                case MUL:
                    System.out.println(controller.multiplication(firstLex, secondLex));
                    break;
                case DIV:

                    System.out.println(controller.division(firstLex, secondLex, Integer.parseInt(numsAfterDot)));
                    break;
            }

        }
    }
    private static boolean isContain(String s){
        for (Commands c : Commands.values()) {
            if (c.name().equals(s)) return true;
        }
        return false;
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
