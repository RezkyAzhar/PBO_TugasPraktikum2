import java.io.*;
import java.util.Scanner;

public class soal1 {

	public static void main(String[] args) {
		try {
			Scanner Obj = new Scanner(System.in);
			long value = Obj.nextLong();
			
			if(value <= Byte.MAX_VALUE && value >= Byte.MIN_VALUE) {
				System.out.println("*Byte");
			}
			if(value <= Short.MAX_VALUE && value >= Short.MIN_VALUE) {
				System.out.println("*Short");
			}
			if(value <= Integer.MAX_VALUE && value >= Integer.MIN_VALUE) {
				System.out.println("*Integer");
			}
			if(value <= Long.MAX_VALUE && value >= Long.MIN_VALUE) {
				System.out.println("*Long");
			}
		}
		catch (Exception e) {
		    System.out.println("Try inputting numbers.");
		}
	}
	
	
}