import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 3 числа: ");
        args = scanner.nextLine().split(" ");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        System.out.println(abcmath(a, b, c));
    }

    public static boolean abcmath(int a, int b, int c){
        return (a*Math.pow(2, b) % c == 0);
    }
}
