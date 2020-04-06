package modelo;
// Generated 03/04/2020 21:15:53 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idpedido;
     private Cliente cliente;
     private Mesa mesa;
     private Plato plato;
     private Date horaDelPedido;
     private double cantidad;
     private double demora;
     private Set propietarios = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(Cliente cliente, Mesa mesa, Plato plato, Date horaDelPedido, double cantidad, double demora) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.plato = plato;
        this.horaDelPedido = horaDelPedido;
        this.cantidad = cantidad;
        this.demora = demora;
    }
    public Pedido(Cliente cliente, Mesa mesa, Plato plato, Date horaDelPedido, double cantidad, double demora, Set propietarios) {
       this.cliente = cliente;
       this.mesa = mesa;
       this.plato = plato;
       this.horaDelPedido = horaDelPedido;
       this.cantidad = cantidad;
       this.demora = demora;
       this.propietarios = propietarios;
    }
   
    public Integer getIdpedido() {
        return this.idpedido;
    }
    
    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Mesa getMesa() {
        return this.mesa;
    }
    
    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    public Plato getPlato() {
        return this.plato;
    }
    
    public void setPlato(Plato plato) {
        this.plato = plato;
    }
    public Date getHoraDelPedido() {
        return this.horaDelPedido;
    }
    
    public void setHoraDelPedido(Date horaDelPedido) {
        this.horaDelPedido = horaDelPedido;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public double getDemora() {
        return this.demora;
    }
    
    public void setDemora(double demora) {
        this.demora = demora;
    }
    public Set getPropietarios() {
        return this.propietarios;
    }
    
    public void setPropietarios(Set propietarios) {
        this.propietarios = propietarios;
    }




}


