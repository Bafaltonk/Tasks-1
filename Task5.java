import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        int N, a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 3 числа: ");
        args = scanner.nextLine().split(" ");
        N = Integer.parseInt(args[0]);
        a = Integer.parseInt(args[1]);
        b = Integer.parseInt(args[2]);
        System.out.println(operation(N, a, b));
    }

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
