public class T {
    public static void main(String[] args) {
        // ��100���ڵ�����
    	M m = new M();
        for (int i = 101; i <= 200; i++) { // ����
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
		 for (int k = 2; k <= x; k++) { // ����
            // �ų������� i=k ֮ǰ �ܱ�k����(����Ϊ0)����
            if (x % k == 0 && x != k) {
                break;
            }
            // ��������� i=k �� i%k=0����
            if (x % k == 0 && x == k) {
                y=x;
            }
        }
        return y;
	}
}

//��Ƭ��������http://outofmemory.cn