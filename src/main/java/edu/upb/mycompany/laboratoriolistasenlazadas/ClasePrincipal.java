package edu.upb.mycompany.laboratoriolistasenlazadas;

import javax.swing.JOptionPane;
/**
 *
 * @author johan
 */

/* Hola profe una cosa es que se me perdió todo lo que hice todo lo que hice, 
   porque como tenia problemas con git entonces buscaba soluciones y una de 
   esas fue github desktop pero me toco eliminar el proceso que había echo para 
   hacer el commit, para eso hice un respaldo de lo que hice, pero cuando 
   lo coloque en github desktop no me habría la aplicaron y de paso lo que hice 
   en el original todo se me perdió, pero como tenia el respaldo, mire haber 
   pero también se había eliminado todo, ahora me toca de nuevo hacer todo*/

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        int edad=0;
        String Nombre ="";
        Nodo primero =new Nodo(0,"");
        
        ListaEstudiantes n = new ListaEstudiantes(primero);
        n.vaciar();
        
        boolean Ejecucion = true;
        while(Ejecucion){
            
            int F = Integer.parseInt(JOptionPane.showInputDialog("""
                Acciones realizables sobre la lista de alumnos
                1. Ingresar
                2. Borrar el primero
                3. Borrar el ultimo
                4. Borrar por indice
                5. Vaciar
                6. Buscar por indice
                7. mostrar el primero
                8. mostrar el ultimo
                9.mostrar al alumno mayor
                10.mostrar el alumno menor
                11.mostrar promedio de edades
                12.imprimir lista
                13. salir"""));
            
            switch(F){
                case 1:  
                    try{
                        
                        edad =Integer.parseInt( JOptionPane.showInputDialog("edad del alumno"));
                        Nombre = JOptionPane.showInputDialog("nombre del alumno"); 
                        Nodo nodo = new Nodo(edad, Nombre);
                        n.agregar(nodo);
                        
                    }catch(NumberFormatException ex){
                        
                        JOptionPane.showMessageDialog(null, "introduzca un valor numerico");
                        
                    }
                    break;
                case 2: 
                    try{
                        
                        n.eliminarPrimero();
                        
                    }catch(NullPointerException ez){
                        
                        JOptionPane.showMessageDialog(null, "indice fuera de rango");
                        
                    } 
                    break;
                
                case 3:  
                    try{
                        
                        edad =Integer.parseInt( JOptionPane.showInputDialog("indice"));
                        n.eliminarPorIndice(edad);
                        
                    }catch(NumberFormatException letras){
                        
                        JOptionPane.showMessageDialog(null, "intoduzca un valor numerico");
                        
                    }catch(NullPointerException ez){
                        
                        JOptionPane.showMessageDialog(null, "indice fuera de rango");
                        
                    }
                    break;
                    
                case 4: 
                    try{
                        
                        n.eliminarUltimo();
                        
                    }catch(NullPointerException ez){
                        
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                        
                    }
                    
                case 5: 
                    n.vaciar();
                    break;
                    
                case 6: 
                    try{
                        
                        edad =Integer.parseInt( JOptionPane.showInputDialog("indice"));
                        System.out.println("edad: " + n.buscarPorIndice(edad).getDato().getNombre()); 
                        System.out.println("nombre: " + n.buscarPorIndice(edad).getDato().getEdad());
                        break;
                        
                    }catch(NullPointerException fuera){
                        
                        JOptionPane.showMessageDialog(null, "el indice esta fuera de rango, vuelve a intentarlo");
                    }catch(NumberFormatException letras){
                        
                        JOptionPane.showMessageDialog(null, "has introducido una letra en lugar de un numero, vuelve a intentarlo");
                    }
                    
                    break;
                    
                case 7: 
                    try{
                        
                        System.out.println("Nombre: "+n.obtenerPrimero().getDato().getNombre()+"\nEdad:"+n.obtenerPrimero().getDato().getEdad());
                        
                    }catch(NullPointerException ez){
                        
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                        
                    } 
                    break;
                    
                case 8: 
                    try{
                        
                        System.out.println("Nombre: "+n.obtenerUltimo().getDato().getNombre()+"\nEdad:"+n.obtenerUltimo().getDato().getEdad());
                        
                    }catch(NullPointerException ez){
                        
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                        
                    }
                    break;
                case 9: 
                    n.calcularEdadMayor();
                    break;
                case 10: 
                    n.calcularEdadMenor();
                    break;
                case 11: 
                    try{
                        n.calcularPromedioEdad();
                    }catch(ArithmeticException ez){
                        JOptionPane.showMessageDialog(null, "agregue un nuevo elemento");
                    } 
                    break;
                case 12: 
                    n.imprimir();
                    break;
                case 13: 
                    Ejecucion=false; 
                    break;
                
            } 
        }
        
    }
    
}
