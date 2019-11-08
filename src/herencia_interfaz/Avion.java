/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_interfaz;

/**
 *
 * @author AULAFISI
 */
//Heredamos de la clase Vehiculo e implementamos la interface Manejable
public class Avion extends Vehiculo implements Manejable{
    public Avion(String color){
        super(3,color);
    }   
    
    //Mostramos un texto para comprobar el metodo manejar
    @Override
    public void manejar(int distancia){
        System.out.println("Se ha volado "+distancia+" metros");    
    }
    
}
