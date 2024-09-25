/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_16_operador_or;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_16_OPERADOR_OR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int km,meses;
    Scanner captu=new Scanner (System.in);
        System.out.println("cuanto kilometraje tiene el veiculo");
        km = captu.nextInt();
        captu.nextLine();
        System.out.println("cuantos meses tiene el veiculo");
        meses = captu.nextInt();
        captu.nextLine();
        
        if(km >=5000 || meses >=6){
            System.out.println("cambio de aceite");
            
        }else{
            System.out.println("vehiculo en buenas condiciones");
            
        }
        
    }
    
}

