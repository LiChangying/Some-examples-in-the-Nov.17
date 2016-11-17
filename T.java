public class T {
    public static void main(String[] args) {
        // 求100以内的质数
    	M m = new M();
        for (int i = 101; i <= 200; i++) { // 质数
        	int z=0;
        	if(m.f(i)!=0){
        		System.out.println(m.f(i));	
        	}
        }
    }
}
class M{
	public static int f(int x){
		 int y = 0;
		 for (int k = 2; k <= x; k++) { // 除数
            // 排除所有在 i=k 之前 能被k整除(余数为0)的数
            if (x % k == 0 && x != k) {
                break;
            }
            // 输出所有在 i=k 且 i%k=0的数
            if (x % k == 0 && x == k) {
                y=x;
            }
        }
        return y;
	}
}

//该片段来自于http://outofmemory.cn