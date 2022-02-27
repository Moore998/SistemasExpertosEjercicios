/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;
import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner E = new Scanner(System.in);
        System.out.println("numero a calcular factorial: ");
        int num = E.nextInt();
        recursividad Recursividad = new recursividad();
        
        int factorial = Recursividad.factor(num);
        System.out.println("el factorial de " + num + " es " + factorial);
    }
    
}
