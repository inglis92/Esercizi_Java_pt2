package serieA;

import distributoreBevande.Bevanda;

import java.util.Arrays; // importo la classe Arrays

public class Classifica extends Squadra { // estendo la classe Squadra
    // attributo della classe
    private Squadra[] squadre; // array di squadre
    private int numeroSquadre;

    public Classifica(int numeroSquadre) {
        super();
        this.squadre = new Squadra[numeroSquadre];
    }
    public void addSquadra(Squadra squadra){
            // qui cerco la squadra
            for (int i = 0; i < squadre.length; i++) { // ciclo i prodotti
                if (squadra.equals(squadre[i])) {
                    squadre[i] = squadra;
                    return;
                }
            }
            // se non la trovo cerco un buco
            for (int i = 0; i < squadre.length; i++) {
                if (squadre[i] == null) {
                    squadre[i] = squadra;
                    return;
                }
            }
        }

    // metodo per ordinare la classifica in base al punteggio
    public void ordinaClassifica() {
        // uso il metodo sort della classe Arrays
        Arrays.sort(squadre, (s1, s2) -> s2.getPunteggio() - s1.getPunteggio());
        // il criterio di confronto è il punteggio decrescente
    }
    // metodo per ottenere la classifica ordinata secondo il punteggio
    public Squadra[] getClassifica() {
        // creo una copia dell'array di squadre
        Squadra[] classifica = Arrays.copyOf(squadre, squadre.length);
        // uso il metodo sort della classe Arrays
        Arrays.sort(classifica, (s1, s2) -> s2.getPunteggio() - s1.getPunteggio());
        // il criterio di confronto è il punteggio decrescente
        // ritorno la copia ordinata
        for (int i = 0; i < classifica.length; i++) {
            System.out.println((classifica[i].getNome() + " " + classifica[i].getPunteggio() + "punti"));
        }
        return classifica;
    }

    // metodo per ottenere la squadra che ha segnato più gol
    public String squadraMigliorAttacco() {
        // inizializzo una variabile per il massimo
        int maxGol = 0;
        // inizializzo una variabile per la squadra
        Squadra squadra = null;
        // uso un ciclo for per scorrere l'array di squadre
        for (int i = 0; i < squadre.length; i++) {
            // se la squadra corrente ha segnato più gol del massimo
            if (squadre[i].getGolFatti() > maxGol) {
                // aggiorno il massimo
                maxGol = squadre[i].getGolFatti();
                // aggiorno la squadra
                squadra = squadre[i];
            }
        }
        System.out.println(squadra.getNome() + " ha segnato " + squadra.getGolFatti() + "gol");

        // ritorno la squadra
        return squadra.getNome();
    }

    // metodo per ottenere la squadra con la peggior difesa
    public String squadraPeggiorDifesa() {
        // inizializzo una variabile per il minimo
        int minGol = squadre[0].getGolSubiti(); // il valore massimo di un intero
        // inizializzo una variabile per la squadra
        Squadra squadra = null;
        // uso un ciclo for per scorrere l'array di squadre
        for (int i = 0; i < squadre.length; i++) {
            // se la squadra corrente ha subito meno
            if (squadre[i].getGolSubiti() > minGol) {
                // aggiorno il massimo
                minGol = squadre[i].getGolSubiti();
                // aggiorno la squadra
                squadra = squadre[i];
            }
        }
        // ritorno la squadra
        System.out.println(squadra.getNome() + " ha subito " + squadra.getGolSubiti() + "gol");
        return squadra.getNome();
    }
}