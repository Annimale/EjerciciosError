/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class Corredor {
     int energia;
    
    public Corredor(int energia){
       this.energia=energia;
    }
    
    public void recargarEnergia(int qtyenergia){
       this.energia+=qtyenergia;
    }
    
    class AgotadoException extends Exception{
        public AgotadoException (String msj){
            super (msj);
        }
    }
    
    
    public void correr()throws AgotadoException{
        try{
            if(this.energia>10){
                this.energia=this.energia-10;
            }else{
                throw new AgotadoException("TIENES MENOS DE 10 ENERGIA");
            }
        }catch (AgotadoException a){
            System.out.println("El corredor tiene :"+this.energia+" de energia");
        }
    }
    
}
