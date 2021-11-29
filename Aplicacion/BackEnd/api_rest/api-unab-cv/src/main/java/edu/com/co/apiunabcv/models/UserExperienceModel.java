package edu.com.co.apiunabcv.models;

public class UserExperienceModel {

    private String nombreCompania;
    private String cargo;
    private int duracion;
    private int salario;
    public UserExperienceModel() {
    }
    public UserExperienceModel(String nombreCompania, String cargo, int duracion, int salario) {
        this.nombreCompania = nombreCompania;
        this.cargo = cargo;
        this.duracion = duracion;
        this.salario = salario;
    }
    public String getNombreCompania() {
        return nombreCompania;
    }
    public void setNombreCompania(String nombreCompania) {
        this.nombreCompania = nombreCompania;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getDuracion() {
        return duracion;
    }
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
    

    
}
