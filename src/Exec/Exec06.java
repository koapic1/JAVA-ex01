package Exec;

import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��ϼ���.");
		int num = scan.nextInt();
		int first = num/10;
		int second = num%10;
		int count = 0;
		if(first % 3 == 0 && first != 0) {
			count++;
		}
		if(second % 3 == 0 && first != 0) {
			count++;
		}
		if(count == 2) {
			System.out.println("�ڼ� ¦¦");
		} else if(count == 1) {
			System.out.println("�ڼ� ¦");
		} else {
			System.out.println("�ڼ�ġ�� ���");
		}
		scan.close();
	}
}
