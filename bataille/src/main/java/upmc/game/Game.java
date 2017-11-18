package upmc.game;

import java.util.ArrayList;

public class Game {
    private String decision;
    private String decision1;
    public static Joueur game1;
    public static Joueur game2;
    private Card card1;
    private Card card2;

    //Create an array id there is War !
    ArrayList<Card> bataille = new ArrayList<Card>();

    public Game(Joueur game1, Joueur game2){
        this.game1 = game1;
        this.game2 = game2;
    }



    //use a while for execute the game
    public void loop(){
        Tools tools = new Tools();
        String decision = tools.menu(this.game1.view_name());
        String decision1 = tools.menu(this.game2.view_name());

        while (decision.equals("") && decision1.equals("")){
            //Cards draw
            System.out.println(pull());

            //Cards compare
            int result = card1.compare_cards(card2);

            result(result);

            System.out.println(view_result());

            if (this.game1.score() == 100 || this.game2.score() == 100) {
                System.out.println(end_message());
                break;
            }

            decision = tools.menu(this.game1.view_name());

            decision1 = tools.menu(this.game2.view_name());

        };
    }

    public String pull(){
        card1 = game1.viewCards();
        card2 = game2.viewCards();
        return "-------------------------------\n" + this.game1.view_name() + " tire une carte : " + card1 + "\n-------------------------------\n"+
                this.game2.view_name() + " tire une carte : " + card2 + "\n-------------------------------\n";

    }

    public void result(int result){
        if (result == 1) {
            winner(game1);

        } else if (result == 2) {
            winner(game2);
        } else {
            System.out.println("----------------\n" +
                    "|  BATAILLE !  |\n" +
                    "----------------\n");
            bataille.add(card1);
            bataille.add(card2);
            this.game1.suppr_card();
            this.game2.suppr_card();
        }
    }

    public void winner(Joueur game){
        game.score(1);
        game.add_card(card1);
        game.add_card(card2);
        this.game1.suppr_card();
        this.game2.suppr_card();

        for (int b = 0; b < bataille.size(); b++) {
            game.add_card(bataille.get(b));
        }
        bataille.clear();
    }

    public String view_result(){
        return "Scores : \n"+
                "-------------------------------\n"+
                game1.view_score() +
                game2.view_score();
    }

    public String end_message(){
        return "La partie est fini ! \n Voici les scores : \n"+
                "-------------------------------\n"+
                this.game1.view_score()+
                this.game2.view_score();
    }

}
