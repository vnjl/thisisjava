package sec13.exam02_constructor_access.package1;

public class B {
	public B() {
		//�ʵ�
		A a1 = new A(true);     // (O)
		A a2 = new A(1);        // (O)
		//A a3 = new A("���ڿ�"); // (X) private ������ ���� �Ұ� (������ ����)
	}
}
