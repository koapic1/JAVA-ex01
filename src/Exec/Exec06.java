package Exec;

import java.util.Scanner;

public class Exec06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요.");
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
			System.out.println("박수 짝짝");
		} else if(count == 1) {
			System.out.println("박수 짝");
		} else {
			System.out.println("박수치면 사망");
		}
		scan.close();
	}
}
