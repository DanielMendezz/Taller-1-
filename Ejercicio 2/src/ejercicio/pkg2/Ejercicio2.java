/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 * Muestra en que estacion esta segun su mes
 * @author DanielMendez
 */
import java.util.Scanner;
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        
        
            System.out.println("Por favor, ingrese el mes en el que esta");
            int mes= n.nextInt();
            switch (mes){
                case 1 :
                System.out.println("Su estacion es invierno");
                case 2 :
                System.out.println("Su estacion es invierno");
                case 3:
                System.out.println("Su estacion es invierno");
                case 4:
                System.out.println("Su estacion es verano");
                case 5:
                System.out.println("Su estacion es verano");
                case 6:
                System.out.println("Su estacion es verano");
                case 7:
                System.out.println("Su estacion es otono");
                case 8:
                System.out.println("Su estacion es otono");
                case 9:
                System.out.println("Su estacion es otono");
                case 10:
                System.out.println("Su estacion es primavera");
                case 11:
                System.out.println("Su estacion es primavera");
                case 12:
                System.out.println("Su estacion es primavera");
                
            }
            
        
            n.close();
        
        
        
        
    }
    
}
