package sec10.exam04_singleton;

public class Singleton {
	// ��ü�� �ϳ� �ۿ� �������� ����.
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
