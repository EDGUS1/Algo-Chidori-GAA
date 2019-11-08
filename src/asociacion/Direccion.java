/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asociacion;

/**
 *
 * @author AULAFISI
 */
public class Direccion {
    public String direccion;
    public Direccion(){
        direccion=" ";
    }
    public Direccion(String direccion){
        this.direccion=direccion;
    }
    public String toString(){
        return(this.direccion);
    }
}
