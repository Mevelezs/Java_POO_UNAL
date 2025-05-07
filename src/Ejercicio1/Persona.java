package Ejercicio1;

public class Persona {
        public String nombre;
        public String apellido;
        public String numDocumento;
        int añoNacimiento;

        public Persona(String nombre, String apellido, String numDocumento, int añoNacimiento) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numDocumento = numDocumento;
            this.añoNacimiento = añoNacimiento;
        }

        public void imprimir() {
            System.out.println( "[" +
                    "Nombre='" + nombre + '\'' +
                    ", Apellido='" + apellido + '\'' +
                    ", Numero de documento='" + numDocumento + '\'' +
                    ", Año de nacimiento='" + añoNacimiento + '\'' +
                    ']');
        }

    public static void main(String[] args) {
        Persona persona1 = new Persona("Mauricio", "Vélez", "ADFBAF47581", 2000);
        Persona persona2 = new Persona("Esteban", "Solís", "DHFBAF64400", 1998);

        persona1.imprimir();
        persona2.imprimir();
    }
    }
