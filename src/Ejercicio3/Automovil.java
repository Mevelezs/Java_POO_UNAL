package Ejercicio3;

public class Automovil {
    enum tipoDeCombustible {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}
    enum colores {BLANCO, NEGRO, ROJO, AMATILLO, AZUL, NARANJA, VERDE, VIOLETA}
    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}

    String marca;
    int modelo;
    tipoDeCombustible tipoCombustible;
    tipoA tipoAutomovil;
    int numPuertas;
    int numAsientos;
    float maxVelocidad;
    colores color;
    float velocidadActual = 0;

    public Automovil(String marca, int modelo, tipoDeCombustible tipoCombustible, tipoA tipoAutomovil, int numPuertas, int numAsientos, float maxVelocidad, colores color) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
         this.numPuertas = numPuertas;
        this.numAsientos = numAsientos;
        this.maxVelocidad = maxVelocidad;
        this.color = color;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public tipoDeCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(tipoDeCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public tipoA getTipoAutomóvil() {
        return tipoAutomovil;
    }

    public void setTipoAutomóvil(tipoA tipoAutomóvil) {
        this.tipoAutomovil = tipoAutomóvil;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public float getMaxVelocidad() {
        return maxVelocidad;
    }

    public void setMaxVelocidad(float maxVelocidad) {
        this.maxVelocidad = maxVelocidad;
    }

    public colores getColor() {
        return color;
    }

    public void setColor(colores color) {
        this.color = color;
    }

    public float getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(float velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public void acelerar(int incrementoVelocidad){
        if (velocidadActual + incrementoVelocidad < maxVelocidad) {
            velocidadActual = velocidadActual + incrementoVelocidad;
        } else {
            System.out.println("No se puede incrementar a una velocidad superior a la máxima del automóvil.");
        }
    }
    public void desAcelerar(int decrementoVelocidad){
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa.");
        }
    }
    public void frenar(){
        velocidadActual = 0;
    }

    public double tiempoDeLlegada(int distancia){
        double tiempo = distancia/velocidadActual;
        System.out.println("Tiempo estimado de llegada: "+ tiempo + " horas");
        return tiempo;
    }

    public void imprimirAuto() {
        System.out.println("Automovil[" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", tipoCombustible=" + tipoCombustible +
                ", tipoAutomovil=" + tipoAutomovil +
                ", numPuertas=" + numPuertas +
                ", numAsientos=" + numAsientos +
                ", maxVelocidad=" + maxVelocidad +
                ", color=" + color +
                ", velocidadActual=" + velocidadActual +
                ']');
    }

    public static void main(String[] args) {
        Automovil auto1 = new Automovil("Ford",2018,tipoDeCombustible.DIESEL,tipoA.EJECUTIVO,6,8,250, colores.AZUL);
        auto1.imprimirAuto();
        auto1.setVelocidadActual(85);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.tiempoDeLlegada(300);
        auto1.acelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.desAcelerar(50);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.frenar();
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.desAcelerar(20);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);

        auto1.acelerar(300);
        System.out.println("Velocidad actual = " + auto1.velocidadActual);


    }
}
