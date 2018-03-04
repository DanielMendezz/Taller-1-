/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.util.Scanner;
import java.math.BigDecimal;
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
        int votop=0,votol=0,votov=0,votom=0,voto,voto1=0,voto2=0,voto3=0,voto4=0,voto5=0,voto6=0,voto7=0,voto8=0,voto9=0, total=0;
        int opc;
        do{
        System.out.println("Por favor escoja una opcion de nuestro menu");
        System.out.println("1.Informacion de candidatos");
        System.out.println("2.Votar");
        System.out.println("3.Calculo de votos");
        System.out.println("5.Salir");
        opc=n.nextInt();
        
        switch(opc){
        
            case 1:
                Scanner c=new Scanner(System.in);
                int op;
                do{  
                    System.out.println("Por favor escoja una opcion de nuestro menu");
                    System.out.println("1.Partido Polo");
                    System.out.println("2.Patido Liberal");
                    System.out.println("3.Partido Verde");
                    System.out.println("4.Partido Mira");
                    System.out.println("5.Salir");

                    op=c.nextInt();
        
                    switch(op){
                            case 1:
                                System.out.println("CANDIDATOS POR EL PARTIDO POLO");
                                System.out.println("");
                                System.out.println("CANDIDATO NUMERO 1:");
                                Datos obj=new Datos();
                                BigDecimal num=new BigDecimal("3134183059");
                                obj.setDatos(1007702164,"Jairo","Perez","Cll 18",23,num,"Facatativa","Polo");
                                System.out.println(obj.getDatos());
                                System.out.println("CANDIDATO NUMERO 2:");
                                Datos obj1=new Datos();
                                BigDecimal num1=new BigDecimal("3214617377");
                                obj1.setDatos(1007702165,"Laura","Alvarado","Cll 21",29,num1,"San Francisco","Polo");
                                System.out.println(obj1.getDatos());
                                break;
                            case 2:
                                System.out.println("CANDIDATOS POR EL PARTIDO LIBERAL");
                                System.out.println("");
                                System.out.println("CANDIDATO NUMERO 1:");
                                Datos obj2=new Datos();
                                BigDecimal num2=new BigDecimal("3114771730");
                                obj2.setDatos(46604709,"Leopoldo","Lopez","Cll 10",40,num2,"Supata","Liberal");
                                System.out.println(obj2.getDatos());
                                System.out.println("CANDIDATO NUMERO 2:");
                                Datos obj3=new Datos();
                                BigDecimal num3=new BigDecimal("3202617477");
                                obj3.setDatos(100774582,"Daniela","Acosta","Cll 41",29,num3,"Madrid","Liberal");
                                System.out.println(obj3.getDatos());
                                break;
                            case 3:
                                System.out.println("CANDIDATOS POR EL PARTIDO VERDE");
                                System.out.println("");
                                System.out.println("CANDIDATO NUMERO 1:");
                                Datos obj4=new Datos();
                                BigDecimal num4=new BigDecimal("3125041789");
                                obj4.setDatos(11478569,"Oscar","Sanchez","Cll 15",50,num4,"Facatativa","Verde");
                                System.out.println(obj4.getDatos());
                                System.out.println("CANDIDATO NUMERO 2:");
                                Datos obj5=new Datos();
                                BigDecimal num5=new BigDecimal("3204617377");
                                obj5.setDatos(11597533,"Diego","Lopez","Cll 50",29,num5,"Bogota","Verde");
                                System.out.println(obj5.getDatos());
                                break;
                            case 4:
                                System.out.println("CANDIDATOS POR EL PARTIDO MIRA");
                                System.out.println("");
                                System.out.println("CANDIDATO NUMERO 1:");
                                Datos obj6=new Datos();
                                BigDecimal num6=new BigDecimal("312050504");
                                obj6.setDatos(21453862,"Yolanda","Diaz","Cll 10",43,num6,"Facatativa","Mira");
                                System.out.println(obj6.getDatos());
                                System.out.println("CANDIDATO NUMERO 2:");
                                Datos obj7=new Datos();
                                BigDecimal num7=new BigDecimal("3003614341");
                                obj7.setDatos(10077021,"Javier","Ramirez","Cll 21",29,num7,"Bogota","Mira");
                                System.out.println(obj7.getDatos());
                                System.out.println("CANDIDATO NUMERO 3:");
                                Datos obj8=new Datos();
                                BigDecimal num8=new BigDecimal("300431258");
                                obj8.setDatos(07702164,"Santiago","Gonzales","Cll 1",42,num8,"Barranquilla","Mira");
                                System.out.println(obj8.getDatos());
                                break;
                        }
                }while(op!=5);
                break;
            case 2:
                Scanner v=new Scanner(System.in);
                Scanner k=new Scanner(System.in);
                System.out.println("ACONTINUACION SE MUESTRAN LOS CANDIDATOS Y SU RESPECTIVO NUMERO");
                System.out.println("");
                System.out.println("CANDIDATOS DEL PARTIDO POLO");
                System.out.println("CANDIDATO NUMERO 1:");
                Datos obj=new Datos();
                BigDecimal num=new BigDecimal("3134183059");
                obj.setDatos(1007702164,"Jairo","Perez","Cll 18",23,num,"Facatativa","Polo");
                System.out.println(obj.getDatos());
                System.out.println("Numero de tarjeton es 1");
                System.out.println("CANDIDATO NUMERO 2:");
                Datos obj1=new Datos();
                BigDecimal num1=new BigDecimal("3214617377");
                obj1.setDatos(1007702165,"Laura","Alvarado","Cll 21",29,num1,"San Francisco","Polo");
                System.out.println(obj1.getDatos());
                System.out.println("Numero de tarjeton es 2");
                System.out.println("CANDIDATOS DEL PARTIDO LIBERAL");
                System.out.println("CANDIDATO NUMERO 1:");
                Datos obj2=new Datos();
                BigDecimal num2=new BigDecimal("3114771730");
                obj2.setDatos(46604709,"Leopoldo","Lopez","Cll 10",40,num2,"Supata","Liberal");
                System.out.println(obj2.getDatos());
                System.out.println("Numero de tarjeton es 3");
                System.out.println("CANDIDATO NUMERO 2:");
                Datos obj3=new Datos();
                BigDecimal num3=new BigDecimal("3202617477");
                obj3.setDatos(100774582,"Daniela","Acosta","Cll 41",29,num3,"Madrid","Liberal");
                System.out.println(obj3.getDatos());
                System.out.println("Numero de tarjeton es 4");
                System.out.println("CANDIDATOS DEL PARTIDO VERDE");
                System.out.println("CANDIDATO NUMERO 1:");
                Datos obj4=new Datos();
                BigDecimal num4=new BigDecimal("3125041789");
                obj4.setDatos(11478569,"Oscar","Sanchez","Cll 15",50,num4,"Facatativa","Verde");
                System.out.println(obj4.getDatos());
                System.out.println("Numero de tarjeton es 5");
                System.out.println("CANDIDATO NUMERO 2:");
                Datos obj5=new Datos();
                BigDecimal num5=new BigDecimal("3204617377");
                obj5.setDatos(11597533,"Diego","Lopez","Cll 50",29,num5,"Bogota","Verde");
                System.out.println(obj5.getDatos());
                System.out.println("Numero de tarjeton es 6");
                System.out.println("CANDIDATOS DEL PARTIDO MIRA");
                System.out.println("CANDIDATO NUMERO 1:");
                Datos obj6=new Datos();
                BigDecimal num6=new BigDecimal("312050504");
                obj6.setDatos(21453862,"Yolanda","Diaz","Cll 10",43,num6,"Facatativa","Mira");
                System.out.println(obj6.getDatos());
                System.out.println("Numero de tarjeton es 7");
                System.out.println("CANDIDATO NUMERO 2:");
                Datos obj7=new Datos();
                BigDecimal num7=new BigDecimal("3003614341");
                obj7.setDatos(10077021,"Javier","Ramirez","Cll 21",29,num7,"Bogota","Mira");
                System.out.println(obj7.getDatos());
                System.out.println("Numero de tarjeton es 8");
                System.out.println("CANDIDATO NUMERO 3:");
                Datos obj8=new Datos();
                BigDecimal num8=new BigDecimal("300431258");
                obj8.setDatos(07702164,"Santiago","Gonzales","Cll 1",42,num8,"Barranquilla","Mira");
                System.out.println(obj8.getDatos());
                System.out.println("Numero de tarjeton es 9");
                System.out.println("");
                System.out.println("INGRESE EL NUMERO DE TARJETON POR EL QUE DESEA VOTAR");
                System.out.println("");
                voto=v.nextInt();
                System.out.println("Por cual medio se entero de este candidato (Television=1,Radio=2,Internet=3");
                int u=k.nextInt();
                switch(voto){
                    case 1:
                        votop=votop+1;
                        total=total+1;
                        voto1=voto1+1;
                        break;
                    case 2:
                        votop=votop+1;
                        total=total+1;
                        voto2=voto2+1;
                        break;
                    case 3:
                        votol=votol+1;
                        total=total+1;
                        voto3=voto3+1;
                        break;
                    case 4:
                        votol=votol+1;
                        total=total+1;
                        voto4=voto4+1;
                        break;
                    case 5:
                        votov=votov+1;
                        total=total+1;
                        voto5=voto5+1;
                        break;
                    case 6:
                        votov=votov+1;
                        total=total+1;
                        voto6=voto6+1;
                        break;
                    case 7:
                        votom=votom+1;
                        total=total+1;
                        voto7=voto7+1;
                        break;
                    case 8:
                        votom=votom+1;
                        total=total+1;
                        voto8=voto8+1;
                        break;
                    case 9:
                        votom=votom+1;
                        total=total+1;
                        voto9=voto9+1;
                        break;
                }
                break;
            case 3:
                System.out.println("PARTIDO POLO");
                System.out.println("El pardito Polo tuvo "+votop+" votos en total");
                System.out.println("El candidato numero 1 obtuvo "+voto1+" votos");
                System.out.println("El candidato numero 2 obtuvo "+voto2+" votos");
                System.out.println("");
                System.out.println("PARTIDO LIBERAL");
                System.out.println("El pardito Liberal tuvo "+votol+" votos en total");
                System.out.println("El candidato numero 1 obtuvo "+voto3+" votos");
                System.out.println("El candidato numero 2 obtuvo "+voto4+" votos");
                System.out.println("");
                System.out.println("PARTIDO VERDE");
                System.out.println("El pardito Verde tuvo "+votov+" votos en total");
                System.out.println("El candidato numero 1 obtuvo "+voto5+" votos");
                System.out.println("El candidato numero 2 obtuvo "+voto6+" votos");
                System.out.println("");
                System.out.println("PARTIDO MIRA");
                System.out.println("El pardito Mira tuvo "+votom+" votos en total");
                System.out.println("El candidato numero 1 obtuvo "+voto7+" votos");
                System.out.println("El candidato numero 2 obtuvo "+voto8+" votos");
                System.out.println("El candidato numero 3 obtuvo "+voto9+" votos");
                System.out.println("");
                System.out.println("Para un total de "+total+" votos");
        }
        }while(opc!=5);}

}
   
    
   

