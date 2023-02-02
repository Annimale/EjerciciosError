
//import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Escribe un programa que lance y capture una excepción de la clase
Exception

 * @author skril
 */
public class Ejercicio1 {
    
    
    
    public static void main(String[] args)throws Exception {
        int a=20;
        
            try{
                if(a>10){
                Exception e = new Exception("Crea una excepcion");
                throw e;
                }
            }catch (Exception e){
                System.out.println("Error en la introduccion del numero");
            }
            
        
        
        
    }
}

    

