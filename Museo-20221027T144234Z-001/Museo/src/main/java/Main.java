
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author JUAN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario usu1 = new Usuario("ca", "123");

            ArrayList museo = new ArrayList ();
            museo.add("museo nacional");
            museo.add("museo del oro");
        String u1;
        String c1;

        System.out.println("ingrese sus datos");
        System.out.println("usuario");
        Scanner usuario1 = new Scanner(System.in);
        u1 = usuario1.next();
        System.out.println("contrasena");
        Scanner contrasena1 = new Scanner(System.in);
        c1 = contrasena1.next();
        
        if (usu1.getUsuario().equals(u1) && usu1.getContrasena().equals(c1) ) {
            Date f1 = new Date();
            Date f2 = new Date();
           
            
            Escultura es1 = new Escultura("Botero", f1, f2, "clasico", false);
            Escultura es2 = new Escultura("DaVinci", f1, f2, "antiguo", true);
            Cuadro cu1 = new Cuadro("picasso", f1, f2, "antiguo", true);

            System.out.println(es1.toString());
            System.out.println(es2.toString());
            System.out.println(cu1.toString());
            
            
            
                    
                    
            
            
            
        }

    }

}
