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
//El conductor maneja a los vehiculos
public class Conductor {
    public Conductor(){
        
    }
    public void manejando(Manejable objeto, int distancia){
        //Maneja los vehivulos "majeables"
        objeto.manejar(distancia);
    }
}
