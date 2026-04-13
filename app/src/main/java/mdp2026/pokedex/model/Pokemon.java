package mdp2026.pokedex.model;

//{"numero":1,"nome":"Bulbasaur","tipo1":"Erba","tipo2":"Veleno","altezza":0.7,"peso":6.9},


import com.google.gson.Gson;

import java.io.FileReader;

public class Pokemon {
    public int numero;
    public String nome;
    public String tipo1;
    public String tipo2;
    public float altezza;
    public float peso;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo1() {
        return tipo1;
    }

    public void setTipo1(String tipo1) {
        this.tipo1 = tipo1;
    }

    public String getTipo2() {
        return tipo2;
    }

    public void setTipo2(String tipo2) {
        this.tipo2 = tipo2;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setAltezza(float altezza) {
        this.altezza = altezza;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static void main(String[] args) {
        try{
            Gson gson = new Gson();

            FileReader reader = new FileReader("data.json");

            Pokemon pokemon = gson.fromJson(reader, Pokemon.class);
            System.out.println(pokemon.getNome());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



