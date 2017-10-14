/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;
import java.util.Scanner;

/**
 *
 * @author licence
 */
public class MenuPseudo {
    public LecturePseudo lirePseudo(){
        Scanner console =  new Scanner(System.in);
        String choice;
        do{
            System.out.print("Comment voulez vous saisir le nom des joueurs ? \n(1)Ouvrir un fichier avec les deux noms \n(2)Saisir les noms dans la console\n");
            choice = console.nextLine();
        }while (!choice.matches("[1-2]"));

        if (choice.equals("1")){
            return new LectureFichier();
        } else {
            return new LectureConsole();
        }

    }
    
}
