package sec06.exam04_wait_notify;

public class WaitNotifyExample {

	public static void main(String[] args) {
		WorkObject shareObject = new WorkObject();
		ThreadA threadA = new ThreadA(shareObject);
		ThreadB threadB = new ThreadB(shareObject);
		threadA.start();
		threadB.start();

	}

}
