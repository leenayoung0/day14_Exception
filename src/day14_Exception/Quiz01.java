package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		System.out.println("���� ���α׷� �Դϴ�.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������� �Է�(yymmdd)");
			System.out.print(">>> ");
			//int age = sc.nextInt();
			try {
				 int age = sc.nextInt();
				 if(age>900101 && age<999999) {
					 throw new Exception("90��� ���� ���ԺҰ�");
				 }
				 if(age<99999) {
					 throw new Exception("���̰� Ʋ�Ƚ��ϴ�.");
				 }
				 if(age>999999) {
					 throw new Exception("���̰� Ʋ�Ƚ��ϴ�.");
				 }
				 System.out.println("���� ����");
				 return;
			}catch (InputMismatchException e) {
				System.err.println("���ڸ� �Է��ϼ���!!!");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//System.out.println(age);
		
	}
	}
}
