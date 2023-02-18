package turista_facoltoso.entities.users;

import java.time.LocalDate;
import java.util.HashSet;

import turista_facoltoso.database.Database;
import turista_facoltoso.entities.Abitazione;
import turista_facoltoso.entities.Prenotazione;

public class Host extends Utente {

    private static int codiceTot = 0;

    private int codiceHost;
    private HashSet<Integer> abitazioni; //i codici delle abitazioni possedute dall'host 

    public Host(String nome, String cognome, String mail, String indirizzo) {
        super(nome, cognome, mail, indirizzo);
        codiceHost = codiceTot++;
    }

    public int getCodiceHost() { return codiceHost;}
    public HashSet<Integer> getAbitazioni() { return abitazioni;}

    public void setAbitazioni(HashSet<Integer> abitazioni) {this.abitazioni = abitazioni;}
    public void setCodiceHost(int codiceHost) {this.codiceHost = codiceHost;}
    
    /**
     * @param nome
     * @param indirizzo
     * @param prezzo
     * @param nLocali
     * @param nPostiLetto
     * @param piano
     * @param inizioDisponibilità
     * @param fineDisp
     */
    public void addAbitazione(String nome, String indirizzo, double prezzo, int nLocali, int nPostiLetto, int piano,
    LocalDate inizioDisponibilità, LocalDate fineDisp ) {
        Abitazione ab = new Abitazione(nome, indirizzo, prezzo, nLocali, nPostiLetto, piano, inizioDisponibilità, fineDisp, this.getId());
        Database.addAbitazione(ab);

        
    }
    /**
     * @param idAbitazione
     */
    public void removeAbitazione(int idAbitazione) {
        Database.removeAbitazione(idAbitazione);
    }
    public void cambiaDisponibilita(){

    }

    public void removePrenotazione(){

    }
    
    /**
     * @return
     */
    public HashSet<Prenotazione> prenotazioniHost(){
        return null;}
    /**
     * @param idAbitazione
     * @return
     */
    public HashSet<Prenotazione> prenotazioniHost(int idAbitazione){
        return null;
    }
    
    public double mediaHost() {
        return 0.0;
    }

    public double mediaAbitazione(int idAbitazione) {
        return 0.0;    
    }

    public int getId() {
        return 0;
    }


    
}
