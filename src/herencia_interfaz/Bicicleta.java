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
public class Bicicleta extends Vehiculo implements Manejable{
    public Bicicleta(String color){
        super(2,color);
    }
    
    //Mostramos un texto para comprobar el metodo manejar
    public void manejar(int distancia){
        System.out.println("Se ha pedaleado "+distancia+" metros");    
    }
}
