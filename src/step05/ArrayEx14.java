package step05;

import java.util.Scanner;

public class ArrayEx14 {

	public static void main(String[] args) {
		String [][] words = {
				{"chair","����"},			//word[0][0], word[0][1]
				{"computer","��ǻ��"},	//word[1][0], word[1][1]
				{"integer","����"},		//word[2][0], word[2][1]
		};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s�� ����?",i+1 ,words[i][0]);
			
			String tmp = scanner.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("�����Դϴ�.%n%n");
			}else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�.%n%n", words[i][1]);
			}
		}
	}
}
