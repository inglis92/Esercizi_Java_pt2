package gestoreVeicoli;

public class Autocarro extends Veicolo{
    private  double caricoMax;
    public Autocarro(String targa, int numeroPosti, double caricoMax) {
        super(targa, numeroPosti);
        this.caricoMax = caricoMax;
    }

    public double getCaricoMax() {
        return caricoMax;
    }
    public String toString() {
        return "Ecco i dettagli dell'autocarro: " + targa + " : " + caricoMax + " quintali.";
    }
}
