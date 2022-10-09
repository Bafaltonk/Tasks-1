import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел основание и высоту треугольника: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Вызов функции и вывод на экран.
        System.out.println("Площадь треугольника равна "+triArea(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
    // Создание метода, для возвращения площади треугольника.
    public static double triArea(int a, int h){
        return (0.5*a*h);
    }
}
