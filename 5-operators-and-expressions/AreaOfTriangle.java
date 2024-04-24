import java.util.Scanner;

public class AreaOfTriangle {

    public static void main(String[] args) {

        double b;
        double h;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the base of triangle: ");
        b = sc.nextDouble();

        System.out.println("Enter the height of triangle: ");
        h = sc.nextDouble();

        double area = (b * h) / 2;

        System.out.println("The area of triangle: " + area);


        sc.close();
    }
}