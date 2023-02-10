package formeGeometriche;

public class Main {
    public static void main(String[] args) {
        Quadrato quadrato = new Quadrato(5, 5);
        Rettangolo rettangolo = new Rettangolo(5,6);
        quadrato.getArea();
        quadrato.getPerimeter();
        System.out.println(quadrato.toString());
        rettangolo.getArea();
        rettangolo.getPerimeter();
        System.out.println(rettangolo.toString());
    }
}
