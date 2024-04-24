import java.util.Scanner;

public class Cubiod {
    public static void main(String[] args) {
        double h,l,b;
        double totalArea, volume;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height, lenght and breadth");
        h = sc.nextDouble();
        l = sc.nextDouble();
        b = sc.nextDouble();

        totalArea = 2*(l*b + l*h + b*h);

        volume = l*b*h;

        System.out.println(totalArea);

        System.out.println(volume);

        sc.close();

    }
}
