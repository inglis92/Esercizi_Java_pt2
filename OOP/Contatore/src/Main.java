import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Contatore contatore = new Contatore(3);
        contatore.read();
        contatore.update();
        contatore.read();
        contatore.reset();
        contatore.read();
        contatore.resetNew(5);
        contatore.update();
        contatore.read();


    }

}
