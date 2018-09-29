package Chapter8;

import java.util.Scanner;

public class circleCalDemo3 {

	private double radius;
	private double perimeter;
	private double area;//属性变成私有的
	
	
	
	public circleCalDemo3() {

	}

	public circleCalDemo3(double radius) {
		this.setRadius(radius);//当前对象的某个方法，不是必须的

	}


	public  double getRadius() {//可读
		return radius;
	}
	public void setRadius(double radius) {//可写可修改
		if(radius <= 0)
			radius = 1;
		else
			this.radius = radius;
	}
		
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}
	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}


	public void show() {
		System.out.println("圆的面积和半径为"+this.getPerimeter() +","+ this.getArea());
//调用类中自己的属性和方法用this.方法/

	}




}
