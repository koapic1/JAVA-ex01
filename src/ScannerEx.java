import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // ���� instance ����

		System.out.println("�̸��� �Է� �Ͻÿ�");
		String name = scanner.next();
		System.out.println("���� �̸���" + name + "�Դϴ�.");

		System.out.println("���̸� �Է� �Ͻÿ�");
		int age = scanner.nextInt();
		System.out.println("���̴�" + age + "�Դϴ�.");

		System.out.println("Ű�� ��ġ ������ �Է� �Ͻÿ� ex) 180");
		Double height = scanner.nextDouble();
		System.out.println("Ű��" + height + "�Դϴ�.");
		
		System.out.println("�����Ը� kg ������ �Է� �Ͻÿ� ex) 60");
		Double weight = scanner.nextDouble();
		System.out.println("�����Դ�" + weight + "�Դϴ�.");

		// 18.5 ���� ������ ��ü��
		// 23���� ������ ����
		// 25 ��ü��
		// 30 ��
		// �������� ����
		double Height = height / 100;
		double bmi = weight / Height / Height;

		if (bmi < 18.5) {
			System.out.println("��ü��");
		} else if (bmi < 23) {
			System.out.println("����");
		} else if (bmi < 25) {
			System.out.println("��ü��");
		} else if (bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("����");
		}

		scanner.close();
		// ���� ������
		int a = 10;
		int b = 20;
		System.out.println(a > b ? a-b : b-a);
	}
}





