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
