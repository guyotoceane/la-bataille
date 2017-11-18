/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

/**
 * @author licence
 */
public class Card {
    private String color;
    private int value;
    public static String cardsColor[] = {"pique", "carreau", "trèfle", "coeur"};
    public static int cardsValues[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public Card(String color, int value) {
        this.color = color;
        this.value = value;
    }


    public int compare_cards(Card card2) {
        if (this.value > card2.value) {
            return 1;
        } else if (this.value < card2.value) {
            return 2;
        } else {
            return 3;
        }


    }

    public int value() {
        return this.value;
    }

    public String to_string() {
        return this.value + " de " + this.color;
    }
}
