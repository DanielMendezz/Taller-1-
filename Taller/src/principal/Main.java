/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
/**
 *
 * @author Sales Rep01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner n=new Scanner(System.in);
        int totalve=0;
        int opc;
        int i=0;
        int total=30;
        int preciom=0;
        int totalc=30;
        int i1=0;
        int preciocho=0;
        int totalg=30;
        int i2=0;
        int precioga=0;
        int totalch=30;
        int i3=0;
        int preciochi=0;
        int totaly=30;
        int i4=0;
        int precioy=0;
        int totalga=30;
        int i5=0;
        int preciogan=0;
        int ganancias=0;
    do{    
        System.out.println("Por favor escoja una opcion del menu");
        System.out.println("1.Comprar");
        System.out.println("2.Cantidad ventas");
        System.out.println("3.Ganancias");
        System.out.println("4.Salir");
        opc=n.nextInt();
        
        switch(opc){
        
            case 1:
                Scanner q=new Scanner(System.in);
                System.out.println("");
                Scanner k=new Scanner(System.in);
                int op;
                System.out.println("Por favor escoja una opcion del menu");
                System.out.println("1.Margaritas");
                System.out.println("2.Chocorramo");
                System.out.println("3.Galletas");
                System.out.println("4.Chitos");
                System.out.println("5.Yogurt");
                System.out.println("6.Gansito");
                op=k.nextInt();
        
                switch(op){
                    case 1:
                        Scanner y=new Scanner(System.in);
                        int qp;
                        System.out.println("Esta seguro en comprar unas Margaritas (Si=1 o No=0");
                        qp=y.nextInt();
                        if(qp==1){
                        total=total-1;
                        totalve=totalve+1;
                        preciom=preciom+2000;
                        ganancias=ganancias+2000;
                        i=i+1;
                        System.out.println(total);
                        }
                        break;
                    case 2:
                        Scanner w=new Scanner(System.in);
                        int e;
                        System.out.println("Esta seguro en comprar un Chocorramo (Si=1 o No=0");
                        e=w.nextInt();
                        if(e==1){
                        totalc=totalc-1;
                        totalve=totalve+1;
                        preciocho=preciocho+1500;
                        ganancias=ganancias+1500;
                        i1++;
                        }
                        break;
                    case 3:
                        Scanner r=new Scanner(System.in);
                        int t;
                        System.out.println("Esta seguro en comprar unas Galletas (Si=1 o No=0");
                        t=r.nextInt();
                        if(t==1){
                        totalg=totalg-1;
                        totalve=totalve+1;
                        precioga=precioga+1000;
                        ganancias=ganancias+1000;
                        i2++;
                        }
                        break;
                    case 4:
                        Scanner u=new Scanner(System.in);
                        int o;
                        System.out.println("Esta seguro en comprar unos Chitos (Si=1 o No=0");
                        o=u.nextInt();
                        if(o==1){
                        totalch=totalch-1;
                        totalve=totalve+1;
                        preciochi=preciochi+2000;
                        ganancias=ganancias+2000;
                        i3++;
                        }
                        break;
                    case 5:
                        Scanner f=new Scanner(System.in);
                        int g;
                        System.out.println("Esta seguro en comprar un Yogurt (Si=1 o No=0");
                        g=f.nextInt();
                        if(g==1){
                        totaly=totaly-1;
                        totalve=totalve+1;
                        precioy=precioy+1500;
                        ganancias=ganancias+1500;
                        i4++;
                        }
                        break;
                    case 6:
                        Scanner j=new Scanner(System.in);
                        int d;
                        System.out.println("Esta seguro en comprar un Gansito (Si=1 o No=0");
                        d=j.nextInt();
                        if(d==1){
                        totalga=totalga-1;
                        totalve=totalve+1;
                        preciogan=preciogan+1000;
                        ganancias=ganancias+1000;
                        i5++;
                        }
                        break;
                   }
        
                break;
            case 2:
                System.out.println("Cantidad de ventas de Margaritas: "+i);
                System.out.println("Cantidad de ventas de Chocorramo: "+i1);
                System.out.println("Cantidad de ventas de Galletas: "+i2);
                System.out.println("Cantidad de ventas de Chitos: "+i3);
                System.out.println("Cantidad de ventas de Yogurt: "+i4);
                System.out.println("Cantidad de ventas de Gansito: "+i5);
                System.out.println("Cantidad de ventas total: "+totalve);
                break;
            case 3:
                System.out.println("Cantidad de ganancias de Margaritas: "+preciom);
                System.out.println("Cantidad de ganancias de Chocorramo: "+preciocho);
                System.out.println("Cantidad de ganancias de Galletas: "+precioga);
                System.out.println("Cantidad de ganancias de Chitos: "+preciochi);
                System.out.println("Cantidad de ganancias de Yogurt: "+precioy);
                System.out.println("Cantidad de ganancias de Gansito: "+preciogan);
                System.out.println("Cantidad de ganancias total: "+ganancias);
                break;
        
        }
    }while(opc!=4); }
    }

    


           
        

