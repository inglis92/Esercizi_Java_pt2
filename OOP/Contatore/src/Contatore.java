public class Contatore {
    private int contatore;

    public Contatore (int contatore){
        this.contatore = contatore;
    }
    public Contatore (){
        this.contatore = 0;
    }
    public void update ( ) {
        this.contatore += 1 ;
    }
    public int read () {
        System.out.println(contatore);
        return contatore ;

    }
    public void reset( ) {
        this.contatore = 0 ;
    }
    public void resetNew(int nuovo){
        this.contatore = nuovo;
    }
}
