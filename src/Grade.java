import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է� �ϼ���");
		int score = scanner.nextInt();
		String result = null;
		
		if (score >= 90) {
			result = "A";
		} else if (score >= 80) {
			result = "B";
		} else if (score >= 70) {
			result = "C";
		} else if (score >= 60) {
			result = "D";
		} else {
			result = "F";
		}
		System.out.println("����� ������" + " " + result + " " + "�Դϴ�.");
		scanner.close();
	}

}
