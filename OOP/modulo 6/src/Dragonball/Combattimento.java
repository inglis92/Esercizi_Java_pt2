package Dragonball;

import java.lang.*;
import java.util.Random;

public class Combattimento {
    public Personaggio[] p;
    public int turno;

    public Combattimento(Personaggio p1,Personaggio p2) {
        p = new Personaggio[2];
        p[0] = p1;
        p[1] = p2;
        turno = 0;
    }



    public void combatti(){
        Random r = new Random();
        int t = r.nextInt(2);
        int mod = (t + 1) % 2;
        System.out.println(p[t].getNome() + " inizia per primo!");
        while(true){
                p[t].scegliMossa(p[mod]);
                if(p[mod].getPuntivita() <= 0){
                    System.out.println(p[t].getNome() + " ha vinto!");
                    break;
                }
                t = (t + 1) % 2;
                mod = (t + 1) % 2;
        }

    }


}
