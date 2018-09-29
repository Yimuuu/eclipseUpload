package Chapter5;

public class calTime {
	public static void main(String[] args) {
		int count = 0;
		long starttime = System.currentTimeMillis();
		while(true) {
			if(count++ == Integer.MAX_VALUE) {
				break;//用于跳出循环，不是if语句，只能跳出最近循环。
			}
		}
		long endtime = System.currentTimeMillis();
		System.out.println(endtime - starttime);
	}

}
