

public class Quadrato {
    private int lato;

    public Quadrato(int lato) {
        this.lato = lato;
    }

    public int perimetro() {
        int perimetro = this.lato * 4;
        return perimetro;
    }
    public void setColore(){

    }

    public void stampa() {
        for (int i = 0; i < lato; i++) {
            for (int j = 0; j < lato; j++) {
                if ((i == 0) || (i == lato - 1))
                    System.out.print('*'+ " ");
                else if ((j == 0) || (j == lato - 1))
                    System.out.print('*'+ " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
