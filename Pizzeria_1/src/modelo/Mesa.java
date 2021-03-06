package modelo;
// Generated 10/05/2020 19:03:06 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Mesa generated by hbm2java
 */
public class Mesa  implements java.io.Serializable {


     private Integer idMesa;
     private String numero;
     private String estado;
     private Set pedidos = new HashSet(0);

    public Mesa() {
    }

	
    public Mesa(String numero, String estado) {
        this.numero = numero;
        this.estado = estado;
    }
    public Mesa(String numero, String estado, Set pedidos) {
       this.numero = numero;
       this.estado = estado;
       this.pedidos = pedidos;
    }
   
    public Integer getIdMesa() {
        return this.idMesa;
    }
    
    public void setIdMesa(Integer idMesa) {
        this.idMesa = idMesa;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getPedidos() {
        return this.pedidos;
    }
    
    public void setPedidos(Set pedidos) {
        this.pedidos = pedidos;
    }

    @Override
    public String toString() {
        return   numero + " " + estado;
    }
    
    
    




}


