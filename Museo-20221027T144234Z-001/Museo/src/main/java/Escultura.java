
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JUAN
 */
public class Escultura {
   private String autor;
   private Date fechaCreacion;
   private Date fechaEntrada;
   private String periodo;
   private boolean restaurado;

    public Escultura(String autor, Date fechaCreacion, Date fechaEntrada, String periodo, boolean restaurado) {
        this.autor = autor;
        this.fechaCreacion = fechaCreacion;
        this.fechaEntrada = fechaEntrada;
        this.periodo = periodo;
        this.restaurado = restaurado;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isRestaurado() {
        return restaurado;
    }

    public void setRestaurado(boolean restaurado) {
        this.restaurado = restaurado;
    }

    @Override
    public String toString() {
        return "Escultura{" + "autor=" + autor + ", fechaCreacion=" + fechaCreacion + ", fechaEntrada=" + fechaEntrada + ", periodo=" + periodo + ", restaurado=" + restaurado + '}';
    }
   
    
    
}
