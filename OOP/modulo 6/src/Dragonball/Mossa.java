package Dragonball;

import java.lang.*;
import java.util.Random;

public class Mossa {
    private String nome;
    private double danno;
    private double probabilita;

    public Mossa(String nome, double danno, double probabilita) {
        this.nome = nome;
        this.danno = danno;
        this.probabilita = probabilita;
    }

    public String getNome() {
        return nome;
    }

    public void attacca(Personaggio p1, Personaggio p2){
        double successo = probabilita * p2.getSchivare();
        Random r = new Random();
        successo *= 100;
        int t = r.nextInt(100);
        if(t < successo){
            p2.prendiDanni(danno * p2.getResistenza());
        } else{
            System.out.println("Mossa schivata!");
        }
    }
}
