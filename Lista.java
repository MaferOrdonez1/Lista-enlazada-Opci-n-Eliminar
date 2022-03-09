/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mafer
 */
public class Lista {
    protected Nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
   
    public void agregarAlInicio(String elemento){
        inicio = new Nodo(elemento,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
   
    public void mostrarLista(){
        Nodo aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]->");
            aux=aux.siguiente;
        }
    }
    public void buscar(String elemento){
        Nodo aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            
            if(aux.dato.equals(elemento)){
                System.out.print("[" + aux.dato + "]->");
                encontrado = true;
                break;
            }
            aux=aux.siguiente;
        }
        if(encontrado == false){
            System.out.print("NO ENCONTRADO");
        }
    }
    public boolean existe(String elemento){
        Nodo aux = inicio;
        while(aux !=null && !aux.dato.equals(elemento)){
            aux =aux.siguiente;
        }
        return aux!=null;
    }
    
    public boolean estaVacia(){
        if(this.inicio == null){
            return true;
        }
        return false;
    }

    public void agregarAlFinal(String elemento){
        if(!estaVacia()){
            this.fin.siguiente = new Nodo(elemento);
            this.fin = this.fin.siguiente;
        }else{
            this.inicio=this.fin = new Nodo(elemento);
        }
    }


    public String eliminarAlInicio(){
        String dato = this.inicio.dato;
        if(this.inicio == this.fin){
            this.inicio=this.fin=null;
        }else{
            this.inicio = this.inicio.siguiente;
        }
         return dato;
    }

    public String eliminarAlFinal(){
        String dato = this.fin.dato;
        if(this.inicio == this.fin){
            this.inicio=this.fin=null;
        }else{
            Nodo aux=inicio;
            while(aux.siguiente!=fin){
                aux=aux.siguiente;
            }
            fin=aux;
            fin.siguiente = null;
            }
        return dato;
    }
    public void eliminarEleccion(String elemento){
        Nodo actual = inicio;
        Nodo anterior = null;
        
        while(actual != null){
            if(actual.dato.equals(elemento)){
                if(actual == inicio){
                    inicio = inicio.siguiente;
                    System.out.println("Elemento eliminado");
                }else{
                    anterior.siguiente = actual.siguiente;
                }
            }
        
            anterior = actual;
            actual = actual.siguiente;
        
        }    
    }
}