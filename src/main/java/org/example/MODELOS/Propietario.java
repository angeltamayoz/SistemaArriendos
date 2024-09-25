package org.example.MODELOS;

public class Propietario {
    private Integer idPropietario;
    private String nombreCompleto;
    private String numeroTelefono;
    private String correoElectronico;
    private String direccionResidencia;
    private Integer numeroApartamentos;
    private String cuentaBancaria;

    public Propietario() {
    }

    public Propietario(Integer idPropietario, String nombreCompleto, String numeroTelefono, String correoElectronico, String direccionResidencia, Integer numeroApartamentos, String cuentaBancaria) {
        this.idPropietario = idPropietario;
        this.nombreCompleto = nombreCompleto;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
        this.direccionResidencia = direccionResidencia;
        this.numeroApartamentos = numeroApartamentos;
        this.cuentaBancaria = cuentaBancaria;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public Integer getNumeroApartamentos() {
        return numeroApartamentos;
    }

    public void setNumeroApartamentos(Integer numeroApartamentos) {
        this.numeroApartamentos = numeroApartamentos;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(Integer idPropietario) {
        this.idPropietario = idPropietario;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "idPropietario=" + idPropietario +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", numeroTelefono='" + numeroTelefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", direccionResidencia='" + direccionResidencia + '\'' +
                ", numeroApartamentos=" + numeroApartamentos +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                '}';
    }
}
