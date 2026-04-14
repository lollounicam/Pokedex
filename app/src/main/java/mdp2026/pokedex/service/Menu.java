package mdp2026.pokedex.service;

import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public static void firstMenu(){
        System.out.println("Benvenuto nel menù principale qui puoi vedere i pokemon scoperti");
    }

    public static int secondMenu(){
        System.out.println("Vuoi scoprire un altro pokemon? Inserisci un numero");
        return 1;
    }
}
