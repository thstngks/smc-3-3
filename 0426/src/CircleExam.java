import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �� >>");
		int radius = scan.nextInt();
		Circle c = new Circle(radius);
		System.out.println("������ "+radius+"�� ���� ���̴� "+c+"�Դϴ�.");
	}

}
class Circle {
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public double Area(double Area) {
		return Area = radius*radius*3.14;
	}
}