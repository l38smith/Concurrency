package remijan.m;

/**
 *
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Card implements Comparable<Card> {
    public static enum Value {
          TWO   (2,"2")
        , THREE (3,"3")
        , FOUR  (4,"4")
        , FIVE  (5,"5")
        , SIX   (6,"6")
        , SEVEN (7,"7")
        , EIGHT (8,"8")
        , NINE  (9,"9")
        , TEN   (10,"10")
        , JACK  (11,"J")
        , QUEEN (12,"Q")
        , KING  (13,"K")
        , ACE   (14,"A")
        ;
        
        private Integer i;
        private String s;
        private Value(int i, String s) {
            this.i = i;
            this.s = s;
        }
    }
    
    protected Value value;
    
    public Card(Value value) {
        this.value = value;
    }
    
    @Override
    public String toString() {
        return value.s;
    }
    
    @Override
    public int compareTo(Card o) {
        return this.value.i.compareTo(o.value.i);
    }
}
