import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать, на сколько человек необходимо разделить счет?");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            try {
                int countOfClient = scanner.nextInt();
                if (countOfClient < 1) {
                    System.out.println("Простите, вы ввели некорректное значение, введите количество человек еще раз!");
                } else if (countOfClient == 1) {
                    System.out.println("Ваш счет делить не нужно! Введите корректное значение!");
                } else {
                    Calculator calculator = new Calculator();
                    calculator.calculate(countOfClient);
                    scanner.close();
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное значение, попробуйте ввести значение еще раз!");
            }
        }
    }
}