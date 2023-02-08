    public class Main {
        public static void main(String[] args) {
            Libro a = new Libro(13,"pluto","le mie gesta");
            Libro b = new Libro(43,"annio","le mie battaglie");
            Libro v = new Libro(23,"sempronio","la formica");
            Libro c = new Libro(3,"ariosto","il lupo");
            Libro r = new Libro(43,"pippo","cagnaccio");

            Libro [] libri = new Libro [4];
            libri [0] = a;
            libri [1] = b;
            libri [2] = c;
            libri [3] = v;
            Biblioteca biblioteca = new Biblioteca(libri);
            System.out.println(biblioteca.esisteLibro(b));
            Libro [] libriOrdinati = new Libro[libri.length];
            biblioteca.getLibriOrdinati();
            System.out.println(libriOrdinati[0] == c);
            System.out.println(libriOrdinati[1] == a);
            System.out.println(libriOrdinati[2] == v);
            System.out.println(libriOrdinati[3] == b);
        }
    }

