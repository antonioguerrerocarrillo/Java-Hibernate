package hibernaterecu;
// Generated 14-abr-2020 16:29:37 by Hibernate Tools 4.3.1



/**
 * Concesionario generated by hbm2java
 */
public class Concesionario  implements java.io.Serializable {


     private Integer idConcesionario;
     private String nombre;
     private int telefono;
     private String localidad;
     private String direccion;

    public Concesionario() {
    }

    public Concesionario(String nombre, int telefono, String localidad, String direccion) {
       this.nombre = nombre;
       this.telefono = telefono;
       this.localidad = localidad;
       this.direccion = direccion;
    }
   
    public Integer getIdConcesionario() {
        return this.idConcesionario;
    }
    
    public void setIdConcesionario(Integer idConcesionario) {
        this.idConcesionario = idConcesionario;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public String getLocalidad() {
        return this.localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}


