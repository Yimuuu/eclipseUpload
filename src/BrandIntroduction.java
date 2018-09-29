import java.util.Scanner;

public class BrandIntroduction {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("品牌1:");
		String brand1 = input.next();//输入字符串
		System.out.println("品牌2:");
		String brand2 = input.next();//nextLine会读空格和回车
		System.out.println(brand1);
		/*int size = input.nextInt();
		double height = input.nextDouble();
		float ...nextFloat();
		难点是char类型：
		char sex = input.next().charAt();输入字符串的第一个字符
		*/
		
	}

}
