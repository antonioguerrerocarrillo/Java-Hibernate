package hibernaterecu;
// Generated 14-abr-2020 16:29:37 by Hibernate Tools 4.3.1



/**
 * Coches generated by hbm2java
 */
public class Coches  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String modelo;
     private int cv;
     private String bastidor;
     private int ano;

    public Coches() {
    }

	
    public Coches(String modelo, int cv, String bastidor, int ano) {
        this.modelo = modelo;
        this.cv = cv;
        this.bastidor = bastidor;
        this.ano = ano;
    }
    public Coches(String nombre, String modelo, int cv, String bastidor, int ano) {
       this.nombre = nombre;
       this.modelo = modelo;
       this.cv = cv;
       this.bastidor = bastidor;
       this.ano = ano;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getCv() {
        return this.cv;
    }
    
    public void setCv(int cv) {
        this.cv = cv;
    }
    public String getBastidor() {
        return this.bastidor;
    }
    
    public void setBastidor(String bastidor) {
        this.bastidor = bastidor;
    }
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }




}

