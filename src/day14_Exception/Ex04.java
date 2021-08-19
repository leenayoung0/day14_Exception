package day14_Exception;

import java.io.IOException;

class A{
	public void test( ) throws IOException {
		ProcessBuilder b = new ProcessBuilder("calc1111");
//		try {
//			b.start();
//		} catch (IOException e) {
//			//e.printStackTrace();
//			System.out.println("해당 명령어는 존재하지 않습니다");
//		} //예외처리
		b.start(); //예외전가 (위에 문구 추가됨)
	}
	public void display() throws IOException  {
		test();
	}
}

public class Ex04 {
	public static void main(String[] args) throws IOException{
		A a = new A();
		a.display();	
		System.out.println("다음 문장들 실행");

}
}
