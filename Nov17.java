import java.net.*;
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		InetAddress locAdd = null;
		InetAddress remAdd = null;
		locAdd = InetAddress.getLocalHost();
		remAdd = InetAddress.getByName("www.mldnjava.cn");
		System.out.println(locAdd.getHostAddress());
		System.out.println(remAdd.getHostAddress());
		System.out.println(locAdd.isReachable(5000));
	}

}





import java.io.FileNotFoundException;
import java.io.PrintStream;
public class AbstractOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		PrintStream out = System.out;
		PrintStream ps = new PrintStream("./log.txt");
		System.setOut(ps);
		int age = 18;
		System.out.println("succeed define the girl's age is 18");
		String sex = "woman";
		System.out.println("sex define succeed is woman");
		String info = "this is a "+sex+"age is "+age;
		System.out.println(info);
		System.setOut(out);
		System.out.println("end ,please lokk txt");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}

}









import java.math.*;
public class AccurateFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money = 2;
		double price = 1.1;
		double result = money + price;
		System.out.println(result);
		//精确浮点数计算
		BigDecimal money1 = new BigDecimal("2");
		BigDecimal price1 = new BigDecimal("1.1");
		BigDecimal result1 = money1.add(price1);
		System.out.println(result1);
	}
}










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

















import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("输入年：");
		int year = scan.nextInt();
		if(year%4==0&&year%100!=0||year%400==0){
			System.out.println("是闰年");
		}else{
			System.out.println("不是闰年");
		}
	}

}






import java.io.*;
import java.util.*;
class Operate{
	public void check(){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		boolean flag = true;
		while(flag){
			System.out.print("请输入用户名：");
			String username = scan.nextLine();
			if(username==null){
				System.out.println("用户名不能为空");
				flag = true;
			}else if(username.equals("lichangying")){
				System.out.println("请输入密码：");
				String password = scan.nextLine();
				if(password.equals("cccwan0.0.0")){
					System.out.println("登陆成功");
					flag = false;
				}else{
					System.out.println("密码输入错误，请重新输入：");
					num1++;
					flag = true;
					if(num1==3){
						System.out.println("错误次数过多，系统退出！");
						System.exit(1);
					}
				}
			}else{
				System.out.println("用户名错误，请重新输入：");
				num++;
				flag = true;
				if(num==3){
					System.out.println("输入次数过多，系统退出");
					System.exit(1);
				}
			}
		}
	}
}
public class CheckLogin{
	public static void main(String[] args){
		Operate p = new Operate();
		p.check();
	}
}














import java.util.*;
public class InoutCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("input your ID card:");
		String l = scanner.nextLine();
		System.out.println(l.length());
	}

}





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










public class PrintErrorAndDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main is doing");
		System.err.println("在运行期间手动输出一个错误信息");
		System.err.println("\t该软件没有买保险，请注意安全");
		System.out.println("PrintErrorAndDebug.main(");
		System.out.println("main()方法运行结束");
	}

}









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

















import java.io.*;
import java.util.*;
class Operate{
	public void check(){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		boolean flag = true;
		while(flag){
			System.out.print("请输入用户名：");
			String username = scan.nextLine();
			if(username==null){
				System.out.println("用户名不能为空");
				flag = true;
			}else if(username.equals("lichangying")){
				System.out.println("请输入密码：");
				String password = scan.nextLine();
				if(password.equals("cccwan0.0.0")){
					System.out.println("登陆成功");
					flag = false;
				}else{
					System.out.println("密码输入错误，请重新输入：");
					num1++;
					flag = true;
					if(num1==3){
						System.out.println("错误次数过多，系统退出！");
						System.exit(1);
					}
				}
			}else{
				System.out.println("用户名错误，请重新输入：");
				num++;
				flag = true;
				if(num==3){
					System.out.println("输入次数过多，系统退出");
					System.exit(1);
				}
			}
		}
	}
}
public class CheckLogin{
	public static void main(String[] args){
		Operate p = new Operate();
		p.check();
	}
}




