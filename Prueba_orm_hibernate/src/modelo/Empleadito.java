package modelo;
// Generated 12/01/2019 15:35:12 by Hibernate Tools 4.3.1

import javax.swing.JOptionPane;




/**
 * Empleadito generated by hbm2java
 */
public class Empleadito  implements java.io.Serializable {


     private Integer idempleadito;
     private String nombre;
     private String apellido;
     private int edad;
     private String dni;

    public Empleadito() {
    }

    public Empleadito(String nombre, String apellido, int edad, String dni) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.edad = edad;
       this.dni = dni;
    }

  

  
   
    public Integer getIdempleadito() {
        return this.idempleadito;
    }
    
    public void setIdempleadito(Integer idempleadito) {
        this.idempleadito = idempleadito;
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
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

//    @Override
//    public boolean equals(Object o) {
//        if(! (o instanceof Empleadito)){
//        return false;
//        
//       
//        
//        
//        }
//         Empleadito empleadito = (Empleadito) o;
//         
//         
//       
//        
//        return (this.dni.equals(empleadito.getDni()));
//       
//    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellido + ", "+ this.dni + ", años " + this.edad;
    }
    
    
    
    
    
    
    
    
    
    




}


