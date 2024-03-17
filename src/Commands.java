import java.util.Arrays;

public enum Commands {
    ADD ("ADD = Сложение"),
    SUB ("SUB = Вычитание"),
    MUL( "MUL = Умножение"),
    DIV("DIV = Деление");

    private final String description;

    Commands(String description) {
        this.description = description;
    }
    @Override
    public String toString() {

        return description;
    }
}
