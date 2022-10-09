import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        a = scanner.nextInt();
        System.out.println(addUpTo((a)));
    }

    public static int addUpTo(int a){
        return ((a)*(a+1)/2);
    }
}
