package teamvs;

import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�� ���� : ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
