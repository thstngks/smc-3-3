import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = (int)(Math.random()*3);
		String a = sc.next();
		if(i==0) {
			System.out.println("가위");
		}
		else if(i==1) {
			System.out.println("바위");
		}		
		else if(i==2) {
			System.out.println("보");
		}
		
		if(a.equals("가위")) {
			if(i==0) {
				System.out.println("비겼다");
			}
			else if(i==1) {
				System.out.println("졌다");
			}
			else if(i==2) {
				System.out.println("이겼다");
			}
		}
		if(a.equals("바위")) {
			if(i==0) {
				System.out.println("이겼다");
			}
			else if(i==1) {
				System.out.println("비겼다");
			}
			else if(i==2) {
				System.out.println("졌다");
			}
		}
		if(a.equals("보")) {
			if(i==0) {
				System.out.println("졌다");
			}
			else if(i==1) {
				System.out.println("이겼다");
			}
			else if(i==2) {
				System.out.println("졌다");
			}
		}
	}
}
