package uy.com.soluciones.modelpgsql;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name= "ods_recursos_pg")
public class Ods_Recurso_PG implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private int Terminal;
    private int Ticket;
    private Double Total;
    private int Renglon;
    private int Dia;
    private int Mes;
    private int Año;
    private int IdMercaderia;
    private String Descripcion;
    private Double Preventa;
    private Double Cantidad;
    private Double Cotizacion;
    private Double Importe;
    private int IdSubFamilia;
    private String TipoVenta;
    private String NombreSubFamilia;
    private int IdFamilia;
    private String NombreFamilia;

    public Ods_Recurso_PG() {
    }

    public Ods_Recurso_PG(Long id, int terminal, int ticket, Double total, int renglon, int dia, int mes, int año, int idMercaderia, String descripcion, Double preventa, Double cantidad, Double cotizacion, Double importe, int idSubFamilia, String tipoVenta, String nombreSubFamilia, int idFamilia, String nombreFamilia) {
        this.id = id;
        Terminal = terminal;
        Ticket = ticket;
        Total = total;
        Renglon = renglon;
        Dia = dia;
        Mes = mes;
        Año = año;
        IdMercaderia = idMercaderia;
        Descripcion = descripcion;
        Preventa = preventa;
        Cantidad = cantidad;
        Cotizacion = cotizacion;
        Importe = importe;
        IdSubFamilia = idSubFamilia;
        TipoVenta = tipoVenta;
        NombreSubFamilia = nombreSubFamilia;
        IdFamilia = idFamilia;
        NombreFamilia = nombreFamilia;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getTerminal() {
        return Terminal;
    }

    public void setTerminal(int terminal) {
        Terminal = terminal;
    }

    public int getTicket() {
        return Ticket;
    }

    public void setTicket(int ticket) {
        Ticket = ticket;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }

    public int getRenglon() {
        return Renglon;
    }

    public void setRenglon(int renglon) {
        Renglon = renglon;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int dia) {
        Dia = dia;
    }

    public int getMes() {
        return Mes;
    }

    public void setMes(int mes) {
        Mes = mes;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int año) {
        Año = año;
    }

    public int getIdMercaderia() {
        return IdMercaderia;
    }

    public void setIdMercaderia(int idMercaderia) {
        IdMercaderia = idMercaderia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Double getPreventa() {
        return Preventa;
    }

    public void setPreventa(Double preventa) {
        Preventa = preventa;
    }

    public Double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Double cantidad) {
        Cantidad = cantidad;
    }

    public Double getCotizacion() {
        return Cotizacion;
    }

    public void setCotizacion(Double cotizacion) {
        Cotizacion = cotizacion;
    }

    public Double getImporte() {
        return Importe;
    }

    public void setImporte(Double importe) {
        Importe = importe;
    }

    public int getIdSubFamilia() {
        return IdSubFamilia;
    }

    public void setIdSubFamilia(int idSubFamilia) {
        IdSubFamilia = idSubFamilia;
    }

    public String getTipoVenta() {
        return TipoVenta;
    }

    public void setTipoVenta(String tipoVenta) {
        TipoVenta = tipoVenta;
    }

    public String getNombreSubFamilia() {
        return NombreSubFamilia;
    }

    public void setNombreSubFamilia(String nombreSubFamilia) {
        NombreSubFamilia = nombreSubFamilia;
    }

    public int getIdFamilia() {
        return IdFamilia;
    }

    public void setIdFamilia(int idFamilia) {
        IdFamilia = idFamilia;
    }

    public String getNombreFamilia() {
        return NombreFamilia;
    }

    public void setNombreFamilia(String nombreFamilia) {
        NombreFamilia = nombreFamilia;
    }
}
