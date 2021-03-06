package modelo;
// Generated 25/05/2019 15:45:25 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Lectura generated by hbm2java
 */
public class Lectura  implements java.io.Serializable {


     private Integer idlectura;
     private Puesto puesto;
     private Date fecha;
     private int lecturaKw;
     private double precio;

    public Lectura() {
    }

    public Lectura(Puesto puesto, Date fecha, int lecturaKw, double precio) {
       this.puesto = puesto;
       this.fecha = fecha;
       this.lecturaKw = lecturaKw;
       this.precio = precio;
    }
   
    public Integer getIdlectura() {
        return this.idlectura;
    }
    
    public void setIdlectura(Integer idlectura) {
        this.idlectura = idlectura;
    }
    public Puesto getPuesto() {
        return this.puesto;
    }
    
    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getLecturaKw() {
        return this.lecturaKw;
    }
    
    public void setLecturaKw(int lecturaKw) {
        this.lecturaKw = lecturaKw;
    }
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }




}


