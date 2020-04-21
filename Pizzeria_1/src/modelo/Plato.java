package modelo;
// Generated 28/03/2020 20:45:43 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Plato generated by hbm2java
 */
public class Plato  implements java.io.Serializable {


     private Integer idPlato;
     private String nombre;
     private double costoDelPlato;
     private double precioAlPublico;
     private String ingredientes;
     private Set pedidos = new HashSet(0);

    public Plato() {
    }

	
    public Plato(String nombre, double costoDelPlato, double precioAlPublico, String ingredientes) {
        this.nombre = nombre;
        this.costoDelPlato = costoDelPlato;
        this.precioAlPublico = precioAlPublico;
        this.ingredientes = ingredientes;
    }
    public Plato(String nombre, double costoDelPlato, double precioAlPublico, String ingredientes, Set pedidos) {
       this.nombre = nombre;
       this.costoDelPlato = costoDelPlato;
       this.precioAlPublico = precioAlPublico;
       this.ingredientes = ingredientes;
       this.pedidos = pedidos;
    }
   
    public Integer getIdPlato() {
        return this.idPlato;
    }
    
    public void setIdPlato(Integer idPlato) {
        this.idPlato = idPlato;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getCostoDelPlato() {
        return this.costoDelPlato;
    }
    
    public void setCostoDelPlato(double costoDelPlato) {
        this.costoDelPlato = costoDelPlato;
    }
    public double getPrecioAlPublico() {
        return this.precioAlPublico;
    }
    
    public void setPrecioAlPublico(double precioAlPublico) {
        this.precioAlPublico = precioAlPublico;
    }
    public String getIngredientes() {
        return this.ingredientes;
    }
    
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }




}

