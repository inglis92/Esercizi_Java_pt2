package lampadina;

public class lampadina {
    private int numMaxClick;
    private static boolean haCorrente;
    private StatoLampadina stato;

    public lampadina(int numMaxClick){
        this.numMaxClick = numMaxClick;
        stato = StatoLampadina.spenta;
    }
    public static boolean accendiCorrente() {
        haCorrente = !haCorrente;
        return haCorrente;
    }
    public StatoLampadina getStato(){
        if (!haCorrente) return StatoLampadina.spenta;
        return stato;
    }
    /**
     * Cambia lo stato della lampadina.lampadina
     * @return Il nuovo stato. Ritorna ROTTA se il numero di click ha superato il massimo consentito
     */
    public StatoLampadina click(){
            if (stato == StatoLampadina.spenta) {
                stato = StatoLampadina.accesa;
                numMaxClick--;
            } else if (stato == StatoLampadina.accesa) {
                stato = StatoLampadina.spenta;
                numMaxClick--;
            }
            if (numMaxClick == 0 ) {
                stato = StatoLampadina.rotta;
            }
    System.out.println("la lampadina è " +stato);
    return stato;

    }
}
