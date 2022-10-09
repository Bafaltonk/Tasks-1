import java.util.Scanner;

public class Task8 {
    public static void main(String[] args){
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 2 стороны треугольника: ");
        args = scanner.nextLine().split(" ");
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        System.out.println(nextEdge(a, b));
    }

    public static int nextEdge(int a, int b){
        return (a+b-1);
    }
}
