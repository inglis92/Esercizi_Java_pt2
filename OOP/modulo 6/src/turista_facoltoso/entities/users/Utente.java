package turista_facoltoso.entities.users;

import java.time.LocalDate;
import java.util.HashSet;

import turista_facoltoso.admin.Airbnb;
import turista_facoltoso.entities.Abitazione;
import turista_facoltoso.entities.Prenotazione;
import turista_facoltoso.enumerators.Voto;

/**
 * Utente
 */
public class Utente {

    private static int idTotale;
    private int id;
    private String nome;
    private String cognome;
    private String mail;
    private String indirizzo;


    /**
     * @param nome
     * @param cognome
     * @param mail
     * @param indirizzo
     */
    public Utente(String nome, String cognome, String mail, String indirizzo) {
        this.id = idTotale ++;
        this.nome = nome;
        this.cognome = cognome;
        this.mail = mail;
        this.indirizzo = indirizzo;
    }


    public String getNome() {return nome;}
    public String getCognome() {return cognome;}
    public String getMail() { return mail;}
    public String getIndirizzo() {return indirizzo;}
    public void setId(int id) { this.id = id;}
    public void setNome(String nome) { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome;}
    public void setMail(String mail) {this.mail = mail;}
    public void setIndirizzo(String indirizzo) { this.indirizzo = indirizzo;}
    
    /**
     * @param idAbitazione
     * @param inizioPren
     * @param finePren
     */
    public void addPrenotazione(int idAbitazione, LocalDate inizioPren, LocalDate finePren){
        Prenotazione p = new Prenotazione(inizioPren, finePren, this.id, idAbitazione);
    }
    public void removePrenotazione(int idPrenotazione){

    }
    
    /**
     * @param titolo
     * @param commento
     * @param voto
     * @param idPren
     */
    public void addFeedback (String titolo, String commento, Voto voto, int idPren){

    }

    public void removeFeedback(int idFeedback){}
    public void removeFeedbackByPrenotazione(int idPrenotazione){}
    public HashSet <Prenotazione> prenotazioniEffettuate(){return null;}

    public void visualizzaAbitazioniDisponibili(){
        for (Abitazione ab:Airbnb.abitazioniDisponibili()){
            System.out.print(ab);
        }
    }

    

}