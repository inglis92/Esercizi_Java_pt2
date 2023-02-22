package distributoreBevande;

public class Bevanda {
    protected String nome;
    protected double prezzo;

    public Bevanda(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public String getNome() {
        return nome;
    }
}
