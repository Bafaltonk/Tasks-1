import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел количество кур, коров и свиней: ");
        args = scanner.nextLine().split(" ");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        System.out.println("Общее число ног животных равно - "+animals(a, b, c));
    }

    public static int animals(int a, int b, int c){
        return (2*a+4*(b+c));
    }
}
