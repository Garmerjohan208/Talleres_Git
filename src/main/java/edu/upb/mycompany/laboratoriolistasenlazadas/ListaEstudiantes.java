package edu.upb.mycompany.laboratoriolistasenlazadas;

/**
 *
 * @author johan
 */
public class ListaEstudiantes implements lListaEnlazadaTDA {

    Nodo Primero;
    Nodo Ultimo;
    
    int tamaño =1;
    boolean N = true;
    
    public ListaEstudiantes(Nodo nuevo){
        
        Primero = nuevo;
        Ultimo = Primero;
        
    }
    
    public void agregar(Nodo nuevo){ 
        
        if(tamaño==0){
            
            Primero=nuevo;
            Ultimo = Primero;
            
        }else{
            
            Nodo current = Primero; 
            Nodo anterior = Primero;
         
            String nuevoIngreso = String.valueOf(nuevo.getDato().getNombre().trim().toLowerCase().charAt(0));
            String elementoX = String.valueOf(current.getDato().getNombre().trim().toLowerCase().charAt(0));
         
            if(nuevoIngreso.compareTo(elementoX)<=0){
            
                nuevo.setSiguiente(current);
                Primero = nuevo;   
             
            }else 
            
                if(nuevoIngreso.compareTo(String.valueOf(Ultimo.getDato().getNombre().trim().toLowerCase().charAt(0)))>=0){  
            
                    Ultimo.setSiguiente(nuevo); 
                    Ultimo=nuevo ;
            
                }else {
         
                }

            
                elementoX = String.valueOf(current.getDato().getNombre().trim().toLowerCase().charAt(0));
                
                if(nuevoIngreso.compareTo(elementoX)<=0){   
                    anterior.setSiguiente(nuevo);
                    nuevo.setSiguiente(current);    
                }
        }       
        tamaño++;    
    }
    
    public void imprimir(){
        
        if(tamaño==0){
            
           System.out.println("lista vacia");
           
        }else{
            
            Nodo current = Primero;
            for(int i = 0 ; i < tamaño ; i++){
                
                int elem = current.getDato().getEdad();
                String elem2= current.getDato().getNombre();
                System.out.println("Edad: " + elem + "\nNombre: "+elem2+"\n"); 
                current = current.getSiguiente(); 
                
            }
            
        }
            
    }
    
    public Nodo buscarPorIndice(int indice){
        
        Nodo elem = Primero;
        for(int i=0 ; i<indice ; i++){
            
            elem = elem.getSiguiente();
        }
        
        return elem;
    }
    
    public void eliminarPorIndice(int indice){
        
        Nodo elem = Primero;
        Nodo elemAnterior = Primero;
        if(indice==0){
            
            Primero = Primero.getSiguiente(); 
        }else if(indice==tamaño-1){
            
            for(int i=0 ; i<tamaño-1 ; i++){
                
                elem = elem.getSiguiente();
                
            }
            Ultimo = elem; 
        }else{
            
            for(int i=0 ; i<indice ; i++){
                
                elem = elem.getSiguiente();
                if(i!=0){
                    
                    elemAnterior = elemAnterior.getSiguiente();
                    
                }
            }
            
            elemAnterior.setSiguiente(elem.getSiguiente());
            
        }
        tamaño--;
        
    }   
    
    public Nodo obtenerPrimero(){
        
        return Primero;
        
    }
    
    public Nodo obtenerUltimo(){
        
        return Ultimo;
        
    }
    
    public void eliminarPrimero(){
        
        Primero = Primero.getSiguiente();
        tamaño--;
        
    }
    
    public void eliminarUltimo(){
        
        Nodo elem = Primero;
        for(int i=0 ; i<tamaño-2 ; i++){
            
            elem=elem.getSiguiente();
            
        }
        
        Ultimo= elem;
        Ultimo.setSiguiente(null);
        tamaño--;
        
    }
    
    public void vaciar(){
        
        Primero=null;
        Ultimo=null;
        tamaño=0;
        
    }
    
    public void calcularEdadMayor(){
        
        if(tamaño==0){
            
            System.out.println("lista vacia");
            
        }else{
            
            Nodo mayor = Primero;
        Nodo elem = Primero;
        int index = 0;
        for (int i = 0 ; i<tamaño-1 ; i++){
            
            elem = elem.getSiguiente();
            if(mayor.getDato().getEdad()<elem.getDato().getEdad()){
                
                mayor=elem; 
                index=i+1;
            }
        }
        
        System.out.println("indice: "+index);
        
        }
    }
    
    public void calcularEdadMenor(){
        
        if(tamaño==0){
            
            System.out.println("lista vacia");
            
        }else{
            
            Nodo menor=Primero;
            Nodo elem=Primero;
            int index=0;
            for (int i=0 ; i<tamaño-1 ; i++){
                
                elem=elem.getSiguiente();
                if(menor.getSiguiente().getDato().getEdad()>elem.getSiguiente().getDato().getEdad()){
                    
                    menor=elem; 
                    index=i+1;
                    
                }
            }
            
            System.out.println("indice: "+index);

        }
        
    }
    
    public void calcularPromedioEdad(){
        
        Nodo current = Primero;
        int promedio=0;
        for(int i = 0 ; i < tamaño ; i++){
            
            promedio += current.getDato().getEdad();  
            current = current.getSiguiente();
            
        }
        
        promedio/=tamaño;
        System.out.println("Promedio: " + promedio);
        
    }
    
}
