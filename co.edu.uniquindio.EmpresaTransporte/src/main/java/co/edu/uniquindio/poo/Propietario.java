package co.edu.uniquindio.poo;
public class Propietario {
    //Atributos de la clase propietario
    private String nombre, cedula, email, edad, celular;

    //constructor vacio
    public Propietario(){}

    //Constructor
    public Propietario(String nombre, String cedula, String email, String edad, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.edad = edad;
        this.celular = celular;
    }

    //Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "" + nombre + 
        " " + cedula + 
        " " + email + 
        " " + edad + 
        " " + celular + 
        " ";
    }
}