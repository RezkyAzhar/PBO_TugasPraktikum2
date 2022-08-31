import java.io.*;

public class ConvertDataType {
	static short methodOne(long l)
	{
		System.out.println("l: " + l);
		int i = (int) l; //di cast ke integer
		System.out.println("i: " + i);
		return (short)i; // integer di cast dengan short dan juga di return
	}
	public static void main(String[] args) {
		double d = 10.25; //tipe data double
		System.out.println("d: " + d);
		float f = (float) d; //di cast menjadi float
		System.out.println("f: " + f);
		//menjalankan methodOne + cast long hasilnya di cast byte
		byte b = (byte) methodOne((long) f);
		System.out.println(b);

	}

}
