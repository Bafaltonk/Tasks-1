import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        // Задание 3 вещественных переменных.
        double a, b, c;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 3 числа: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Задача переменных с помощью args.
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        // Вызов функции и вывод на экран.
        System.out.println(profitableGamble(a, b, c));
    }
    // Создание метода, для определение выполняется ли условие.
    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob*prize>pay);
    }
}
