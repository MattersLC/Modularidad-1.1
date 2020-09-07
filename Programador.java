package Modularidad;

public class Programador extends Personaje {
    
    private String lenguaje;
    
    /*
    Modifico la función saludar() para que se adapte a mí clase
    programador
    */
    public void saludar() {
        System.out.println("Hola mundo!");
    }
    
    /*
    Uso un set para instanciar una nueva función de mi clase
    programador
    */
    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    /*
    Uso un get para indicar el valor de retorno de una nueva
    función de mi clase programador
    */
    public String getLenguaje() {
        return lenguaje;
    }
    
    
}
