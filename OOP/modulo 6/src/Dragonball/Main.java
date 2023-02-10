package Dragonball;

public class Main {
    public static void main(String[] args) {
        Mossa kamehameha = new Mossa("kamehameha", 60, 0.7);
        Mossa kaioken = new Mossa("kaioken", 40, 0.9);
        Mossa jenkidama = new Mossa("jenkidama", 80, 0.3);
        Mossa rko = new Mossa("rko", 30, 0.9);
        Mossa scema = new Mossa("scema", 25, 1);

        Personaggio gohan = new Personaggio(Tipo.sayan, "Gohan", 100, 0.3, 50, 0.8, 0.5);
        gohan.addMosse(kamehameha);
        gohan.addMosse(rko);
        gohan.addMosse(kaioken);
        gohan.addMosse(jenkidama);

        Personaggio trunks = new Personaggio(Tipo.sayan, "Trunks", 80, 0.5, 60, 0.8, 0.3);
        trunks.addMosse(kamehameha);
        trunks.addMosse(rko);
        trunks.addMosse(kaioken);
        trunks.addMosse(jenkidama);

        Combattimento c = new Combattimento(gohan, trunks);
        c.combatti();
    }
}