package Ejercicio2;

public class Planeta {
    String nombre = null;
    int numSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    tipoPlaneta tipo;
    boolean esObservable = false;

    public Planeta(String nombre, int numSatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable) {
        this.nombre = nombre;
        this.numSatelites = numSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
    }

    public String densidad (){
        double densidad = this.masa/this.volumen;
        return "LA densidad del planeta "+ this.nombre + " es: "+ densidad + " Kg/Km3";
    }

    public boolean esPlanetaExterior (){
        float limite =  (float) (149597870 * 3.4);
        return this.distanciaSol > limite;
    }
    public void imprimir () {
        System.out.println("Planeta[" +
                "nombre='" + nombre + '\'' +
                ", numSatelites=" + numSatelites +
                ", masa=" + masa +
                ", volumen=" + volumen +
                ", diametro=" + diametro +
                ", distanciaSol=" + distanciaSol +
                ", tipo=" + tipo +
                ", esObservable=" + esObservable +
                ']');
    }

    public static void main(String[] args) {
        Planeta planeta1 = new Planeta("Sádala", 5, 1.898e27,143128e15 ,139820 ,750000000 ,tipoPlaneta.GASEOSO, false);
        Planeta planeta2 = new Planeta("Vegita", 1, 1.38e2,6431e6 ,7499 ,750000 ,tipoPlaneta.TERRESTRE, true);

        planeta1.imprimir();
        planeta2.imprimir();

        System.out.println(planeta1.densidad());
        System.out.println(planeta2.densidad());

        System.out.println(planeta1.esPlanetaExterior());
        System.out.println(planeta2.esPlanetaExterior());



    }
}
