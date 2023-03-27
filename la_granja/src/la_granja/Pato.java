/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_granja;

/**
 *
 * @author carol
 */
public class Pato {
    private String nombre;
    private String color;
    private int vida;
    private int hambre;
    private String estado;
    
    public Pato(String nombre, String color, int vida, int hambre, String estado) {
        this.nombre = nombre;
        this.color = color;
        this.vida = vida;
        this.hambre = hambre;
        this.estado = estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
   

    public String getColor() {
        return color;
    }

    public int getVida() {
        return vida;
    }

    public int getHambre() {
        return hambre;
    }

    public String getEstado() {
        return estado;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
