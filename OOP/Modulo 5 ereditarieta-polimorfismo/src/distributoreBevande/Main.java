package distributoreBevande;

public class Main {
    public static void main(String[] args) {
        Caffe caffe = new Caffe("caffe", 0.5);
        Cappuccino cappuccino = new Cappuccino("cappuccino", 1);
        DistributoreDiBevande distributoreDiBevande = new DistributoreDiBevande(10);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(caffe);
        distributoreDiBevande.caricaProdotto(cappuccino);
        distributoreDiBevande.caricaProdotto(caffe);
        System.out.println(distributoreDiBevande.saldoAttuale() == 0);
        System.out.println(distributoreDiBevande.getResto() == 0);
        System.out.println("-----------------------");
        distributoreDiBevande.inserisciImporto(0.4);
        System.out.println(distributoreDiBevande.scegliProdotto(caffe));
        System.out.println("-----------------------");
        distributoreDiBevande.inserisciImporto(0.2);
        System.out.println(distributoreDiBevande.scegliProdotto(caffe));
        System.out.println(distributoreDiBevande.getResto());
        System.out.println("-----------------------");
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.scegliProdotto(caffe));
        System.out.println("-----------------------");
        distributoreDiBevande.inserisciImporto(2.0);
        System.out.println(distributoreDiBevande.scegliProdotto(caffe));
        System.out.println(distributoreDiBevande.scegliProdotto(cappuccino) );
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println("-----------------------");
        System.out.println(distributoreDiBevande.scegliProdotto(caffe));
        System.out.println(distributoreDiBevande.saldoAttuale());
        System.out.println(distributoreDiBevande.getResto());
    }
}
