import java.util.Arrays;
import java.util.Comparator;
public class Biblioteca {
    //private int [] libri;
    private Libro [] libri;
    // costruttore biblioteca semplificata
    /*public Biblioteca(int []libri){
        this.libri = libri;
    }*/
    // costruttore biblioteca smart
    public Biblioteca (Libro[] libri){
        this.libri = libri;
    }

    //metodo per ricerca indici in array di indici che rappresentano i libri

    /*public boolean esisteLibro(int indice){
        boolean esiste = false;
        for (int i = 0; i < libri.length; i++) {
            if (libri[i] == indice) esiste  = true;
        }
        return esiste;
    }*/
    // metodo per ricerca di libri in un array fatto di elementi libro
    public boolean esisteLibro(Libro libroDaCercare){
        for (Libro book : libri)
            if (book == libroDaCercare)
                return true;
        return false;
    }
    //metodo per ordinamento array di indici libri
    /*public Libro [] getIndiciLibriOrdinati(){
        Arrays.sort(libri);
        return libri;
    }*/
    public int[] getIndiciLibriOrdinati() {
        int[] bookIndexes = new int[libri.length];
        for (int i = 0; i < libri.length; i++) bookIndexes[i] = libri[i].getIndex();
        return bookIndexes;
    }
    public Libro[] getLibriOrdinati() {
            int n = libri.length;

            // One by one move boundary of unsorted subarray
            for (int i = 0; i < n-1; i++)
            {
                // Find the minimum element in unsorted array
                int min_idx = i;
                for (int j = i+1; j < n; j++){
                    if (libri[j].getIndex() < libri[min_idx].getIndex())
                        min_idx = j;
                }

                // Swap the found minimum element with the first
                // element
                int temp = libri[min_idx].getIndex();
                libri[min_idx] = libri[i];
                temp = libri[i].getIndex();
            }
        return libri;
    }
}
