package Exec;
import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�.");
		int money = scanner.nextInt();
		
		if(money >= 0) {
			System.out.println("�������� " + money / 50000 + "��");
			money%=50000;
			System.out.println("������ " + money / 10000 + "��");
			money%=10000;
			System.out.println("��õ����" + money / 5000 + "��");
			money%=5000;
			System.out.println("õ���� " + money / 1000 + "��");
			money%=1000;
			System.out.println("��� " + money / 100 + "��");
			money%=100;
			System.out.println("���ʿ� " + money / 50 + "��");
			money%=50;
			System.out.println("�ʿ� " + money / 10 + "��");
		} 
		scanner.close();
	}
}
