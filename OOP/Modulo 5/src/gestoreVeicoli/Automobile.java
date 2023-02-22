package gestoreVeicoli;

public class Automobile extends Veicolo{
    private int numeroPorte;
    public Automobile(String targa, int numeroPosti, int numeroPorte) {
        super(targa, numeroPosti);
        this.numeroPorte = numeroPorte;
    }

    public String toString() {
        return  "Ecco i dettagli dell'automobile: " + targa + " : " + numeroPorte;
    }
}
