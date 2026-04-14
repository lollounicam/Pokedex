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

        //Loading pokemons into a List
        List<Pokemon> pokemons = null;
        pokemons = Mapping.getPokemons();
//        Arrays.fill(discovered, false);
//
//        discovered[10] = true;

        //System.out.println(pokemons.size());

        boolean exit = true;
        while (exit) {
            Menu.firstMenu();
            for (Pokemon pokemon : pokemons) {
                if (pokemon.discovered)
                   System.out.println(pokemon);
            }
            System.out.print("Inserisci un numero per approfondire dettagli sul pokemon o 999 per uscire: ");
            int choice = sc.nextInt();
            //1-151
            if(choice == 999){
                break;
            }
            if (choice > 0 && choice < 152) {
                if (pokemons.get(choice - 1).discovered) {
                    pokemons.get(choice - 1).stampaDettagli();
                }else{
                    pokemons.get(choice - 1).discovered = true;
                }
                //System.out.println(pokemons.get(choice - 1));
            }else{
                System.out.println("Inserisci un valore corretto!");
            }

        }
    }
}
