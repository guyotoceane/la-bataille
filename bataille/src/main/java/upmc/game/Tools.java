package upmc.game;

import java.util.Scanner;

//Boite à outils de fonctions : morceau de code utilisé plusieurs fois (éviter les copier collé de code)
public class Tools {

    //Affichage du menu
    public String menu(String player) {
        Scanner console = new Scanner(System.in);

        if (player.equals("Ordinateur")) {
            return "";
        } else {
            System.out.print(player + ", que voulez vous faire ? \n (enter) tirer une carte \n (q) Quitter le jeu - appuyer que q \n ");
            String result = console.nextLine();
            return result ;
        }
    }
}
