import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        // Инициализация целочисленных переменных.
        int a, b;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 2 стороны треугольника: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Определение значений переменных через элементы массива args.
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        // Вызов функции и вывод на экран.
        System.out.println(nextEdge(a, b));
    }
    // Создание метода, для возвращения 3-ей наибольшей целой стороны треугольника.
    public static int nextEdge(int a, int b){
        return (a+b-1);
    }
}
