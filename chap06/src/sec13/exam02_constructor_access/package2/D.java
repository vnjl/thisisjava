package sec13.exam02_constructor_access.package2;

import sec13.exam02_constructor_access.package1.A;

public class D {
    //�ʵ�
    A a1 = new A(true);      //(O)
    //A a2 = new A(1);       //(X) default ������ ���� �Ұ�(������ ����)
    //A a3 = new A("���ڿ�");  //(X) private ������ ���� �Ұ�(������ ����)
}
