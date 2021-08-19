package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		System.out.println("인증 프로그램 입니다.");
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("생년월일 입력(yymmdd)");
			System.out.print(">>> ");
			//int age = sc.nextInt();
			try {
				 int age = sc.nextInt();
				 if(age>900101 && age<999999) {
					 throw new Exception("90년생 이하 가입불가");
				 }
				 if(age<99999) {
					 throw new Exception("길이가 틀렸습니다.");
				 }
				 if(age>999999) {
					 throw new Exception("길이가 틀렸습니다.");
				 }
				 System.out.println("가입 가능");
				 return;
			}catch (InputMismatchException e) {
				System.err.println("숫자를 입력하세요!!!");
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//System.out.println(age);
		
	}
	}
}
