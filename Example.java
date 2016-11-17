import java.util.Scanner;
public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a word");
		String password = scanner.nextLine();
		char[] array = password.toCharArray();
		for(int i=0;i<array.length;i++){
			array[i] = (char)(array[i]^20000);
		}
		System.out.println("result is :"+array);
		for(int i=0;i<array.length;i++){
			array[i] = (char)(array[i]^20000);
		}
		System.out.println(array);
	}

}
//可通过位运算符 ^ 实现加密解密处理
