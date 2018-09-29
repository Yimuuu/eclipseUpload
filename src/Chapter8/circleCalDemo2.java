package Chapter8;

import java.util.Scanner;

public class circleCalDemo2 {

	public double radius;
	public double perimeter;
	public double area;
	//定义带参和不带参的构造方法。
	public circleCalDemo2() {
		inputRadius();
	}
	public circleCalDemo2(double radius) {
		if (radius > 0)
			this.radius = radius;
		else
			inputRadius();
	}
	
	private void inputRadius() {//改成private只供构造方法使用
		Scanner input = new Scanner(System.in);
		System.out.println("输入圆半径");
		radius = input.nextDouble();
		//如后续不用，可以 input.close();
	}
	public void showPerimeter() {
		perimeter = 2 * Math.PI * radius;
		System.out.println("周长是" + perimeter);
	
	}
	public void showArea() {
		area = Math.PI * Math.pow(radius, 2);
		System.out.println("面积是" + area);

	}




}
