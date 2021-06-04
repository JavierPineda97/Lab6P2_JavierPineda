
package lab.pkg6progra2;


public class Alumnos extends Personas{
    //Atributos
    private int edad;
    private int numRegistro;
    private int ID;
    private String carrera;
    private int anoCarrera;
    private float promedioGraduacion;
    private String facultad;
    
    //Constructor
    public Alumnos(int edad, int numRegistro, int ID, String carrera, int anoCarrera, float promedioGraduacion, String facultad, String nombre, String apellido) {
        super(nombre, apellido);
        this.edad = edad;
        this.numRegistro = numRegistro;
        this.ID = ID;
        this.carrera = carrera;
        this.anoCarrera = anoCarrera;
        this.promedioGraduacion = promedioGraduacion;
        this.facultad = facultad;
    }
    
    //Mutadores
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAnoCarrera() {
        return anoCarrera;
    }

    public void setAnoCarrera(int anoCarrera) {
        this.anoCarrera = anoCarrera;
    }

    public float getPromedioGraduacion() {
        return promedioGraduacion;
    }

    public void setPromedioGraduacion(float promedioGraduacion) {
        this.promedioGraduacion = promedioGraduacion;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    //To String
    @Override
    public String mostrarDatos() {
        return "Alumnos{" + "edad=" + edad + ", numRegistro=" + numRegistro + ", ID=" + ID + ", carrera=" + carrera + ", anoCarrera=" + anoCarrera + ", promedioGraduacion=" + promedioGraduacion 
                + ", facultad=" + facultad  + ",nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    

    
}
