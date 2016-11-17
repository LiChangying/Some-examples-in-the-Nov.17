import java.util.*;
public class AvailableExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input first number:");
		int a = scan.nextInt();
		System.out.println("Please inout second number:");
		int b = scan.nextInt();
		System.out.println("a="+a+"\t"+"b="+b);
		a = a^b;
		b = b^a;
		a = a^b;
		System.out.println("a="+a+"\t"+"b="+b);
	}

}
