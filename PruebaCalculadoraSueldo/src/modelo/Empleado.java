package modelo;
// Generated 04/06/2019 20:45:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javassist.expr.Instanceof;

/**
 * Empleado generated by hbm2java
 */
public class Empleado  implements java.io.Serializable {


     private Integer idempleado;
     private String nombre;
     private String apellido;
     private String dni;
     private double sueldoBase;
     private Set articulos = new HashSet(0);

    public Empleado() {
    }

	
    public Empleado(String nombre, String apellido, String dni, double sueldoBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
    }
    public Empleado(String nombre, String apellido, String dni, double sueldoBase, Set articulos) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.sueldoBase = sueldoBase;
       this.articulos = articulos;
    }
   
    public Integer getIdempleado() {
        return this.idempleado;
    }
    
    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public double getSueldoBase() {
        return this.sueldoBase;
    }
    
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public Set getArticulos() {
        return this.articulos;
    }
    
    public void setArticulos(Set articulos) {
        this.articulos = articulos;
    }

    @Override
    public String toString() {
        return  idempleado +" "+ nombre +" "+  apellido +" "+  dni +"Sueldo Base "+  sueldoBase;
    }

    @Override
    public boolean equals(Object o) {
        
        if(!( o instanceof Empleado)){
            
            
            
            return false;
        }
        Empleado empleado = (Empleado) o;
        return (this.dni.equals(empleado.getDni()));
    }
    
    
    
    
    




}


