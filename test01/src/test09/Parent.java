package test09;

public class Parent {
	public String nation;
	
	public Parent() {  // (4) ���ڰ� �ϳ��� �Ʒ� �޼ҵ带 ȣ���ϰ� ����
		this("���ѹα�");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) { // (5) ����Ǹ鼭 println() ���� �����
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
