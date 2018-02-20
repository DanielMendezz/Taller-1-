/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

/**
 * Notas de estudiante, finalizando con su promedio
 * @author DanielMendez
 */
import java.util.Scanner;
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner n=new Scanner(System.in);
    Scanner no=new Scanner(System.in);
    Scanner c=new Scanner(System.in);
    int i;
    double total=0,promedio;
    System.out.println("Por favor, ingrese el nombre del estudiante");
    String nombre=n.nextLine();
    System.out.println("Ingrese cuantas notas desea digitar");
    int cant_notas=n.nextInt();

    for(i=0;i<cant_notas;i++){
        System.out.println("Por favor, ingrese la nota " +i);
        double nota=n.nextDouble();
        
        total=total+nota;
    }
    promedio=total/cant_notas;
    System.out.println("El promedio del estudiante " +nombre+ " es de : " +promedio);

    n.close();
    no.close();
    c.close();

       
    }
}
    








