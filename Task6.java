import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        char f;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        f = scanner.next().charAt(0);
        System.out.println(ctoa((f)));
    }

    public static int ctoa(char a){
        return ((int) a);
    }
}
