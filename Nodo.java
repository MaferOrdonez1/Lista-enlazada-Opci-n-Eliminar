/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mafer
 */
public class Nodo {
    public String dato;
    public Nodo siguiente;
   
    public Nodo(String dato){
        this.dato = dato;
    }
   
    public Nodo(String dato, Nodo siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
