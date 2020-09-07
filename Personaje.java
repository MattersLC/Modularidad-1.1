package Modularidad;

public class Personaje {
    
    //Declaro mis variables
    private String nombre;
    private String oficio;
    private int edad;
    private Double salario;
    
    //Declaro una función llamada saludar()
    public void saludar() {
        System.out.println("Hola!");
    }
    
    //Setters de mis variables
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setOficio(String oficio) {
        this.oficio = oficio;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
    //Getters de mis variables
    public String getNombre() {
        return nombre;
    }
    
    public String getOficio() {
        return oficio;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public Double getSalario() {
        return salario;
    }
    
}
