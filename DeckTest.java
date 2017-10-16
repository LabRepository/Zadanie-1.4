import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.Assert.*;

/**
 * Created by Jakub Czyszczonik on 11.10.2017. konflikt2
 */
public class DeckTest {
    private Deck deck;
    @Before
    public void setUp() throws Exception {
        deck = new Deck(7);
        System.out.println("Start Testing!");

    }


    @After
    public void tearDown() throws Exception {
        System.out.println("End Testing");
    }


    @Test
    public void testAfterSortingFirstCardEquals20() throws Exception {
        deck.sort();
        assertEquals(20,deck.firstCard().number);

    }
    @Test(expected= IndexOutOfBoundsException.class) public void outOfBounds() {
        System.out.println(deck.cards[52]);
    }

    @Test(timeout = 25)
    public void suffleAndSortingTimeBelow25() {
        deck.shuffle();
        deck.sort();
        assertEquals(20, deck.firstCard().number);
    }

    @Ignore
    public void notWorkingYet() {
        System.out.println("not working yet");
    }

}