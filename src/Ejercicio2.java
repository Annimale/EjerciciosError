/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio2 {
   // public static int devuelveEntero(int num){
       // try{
         //   if(num%2==0){
          //      throw new Exception("Lanzando excepcion");
           // }
           // return 1;
       // }catch (Exception e){
            //return 2;
        //}finally{ Quitando el finally conseguimos que salga 2,1,2,1,2,1,2,1...
         //   return 3;
       // }
   // }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                System.out.println("1");
            }else
                System.out.println("2");
           // System.out.println(devuelveEntero(i));
            
        }
    }
}
