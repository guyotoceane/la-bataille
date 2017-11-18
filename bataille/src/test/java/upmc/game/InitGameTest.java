package upmc.game;

import org.junit.*;

import static org.junit.Assert.*;

public class InitGameTest {

    private InitGame init_game;

    @Before
    public void init(){
        init_game = new InitGame();
        init_game.init_deck();
        init_game.mix_deck();
        init_game.delivery_cards();
    }

    @Test
    public void delivery_cards(){
        System.out.println();
        boolean result = false;

        if(InitGame.deck1.size()==26 && InitGame.deck2.size()==26){
            result = true;
        }

        assertTrue(result);
    }


}