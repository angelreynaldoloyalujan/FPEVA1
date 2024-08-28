/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_5_entrada.de.datos;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_5_entradaDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String marca;
        String modelo;
        int year;
        double precio;
        //como se captura?
        //scaner = clase: nos proporciona muchas herramientas
        
        Scanner captu;// tienes q hacer un importe para edclarar la variable
        
        captu = new Scanner (System.in);// creear herramienta se hace asi 
        // hay que dar instrucciones al usuario que captura 
        System.out.println("introduce la marca del veiculo");
        // capturamos una asignacion 
       marca = captu.nextLine();// les regresa todo el texto hasta q pongas "enter"
        System.out.println(marca);
        System.out.println("introduce el modelo del veiculo");
        modelo = captu.nextLine();
        System.out.println("introduce el año");
        year = captu.nextInt();
        System.out.println("introduce el precio");
        precio = captu.nextDouble();
        System.out.println("datos capturados........................");
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(precio);
        System.out.println(year);
        System.out.println(precio);
        
        
    
    
    }
// TODO c
}

    