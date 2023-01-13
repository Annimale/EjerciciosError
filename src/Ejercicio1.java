
//import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author skril
 */
public class Ejercicio1 {
    
    
    
    public static void main(String[] args) {
        Scanner tcl= new Scanner(System.in);
        int valor=0;
        boolean leido=false;
        
        do{
            try{
                System.out.println("Introduce un numero entero: ");
                valor=tcl.nextInt();
                leido=true;
            }catch (Exception a){
                System.out.println("Error en la introduccion del numero");
                tcl.nextLine();
            }
            
        }while (!leido);
        System.out.println("Hemos leido : "+valor);
            
        }
        
    }
    

