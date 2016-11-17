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
