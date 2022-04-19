import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("시작 숫자: ");
		int start = scan.nextInt();
		System.out.println("마지막 숫자: ");
		int last = scan.nextInt();
		for(int i = start; i<=last; i++) {
			sum += i;
		}
		System.out.println(start+"부터 "+last+"까지의 합은 "+sum);
	}

}
