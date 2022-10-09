import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел числа: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Задание массива с целочисленными местами длинной массива args.
        int[] a = new int[args.length];
        // Цикл для заполенения нового массива целыми числами.
        for (int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        // Вызов функции и вывод на экран.
        System.out.println(nextEdge(a));
    }
    // Создание метода, для возвращения суммы кубов заданных в массиве чисел.
    public static int nextEdge(int a[]){
        int s = 0;
        if (a.length != 0){
            for (int j = 0; j < a.length; j++) {
                s += Math.pow(a[j], 3);
            }
        }
        return s;
    }
}
