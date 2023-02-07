
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
        int a;
        Scanner tcl=new Scanner (System.in);
        do {
                    System.out.println("Introduce un numero menor a 10");
                    a=tcl.nextInt();
            try{
                if(a>10){
                Exception e = new Exception("El numero ha de ser menor a 10");
                throw e;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            } while (a>10);
        
        
        
    }
}

    

