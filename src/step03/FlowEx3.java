package step03;

import java.util.Scanner;

public class FlowEx3 {

	public static void main(String[] args) {
		int input;
		
		System.out.println("���ڸ� �ϳ� �Է��ϼ���. >");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();	//ȭ���� ���� �Է¹��� ������ tmp�� ����
		input = Integer.parseInt(tmp);	//�Է¹��� ���ڿ� tmp�� ���ڷ� ��ȯ
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
		
	}

}
