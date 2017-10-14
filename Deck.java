import java.util.*;
/**
 * @author Jakub Czyszczonik
 */
public class Deck {
    /**
     *  Index of array equals position in Deck 0 == Top of Deck
     */
    protected Card [] cards;
    /**
     * Class constructor
     *  Default constructor construct
     */
    public Deck() {
        cards = new Card[52];
        for(int index = 0;index < 52;index++) {
            cards[index] = new Card(index);
        }
    }


    /**
     * Class constructor
     * @param setting 9 - deck start at nine, 7 - deck start at seven, else full deck .
     *
     */
    public Deck(int setting){
        if(setting == 9){
            cards = new Card[24];
            for(int index = 0;index < 24;index++){
                cards[index] = new Card(index+28);
            }
        } else if(setting == 7){
            cards = new Card[32];
            for(int index = 0;index < 32;index++){
                cards[index] = new Card(index+20);
            }
        } else {
            cards = new Card[52];
            for(int index = 0;index < 52;index++) {
                cards[index] = new Card(index);
            }
        }
    }

    public void sort(){
        Arrays.sort(cards);
    }

    public Card firstCard(){
        return cards[0];
    }
    public void shuffle(){
        int n = cards.length;
        Random random = new Random();
        for (int i = 0; i < cards.length; i++) {
            // Get a random index of the array past the current index.
            int randomValue = i + random.nextInt(n - i);
            // Swap the random element with the present element.
            int randomElement = cards[randomValue].number;
            cards[randomValue].number = cards[i].number;
            cards[i].number = randomElement;
        }
    }
}
