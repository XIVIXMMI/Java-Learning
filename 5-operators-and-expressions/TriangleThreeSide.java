import java.util.Scanner;

public class TriangleThreeSide {

    public static void main(String[] args) {
        int a, b, c;
        float s, area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 3 sides of triangle");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a + b + c) / 2f;

        area =(float) Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of triangle is " + area);

        sc.close();
    }
}
