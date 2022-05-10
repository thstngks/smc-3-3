import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0;
		int sum=0;
		System.out.println("시작 숫자 : ");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("마지막 숫자 : ");
		b = sc.nextInt();
		for(int i=a; i<b; i++) {
			sum+=i;
		}
		System.out.println(a+"부터"+b+"까지의 합은"+sum);
	}

}
