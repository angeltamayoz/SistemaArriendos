package org.example.MODELOS;

import java.time.LocalDate;

public class Arrendatario {
    private Integer idArrendatario;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private String numeroTelefono;
    private String correoElectronico;
    private String historialPagos;
    private String fechaInicioContrato;

    public Arrendatario() {
    }

    public Arrendatario(Integer idArrendatario, String nombreCompleto, LocalDate fechaNacimiento, String numeroTelefono, String correoElectronico, String historialPagos, String fechaInicioContrato) {
        this.idArrendatario = idArrendatario;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.historialPagos = historialPagos;
        this.fechaInicioContrato = fechaInicioContrato;
    }

    public Integer getIdArrendatario() {
        return idArrendatario;
    }

    public void setIdArrendatario(Integer idArrendatario) {
        this.idArrendatario = idArrendatario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getHistorialPagos() {
        return historialPagos;
    }

    public void setHistorialPagos(String historialPagos) {
        this.historialPagos = historialPagos;
    }

    public String getFechaInicioContrato() {
        return fechaInicioContrato;
    }

    public void setFechaInicioContrato(String fechaInicioContrato) {
        this.fechaInicioContrato = fechaInicioContrato;
    }

    @Override
    public String toString() {
        return "Arrendatario{" +
                "idArrendatario=" + idArrendatario +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", historialPagos='" + historialPagos + '\'' +
                ", fechaInicioContrato='" + fechaInicioContrato + '\'' +
                '}';
    }
}
