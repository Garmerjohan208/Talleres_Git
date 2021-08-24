package edu.upb.mycompany.laboratoriolistasenlazadas;

/**
 *
 * @author johan
 */
public class Nodo {
    
    private Estudiantes dato;
    private Nodo Siguiente;
    
    public Nodo(int edad, String nombre){
        
        Estudiantes nuevo = new Estudiantes(edad,nombre);
        dato = nuevo;
    }

    public Estudiantes getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo Siguiente) {
        this.Siguiente = Siguiente;
    }
    
    public String MonstrarInfo(){
        
        return "Nombre: "+ dato.getNombre()+"\nedad: "+ dato.getEdad();
        
    }

}
