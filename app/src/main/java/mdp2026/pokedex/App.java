package mdp2026.pokedex;


import mdp2026.pokedex.model.Pokemon;
import mdp2026.pokedex.service.Mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    Scanner sc = new Scanner(System.in);
    static boolean[] discovered = new boolean[151];


    public static void main(String[] args) {

        //Loading pokemons into a List
        List<Pokemon> pokemons = null;
        pokemons = Mapping.getPokemons();
        Arrays.fill(discovered, false);

        System.out.println(pokemons.size());

        System.out.println("Benvenuto nel menù principale");
        System.out.println("Questi sono i pokemon che hai scoperto: ");
        for (Pokemon pokemon : pokemons){
            if(discovered[pokemons.indexOf(pokemon)])
                System.out.println(pokemon);
        }
    }
}
