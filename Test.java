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
			System.out.println("�������û�����");
			String username = scan.nextLine();
			if(username.equals("")){
				System.out.println("�û�������Ϊ�գ����������룡");
				flag = true;
				num3++;
				if(num3==3){
					System.out.println("Ϊ�մ������࣬ϵͳ�˳���");
					System.exit(1);
				}
			}else {
				if(username.equals("lcy")){
					System.out.println("���������룺");
					String password = scan.nextLine();
					if(password.equals("")){
						System.out.println("���벻��Ϊ�գ����������룡");
						flag = true;
						num4++;
						if(num4==3){
							System.out.println("Ϊ�մ������࣬ϵͳ�˳���");
							System.exit(1);
						}
					}else{
						if(password.equals("123456")){
							System.out.println("��½�ɹ���");
							flag = false;
						}else{
							System.out.println("���������������룺");
							num2++;
							if(num2==3){
								System.out.println("����������࣬ϵͳ�˳�!");
								System.exit(1);
							}
							flag = true;
						}
					}
				}else{
					System.out.println("�û���������������룺");
					num1++;
					flag = true;
					if(num1==3){
						System.out.println("����������࣬ϵͳ�˳�");
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