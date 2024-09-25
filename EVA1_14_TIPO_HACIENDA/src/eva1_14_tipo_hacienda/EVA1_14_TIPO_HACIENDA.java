/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_14_tipo_hacienda;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA1_14_TIPO_HACIENDA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    char f,m ,tipo;
    Scanner captu =new Scanner(System.in);
        System.out.println("captura el tipo de persona f:si es fisica y m:si es moral");
        tipo = captu.nextLine().charAt(0);
        System.out.println("el caracter es" + tipo);
        if (tipo ==100)
            System.out.println("persona fisica");
        else
            System.out.println("persona moral");
        
        
            
        
        
    }
    
}
