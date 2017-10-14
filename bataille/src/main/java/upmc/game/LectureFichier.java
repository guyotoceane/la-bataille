/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package upmc.game;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class LectureFichier implements LecturePseudo {

    private File file;
    private ArrayList<String> pseudos;
    Scanner console = new Scanner(System.in);

    public ArrayList<String> lirePseudo() {


        System.out.print("Entrez le nom du fichier (avec extention) : \n");
        this.file = new File(console.nextLine());

        while (!this.file.exists()) {
            System.out.println("Erreur, Le fichier saisie est introuvable. \n Entrez le nom du fichier (avec extention) :");
            this.file = new File(console.nextLine());
        }

        try {
            add_pseudo();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pseudos;
    }

    //add pseudo from file in a arraylist
    private void add_pseudo() throws IOException {
        pseudos = new ArrayList<String>();

        InputStream ips = new FileInputStream(this.file);
        InputStreamReader ipsr = new InputStreamReader(ips);
        BufferedReader br = new BufferedReader(ipsr);
        String ligne;
        while ((ligne = br.readLine()) != null) {
            pseudos.add(ligne);
        }
        br.close();
    }

}
