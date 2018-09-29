package Chapter5;

public class printNum {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {//9行
			for(int j = 1; j < 18; j++) { //17列
				if(j < (10-i))
					System.out.print("####");//打印空白
				}
			for(int j = 0; j < i-1;j++) {
				System.out.printf("%4d",(int)Math.pow(2, j));//打印左半边，列数增加，值增加。
			}
			for(int t = 8; t >=(9-i);t--) {
				System.out.printf("%4d",(int)Math.pow(2, (t-(9-i))));//打印右半边，列数增加，值减小
			}
			
			System.out.println();	
			}
		
		
		
		
		
		
		
		}
}
