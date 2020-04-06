package modelo;
// Generated 28/03/2020 20:45:43 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pedido generated by hbm2java
 */
public class Pedido  implements java.io.Serializable {


     private Integer idPedido;
     private Cliente cliente;
     private Mesa mesa;
     private Plato plato;
     private Date horaDelPedido;
     private double demora;
     private double cantidad;
     private Set facturas = new HashSet(0);

    public Pedido() {
    }

	
    public Pedido(Cliente cliente, Mesa mesa, Plato plato, Date horaDelPedido, double demora, double cantidad) {
        this.cliente = cliente;
        this.mesa = mesa;
        this.plato = plato;
        this.horaDelPedido = horaDelPedido;
        this.demora = demora;
        this.cantidad = cantidad;
    }
    public Pedido(Cliente cliente, Mesa mesa, Plato plato, Date horaDelPedido, double demora, double cantidad, Set facturas) {
       this.cliente = cliente;
       this.mesa = mesa;
       this.plato = plato;
       this.horaDelPedido = horaDelPedido;
       this.demora = demora;
       this.cantidad = cantidad;
       this.facturas = facturas;
    }
   
    public Integer getIdPedido() {
        return this.idPedido;
    }
    
    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
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
    public double getDemora() {
        return this.demora;
    }
    
    public void setDemora(double demora) {
        this.demora = demora;
    }
    public double getCantidad() {
        return this.cantidad;
    }
    
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    public Set getFacturas() {
        return this.facturas;
    }
    
    public void setFacturas(Set facturas) {
        this.facturas = facturas;
    }




}


