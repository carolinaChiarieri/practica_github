/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la_granja;

/**
 *
 * @author Simon
 */
public class Gato {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private int vida; 
    private int hambre;
    private String estado;
    private String color;

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Gato(String nombre, int vida, int hambre, String estado, String color) {
        this.vida = vida;
        this.hambre = hambre;
        this.estado = estado;
        this.color = color;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getColor() {
        return color;
    }
}
