import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ����: ");
		int start = scan.nextInt();
		System.out.println("������ ����: ");
		int last = scan.nextInt();
		for(int i = start; i<=last; i++) {
			sum += i;
		}
		System.out.println(start+"���� "+last+"������ ���� "+sum);
	}

}
