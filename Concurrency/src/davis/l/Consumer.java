package davis.l;
import java.util.ArrayList;
import java.security.SecureRandom;


public class Consumer implements Runnable
{
private final Buffer locationShared;
private static final SecureRandom generate = new SecureRandom();
//buffer = value;
public Consumer(Buffer locationShared) {
	this.locationShared = locationShared;
		
}
@Override
public  void run() {
		
	
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
	sharedSimpleArray.add("11");
	sharedSimpleArray.add("12");
	sharedSimpleArray.add("13");
	sharedSimpleArray.add("14");

	while (true)	
		
		try { 
			
					
	 String Card1 = locationShared.blockingGet();	
	 String Card2 = locationShared.blockingGet();
	  
	 System.out.printf("%nPlay Game%n");
	 
	 System.out.printf("Card 1 is \"%s\"", Card1);
	 System.out.printf(", Card 2 is \"%s\".", Card2);
	 	
	 if (Card1.compareTo(Card2) > 0) {
     System.out.printf("  Winner is Card 1%n%n");}
	 else if (Card2.compareTo(Card1) > 0) {
	  System.out.printf(" Winner is Card 2%n%n");}
	                                                         
		else {
		 System.out.printf(" Cards Tie!%n%n");
		 
		 Thread.sleep(generate.nextInt(4000));
		
	}
	}
		
catch(InterruptedException e) {
	Thread.currentThread().interrupt();
}	
}
}


	





