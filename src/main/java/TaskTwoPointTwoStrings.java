import java.util.Scanner;

public class TaskTwoPointTwoStrings {
    String first;
    String second;

    public void readStrings() {
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода первой строки
        System.out.println("Введите первую строку: ");
        first = scanner.nextLine();

        // Запрос ввода второй строки
        System.out.println("Введите вторую строку: ");
        second = scanner.nextLine();
    }

    // Метод сравнения строк
    public void comparisonOfStrings () {
        if(first.equals(second)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }

    public static void main(String[] args) {
        TaskTwoPointTwoStrings strings = new TaskTwoPointTwoStrings();

        strings.readStrings();
        strings.comparisonOfStrings();
    }
}
