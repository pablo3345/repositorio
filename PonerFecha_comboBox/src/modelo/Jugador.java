package modelo;
// Generated 22/04/2019 15:52:32 by Hibernate Tools 4.3.1



/**
 * Jugador generated by hbm2java
 */
public class Jugador  implements java.io.Serializable {


     private Integer idjugador;
     private String nombre;
     private int diaNacimiento;
     private String mesNacimiento;
     private int añoNacimiento;

    public Jugador() {
    }

    public Jugador(String nombre, int diaNacimiento, String mesNacimiento, int añoNacimiento) {
       this.nombre = nombre;
       this.diaNacimiento = diaNacimiento;
       this.mesNacimiento = mesNacimiento;
       this.añoNacimiento = añoNacimiento;
    }
   
    public Integer getIdjugador() {
        return this.idjugador;
    }
    
    public void setIdjugador(Integer idjugador) {
        this.idjugador = idjugador;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getDiaNacimiento() {
        return this.diaNacimiento;
    }
    
    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }
    public String getMesNacimiento() {
        return this.mesNacimiento;
    }
    
    public void setMesNacimiento(String mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }
    public int getAñoNacimiento() {
        return this.añoNacimiento;
    }
    
    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }




}


