package remijan.m;

import java.security.SecureRandom;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Producer implements Runnable {

    protected Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        System.out.printf("Producer has started running%n");
        SecureRandom random
            = new SecureRandom();

        while (true) {
            try {
                Thread.sleep(random.nextInt(1000 * 4) + 1);
                int x = random.nextInt(13) + 1;
                switch (x) {
                    case 1:
                        buffer.blockingPut(new Card(Card.Value.TWO));
                        break;
                    case 2:
                        buffer.blockingPut(new Card(Card.Value.THREE));
                        break;
                    case 3:
                        buffer.blockingPut(new Card(Card.Value.FOUR));
                        break;
                    case 4:
                        buffer.blockingPut(new Card(Card.Value.FIVE));
                        break;
                    case 5:
                        buffer.blockingPut(new Card(Card.Value.SIX));
                        break;
                    case 6:
                        buffer.blockingPut(new Card(Card.Value.SEVEN));
                        break;
                    case 7:
                        buffer.blockingPut(new Card(Card.Value.EIGHT));
                        break;
                    case 8:
                        buffer.blockingPut(new Card(Card.Value.NINE));
                        break;
                    case 9:
                        buffer.blockingPut(new Card(Card.Value.TEN));
                        break;
                    case 10:
                        buffer.blockingPut(new Card(Card.Value.JACK));
                        break;
                    case 11:
                        buffer.blockingPut(new Card(Card.Value.QUEEN));
                        break;
                    case 12:
                        buffer.blockingPut(new Card(Card.Value.KING));
                        break;
                    case 13:
                        buffer.blockingPut(new Card(Card.Value.ACE));
                        break;
                }
            } catch (InterruptedException e) {

            }
        }
    }

}
