package Exec;
import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է�(10~99)");
		int i = scanner.nextInt();
		if(i < 10 || i > 99) {
			System.out.println("2�ڸ� ���ڸ� �����մϴ� (10~99)");
			scanner.close();
			return;
		}
		int resultA = i / 10;
		int resultB = i % 10;
		
		if(resultA == resultB) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		} else {
			System.out.println("No! 10�� �ڸ��� 1�� �ڸ��� �ٸ��ϴ�.");
		}
		scanner.close();
	}
}
