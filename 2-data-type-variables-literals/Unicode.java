import java.lang.*;

public class Unicode {
	public static void main(String args[]){
		for(char c = 0x0370; c <= 0x03ff; c++)
			System.out.println(c + " ");

		for(char c = 0x0900; c <= 0x0970; c++)
			System.out.println(c + " ");
	}
}