import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        double a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел 3 числа: ");
        args = scanner.nextLine().split(" ");
        a = Double.parseDouble(args[0]);
        b = Double.parseDouble(args[1]);
        c = Double.parseDouble(args[2]);
        System.out.println(profitableGamble(a, b, c));
    }

    public static boolean profitableGamble(double prob, double prize, double pay){
        return (prob*prize>pay);
    }
}
