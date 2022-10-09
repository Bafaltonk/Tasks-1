import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        // Инициализация целочисленной переменной.
        int a;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        // Ввод числа пользователем.
        a = scanner.nextInt();
        // Вызов функции и вывод на экран.
        System.out.println(addUpTo((a)));
    }
    // Создание метода, для возвращения суммы 1 + 2 + ... + a.
    public static int addUpTo(int a){
        return ((a)*(a+1)/2);
    }
}
