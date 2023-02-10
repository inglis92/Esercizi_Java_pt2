package distributoreBevande;

public class DistributoreDiBevande {
    protected int quantita;
    protected double saldo;
    protected double resto;
    private Bevanda [] bevande;
    private  double importo;

    public DistributoreDiBevande(int quantita) {
        this.quantita = quantita;
        this.bevande = new Bevanda[quantita];
        saldo = 0;
        resto = 0;
    }

    public double saldoAttuale() {
        System.out.println("Saldo disponibile: "+ saldo);
        return saldo;
    }

    public double getResto() {
        saldo = 0;
        System.out.println("Ritira il resto dall'area monete in basso");
        return resto;
    }
    public void caricaProdotto(Bevanda p){
        // qui cerco il prodotto
        for (int i = 0; i < bevande.length; i++) { // ciclo i prodotti
            if (p.equals(bevande[i])) {
                bevande[i] = p;
                return;
            }
        }
        // se non lo trovo cerco un buco
        for (int i = 0; i < bevande.length; i++) {
            if (bevande[i] == null) {
                bevande[i] = p;
                return;
            }
        }
    }

    public void inserisciImporto(double importo ){
        saldo += importo;
        System.out.println("Hai inserito "+ importo +". Nuovo saldo disponibile: " + saldo);
    }
    public String scegliProdotto(Bevanda b){
        if (saldo >= b.getPrezzo()){
            resto = saldo;
            saldo = resto - b.prezzo;
            resto = saldo;
            return b.getNome();}
        else return "Credito insufficiente per comprare un "+ b.getNome();
    }

    }

