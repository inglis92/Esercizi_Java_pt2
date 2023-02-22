package serieA;
import java.util.*;

public class SerieA {
    public static void main(String[] args) {
        Giocatore Perin = new Giocatore(12,"Mattia", "perin");
        Giocatore Desciglio = new Giocatore(2,"Mattia", "Desciglio");
        Giocatore Vlahovic = new Giocatore(9,"Dusan", "Vlahovic");
        Giocatore Rabiot = new Giocatore(22,"Adrien", "Rabiot");
        Giocatore Meret = new Giocatore(12,"Alexis", "Meret");
        Giocatore DiLorenzo = new Giocatore(2,"Giovanni", "DiLorenzo");
        Giocatore Anguissa = new Giocatore(9,"Zambo", "Anguissa");
        Giocatore Osimhen = new Giocatore(22,"Victor", "Osihmen");
        Giocatore Maignan = new Giocatore(12,"Mike", "Maignan");
        Giocatore Calabria = new Giocatore(2,"Davide", "Calabria");
        Giocatore Giroud = new Giocatore(9,"Olivier", "Giroud");
        Giocatore Tonali = new Giocatore(22,"Sandro", "Tonali");
        Classifica classifica = new Classifica(3);
        Squadra Juventus = new Squadra("Juv", "Juventus", new Giocatore[]{Perin, Desciglio, Vlahovic, Rabiot});
        Squadra Napoli = new Squadra("Nap", "Napoli", new Giocatore[]{Meret,DiLorenzo,Anguissa,Osimhen});
        Squadra Milan = new Squadra("Mil", "Milan", new Giocatore[]{Maignan,Calabria,Giroud,Tonali});
        classifica.addSquadra(Juventus);
        classifica.addSquadra(Milan);
        classifica.addSquadra(Napoli);
        Partita partita1 = new Partita(Juventus, Milan);
        partita1.esitoPartita(8,1);
        Partita partita2 = new Partita(Juventus, Napoli);
        partita2.esitoPartita(2,1);
        Partita partita3 = new Partita(Napoli, Milan);
        partita3.esitoPartita(3,3);
        Partita partita4 = new Partita(Milan, Juventus);
        partita4.esitoPartita(1,1);
        Partita partita5 = new Partita(Napoli, Juventus);
        partita5.esitoPartita(1,1);
        Partita partita6 = new Partita(Milan, Napoli);
        partita6.esitoPartita(5,1);
        classifica.ordinaClassifica();
        classifica.getClassifica();
        classifica.squadraMigliorAttacco();
        classifica.squadraPeggiorDifesa();





    }
}
