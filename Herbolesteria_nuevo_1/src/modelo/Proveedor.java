package modelo;
// Generated 01/03/2019 20:11:37 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Proveedor generated by hbm2java
 */
public class Proveedor  implements java.io.Serializable {


     private Integer idproveedor;
     private String nombreApellido;
     private String localidad;
     private String rubro;
     private Set compras = new HashSet(0);

    public Proveedor() {
    }

	
    public Proveedor(String nombreApellido, String localidad, String rubro) {
        this.nombreApellido = nombreApellido;
        this.localidad = localidad;
        this.rubro = rubro;
    }
    public Proveedor(String nombreApellido, String localidad, String rubro, Set compras) {
       this.nombreApellido = nombreApellido;
       this.localidad = localidad;
       this.rubro = rubro;
       this.compras = compras;
    }
   
    public Integer getIdproveedor() {
        return this.idproveedor;
    }
    
    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }
    public String getNombreApellido() {
        return this.nombreApellido;
    }
    
    public void setNombreApellido(String nombreApellido) {
        this.nombreApellido = nombreApellido;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getRubro() {
        return this.rubro;
    }
    
    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    public Set getCompras() {
        return this.compras;
    }
    
    public void setCompras(Set compras) {
        this.compras = compras;
    }

    @Override
    public String toString() {
        return  "id:" + idproveedor + ", nombre Apellido:" + nombreApellido + ", localidad:" + localidad + ", rubro:" + rubro;
    }
    
    




}

