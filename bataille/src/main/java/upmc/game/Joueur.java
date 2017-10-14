package upmc.game;

import java.util.ArrayList;

public class Joueur {
    private ArrayList<Carte> paquet = new ArrayList<Carte>();
    private String name;
    private int score_player = 0;

    public Joueur(ArrayList<Carte> paquet, String name) {
        this.paquet = paquet;
        this.name = name;
    }

    public Carte viewCards() {
        return this.paquet.get(0);
    }

    //View name


    public String viewName() {
        return this.name;
    }

    //Affichage du score
    public String viewScore() {

        if (this.score_player < 0) {
            return this.name + " : " + 0 + "\n" +
                    "-------------------------------\n";
        } else {
            return this.name + " : " + this.score_player + "\n" +
                    "-------------------------------\n";
        }
    }

    //Connaitre le score mais ne pas l'afficher
    public int score() {
        if (this.score_player < 0) {
            return 0;
        } else {
            return this.score_player;
        }
    }

    public int view_nb_card() {
        return this.paquet.size();
    }

    //Enlever une carte du tas (après avoir joué)
    void suppr_card() {
        this.paquet.remove(this.paquet.get(0));
    }

    //Ajouter des cartes au fond du tas si on a gagné
    void add_card(Carte card1) {
        this.paquet.add(card1);
    }

    //Ajouter des points au score
    void score(int point) {
        this.score_player += point;
    }


}
