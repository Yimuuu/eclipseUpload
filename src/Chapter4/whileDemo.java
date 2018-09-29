package Chapter4;

import java.util.Scanner;

public class whileDemo {
	public static void main(String[] args) {
	
		final String PASSWORD = "000000";
		String password = null;
		String username = "";
		
		int i = 0;		
		while(i < 3) {
			i++;
			System.out.println("请输入密码：");
			Scanner input = new Scanner(System.in);
			password = input.next();
			if(!PASSWORD.equals(password)) {
				System.out.println("密码错误，请重新输入！还剩"+(3-i)+"次机会");
				if(i == 3) {
					System.out.println("密码输错三次，退出程序");
					System.exit(0);	
				}
				
			}
			else {
				System.out.println("登入系统！");
				i = Integer.MAX_VALUE;	
				
			}
				
			

		}
	}

}
