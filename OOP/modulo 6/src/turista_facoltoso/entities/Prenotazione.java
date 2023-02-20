package turista_facoltoso.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prenotazione {

    private static int idTot = 0;    

    private int id;
    private LocalDate inizioPren;
    private LocalDate finePren;
    private int idUtente;
    private int idAbitazione;
    private LocalDateTime istantePren; // il momento esatto in cui è stata effettuata la prenotazione
    private int idFeedback;
   
    public Prenotazione(LocalDate inizioPren, LocalDate finePren, int idUtente, int idAbitazione) {
        this.id = idTot++;
        this.inizioPren = inizioPren;
        this.finePren = finePren;
        this.idUtente = idUtente;
        this.idAbitazione = idAbitazione;
        this.istantePren = LocalDateTime.now(); //ottengo l'istante attuale
    }

    public int getId() { return id; }
    public LocalDate getInizioPren() {return inizioPren;}
    public LocalDate getFinePren() {return finePren;}
    public int getIdUtente() {return idUtente;}
    public int getIdAbitazione() {return idAbitazione;}
    public LocalDateTime getIstantePren() {return istantePren;}

    
    public void setInizioPren(LocalDate inizioPren) { this.inizioPren = inizioPren;}
    public void setFinePren(LocalDate finePren) { this.finePren = finePren;}
    public void setIdUtente(int idUtente) {this.idUtente = idUtente;}
    public void setIdAbitazione(int idAbitazione) {this.idAbitazione = idAbitazione;}

    
}
