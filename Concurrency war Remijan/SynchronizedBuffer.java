package remijan.m;

/**
 * Page 989
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class SynchronizedBuffer implements Buffer {

    protected Card buffer = null;
    protected boolean occupied = false;
    
    @Override
    public synchronized void blockingPut(Card c) throws InterruptedException {
        while (occupied) {
            System.out.printf("Buffer full. Producer waits...%n");
            wait();
        }
        
        buffer = c;
        occupied = true;
        
        System.out.printf("Producer produced %s%n", c);
        notifyAll();
    }

    @Override
    public synchronized Card blockingGet() throws InterruptedException {
        while (!occupied) {
            System.out.printf("Buffer empty. Consumer waits...%n");
            wait();
        }
        occupied = false;
        notifyAll();
        return buffer;
    }

}
