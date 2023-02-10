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
        this.punteggio = 0;
        this.golFatti = 0;
        this.golSubiti = 0;
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
