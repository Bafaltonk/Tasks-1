import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 2 числа: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.println(remainder(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    // Создание метода, для возвращения остатка при делении a на b.
    public static int remainder(int  a, int b){
        return (a % b);
    }
}
