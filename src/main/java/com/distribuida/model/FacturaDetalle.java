package com.distribuida.model;

public class FacturaDetalle {

    //Integrar

    private int idFacturadetalle;
    private int cantidad;
    private Double  subtotal;
    private Factura factura;
    private Libro libro;

    // contructores

public FacturaDetalle(){

}

    // getters and setters


    public int getIdFacturadetalle() {
        return idFacturadetalle;
    }

    public void setIdFacturadetalle(int idFacturadetalle) {
        this.idFacturadetalle = idFacturadetalle;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int i) {
        this.cantidad = i;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    @Override
    public String toString() {
        return "FacturaDetalle{" +
                "idFacturadetalle=" + idFacturadetalle +
                ", cantidad=" + cantidad +
                ", subtotal=" + subtotal +
                ", factura=" + factura +
                ", libro=" + libro +
                '}';
    }


}
