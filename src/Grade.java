import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력 하세요");
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
		System.out.println("당신의 학점은" + " " + result + " " + "입니다.");
		scanner.close();
	}

}
