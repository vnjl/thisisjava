package sec06.exam02_yield;

public class ThreadB extends Thread{
	public boolean stop = false;
	public boolean work = true;
	
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				try {Thread.sleep(1000);}catch(InterruptedException e){}
				System.out.println("ThreadB �۾� ����");
			}else {
				Thread.yield();
			}
			
		}
		System.out.println("ThreadB ����");
	}

}
