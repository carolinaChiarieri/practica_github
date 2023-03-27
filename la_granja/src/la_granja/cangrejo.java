/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_granja;

/**
 *
 * @author Mininos
 */
public class cangrejo {
    
    private String nombre;
    
    private int patas;

    public cangrejo(String nombre, int patas, int edad, int color) {
        this.nombre = nombre;
        this.patas = patas;
        this.edad = edad;
        this.color = color;
    }
    
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
    
    private int color;
    
    
    
}
