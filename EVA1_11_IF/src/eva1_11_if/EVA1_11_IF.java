/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_11_if;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_11_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     //condicional
     //logica boleana son operaciones de verdadero o falso 
     //solicitar la edad en años
     //si son varias instrucciones se agrupa con {}
     int edad;
     Scanner capturar = new Scanner(System.in);
        System.out.println("capturar la edad");
        edad = capturar.nextInt();
        if(edad>=18){
        System.out.println("es adulto");
        
    }else{//bloque para el falso es opcional
            System.out.println("menor de edad");
        }
    
    }
}
