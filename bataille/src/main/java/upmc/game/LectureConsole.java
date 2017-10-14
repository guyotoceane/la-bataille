/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author licence
 */
public class LectureConsole implements LecturePseudo {

    private String player1;
    private String player2;

    private ArrayList <String> pseudos;

    public ArrayList<String> lirePseudo() {
        add_pseudo();
        return pseudos;
    }

    private void add_pseudo(){
        Scanner console = new Scanner(System.in);
        pseudos = new ArrayList<String>();

        for(int i=1; i<3 ; i++){
            System.out.print("Entrez le nom du joueur "+ i +" : ");
            System.out.flush();
            pseudos.add(console.nextLine());
        }


    }


}
