import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        // Инициализация целочисленных переменных.
        int a, b, c;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 3 числа: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Определение значений переменных через элементы массива args.
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        // Вызов функции и вывод на экран.
        System.out.println(abcmath(a, b, c));
    }
    // Создание метода, для возвращения true или false, делится ли число a сложенное с самим собой b раз на c.
    public static boolean abcmath(int a, int b, int c){
        return (a*Math.pow(2, b) % c == 0);
    }
}
