import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("1000 ������ �ڿ����� �Է��ϼ���.");
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		while(i <= num) {
			if(i%4 == 0) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println("1~"+num+"���� 4�� ����� ���� "+sum+"�Դϴ�.");
	}

}
