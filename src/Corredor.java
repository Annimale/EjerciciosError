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
