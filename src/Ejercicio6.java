/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Ejercicio6 {
//  Escribe un método, de nombre enviarMensaje, que reciba por
//  parámetro una cadena de caracteres correspondiente a una dirección
//  de correo electrónico. El método comprobará que la dirección recibida
//  es correcta elevando la excepción DirCorreoIncorrectaExcepcion en
//  caso contrario. La comprobación consistirá en verificar que la dirección
//  contiene el carácter (@), algún carácter después de él antes del
//  carácter (.) y algún carácter después de éste
    public static void DirCorreoIncorrectaExcepcion(String correo){
        int arroba= correo.indexOf('@');
        int punto= correo.indexOf('.');

        try{
            //System.out.println(correo);
            if (arroba>0 || (punto-arroba)>=2 || punto<correo.length()) {
                //Condicion para saber si hay algo antes del @ y despues del @ y despues del punto
                throw new Exception ("DirCorreoIncorrectaExcepcion");
            }
        }catch (Exception dir){
            System.out.println("El correo esta mal");
        }
        
    }
    public static void main(String[] args) {
        DirCorreoIncorrectaExcepcion("ivan@.com");
    }
}
