/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Escribe una clase, de nombre Entrenamiento, en cuyo método
 * main() se creará un objeto Corredor con una energía de 50 unidades.
 * Se hará que el corredor corra hasta que se agote 3 veces. La primera
 * vez que se agote, su energía se recargará con 30 unidades. La
 * segunda vez que se agote su energía se recargará con 10 unidades.
 * Cuando el corredor se agote por tercera vez se dará el entrenamiento
 * por concluido
 *
 *
 *
 *
 * @author ivamar
 */
public class Entrenamiento {

    public static void main(String[] args) throws AgotadoExcepcion {
        Corredor Pepe = new Corredor(50);
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <=(Pepe.getEnergia() / 10)+1; j++) {//He de poner el mas 1 para llegar a la excepcion
                
                try {
                    Pepe.correr();

                } catch (AgotadoExcepcion a) {
                }
            }
            if (i == 1) {
                System.out.println("RECARGA 30");
                Pepe.recargarEnergia(30);
            } else if (i == 2) {
                System.out.println("RECARGA 10");
                Pepe.recargarEnergia(10);
            } else if (i == 3) {
                System.out.println("Entrenamiento finalizado");

            }
             

        }
    }
}
//ME FALTA QUE COJA LA EXECEPCION (QUE NO LA COGE) Y QUE EN i==2 no llega a 0