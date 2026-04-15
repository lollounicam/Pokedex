package mdp2026.pokedex;


import mdp2026.pokedex.model.Pokemon;
import mdp2026.pokedex.service.Mapping;
import mdp2026.pokedex.service.Menu;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    //static boolean[] discovered = new boolean[151];


    public static void main(String[] args) {
        boolean exit = true;
        while (exit) {
            Menu.firstMenu();
        }
    }
}
