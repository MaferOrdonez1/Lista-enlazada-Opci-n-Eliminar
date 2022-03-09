/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author mafer
 */
public class Print {
    Scanner in = new Scanner(System.in);
    Lista lista = new Lista();
    protected Nodo inicio, fin;

    public void add(){
        System.out.print("Ingresar nombre:");
        lista.agregarAlInicio(in.next());
    }   
    public void buscarelemento(){
        System.out.print("Ingresar nombre:");
        lista.buscar(in.next());
    }
    public void elementoSelec(){
        System.out.print("Ingresar nombre:");
        lista.eliminarEleccion(in.next());
    
    }
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        
        
        while(!salir){
            
           System.out.println("\n 1. Agregar 1");
           System.out.println("2. Mostrar 2");
           System.out.println("3. Buscar  3");
           System.out.println("4. Agregar elemento 4");
           System.out.println("5. Eliminar al final 5");
           System.out.println("6. Eliminar al Inicio 6");
           System.out.println("7. Eliminar a eleccion 7");
           System.out.println("8. Salir 8");
           System.out.println("Escribe una de las opciones:");
           opcion = in.nextInt();
           
           switch(opcion){
               case 1:
                   System.out.println("-----------------Agregar-----------------");
                   add();
                   break;
               case 2:
                   System.out.println("-----------------Listar-----------------");
                   lista.mostrarLista();
                   break;
                case 3:
                   System.out.println("-----------------Buscar-----------------");
                   buscarelemento();
                   break;
                case 4:
                   System.out.println("-----------------Agregar elemento-----------------");
                   addlist();
                   break;
                case 5:
                   System.out.println("Se elimino el elemento ["+ lista.eliminarAlFinal()+"]");
                   break;
                case 6:
                   System.out.println("Se elimino el elemento ["+ lista.eliminarAlInicio()+"]");
                   break;
                case 7:
                   elementoSelec(); 
                   break;
                case 8:
                   salir=true;
                   System.out.println("Programa terminado");
                   break;
                default:
                   System.out.println("Solo números entre 1 y 4");
           }   
        }
    }
    public static void main(String[] args) {
        Print list = new Print();
        list.menu();
    }
    public void addlist(){
        String elemento;
        System.out.println("Ingresar elemento:");
        lista.agregarAlFinal(in.next());
    }
}

 