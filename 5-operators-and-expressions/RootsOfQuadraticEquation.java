import java.util.Scanner;

public class RootsOfQuadraticEquation {
    
    public static void main(String[] args) {
        
        int a,b,c;

        double r1,r2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);

        System.out.println("Root are: " + r1 +" "+ r2);

        sc.close();
    }
}
