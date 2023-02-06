public class Cerchio {
    private int raggio;
    public Cerchio(int raggio){
        this.raggio = raggio;
    }
    public double Circonferenza(){
        double circonferenza = 2 * 3.14 * raggio;
        return circonferenza;
    }
    public double Area(){
        double area = 2 * 3.14 * raggio * raggio;
        return area;
    }
}
