import java.util.Scanner;
class Operate{
	public void check(){
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		while(flag){
			System.out.println("请输入用户名：");
			String username = scan.nextLine();
			if(username.equals("")){
				System.out.println("用户名不能为空，请重新输入！");
				flag = true;
				num3++;
				if(num3==3){
					System.out.println("为空次数过多，系统退出！");
					System.exit(1);
				}
			}else {
				if(username.equals("lcy")){
					System.out.println("请输入密码：");
					String password = scan.nextLine();
					if(password.equals("")){
						System.out.println("密码不能为空，请重新输入！");
						flag = true;
						num4++;
						if(num4==3){
							System.out.println("为空次数过多，系统退出！");
							System.exit(1);
						}
					}else{
						if(password.equals("123456")){
							System.out.println("登陆成功！");
							flag = false;
						}else{
							System.out.println("密码错误，请从新输入：");
							num2++;
							if(num2==3){
								System.out.println("错误次数过多，系统退出!");
								System.exit(1);
							}
							flag = true;
						}
					}
				}else{
					System.out.println("用户名错误，请从新输入：");
					num1++;
					flag = true;
					if(num1==3){
						System.out.println("错误次数过多，系统退出");
						System.exit(1);
					}
				}
			}
		}
	}
}
public class Test{
	public static void main(String[] args){
		Operate p = new Operate();
		p.check();
	}
}