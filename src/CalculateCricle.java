import java.util.Scanner;

public class CalculateCricle {
	public static void main(String args[]) {
		System.out.println("输入圆半径：");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();//读取用户输入数据给变量radius
		double area = radius * radius *3.14;
		System.out.printf("圆面积是:%.2f",area);
		
	}

}
