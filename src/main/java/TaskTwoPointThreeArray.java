public class TaskTwoPointThreeArray {
    int[] arrayOfNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public void evenNumbersPrint() {
        System.out.println("Чётные числа в массиве: ");

        // Проверка чётности каждого элемента массива и вывод чётных чисел
        for (int number : arrayOfNumbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        TaskTwoPointThreeArray array = new TaskTwoPointThreeArray();

        array.evenNumbersPrint();
    }
}
