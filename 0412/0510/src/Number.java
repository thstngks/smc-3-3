import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("10개의 랜덤 숫자 중 하나를 맟춰보세요(1~50)");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int []arr = new int[10];
		int diff = 0;
		for(int i=0; i<10; i++) {
			arr[i] = (int)(Math.random()*50+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			if(arr[i] == num) {
				System.out.print("당첨! 일치하는 숫자가 있습니다.");
				diff = 1;
			}
		}
		if(diff == 0) {
			System.out.print("꽝! 다음기회에~");
		}
	}

}
