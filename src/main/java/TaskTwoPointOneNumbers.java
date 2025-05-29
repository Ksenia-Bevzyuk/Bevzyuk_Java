import java.util.Scanner;
import static java.lang.Math.abs;

public class TaskTwoPointOneNumbers {
    int a;
    int b;

    public void readNumbers() {
        Scanner scanner = new Scanner(System.in);

        // Запрос ввода числа a с обработкой исключений при вводе не целого числа
        while (true) {
            try {
                System.out.println("Введите целое число a: ");
                a = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введено не целое число");
                scanner.nextLine();
            }
        }

        // Запрос ввода числа b с обработкой исключений при вводе не целого числа
        while (true) {
            try {
                System.out.println("Введите целое число b: ");
                b = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введено не целое число");
                scanner.nextLine();
            }
        }
    }

    // Метод сравнения чисел
    public void comparisonOfNumbers() {
        if(a > b){
            System.out.println(a + ">" + b);
        } else if(a < b) {
            System.out.println(a + "<" + b);
        } else if(a == b) {
            System.out.println(a + "=" + b);
        } else {
            System.out.println("Неизвестное выражение");
        }
    }

    // Метод сложения чисел
    public void sumOfNumbers() {
        int sumOfNumbers = a + b;
        System.out.println("Сумма чисел равна: " + sumOfNumbers);
    }

    // Метод получения модуля разницы чисел
    public void subOfNumbers() {
        int subOfNumbers = abs(a - b);
        System.out.println("Разница чисел равна: " + subOfNumbers);
    }

    // Метод получения частного чисел, с учётом невозможности деления на ноль
    public void divOfNumbers() {
        double divOfNumbers;
        if((a == 0) && (b == 0)){
            System.out.println("Невозможно произвести деление на 0");
        } else if((a == 0) && (b != 0)) {
            divOfNumbers = a / b;
            System.out.println(a + " разделить на " + b + " равно: " + divOfNumbers);
        } else if ((a != 0) && (b == 0)) {
            divOfNumbers = b / a;
            System.out.println(b + " разделить на " + a + " равно: " + divOfNumbers);
        } else {
            divOfNumbers = (double) a / b;
            System.out.println(a + " разделить на " + b + " равно: " + divOfNumbers);
            System.out.println(b + " разделить на " + a + " равно: " + 1/divOfNumbers);
        }
    }

    // Метод умножения чисел
    public void multOfNumbers() {
        int multOfNumbers = a * b;
        System.out.println("Произведение чисел равно: " + multOfNumbers);
    }

    public static void main(String[] args) {
        TaskTwoPointOneNumbers numbers = new TaskTwoPointOneNumbers();
        numbers.readNumbers();
        numbers.comparisonOfNumbers();
        numbers.sumOfNumbers();
        numbers.subOfNumbers();
        numbers.multOfNumbers();
        numbers.divOfNumbers();
    }
}
