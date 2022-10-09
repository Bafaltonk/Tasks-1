import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        // Инициализация символьной переменной.
        char f;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        // Ввод символа пользователем.
        f = scanner.next().charAt(0);
        // Вызов функции и вывод на экран.
        System.out.println(ctoa((f)));
    }
    // Создание метода, для возвращения кода ASCII элемента.
    public static int ctoa(char a){
        return ((int) a);
    }
}
