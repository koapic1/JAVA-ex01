package Exec;
import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2자리수 정수 입력(10~99)");
		int i = scanner.nextInt();
		if(i < 10 || i > 99) {
			System.out.println("2자리 숫자만 가능합니다 (10~99)");
			scanner.close();
			return;
		}
		int resultA = i / 10;
		int resultB = i % 10;
		
		if(resultA == resultB) {
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
		} else {
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
		}
		scanner.close();
	}
}
