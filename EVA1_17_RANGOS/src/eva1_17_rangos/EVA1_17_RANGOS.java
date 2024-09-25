/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_17_rangos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_17_RANGOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        int calificacion;
        Scanner captu=new Scanner (System.in);
        System.out.println("cual es la calificacion");
        calificacion = captu.nextInt();
        captu.nextLine();
        if (calificacion >=0 && calificacion <=100){
            System.out.println("calificacion aceptada");
        }else{
            System.out.println("calificacion no aceptada");
    }
        }
    
}


