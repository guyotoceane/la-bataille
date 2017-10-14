// Copyright 2017 Pierre Talbot (IRCAM)

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

//     http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package upmc.game;

import java.util.ArrayList;

import java.util.Scanner;

public class Bataille {
    public static Game game;
    public static Joueur game1;
    public static Joueur game2;
    public static String player1;
    public static String player2;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //start of the game (rules, init players, init deck)
        init();

        //Loop for continue game
        game = new Game(game1, game2);
        game.loop();

        if (game1.score() == 100 || game1.score() > game2.score() || game1.view_nb_card() > game2.view_nb_card()) {
            System.out.println(final_result(player1));

        } else if (game2.score() == 100 || game1.score() < game2.score() || game1.view_nb_card() < game2.view_nb_card()) {
            System.out.println(final_result(player1));
        }

    }

    public static String final_result(String player) {
        return game.end_message() +
                "///////////////////////////////\n" +
                player + " a gagné\n" +
                "///////////////////////////////\n";
    }

    //start of the game (rules, init players, init deck)
    public static void init() {
        System.out.println("C'est le jeu de la bataille!\n");
        System.out.println("But du jeu : \n Etre le premier à avoir 100 points. \n Vous marquez 1 point dès que vous avez un nombre supérieur à votre adversaire \n Bonne chance :) \n\n");

        // Init game
        InitGame initgame = new InitGame();
        initgame.init_game();
        ArrayList<Carte> deck1 = InitGame.deck1;
        ArrayList<Carte> deck2 = InitGame.deck2;

        //Init two players
        InitPlayers players = new InitPlayers();

        int nbPlayer = players.choose_type_player();

        while (nbPlayer == 0) {
            nbPlayer = players.choose_type_player();
        }

        players.add_name_players(nbPlayer);
        player1 = InitPlayers.player1;
        player2 = InitPlayers.player2;

        //Layout deck
        game1 = new Joueur(deck1, player1);
        game2 = new Joueur(deck2, player2);
    }
}
