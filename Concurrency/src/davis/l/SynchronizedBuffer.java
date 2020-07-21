

package davis.l;

public class SynchronizedBuffer implements Buffer {
	private boolean occupied = false;
	private String buffer;
			

@Override
public synchronized void blockingPut(String value)
throws InterruptedException {
	
	while (occupied) {
	wait();
	
	}	

buffer = value;
occupied = true;
notifyAll();

}


@Override
public synchronized String blockingGet() throws InterruptedException {
	String readValue1;
		
	while (!occupied) {
		wait();
			
}

occupied = false;
readValue1 = buffer;

notifyAll();
occupied = false;
readValue1 = buffer;

notifyAll();
return readValue1;
 }
}
 	















	
	




















































































