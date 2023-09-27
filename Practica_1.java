/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_1;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Practica_1 = new Scanner (System.in);
        int n;
        System.out.println("Ingresa el numero entero: ");
        n = Practica_1.nextInt();
        
        if (n % 2 == 0){
            System.out.println(n + " es un numero par.");
        }else{
            System.out.println(n + " es un numero impar.");
        }
        Practica_1.close();
    }
    
}
