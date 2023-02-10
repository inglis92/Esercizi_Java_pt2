package serieA;

public class Partita {
    protected Squadra squadraCasa,squadraOspite;
    protected int golCasa, golOspite;

    // gestisce il punteggio delle due squadre in base all'esito
    public void esitoPartita(Squadra squadraCasa, int golCasa, Squadra squadraOspite, int golOspite){
        squadraCasa.golFatti +=golCasa;
        squadraOspite.golFatti +=golOspite;
        if (golCasa == golOspite) {
             squadraCasa.punteggio += 1;
             squadraOspite.punteggio += 1;
         } else if (golCasa > golOspite) {
             squadraCasa.punteggio += 3;
         } else squadraOspite.punteggio +=3;
    }

}
