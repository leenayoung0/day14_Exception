package day14_Exception;

class BBB { 
	public int aaa;
}

class AAA extends BBB{
	public void catch1(Object a) {
		System.out.println("오브젝트: "+a);
	}

	
}

public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
		//BBB a = new AAA(); 자식은 부모 형태로 저장 할 수 있다.
		//Object a = new AAA();
		Object ss = "test";
		a.catch1(11);
		a.catch1("aaaa");
		a.catch1(1.111);
		a.catch1('a');
		
	}

}
