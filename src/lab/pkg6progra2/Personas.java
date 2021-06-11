
package lab.pkg6progra2;


public abstract class Personas {
    //Atributos
    protected String nombre;
    protected String apellido;
            
    //Constructor
    public Personas(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //Mutadores
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //To String
    public String mostrarDatos(){
        return "Nombre:"+nombre+" "+"Apellido:"+apellido;
    }  
}
