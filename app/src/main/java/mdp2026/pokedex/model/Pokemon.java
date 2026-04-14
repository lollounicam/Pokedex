package mdp2026.pokedex.model;

//{"numero":1,"nome":"Bulbasaur","tipo1":"Erba","tipo2":"Veleno","altezza":0.7,"peso":6.9},


public class Pokemon {
    public int numero;
    public String nome;
    public String tipo1;
    public String tipo2;
    public float altezza;
    public float peso;
    public boolean discovered;

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

    public boolean isDiscovered() {
        return discovered;
    }

    public void stampaDettagli(){
        System.out.println("🔹 Pokémon #" + numero + "\n" +
                "Nome: " + nome + "\n" +
                "Tipo: " + tipo1 + (tipo2 != null ? " / " + tipo2 : "") + "\n" +
                "Altezza: " + altezza + " m\n" +
                "Peso: " + peso + " kg\n");
    }

    @Override
    public String toString() {
        return "🔹 Pokémon #" + numero + "\n" +
                "Nome: " + this.nome;
    }

}



