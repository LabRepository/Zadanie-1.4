/**
 * @author Jakub Czyszczonik ,
 * Class Card represent information about card (color and value)
 * Color:
 * 0 == Heart
 * 1 == Diamonds
 * 2 == Clubs
 * 3 == Spades
 *
 * Suits:
 * 0 == 2
 * 1 == 3
 * 2 == 4
 * 3 == 5
 * 4 == 6
 * 5 == 7
 * 6 == 8
 * 7 == 9
 * 8 == 10
 * 9 == Jack
 * 10 == Queen
 * 11 == King
 * 12 == Ace
 *
 */

public class Card implements Comparable<Card> {
    int color;
    int value;
    int number;

    public Card(int number){
        this.number = number;
        this.color = number / 13;
        this.value = number % 13;
    }

    @Override
    public int compareTo(Card other) {
        if(this.number > other.number){
            return 1;
        } else if(this.number < other.number){
            return -1;
        } else {
            return 0;
        }
    }

}
