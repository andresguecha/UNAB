package edu.com.co.apiunabcv.models;

public class UserAcademyModel {

    private String tipoEstudio;
    private String tituloObtenido;
    private String año;
    private String estado;
    public UserAcademyModel() {
    }
    public UserAcademyModel(String tipoEstudio, String tituloObtenido, String año, String estado) {
        this.tipoEstudio = tipoEstudio;
        this.tituloObtenido = tituloObtenido;
        this.año = año;
        this.estado = estado;
    }
    public String getTipoEstudio() {
        return tipoEstudio;
    }
    public void setTipoEstudio(String tipoEstudio) {
        this.tipoEstudio = tipoEstudio;
    }
    public String getTituloObtenido() {
        return tituloObtenido;
    }
    public void setTituloObtenido(String tituloObtenido) {
        this.tituloObtenido = tituloObtenido;
    }
    public String getAño() {
        return año;
    }
    public void setAño(String año) {
        this.año = año;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
