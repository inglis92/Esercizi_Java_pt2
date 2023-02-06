public class Main {
    public static void main(String[] args) {
    Quadrato quadrato = new Quadrato(4);
    Cerchio cerchio = new Cerchio(5);
    System.out.println("Questo quadrato ha perimetro " + quadrato.perimetro());
    quadrato.stampa();
    System.out.println(cerchio.Circonferenza());
    System.out.println(cerchio.Area());
    Colore bianco = new Colore();
    System.out.println(bianco.getRGB());

    }
}
