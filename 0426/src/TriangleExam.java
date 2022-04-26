
public class TriangleExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tr = new Triangle(10.2, 17.3);
		System.out.println("삼각형의 넓이: "+tr.getArea());
		tr.setSize(7.5, 9.2);
		System.out.println("변경된 삼각형의 넓이: "+tr.getArea());
	}

}
class Triangle {
	double bottom;
	double height;
	public Triangle(double bt, double hg) {//생성자
		this.bottom = bt;
		this.height = hg;
	}
	public void setSize(double bt, double hg) { //함수
		this.bottom = bt;
		this.height = hg;
	}
	public double getArea() { //함수
		return bottom*height/2;
	}
}