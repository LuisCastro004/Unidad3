/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_3;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Practica_3 = new Scanner (System.in);
        int a = 0, b = 1, c, n;
        System.out.print("Ingresa los valores a considerar: ");
        
        n = Practica_3.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        Practica_3.close();  
        }
        
    }
    
}
