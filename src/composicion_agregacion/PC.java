/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion_agregacion;

/**
 *
 * @author AULAFISI
 */
public class PC {
    public RAM ram;
    public SO so;
    public Monitor monitor;
    public Impresora impresora;
    public PC(Monitor a, Impresora b){
        //Composicion
        ram = new RAM(4.0, "Kingston");
        so = new SO("Windows", 10 );
        //Agregacion
        monitor=a;
        impresora=b; 
    }
   public String toString(){
        return(
                "Especificaciones:\n"
                + "RAM: Capacidad = "+ram.capacidad+"  Marca= "+ram.marca
                + "\nSO: Nombre = "+so.nombre+"  Version = "+so.version
                + "\nMonitor: Marca = "+monitor.marca+"  Resolucion = "+monitor.resolucion
                + "\nImpresora: Marca = "+impresora.marca);
    }
}
