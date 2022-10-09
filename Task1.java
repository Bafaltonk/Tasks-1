import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 2 числа: ");
        args = scanner.nextLine().split(" ");
        System.out.println(remainder(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    public static int remainder(int  a, int b){
        return (a % b);
    }
}
