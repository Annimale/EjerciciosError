/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Escribe una clase, de nombre Corredor, teniendo en cuenta las
siguientes especificaciones:
 La clase tendrá un atributo entero de nombre energía
 La clase tendrá un método constructor que reciba por parámetro
una cantidad de energía que asignará al atributo
 La clase tendrá un método, de nombre recargarEnergia, que
recibirá por parámetro una cantidad de energía que será
sumada al atributo energía
 La clase tendrá un método, de nombre correr, que mostrará por
pantalla un mensaje y decrementará la energía en 10 unidades.
Antes de proceder al decremento, el método comprobará que la
energía del corredor es igual o superior a 10 unidades. Si no es
así, el método lanzará una excepción de tipo AgotadoException
Para crear la excepción AgotadoException (en el fichero Corredor.java):
 * @author ivamar
 */



public class Corredor {
    private int energia;
    
    
    
    
    public Corredor(int energia){
       this.energia=energia;
    }
    
    public void recargarEnergia(int qtyenergia){
       this.energia=qtyenergia;
    }
    

    public int getEnergia() {
        return energia;
    }
    
    
    public void correr()throws AgotadoExcepcion{
        try{
            System.out.println("El corredor empieza con: "+this.energia);
            if(this.energia>=10){
                this.energia=this.energia-10;
            }else{
                throw new AgotadoExcepcion("TIENES MENOS DE 10 ENERGIA");
            }
        }catch (AgotadoExcepcion a){
           System.out.println(a.getMessage());
        }finally{
            System.out.println("El corredor acaba con :"+this.energia+" de energia");
        }
    }
    
}
