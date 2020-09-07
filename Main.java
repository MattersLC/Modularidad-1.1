package Modularidad;

public class Main {
    
    /*
    Función principal del código,estoy mandando a llamar las clases
    Personaje y Programador, haciendo uso de sus setters y getters.
    */
    public static void main(String[] args) {
        Personaje programador = new Programador();
        
        //Usando setters le doy nombre, edad y salario a "programador"
        programador.setNombre("Orlando");
        programador.setEdad(19);
        programador.setSalario(20000.5);
        
        //Llamo la función saludar() de la clase Programador
        programador.saludar();
        //Imprimo los datos, usando getters, de mi clase programador
        System.out.println("Nombre: "+programador.getNombre());
        System.out.println("Oficio: Programador");
        System.out.println("Edad: "+programador.getEdad());
        System.out.println("Slario mensual: "+programador.getSalario());
    }
}
