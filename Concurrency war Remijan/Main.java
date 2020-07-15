package remijan.m;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Page 982
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main {
    public static void main(String[] args) {
        System.out.printf("Welcome to WAR!%n%n");
        ExecutorService pool
            = Executors.newCachedThreadPool();
        
        Buffer buffer
            = new SynchronizedBuffer();
                
        pool.execute(new Producer(buffer));
        pool.execute(new Consumer(buffer));
    }
}
