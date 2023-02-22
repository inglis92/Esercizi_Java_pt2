package gestoreVeicoli;

public class Veicolo {
    protected String targa;
    protected int numeroPosti;

    public Veicolo(String targa, int numeroPosti) {
        this.targa = targa;
        this.numeroPosti = numeroPosti;
    }

    public String getTarga() {
        return targa;
    }

    public int getNumeroPosti() {
        return numeroPosti;
    }

}
