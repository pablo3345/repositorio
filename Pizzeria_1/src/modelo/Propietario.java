package modelo;
// Generated 10/05/2020 19:03:06 by Hibernate Tools 4.3.1



/**
 * Propietario generated by hbm2java
 */
public class Propietario  implements java.io.Serializable {


     private Integer idPropietario;
     private Pedido pedido;

    public Propietario() {
    }

    public Propietario(Pedido pedido) {
       this.pedido = pedido;
    }
   
    public Integer getIdPropietario() {
        return this.idPropietario;
    }
    
    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }
    public Pedido getPedido() {
        return this.pedido;
    }
    
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }




}


