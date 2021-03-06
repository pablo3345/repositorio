package modelo;
// Generated 25/05/2019 15:45:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoDePuesto generated by hbm2java
 */
public class TipoDePuesto  implements java.io.Serializable {


     private Integer idtipoDePuesto;
     private String nombre;
     private String camaraRefrigerante;
     private Set puestos = new HashSet(0);

    public TipoDePuesto() {
    }

	
    public TipoDePuesto(String nombre, String camaraRefrigerante) {
        this.nombre = nombre;
        this.camaraRefrigerante = camaraRefrigerante;
    }
    public TipoDePuesto(String nombre, String camaraRefrigerante, Set puestos) {
       this.nombre = nombre;
       this.camaraRefrigerante = camaraRefrigerante;
       this.puestos = puestos;
    }
   
    public Integer getIdtipoDePuesto() {
        return this.idtipoDePuesto;
    }
    
    public void setIdtipoDePuesto(Integer idtipoDePuesto) {
        this.idtipoDePuesto = idtipoDePuesto;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCamaraRefrigerante() {
        return this.camaraRefrigerante;
    }
    
    public void setCamaraRefrigerante(String camaraRefrigerante) {
        this.camaraRefrigerante = camaraRefrigerante;
    }
    public Set getPuestos() {
        return this.puestos;
    }
    
    public void setPuestos(Set puestos) {
        this.puestos = puestos;
    }

    @Override
    public String toString() {
        return  + idtipoDePuesto +" "+  nombre + " "+ camaraRefrigerante;
    }
    
    
    
    




}


