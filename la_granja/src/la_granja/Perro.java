/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_granja;

/**
 *
 * @author Max
 */
public class Perro {
    private int catidadDePatas;
    private String nombre;
    private String color;
    private String apellido;
    private int edad;
    private boolean vive;
    
    /*
    Maxi fijate que te falta añadirle tanto el constructor como los getters 
    y setters s tu clase perro, de lo contrario no podes instanciarla.
    __Simon__
    */

    public Perro(int catidadDePatas, String nombre, String color, String apellido, int edad, boolean vive) {
        this.catidadDePatas = catidadDePatas;
        this.nombre = nombre;
        this.color = color;
        this.apellido = apellido;
        this.edad = edad;
        this.vive = vive;
    }

    public int getCatidadDePatas() {
        return catidadDePatas;
    }

    public void setCatidadDePatas(int catidadDePatas) {
        this.catidadDePatas = catidadDePatas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    /*Ahora si, gracias por recordarme Simon :D */    
}
