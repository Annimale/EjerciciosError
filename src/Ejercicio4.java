/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Escribe una clase de nombre ClaseExcep1 que incluya un método
denominado dividirEntreArray. Este método recibirá por parámetro un
número entero y un array de elementos del mismo tipo. El método
mostrará por pantalla el resultado de la división entre el número
recibido y cada uno de los elementos del array. A continuación, se
escribirá un programa que invoque al método con el número 2 y un
array con los elementos -2, -1, 0, 1 y 2.
 Reescribe el método anterior para capturar la excepción
derivada del intento de división entre 0, de forma que no se
interrumpa la ejecución del programa y se continúe dividiendo
entre los otros elementos del array.
 Reescribe el código anterior con las sentencias de código
necesarias para que la excepción no llegue a producirse (comprobar
que el divisor debe ser distinto de cero) 
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
