package davis.l;

public interface Buffer {
	
	public void blockingPut(String value) throws InterruptedException;
		
	public String blockingGet() throws InterruptedException;
	

}
// 23.9