package Chapter8;

import java.util.Scanner;

public class circleCalDemo {
	/**
	 * 变量：半径，周长，面积
	 * 方法：输入，计算并现实周长和面积
	 */
	public double radius;
	public double perimeter;
	public double area;
	
	public void inputRadius() {
		Scanner input = new Scanner(System.in);
		System.out.println("输入圆半径");
		radius = input.nextDouble();
		//如后续不用，可以 input.close();
	}
	public void showPerimeter() {
		if (radius <= 0) {
			inputRadius();
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("周长是" + perimeter);
	
	}
	public void showArea() {
		if (radius <= 0) {
			inputRadius();
		}
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("面积是" + area);

	}




}
