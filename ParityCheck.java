import java.util.*;
public class ParityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Please input a num");
		int num = scan.nextInt();
		String check = (num%2==0?"is odd":"is jishu");
		System.out.println("this num "+check);
	}

}
