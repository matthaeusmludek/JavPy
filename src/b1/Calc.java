package b1;
import java.io.IOException;
import java.util.Scanner;


public class Calc {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter any number:");
		float x = scan.nextInt();
		System.out.print("Enter an operator:");
		
		try {
			char c = (char) System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.print("Enter another number:");
		float y = scan.nextInt();
		float sum = x+y;
		float mul = x*y;
		float div = x/y;
		float sub = x-y;		
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(sub);
	}

}
