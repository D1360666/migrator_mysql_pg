package uy.com.soluciones.modelpgsql;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "ods_recursos_pg")
public class Ods_Recurso_PG implements Serializable {
    @Id
    private Integer id;
    private Integer terminal;
    private Integer ticket;
    private Double total;
    private int renglon;
    private int dia;
    private int mes;
    private int año;
    private int idMercaderia;
    private String descripcion;
    private Double preventa;
    private Double cantidad;
    private Double cotizacion;
    private Double importe;
    private int idSubFamilia;
    private String tipoVenta;
    private String nombreSubFamilia;
    private int idFamilia;
    private String nombreFamilia;

    public Ods_Recurso_PG() {
    }

    public Ods_Recurso_PG(Integer id, Integer terminal, Integer ticket, Double total, int renglon, int dia, int mes, int año, int idMercaderia, String descripcion, Double preventa, Double cantidad, Double cotizacion, Double importe, int idSubFamilia, String tipoVenta, String nombreSubFamilia, int idFamilia, String nombreFamilia) {
        this.id = id;
        this.terminal = terminal;
        this.ticket = ticket;
        this.total = total;
        this.renglon = renglon;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.idMercaderia = idMercaderia;
        this.descripcion = descripcion;
        this.preventa = preventa;
        this.cantidad = cantidad;
        this.cotizacion = cotizacion;
        this.importe = importe;
        this.idSubFamilia = idSubFamilia;
        this.tipoVenta = tipoVenta;
        this.nombreSubFamilia = nombreSubFamilia;
        this.idFamilia = idFamilia;
        this.nombreFamilia = nombreFamilia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTerminal() {
        return terminal;
    }

    public void setTerminal(Integer terminal) {
        this.terminal = terminal;
    }

    public Integer getTicket() {
        return ticket;
    }

    public void setTicket(Integer ticket) {
        this.ticket = ticket;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public int getRenglon() {
        return renglon;
    }

    public void setRenglon(int renglon) {
        this.renglon = renglon;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getIdMercaderia() {
        return idMercaderia;
    }

    public void setIdMercaderia(int idMercaderia) {
        this.idMercaderia = idMercaderia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPreventa() {
        return preventa;
    }

    public void setPreventa(Double preventa) {
        this.preventa = preventa;
    }

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public Double getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Double cotizacion) {
        this.cotizacion = cotizacion;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }

    public int getIdSubFamilia() {
        return idSubFamilia;
    }

    public void setIdSubFamilia(int idSubFamilia) {
        this.idSubFamilia = idSubFamilia;
    }

    public String getTipoVenta() {
        return tipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        this.tipoVenta = tipoVenta;
    }

    public String getNombreSubFamilia() {
        return nombreSubFamilia;
    }

    public void setNombreSubFamilia(String nombreSubFamilia) {
        this.nombreSubFamilia = nombreSubFamilia;
    }

    public int getIdFamilia() {
        return idFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        this.idFamilia = idFamilia;
    }

    public String getNombreFamilia() {
        return nombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        this.nombreFamilia = nombreFamilia;
    }
}
