package sec06.exam04_wait_notify;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();
		try{
			wait();
		}catch(InterruptedException e) {}
	}
	public synchronized void methodAB() {
		System.out.println("ThreadA�� methodB() �۾� ����");
		notify();
		try{
			wait();
		}catch(InterruptedException e) {}
	}
}
