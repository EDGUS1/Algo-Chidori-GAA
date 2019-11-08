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
public class Comp_Agreg {
    public static void main(String[] args) {
        Monitor m1=new Monitor("AOC","1024x480");
        Impresora i1=new Impresora("HP");
        PC nPC = new PC(m1,i1);
        System.out.println(nPC.toString());
    }
}
