package turista_facoltoso.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prenotazione {

    private static int idTot = 0;    

    private int id;
    private LocalDate inizioPren;
    private LocalDate finePren;
    private int idUtentePrenotante;
    private int idAbitazionePrenotata;
    private LocalDateTime istantePren; // il momento esatto in cui è stata effettuata la prenotazione
    private int idFeedback;
   
    public Prenotazione(LocalDate inizioPren, LocalDate finePren, int idUtentePrenotante, int idAbitazionePrenotata) {
        this.id = idTot++;
        this.inizioPren = inizioPren;
        this.finePren = finePren;
        this.idUtentePrenotante = idUtentePrenotante;
        this.idAbitazionePrenotata = idAbitazionePrenotata;
        this.istantePren = LocalDateTime.now(); //ottengo l'istante attuale
    }

    public int getId() { return id; }
    public LocalDate getInizioPren() {return inizioPren;}
    public LocalDate getFinePren() {return finePren;}
    public int getIdUtentePrenotante() {return idUtentePrenotante;}
    public int getIdAbitazionePrenotata() {return idAbitazionePrenotata;}
    public LocalDateTime getIstantePren() {return istantePren;}
    
    public void setInizioPren(LocalDate inizioPren) { this.inizioPren = inizioPren;}
    public void setFinePren(LocalDate finePren) { this.finePren = finePren;}
    public void setIdUtentePrenotante(int idUtentePrenotante) {this.idUtentePrenotante = idUtentePrenotante;}
    public void setIdAbitazionePrenotata(int idAbitazionePrenotata) {this.idAbitazionePrenotata = idAbitazionePrenotata;}

    
}
