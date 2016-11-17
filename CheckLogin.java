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