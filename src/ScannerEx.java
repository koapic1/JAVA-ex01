import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 생성 instance 생성

		System.out.println("이름을 입력 하시오");
		String name = scanner.next();
		System.out.println("나의 이름은" + name + "입니다.");

		System.out.println("나이를 입력 하시오");
		int age = scanner.nextInt();
		System.out.println("나이는" + age + "입니다.");

		System.out.println("키를 센치 단위로 입력 하시오 ex) 180");
		Double height = scanner.nextDouble();
		System.out.println("키는" + height + "입니다.");
		
		System.out.println("몸무게를 kg 단위로 입력 하시오 ex) 60");
		Double weight = scanner.nextDouble();
		System.out.println("몸무게는" + weight + "입니다.");

		// 18.5 보다 작으면 저체중
		// 23보다 작으면 정상
		// 25 과체중
		// 30 비만
		// 나머지는 고도비만
		double Height = height / 100;
		double bmi = weight / Height / Height;

		if (bmi < 18.5) {
			System.out.println("저체중");
		} else if (bmi < 23) {
			System.out.println("정상");
		} else if (bmi < 25) {
			System.out.println("과체중");
		} else if (bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도비만");
		}

		scanner.close();
		// 삼항 연산자
		int a = 10;
		int b = 20;
		System.out.println(a > b ? a-b : b-a);
	}
}





