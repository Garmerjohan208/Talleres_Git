package edu.upb.mycompany.laboratoriolistasenlazadas;

/**
 *
 * @author johan
 */
public class Estudiantes {
    
    int edad;
    String nombre;
    
    public Estudiantes(int edad, String nombre){
        this.edad=edad;
        this.nombre=nombre;
    }

    public int getEdad() {
        return edad;
    }
 

    public String getNombre() {
        return nombre;
    }
}
