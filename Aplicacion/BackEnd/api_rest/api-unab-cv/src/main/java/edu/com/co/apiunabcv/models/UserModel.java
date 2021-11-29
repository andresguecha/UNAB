package edu.com.co.apiunabcv.models;


import java.util.List;

import org.springframework.data.annotation.Id;


public class UserModel {

    @Id
    private String id;

    private String tipoDocumento;
    private String numDocumento;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String celular;
    private String correo;
    private int añosExperiencia;
    private List<UserExperienceModel> experienciaLaboral;
    private List<UserAcademyModel> estudiosRealizados;
    public UserModel() {
    }
    public UserModel(String id, String tipoDocumento, String numDocumento, String nombres, String apellidos,
            String fechaNacimiento, String celular, String correo, int añosExperiencia,
            List<UserExperienceModel> experienciaLaboral, List<UserAcademyModel> estudiosRealizados) {
        this.id = id;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.correo = correo;
        this.añosExperiencia = añosExperiencia;
        this.experienciaLaboral = experienciaLaboral;
        this.estudiosRealizados = estudiosRealizados;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getTipoDocumento() {
        return tipoDocumento;
    }
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
    public String getNumDocumento() {
        return numDocumento;
    }
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public int getAñosExperiencia() {
        return añosExperiencia;
    }
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    public List<UserExperienceModel> getExperienciaLaboral() {
        return experienciaLaboral;
    }
    public void setExperienciaLaboral(List<UserExperienceModel> experienciaLaboral) {
        this.experienciaLaboral = experienciaLaboral;
    }
    public List<UserAcademyModel> getEstudiosRealizados() {
        return estudiosRealizados;
    }
    public void setEstudiosRealizados(List<UserAcademyModel> estudiosRealizados) {
        this.estudiosRealizados = estudiosRealizados;
    }
    
}
