import lampadina.lampadina;

import java.util.*;
public class Main {
    public static void main(String[] args) {

        lampadina bulb = new lampadina(5);
        Interruttore onoff = new Interruttore(bulb);
        onoff.premi();
        onoff.premi();
        onoff.premi();
        onoff.premi();
        onoff.premi();

//Creare un metodo di test che istanzia due interruttori e li collega
// alla stessa lampadina.lampadina e poi offre all’utente ripetutamente la possibilità di clickare
// uno dei due interruttori oppure di terminare l’esecuzione
        int numMaxClick = 3;
        lampadina bulb2 = new lampadina(numMaxClick);
        Interruttore interr1 = new Interruttore(bulb2);
        Interruttore interr2 = new Interruttore(bulb2);
        System.out.println("Scegli quale interruttore vuoi azionare: ");
        System.out.print("Scrivi 1 per Interruttore 1. ");
        System.out.print("Scrivi 2 per Interruttore 2. ");
        System.out.print("Altrimenti scrivi 3 per uscire dalla stanza: ");
        Scanner sc = new Scanner(System.in);
        int selettore;
       do {
            selettore = sc.nextInt();
            switch (selettore) {
                case 1 -> {
                    interr1.premi();

                }
                case 2 -> {
                    interr2.premi();
                }
                case 3 -> {
                    System.out.println("ok, esci dalla stanza lasciando la lampadina " + bulb2.getStato());
                    break;

                }
            }
            numMaxClick--;
        }  while (numMaxClick != 0 &&  selettore != 3);
        if (numMaxClick == 0) {
            System.out.println("La lampadina si è " + bulb2.getStato() + " è ora di cambiarla! Esci dalla stanza e chiama un elettricista!");
        }
    }
}