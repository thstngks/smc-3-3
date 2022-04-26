import java.util.Scanner;

public class CircleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("반지름 값 >>");
		int radius = scan.nextInt();
		Circle c = new Circle(radius);
		System.out.println("반지름 "+radius+"인 원의 넓이는 "+c+"입니다.");
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