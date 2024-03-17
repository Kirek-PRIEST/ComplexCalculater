
import java.util.Scanner;

public class Veuwer {


    public void run() {
        Commands com;
        while (true) {
            System.out.println("Список доступных действий:");
            System.out.println("ADD - вычисление суммы. SUB - вычитание. MUL - умножение. DIV - деление.");
            String action = prompt("Введите действие, которое хотите выполить с мнимыми числами");
            com = Commands.valueOf(action.toUpperCase());
            String firstLex = prompt("Введите первое комплексное число (в формате a+bi):");
            String secondLex = prompt("Введите второе комплексное число (в формате a+bi): ");
            Contoller contoller = new Contoller();
            switch (com) {
                case ADD:
                    System.out.println(contoller.adding(firstLex, secondLex));
                    break;
                case SUB:
                    System.out.println(contoller.subtracting(firstLex, secondLex));
                    break;
                case MUL:
                    System.out.println(contoller.multiplication(firstLex, secondLex));
                    break;
                case DIV:
                    System.out.println(contoller.division(firstLex, secondLex));
                    break;
            }

        }
    }

    private String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
