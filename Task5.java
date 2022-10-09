import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        // Задание 3 целочисленных переменных.
        int N, a, b;
        // Создание объекта класса Scanner для ввода пользователем данных.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 3 числа: ");
        // Ввод строчки пользователем, разбиение её с помощью пробелов и запись в массив args.
        args = scanner.nextLine().split(" ");
        // Задача переменных с помощью args.
        N = Integer.parseInt(args[0]);
        a = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[2]);
        // Вызов функции и вывод на экран.
        System.out.println(operation(N, a, b));
    }
    // Создание метода, для нахождения способа получения числа N из a и b.
    public static String operation(int N, int a, int b){
        if (a + b == N){
            return "added";
        }else if (a - b == N){
            return "subtracted";
        }else if (a / b == N){
            return "divided";
        }else if(a * b == N){
            return "multiplied";
        }else{
            return "none";
        }
    }
}
