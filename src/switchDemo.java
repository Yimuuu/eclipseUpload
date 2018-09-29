import java.util.Scanner;

public class switchDemo {
	public static void main(String[] args) {
		System.out.println("1.enter into game!");
		System.out.println("2.exit from game!");
		Scanner input = new Scanner(System.in);
		int choice = -1; //赋初值
		choice = input.nextInt();//第一次输入
		if (choice == 1) {
			System.out.println("1.传音入密");
			System.out.println("2.举目四望");
			System.out.println("3.会会老友");
			System.out.println("4.自我欣赏");
			System.out.println("5.观察地形");
			System.out.println("6.到此一游");//
			choice = input.nextInt();//第二次输入
			switch(choice) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				System.out.println("笑傲江湖>会会老友");
				System.out.println("1.显示所有好友"+"\n"+"2.添加好友"+"\n"+"3....");
				break;
			case 4:
				break;
			case 5:
				System.out.println("笑傲江湖>观测地形");
				System.out.print("1.查看敌情"+"\n"+"2.切磋武艺"+"\n"+"3....");
				break;
			case 6:
				break;
			default:
				System.out.println("输入错误，退出！");
				System.exit(0);//退出程序
			}
			
		}
			
		else if(choice == 2)
			System.exit(0);//退出程序
		else
			System.out.println("输入错误，重新输入1或2！！");
	     	System.exit(0);//退出程序
	}

}
