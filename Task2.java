import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите через пробел основание и высоту треугольника: ");
        args = scanner.nextLine().split(" ");
        System.out.println("Площадь треугольника равна "+triArea(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }

    public static double triArea(int a, int h){
        return (0.5*a*h);
    }
}
