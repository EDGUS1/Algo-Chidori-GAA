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
public class herencia_interfaz {
    
    public static void main(String[] args) {
        //Se declara los objetos
        Bicicleta unaBicicleta = new Bicicleta("Azul");
        Carro unCarro = new Carro("Rojo");
        Avion unAvion = new Avion("Blanco");
        Conductor unConductor = new Conductor();
        //Uso de la interfaz
        unConductor.manejando((Manejable)unaBicicleta, 152);
        unConductor.manejando((Manejable)unAvion, 1326);
        unConductor.manejando((Manejable)unCarro, 114);
    }
}
