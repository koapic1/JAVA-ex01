package Exec;

import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 3���� �Է��Ͻÿ�");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if((a + b) < c || (a + c) < b || (b + c) < a ) {
			System.out.println("�ﰢ���� �ȵ˴ϴ�.");
		} else {
			System.out.println("�ﰢ���� �˴ϴ�.");
		}
		
		scan.close();
	}
}
