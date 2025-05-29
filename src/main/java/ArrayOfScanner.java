import java.util.Scanner;

public class ArrayOfScanner {
    int[] arrayOfScannerNumbers;

    public void readScannerArraySizeAndNumbers() {
        Scanner scanner = new Scanner(System.in);

        int size;

        // Обработка исключений при вводе размера массива
        while (true) {
            try {
                System.out.print("Введите длину массива: ");
                size = scanner.nextInt();

                // Проверка введенной длины массива на целочисленное значение больше нуля
                if (size <= 0) {
                    System.out.println("Длина массива должна быть больше нуля");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Введено не целое число");
                scanner.nextLine();
            }
        }

        arrayOfScannerNumbers = new int[size];

        // Запрос ввода целочисленных элементов массива с обработкой исключений при вводе
        // не целого числа
        System.out.println("Введите " + size + " целых чисел:");
        for (int i = 0; i < size; i++) {
            while (true) {
                try {
                    System.out.print("Число " + (i + 1) + ": ");
                    arrayOfScannerNumbers[i] = scanner.nextInt();
                    break;
                } catch (Exception e) {
                    System.out.println("Введено не целое число");
                    scanner.nextLine();
                }
            }
        }
    }

    public void evenScannerNumbersPrint() {
        System.out.println("Чётные числа в массиве: ");

        // Проверка чётности каждого элемента массива
        for (int number : arrayOfScannerNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayOfScanner arrayOfScanner = new ArrayOfScanner();

        arrayOfScanner.readScannerArraySizeAndNumbers();
        arrayOfScanner.evenScannerNumbersPrint();
    }
}
