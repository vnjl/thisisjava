package sec06.exam07_daemon;

public class AutoSaveThread extends Thread{
	public void save() {
		System.out.println("�۾� ������ ������");
	}
	
	@Override
	public void run() {
		try {
		while(true) {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
				break;
			}
			save();
		}
		
	}

}
