
package lab.pkg6progra2;


public class Docentes extends Personas {
    //Atributos
    private int codigoCarrera;
    private int cantMaximaAlumnos;
    private int numAula;
    private String usuario;
    
    //Constructor
     public Docentes(int codigoCarrera, int cantMaximaAlumnos, int numAula, String nombre, String apellido) {
        super(nombre, apellido);
        this.codigoCarrera = codigoCarrera;
        this.cantMaximaAlumnos = cantMaximaAlumnos;
        this.numAula = numAula;
    }
     
    //Mutadores
      public int getCodigoCarrera() {
        return codigoCarrera;
    }

    public void setCodigoCarrera(int codigoCarrera) {
        this.codigoCarrera = codigoCarrera;
    }

    public int getCantMaximaAlumnos() {
        return cantMaximaAlumnos;
    }

    public void setCantMaximaAlumnos(int cantMaximaAlumnos) {
        this.cantMaximaAlumnos = cantMaximaAlumnos;
    }

    public int getNumAula() {
        return numAula;
    }

    public void setNumAula(int numAula) {
        this.numAula = numAula;
    }
    
    //To String
    @Override
    public String mostrarDatos() {
        return "Docentes{" + "codigoCarrera=" + codigoCarrera + ", cantMaximaAlumnos=" + cantMaximaAlumnos + ", numAula=" + numAula + ",nombre=" + nombre + ", apellido=" + apellido + '}';
    }

   

   
}
