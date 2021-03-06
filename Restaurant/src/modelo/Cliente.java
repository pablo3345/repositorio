package modelo;
// Generated 10/04/2020 15:44:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idcliente;
     private String nombre;
     private String apellido;
     private String direccion;
     private String localidad;
     private Set pedidos = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String nombre, String apellido, String direccion, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.localidad = localidad;
    }
    public Cliente(String nombre, String apellido, String direccion, String localidad, Set pedidos) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.localidad = localidad;
       this.pedidos = pedidos;
    }
   
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
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
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return idcliente + " " + nombre + " " + apellido + ", " + direccion;
    }
    
    
    




}


