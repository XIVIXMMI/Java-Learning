public class Masking {
    public static void main(String[] args) {
        byte a=9;
        byte b=12;
    
        byte c;
        c=(byte)(a<<4);
        c=(byte)(c|b);

        System.out.println((c&0b11110000)>>4);
    }
}
