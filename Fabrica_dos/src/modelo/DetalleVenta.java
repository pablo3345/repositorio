package modelo;
// Generated 30/12/2019 14:57:30 by Hibernate Tools 4.3.1



/**
 * DetalleVenta generated by hbm2java
 */
public class DetalleVenta  implements java.io.Serializable {


     private Integer iddetalleVenta;
     private Fabrica fabrica;
     private Repuesto repuesto;
     private int repuestoCantidad;
     private double precioConiva;
     private double total;
     private Double totalaPagar;

    public DetalleVenta() {
    }

	
    public DetalleVenta(Fabrica fabrica, Repuesto repuesto, int repuestoCantidad, double precioConiva, double total) {
        this.fabrica = fabrica;
        this.repuesto = repuesto;
        this.repuestoCantidad = repuestoCantidad;
        this.precioConiva = precioConiva;
        this.total = total;
    }
    public DetalleVenta(Fabrica fabrica, Repuesto repuesto, int repuestoCantidad, double precioConiva, double total, Double totalaPagar) {
       this.fabrica = fabrica;
       this.repuesto = repuesto;
       this.repuestoCantidad = repuestoCantidad;
       this.precioConiva = precioConiva;
       this.total = total;
       this.totalaPagar = totalaPagar;
    }
   
    public Integer getIddetalleVenta() {
        return this.iddetalleVenta;
    }
    
    public void setIddetalleVenta(Integer iddetalleVenta) {
        this.iddetalleVenta = iddetalleVenta;
    }
    public Fabrica getFabrica() {
        return this.fabrica;
    }
    
    public void setFabrica(Fabrica fabrica) {
        this.fabrica = fabrica;
    }
    public Repuesto getRepuesto() {
        return this.repuesto;
    }
    
    public void setRepuesto(Repuesto repuesto) {
        this.repuesto = repuesto;
    }
    public int getRepuestoCantidad() {
        return this.repuestoCantidad;
    }
    
    public void setRepuestoCantidad(int repuestoCantidad) {
        this.repuestoCantidad = repuestoCantidad;
    }
    public double getPrecioConiva() {
        return this.precioConiva;
    }
    
    public void setPrecioConiva(double precioConiva) {
        this.precioConiva = precioConiva;
    }
    public double getTotal() {
        return this.total;
    }
    
    public void setTotal(double total) {
        this.total = total;
    }
    public Double getTotalaPagar() {
        return this.totalaPagar;
    }
    
    public void setTotalaPagar(Double totalaPagar) {
        this.totalaPagar = totalaPagar;
    }
    
  




}


