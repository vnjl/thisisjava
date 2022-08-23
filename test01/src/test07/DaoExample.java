package test07;

public class DaoExample {
	/*dbWork�̶�� �޼ҵ带 ȣ���� �� �Ű� ������ DataAccessObject dao��� �������̽��� ���� �Ǿ� �����Ƿ� 
	OracleDao�� MySqlDao�� �������̽� ���� Ŭ������ �����ϵ� dao.select(); ~ dao.delete(); 4���� �߻� �޼ҵ带 ������*/
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
