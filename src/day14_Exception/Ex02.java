package day14_Exception;

class BBB { 
	public int aaa;
}

class AAA extends BBB{
	public void catch1(Object a) {
		System.out.println("������Ʈ: "+a);
	}

	
}

public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		//BBB a = new AAA(); �ڽ��� �θ� ���·� ���� �� �� �ִ�.
		//Object a = new AAA();
		Object ss = "test";
		a.catch1(11);
		a.catch1("aaaa");
		a.catch1(1.111);
		a.catch1('a');
		
	}

}
