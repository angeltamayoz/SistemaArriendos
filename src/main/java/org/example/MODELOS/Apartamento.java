package org.example.MODELOS;

import java.time.LocalDate;

public class Apartamento {
    private Integer idApartamento;
    private String direccion;
    private Double tamaño;
    private Integer numeroHabitaciones;
    private Double precioMensual;
    private Integer numeroBaños;
    private LocalDate fechaDisponible;

    public Apartamento() {
    }

    public Apartamento(Integer idApartamento, String direccion, Double tamaño, Integer numeroHabitaciones, Double precioMensual, Integer numeroBaños, LocalDate fechaDisponible) {
        this.idApartamento = idApartamento;
        this.direccion = direccion;
        this.tamaño = tamaño;
        this.numeroHabitaciones = numeroHabitaciones;
        this.precioMensual = precioMensual;
        this.numeroBaños = numeroBaños;
        this.fechaDisponible = fechaDisponible;
    }

    public Integer getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(Integer idApartamento) {
        this.idApartamento = idApartamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Double getTamaño() {
        return tamaño;
    }

    public void setTamaño(Double tamaño) {
        this.tamaño = tamaño;
    }

    public Integer getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(Integer numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

    public Double getPrecioMensual() {
        return precioMensual;
    }

    public void setPrecioMensual(Double precioMensual) {
        this.precioMensual = precioMensual;
    }

    public Integer getNumeroBaños() {
        return numeroBaños;
    }

    public void setNumeroBaños(Integer numeroBaños) {
        this.numeroBaños = numeroBaños;
    }

    public LocalDate getFechaDisponible() {
        return fechaDisponible;
    }

    public void setFechaDisponible(LocalDate fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "idApartamento=" + idApartamento +
                ", direccion='" + direccion + '\'' +
                ", tamaño=" + tamaño +
                ", numeroHabitaciones=" + numeroHabitaciones +
                ", precioMensual=" + precioMensual +
                ", numeroBaños=" + numeroBaños +
                ", fechaDisponible=" + fechaDisponible +
                '}';
    }
}
