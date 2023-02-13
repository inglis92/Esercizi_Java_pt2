package serieA;

public class Squadra {
   protected String id;
    protected String nome;
    protected Giocatore[] rosaDiGiocatori;
    protected int punteggio, golFatti, golSubiti;

    public Squadra(String id, String nome, Giocatore[] rosaDiGiocatori) {
        this.id = id;
        this.nome = nome;
        this.rosaDiGiocatori = rosaDiGiocatori;
        punteggio = 0;
        golFatti = 0;
        golSubiti = 0;
    }

    public Squadra() {

    }

    public String getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public Giocatore[] getRosaDiGiocatori() {
        return rosaDiGiocatori;
    }

    public void setRosaDiGiocatori(Giocatore[] rosaDiGiocatori) {
        this.rosaDiGiocatori = rosaDiGiocatori;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public int getGolFatti() {
        return golFatti;
    }

    public int getGolSubiti() {
        return golSubiti;
    }

}
