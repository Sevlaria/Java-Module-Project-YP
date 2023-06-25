import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    String listOfProducts = "Добавленные товары:\n";
    Double coast;
    Double sum = 0.0;
    String product;
    boolean t;

    public void calculate(int countOfClient) {
        while (true) {
           Scanner scanner = new Scanner(System.in);
            System.out.println("Какой товары вы желаете положить в корзину?");
            product = scanner.nextLine();
            while (t == false) {
               t = input();
                }

            t = false;

                listOfProducts = listOfProducts +  product + "  " + coast + " \n";
                sum = sum + coast;
                System.out.println("Вы успешно добавили товар в корзину!" +
                        "Хотите ли вы добавить еще один товар?\n Введите любой символ, чтобы продолжить покупки. " +
                        "Для завершения покупок наберите команду 'завершить'!");
                product = scanner.nextLine();
                if (product.equalsIgnoreCase("завершить")) {
                    output(countOfClient);
                    return;
                }



        }
    }

    public void output(int countOfClient) {
        System.out.println(listOfProducts);
        sum = sum/countOfClient;
        switch ((int) Math.floor(sum)) {
            case 1:
                System.out.println("Общая сумма покупки в расчете на одного человека: "
                        + String.format("%.2f", sum) + " рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Общая сумма покупки в расчете на одного человека: "
                        + String.format("%.2f", sum) + " рубля");
                break;
            default:
                System.out.println("Общая сумма покупки в расчете на одного человека: "
                        + String.format("%.2f", sum) + " рублей");
                break;

        }

    }

   public boolean input(){
        System.out.println("Введите стоимость товара.");
        try {
            Scanner in = new Scanner(System.in);
            coast = in.nextDouble();
            return true;
        } catch (InputMismatchException e) {
            System.out.println("Введено некорректное значение цены, " +
                    "введите в формате рубли,копейки.");
            return false;
        }
        }

    }
