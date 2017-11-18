/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.ArrayList;

/**
 *
 * @author licence
 */
public class InitGame {
    // INITIALISATION DU PAQUET DE CARTES

    public static ArrayList<Card> deckPack = new ArrayList<Card>();
    public static ArrayList<Card> mixDeckPack = new ArrayList<Card>();
    public static ArrayList<Card> deck1 = new ArrayList<Card>();
    public static ArrayList<Card> deck2 = new ArrayList<Card>();

    public InitGame() {
        this.deckPack = deckPack;
        this.mixDeckPack = mixDeckPack;
        this.deck1 = deck1;
        this.deck2 = deck2;
    }

    public void init_deck() {
        for (int i = 0; i < Card.cardsColor.length; i++) {
            for (int j = 0; j < Card.cardsValues.length; j++) {
                Card card = new Card(Card.cardsColor[i], Card.cardsValues[j]);
                deckPack.add(card);
            }
        }
    }

    public void mix_deck() {
        // Mélange du pacquet de carte et distribution des cartes
        for (int k = 0; k < 52; k++) {
            int random = (int) (Math.random() * (51 - k));
            this.mixDeckPack.add(deckPack.get(random));
            this.deckPack.remove(deckPack.get(random));
            
        }
    }
    
    public void delivery_cards(){
        for (int k = 0; k < 52; k++) {
            if (k % 2 == 0) {
                this.deck1.add(mixDeckPack.get(k));
           } else {
                this.deck2.add(mixDeckPack.get(k));
            }
            
        }
    }
    
    //void who call other void from Class
    public void init_game(){
        init_deck();
        mix_deck();
        delivery_cards();
    }
}
