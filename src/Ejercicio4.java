/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio4 {//ClaseExcep1

    public static void dividirEntreArray1(int num, int[] Array) {

        int resultado = 0;
        for (int i = 0; i < Array.length; i++) {
            try {//  block of code to be tested for errors while it is being executed.
                resultado = num / Array[i];
                System.out.println("El resultado es: " + resultado + " y se ha divido " + num + " entre " + Array[i]);
            } catch (ArithmeticException e) { //statement allows you to define a block of code to be executed, if an error occurs in the try block.
                System.out.println(e.getMessage());
              //Array[i] = 8;
            } finally {
                System.out.println("");
            }

        }
    }

    public static void dividirEntreArray2(int num, int[] Array) {

        int resultado = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i]!=0) {
                resultado = num / Array[i];
                System.out.println("El resultado es: " + resultado + " y se ha divido " + num + " entre " + Array[i]);
                
            }

        }
    }

    public static void main(String[] args) {

        int[] Arraya = {-2, -1, 0, 1, 2};

        dividirEntreArray1(2, Arraya);
        System.out.println("*********************");
        dividirEntreArray2(2,Arraya);

    }
}
