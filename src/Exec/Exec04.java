package Exec;

import java.util.Scanner;

public class Exec04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� 3�� �Է�");
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		int center = A;
		
		if ((A >= B && A <= C) || (A >= C && A <= B)) {
			center = A;
		} else if ((B >= A && B <= C) || (B >= C && B <= A)) {
			center = B;
		} else {
			center = C;
		}
		System.out.println("�߰� ����" + center);
		scanner.close();
	}
}
