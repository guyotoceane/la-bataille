package upmc.game;

import org.junit.*;

import static org.junit.Assert.*;

public class CardTest {
    private Card card;

    @Before
    public void create_card() {
        card = new Card("coeur", 10);
    }

    @Test
    public void test_compare_cards() {
        Card card2 = new Card("pique", 5);
        int compare = card.compare_cards(card2);

        boolean result;

        //Test si la deuxième carte est bien inférieur à la première
        switch (compare) {
            case 1:
                result = true;
                break;
            case 2:
                result = false;
                break;
            default:
                result = false;
                break;
        }

        assertTrue(result);


    }


}