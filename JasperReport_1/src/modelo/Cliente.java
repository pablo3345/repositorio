package modelo;
// Generated 21/03/2019 23:31:21 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private Integer idcliente;
     private String nombre;
     private String apellido;
     private Date fecha;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, Date fecha) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.fecha = fecha;
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
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    




}


