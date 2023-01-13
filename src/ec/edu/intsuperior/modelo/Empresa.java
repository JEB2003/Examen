/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author PC
 */
public class Empresa {
    private Integer idEmpresa;
    private String nombre;
    private String email;
    private Integer telefono;
 
public Empresa(){
    
}

    public Empresa(Integer idEmpresa, String nombre, String email, Integer telefono) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "El idEmpresa es: "+getIdEmpresa()+"\n"
                +"El Nombre de la Empresa es: "+getNombre()+"\n"
                +"El Email de la Empresa es: "+getEmail()+"\n"
                +"El Telefono de la empresa es: "+getTelefono()+"\n";
    }
    
}
