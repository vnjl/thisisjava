package test09;

public class Child extends Parent{
	private String name;
	
	public Child() {  // (1) super(); �����Ǿ�� ��. �׷��� this() ������ ������� ����
		this("ȫ�浿"); // (2) ���ڰ� �ϳ���  �Ʒ� �޼ҵ� child(String name)�� �����
		System.out.println("Child() call");
	}
	
	public Child(String name) { // (3)�� ������(�Ķ���Ͱ� �ϳ���...) super()�� ȣ��
		super();
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
