import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел числа: ");
        args = scanner.nextLine().split(" ");
        int[] a = new int[args.length];
        for (int i = 0; i < args.length; i++){
            a[i] = Integer.parseInt(args[i]);
        }
        System.out.println(nextEdge(a));
    }

    public static int nextEdge(int a[]){
        int s = 0;
        if (a.length != 0){
            for (int j = 0; j < a.length; j++) {
                s += Math.pow(a[j], 3);
            }
        }
        return s;
    }
}
