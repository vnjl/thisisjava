package sec13.exam03_field_method_access.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;    //(O)
		a.field2 = 1;    // (O)
		//a.field3 = 1;  // (X) private �ʵ� ���� �Ұ� (������ ����)
		
		a.method1();     //(O)
		a.method2();     // (O)
		//a.method3();   // (X) private �޼ҵ� ���� �Ұ� (������ ����)
	}
}
