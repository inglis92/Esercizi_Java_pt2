package Dragonball;

import java.util.Objects;
import java.util.Random;

public class Personaggio implements Comparable<Personaggio>{
    private Tipo tipo;
    private String nome;
    private double puntivita;
    private double schivare;
    private double resistenza;
    private double forza;

    private Mossa[] mosse;
    private int imosse;

    public Personaggio(Tipo tipo, String nome, int puntivita, double schivare, double forza, double resistenza, double probabilita) {
        this.tipo = tipo;
        this.nome = nome;
        this.resistenza = resistenza;
        this.puntivita = puntivita;
        this.schivare = schivare;
        mosse = new Mossa[5];
        mosse[0] = new Mossa("fisico", forza, probabilita);
        imosse = 1;
    }

    public double getSchivare(){
        return schivare;
    }

    public void prendiDanni(double danni){
        puntivita -= danni;
        System.out.println("Danni inflitti: " + danni);
        if(puntivita > 0)
            System.out.println(this.nome + " ha ancora " + puntivita + " punti vita.");
        else
            System.out.println(this.nome + " è stato sconfitto.");
    }

    public double getResistenza(){
        return resistenza;
    }

    public void addMosse(Mossa a){
        mosse[imosse] = a;
        imosse++;
    }

    public String getNome() {
        return nome;
    }

    public double getPuntivita(){
        return puntivita;
    }

    public void scegliMossa(Personaggio p2){
        Random r = new Random();
        int t = r.nextInt(5);
        System.out.println(this.nome + " usa " + mosse[t].getNome());
        mosse[t].attacca(this, p2);
    }

    @Override
    public int compareTo(Personaggio o) {
        if(this.puntivita > o.puntivita){
            return 1;
        }else if(this.puntivita < o.puntivita){
            return -1;
        }else{
            return 0;
        }
    }
}
