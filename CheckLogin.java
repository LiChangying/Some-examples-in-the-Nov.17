import java.io.*;
import java.util.*;
class Operate{
	public void check(){
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		boolean flag = true;
		while(flag){
			System.out.print("�������û�����");
			String username = scan.nextLine();
			if(username==null){
				System.out.println("�û�������Ϊ��");
				flag = true;
			}else if(username.equals("lichangying")){
				System.out.println("���������룺");
				String password = scan.nextLine();
				if(password.equals("cccwan0.0.0")){
					System.out.println("��½�ɹ�");
					flag = false;
				}else{
					System.out.println("��������������������룺");
					num1++;
					flag = true;
					if(num1==3){
						System.out.println("����������࣬ϵͳ�˳���");
						System.exit(1);
					}
				}
			}else{
				System.out.println("�û����������������룺");
				num++;
				flag = true;
				if(num==3){
					System.out.println("����������࣬ϵͳ�˳�");
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