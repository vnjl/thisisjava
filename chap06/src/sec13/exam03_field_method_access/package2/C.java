package sec13.exam03_field_method_access.package2;

import sec13.exam03_field_method_access.package1.A;

public class C {
	public C() {
		A a = new A();     
		a.field1 = 1;     //(O)
		//a.field2 = 1;   //(X) default �ʵ� ���� �Ұ� (������ ����) 
		//a.field3 = 1;   //(X) private �ʵ� ���� �Ұ� (������ ����)
		
		a.method1();      //(O)
		//a.method2();    //(X) default �޼ҵ� ���� �Ұ� (������ ����)
		//a.method3();    //(X) private �޼ҵ� ���� �Ұ� (������ ����)
	}
}
