class FetchData extends Thread{
	public  void run() {
		try{
			System.out.println("FetchData Thread has started");
			Thread.sleep(5000);
			System.out.println("FetchData Thread has ended");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class ProcessData implements Runnable{
	public  void run() {
		try{
			System.out.println("ProcessData Thread has started");
			Thread.sleep(10000);
			System.out.println("ProcessData Thread has ended");
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FetchData fetchData=new FetchData();
		ProcessData processData=new ProcessData();
		Thread t=new Thread(processData);
		
		fetchData.start();
		try {
		fetchData.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		t.start();

	}

}
