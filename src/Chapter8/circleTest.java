/**
 * 
 */
package Chapter8;

import java.util.Scanner;

/**
 * @author MuYi
 * @version 1.0
 * @date
 * 
 */
public class circleTest {
	public static void main(String args[]) {
		// circleCalDemo Circle1 = new circleCalDemo();
		// Circle1.inputRadius();
		// Circle1.showPerimeter();
		// Circle1.showArea();

		// circleCalDemo2 Circle2 = new circleCalDemo2();
		// Circle2.showArea();//将输入部分放到构造方法中。

		Scanner input = new Scanner(System.in);
		System.out.println("输入圆半径");
		double radius = input.nextDouble();
		circleCalDemo3 Circle3 = new circleCalDemo3(radius);
		Circle3.show();
	}

}
