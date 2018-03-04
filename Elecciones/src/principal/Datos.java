/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import java.math.BigDecimal;
/**
 *
 * @author Sales Rep01
 */
public class Datos extends Main{
    private int cedula;
    private String nombre;
    private String apellido;
    private String direccion;
    private int edad;
    private BigDecimal celular;
    private String ciudad;
    private String partido;
    boolean getDatos;
    
    Datos(){
      System.out.println("");
    }
    
    Datos(int _cedula , String _nombre , String _apellido , String _direccion , int _edad , BigDecimal _celular , String _ciudad , String _partido){
    this();
    this.cedula=_cedula;
    this.nombre=_nombre;
    this.apellido=_apellido;
    this.direccion=_direccion;
    this.edad=_edad;
    this.celular=_celular;
    this.ciudad=_ciudad;
    this.partido=_partido;
    }
    
    public void setDatos(int _cedula , String _nombre , String _apellido , String _direccion , int _edad , BigDecimal _celular , String _ciudad , String _partido){
    
    this.cedula=_cedula;
    this.nombre=_nombre;
    this.apellido=_apellido;
    this.direccion=_direccion;
    this.edad=_edad;
    this.celular=_celular;
    this.ciudad=_ciudad;
    this.partido=_partido;
    }
    
    public String getDatos(){
        String respuesta="El nombre del candidato es: "+this.nombre+" "+this.apellido;
        respuesta+="\nCon numero de cedula: "+this.cedula;
        respuesta+="\nDe la ciudad de: "+this.ciudad;
        respuesta+="\nPerteneciente al partido:"+this.partido;
        return respuesta;
           
    }
    
    
}
