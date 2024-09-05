/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double v , a , t , d ;
    Scanner captu = new Scanner(System.in);
    System.out.println("velocidad inicial: ");
    v = captu.nextDouble();
        System.out.println("tiempo: ");
    t = captu.nextDouble();
        System.out.println("aceleracion: ");
    a = captu.nextDouble();
    d =  v * t + (a * t * t) / 2;
        System.out.println("distancia = " + d );
        
        
        
    
    
    
    
    }
    
}
