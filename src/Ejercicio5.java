/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Escribe un método, de nombre mostrarCadenasArray, que reciba por
parámetro un array con cadenas de caracteres. El método mostrará
Programación – DAM - Semipresencial U07 – Ejercicios2
3
por pantalla el primer carácter de cada una de las cadenas contenidas
en el array.
 Se debe evitar que se produzca una excepción
NullPointerException si alguna de las posiciones del array
contiene una referencia no inicializada (valor null)
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
