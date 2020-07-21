package davis.l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class MainDemo {
	public static void main(String[] args) throws InterruptedException {
	
		
		System.out.printf("Welcome to War!%n%n");
		System.out.printf("Producer has started running %n");
		System.out.printf("Consumer has started running %n");
		
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		Buffer locationShared = new SynchronizedBuffer();
	

		
        executorService.execute(new Producer(locationShared));
        executorService.execute(new Consumer(locationShared));
		
	
	
	
	}}


