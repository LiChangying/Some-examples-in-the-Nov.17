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
