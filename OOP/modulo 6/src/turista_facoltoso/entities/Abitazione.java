package turista_facoltoso.entities;

import java.time.LocalDate;

public class Abitazione {

    private static int idTot = 0;
    
    private int id;
    private String nome;
    private String indirizzo;
    private double prezzo;
    private int nLocali;
    private int nPostiLetto;
    private int piano;
    private LocalDate inizioDisponibilità;
    private LocalDate fineDisp;
    private Integer idHost;
    
    
    public Abitazione(String nome, String indirizzo, double prezzo, int nLocali, int nPostiLetto, int piano,
            LocalDate inizioDisponibilità, LocalDate fineDisp, int idHost) {
        this.id = idTot++;
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.prezzo = prezzo;
        this.nLocali = nLocali;
        this.nPostiLetto = nPostiLetto;
        this.piano = piano;
        this.inizioDisponibilità = inizioDisponibilità;
        this.fineDisp = fineDisp;
        this.idHost = idHost;
    }


    public int getId() { return id;}
    public String getNome() { return nome;}
    public String getIndirizzo() {return indirizzo;}
    public double getPrezzo() {return prezzo;}
    public int getnLocali() {return nLocali;}
    public int getnPostiLetto() {return nPostiLetto;}
    public int getPiano() {return piano;}
    public LocalDate getInizioDisponibilità() {return inizioDisponibilità;}
    public LocalDate getFineDisp() {return fineDisp;}
    public int getHost() {return idHost;}
    
    public void setNome(String nome) { this.nome = nome;}
    public void setIndirizzo(String indirizzo) {this.indirizzo = indirizzo;}
    public void setPrezzo(double prezzo) {this.prezzo = prezzo;}
    public void setnLocali(int nLocali) {this.nLocali = nLocali;}
    public void setnPostiLetto(int nPostiLetto) {this.nPostiLetto = nPostiLetto;}
    public void setPiano(int piano) { this.piano = piano; }
    public void setInizioDisponibilità(LocalDate inizioDisponibilità) { this.inizioDisponibilità = inizioDisponibilità;}
    public void setFineDisp(LocalDate fineDisp) {this.fineDisp = fineDisp;}

    
    

    
    
}
