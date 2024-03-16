
import java.util.Scanner;

public class Veuwer {


    public void run() {
        Commands com;
        while (true) {
            System.out.println("Список доступных действий:");
            System.out.println("ADD - вычисление суммы. SUB - вычитание. MUL - умножение. DIV - деление.");
            String action = prompt("Введите действие, которое хотите выполить с мнимыми числами");
            com = Commands.valueOf(action.toUpperCase());
            Calculating calculating = new Calculating();
            String firstLex = prompt("Введите первое комплексное число (в формате a+bi):");
            String secondLex = prompt("Введите второе комплексное число (в формате a+bi): ");
            switch (com) {
                case ADD:
                    System.out.println(calculating.summ(firstLex, secondLex));
                    break;
                case SUB:
                    System.out.println(calculating.subtracting(firstLex, secondLex));
                    break;
                case MUL:

                case DIV:
            }

        }
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
