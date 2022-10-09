import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        // Задание 3 целочисленных переменных.
        int a, b, c;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел количество кур, коров и свиней: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Задача переменных с помощью args.
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        // Вызов функции и вывод на экран.
        System.out.println("Общее число ног животных равно - "+animals(a, b, c));
    }
    // Создание метода, для подсчёта количества ног.
    public static int animals(int a, int b, int c){
        return (2*a+4*(b+c));
    }
}
