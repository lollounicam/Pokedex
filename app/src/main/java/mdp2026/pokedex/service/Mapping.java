package mdp2026.pokedex.service;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import mdp2026.pokedex.model.Pokemon;

import java.io.*;
import java.lang.reflect.Type;
import java.util.List;

public class Mapping {
    public static void main(String[] args) {
    String path = "/Users/lollo/UNI/Metodologie di programmazione/Pokedex/app/src/main/resources/data.json";

    try{
            Gson gson = new Gson();

            FileReader reader = new FileReader(path);

            Type listtype = new TypeToken<List<Pokemon>>(){}.getType();
            List<Pokemon> pokemons = gson.fromJson(reader, listtype);

            for (Pokemon pokemon : pokemons){
                System.out.println(pokemon.getNome());
            }

        }catch (Exception e){
            e.printStackTrace();
            if (e instanceof FileNotFoundException){
                System.out.println("File non trovato");
            }
        }


    }

    public static List<Pokemon> getPokemons() {
        String path = "/Users/lollo/UNI/Metodologie di programmazione/Pokedex/app/src/main/resources/data.json";
        List<Pokemon> pokemons = null;
        try {
            Gson gson = new Gson();
            FileReader reader = new FileReader(path);

            Type listtype = new TypeToken<List<Pokemon>>() {
            }.getType();
            pokemons = gson.fromJson(reader, listtype);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pokemons;
    }
}
