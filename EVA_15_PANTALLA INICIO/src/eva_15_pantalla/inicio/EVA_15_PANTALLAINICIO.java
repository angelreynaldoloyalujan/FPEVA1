/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva_15_pantalla.inicio;

import java.util.Scanner;

/**
 *
 * @author invitado
 */

public class EVA_15_PANTALLAINICIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String usu , pwd;
    Scanner captu = new Scanner(System.in);
        System.out.println("Usuario");
        usu= captu.nextLine();
        System.out.println("Password");
    pwd=captu.nextLine();
   final String USUARIO ="admin";
   final String PASSWORD="admin";
   if (usu.equals(USUARIO) && pwd.equals(PASSWORD)){
       System.out.println("ACCESO CONCEDIDO");
   }else{
       System.out.println("ACCESO DENEGADO");
   }
   
   
   
   
    }
    
}
