public class BitWise {
    public static void main(String[] args) {
        int x = 0b1010;

        int a = x >>  1;

        int y = ~x;
        
        System.out.println(a);
        System.out.println(String.format("%s", Integer.toBinaryString(a)));
        System.out.println(y);
    }
}
