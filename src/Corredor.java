/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */



public class Corredor {
    private int energia;
    
    class AgotadoExcepcion extends Exception{//ESTO EN TEORIA ESTA MAL HABRÍA QUE SACAR LA CLASE AGOTADOEXCEPCION FUERA DE PUBLIC CLASS CORREDOR, PERO SI LA SACO LUEGO 
        //NO PUEDO EAPLCIARLA EN LOS METODOS DE CORREDOR, LA SOLUCIÓN ESTÁ EN CREAR UN FICHERO CON LA CLASE SIMPLEMENTE5
        public AgotadoExcepcion (String msj){
            super (msj);
        }
    }
    
    
    
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
