package sec13.exam03_field_method_access.package1;

public class A {
	//�ʵ�
	public int field1;  //public ���� ����
	int field2;         //default ���� ���� 
	private int field3; //private ���� ����
	
	//������
	public A() {
		// Ŭ������ ������ ��� ���� �������� ������ ���� �ʴ´�.
		field1 = 1; //(O) 
		field2 = 1; //(O) 
		field3 = 1; //(O)
		
		method1(); //(O)
		method2(); //(O)
		method3(); //(O)
	}
	
	//�޼ҵ�
	public void method1() {}  //public ���� ����
	void method2() {}         //default ���� ���� 
	private void method3() {} //private ���� ����
}
