package mdp2026.pokedex.service;

import mdp2026.pokedex.model.Pokemon;

import java.util.List;
import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);
    static List<Pokemon> pokemons = Mapping.getPokemons();

    public static void firstMenu(){
        System.out.println("Inserisci un numero per approfondire dettagli sul pokemon o 999 per uscire: ");
        for (Pokemon pokemon : pokemons) {
            if (pokemon.discovered)
                System.out.println(pokemon);
        }

        int choice = sc.nextInt();
        //1-151
//        if(choice == 999){
//            break;
//        }
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

    public static int secondMenu(){
        System.out.println("Vuoi scoprire un altro pokemon? Inserisci un numero");
        return 1;
    }
}
