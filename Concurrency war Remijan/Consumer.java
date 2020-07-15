package remijan.m;

import java.security.SecureRandom;

/**
 * Page 980
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Consumer implements Runnable {

    protected Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.printf("Consumer has started running%n");
        
        SecureRandom random
            = new SecureRandom();

        while (true) {
            try {
                Thread.sleep(random.nextInt(1000 * 4) + 1);
                
                Card c1 = null;
                Card c2 = null;
                for (int i = 1; i <= 2; i++) {
                    switch (i) {
                        case 1:
                            c1 = buffer.blockingGet();
                            break;
                        case 2:
                            c2 = buffer.blockingGet();
                    }
                }
                
                System.out.printf("%n");
                System.out.printf("  PLAY GAME%n");
                System.out.printf(
                    "  Card 1 is \"%s\", Card 2 is \"%s\". "
                    ,c1.toString()
                    ,c2.toString()
                );
                int compare = c1.compareTo(c2);
                if (compare < 0) {
                    System.out.printf("Winner is Card 2");
                }
                else
                if (compare > 0) {
                    System.out.printf("Winner is Card 1");
                }
                else {
                    System.out.printf("Cards tie!");
                }
                
                System.out.printf("%n%n");
            } catch (InterruptedException e) {

            }
        }
    }

}
