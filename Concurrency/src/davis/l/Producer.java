package davis.l;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;


public class Producer implements Runnable {
	private static final SecureRandom generate = new SecureRandom();
	private final Buffer locationShared;
	
	public Producer (Buffer locationShared) {
		this.locationShared = locationShared;
	}


	@Override
	public void run() {

		
	while (true) {

ArrayList<String> sharedSimpleArray = new ArrayList<String>();

sharedSimpleArray.add("2");
sharedSimpleArray.add("3");
sharedSimpleArray.add("4");
sharedSimpleArray.add("5");
sharedSimpleArray.add("6");
sharedSimpleArray.add("7");
sharedSimpleArray.add("8");
sharedSimpleArray.add("9");
sharedSimpleArray.add("10");
sharedSimpleArray.add("JACK");
sharedSimpleArray.add("QUEEN");
sharedSimpleArray.add("KING");
sharedSimpleArray.add("ACE");

	


for (int count = 0; count < sharedSimpleArray.size(); count++) {
	
	while (true) {



   try { 
	
	   Collections.shuffle(sharedSimpleArray);
	  locationShared.blockingPut( sharedSimpleArray.get(count));
	  System.out.println("Producer produced " + sharedSimpleArray.get(count));
	  Thread.sleep(generate.nextInt(4000)); 
	  System.out.printf("Buffer Empty. Consumer waits...%n");
}

catch(InterruptedException e) {
	Thread.currentThread().interrupt();
}

	

}
	 
}
	
}

}}




	