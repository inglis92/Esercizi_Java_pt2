package serieA;

public class Partita {
    protected Squadra squadraCasa,squadraOspite;
    protected int golCasa, golOspite;

    public Partita(Squadra squadraCasa, Squadra squadraOspite) {
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
    }

    // gestisce il punteggio delle due squadre in base all'esito
    public void esitoPartita(int golCasa, int golOspite){
        squadraCasa.golFatti +=golCasa;
        squadraCasa.golSubiti +=golOspite;
        squadraOspite.golSubiti +=golCasa;
        squadraOspite.golFatti +=golOspite;
        if (golCasa == golOspite) {
             squadraCasa.punteggio += 1;
             squadraOspite.punteggio += 1;
         } else if (golCasa > golOspite) {
             squadraCasa.punteggio += 3;
         } else squadraOspite.punteggio +=3;
    }

}
