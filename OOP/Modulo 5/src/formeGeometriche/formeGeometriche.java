package formeGeometriche;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class formeGeometriche {
    protected int base;
    protected int altezza;

    public formeGeometriche(int base, int altezza){
        this.base = base;
        this.altezza = altezza;
    }
    public int getArea(){
        int Area = (base * altezza);
        System.out.println(Area);
        return Area;
    }
    public double getPerimeter(){
        double perimetro = 2*(base + altezza);
        System.out.println(perimetro);
        return perimetro;
    }
    public String toString(){
        if (base == altezza) return "Quadrato";
        return "Rettangolo";
    }
}
