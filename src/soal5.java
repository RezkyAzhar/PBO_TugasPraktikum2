import java.util.Scanner;

public class soal5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		String str1,str2;
		str1= obj.nextLine();
		str2= obj.nextLine();
		
		System.out.println(str1.length() + str2.length());
		
		if(str1.charAt(0) < str2.charAt(0)) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
				
		}
	
		String HurufDepan_Kata1 = str1.substring(0,1);
		String HurufSisa_Kata1 = str1.substring(1);
		String HurufDepan1_Diperbesar = HurufDepan_Kata1.toUpperCase();
		String HurufDepan_Kata2 = str2.substring(0,1);
		String HurufSisa_Kata2 = str2.substring(1);
		String HurufDepan2_Diperbesar = HurufDepan_Kata2.toUpperCase();
		
		System.out.println(HurufDepan1_Diperbesar + HurufSisa_Kata1 + " " + HurufDepan2_Diperbesar + HurufSisa_Kata2);
		
	}

}