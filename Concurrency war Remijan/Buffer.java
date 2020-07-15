package remijan.m;

/**
 * Page 978
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public interface Buffer {
    void blockingPut(Card c) throws InterruptedException;
    Card blockingGet() throws InterruptedException;
}
