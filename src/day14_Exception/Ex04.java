package day14_Exception;

import java.io.IOException;

class A{
	public void test( ) throws IOException {
		ProcessBuilder b = new ProcessBuilder("calc1111");
//		try {
//			b.start();
//		} catch (IOException e) {
//			//e.printStackTrace();
//			System.out.println("�ش� ��ɾ�� �������� �ʽ��ϴ�");
//		} //����ó��
		b.start(); //�������� (���� ���� �߰���)
	}
	public void display() throws IOException  {
		test();
	}
}

public class Ex04 {
	public static void main(String[] args) throws IOException{
		A a = new A();
		a.display();	
		System.out.println("���� ����� ����");

}
}
