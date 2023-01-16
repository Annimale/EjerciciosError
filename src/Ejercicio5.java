/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio5 {
    public static void mostrarCadenasArray(String[] Array){
        for (int i = 0; i < Array.length; i++) {
            try{
                System.out.println(Array[i].charAt(0));//Lo que hacemos es imprimir solamente la primera letra de cada elemento del array
                
            }catch (NullPointerException e){
                        System.out.println("Has introducido un valor nulo en la posicion "+i);
                
            }
            //System.out.println(Array[i].charAt(0));//Lo que hacemos es imprimir solamente la primera letra de cada elemento del array
        }
    }
    
    public static void main(String[] args) {
        String[] Arraya={"Hola",null,"Adios","Pepe","Manolo"};
        
        
        mostrarCadenasArray(Arraya);
    }
    
}
