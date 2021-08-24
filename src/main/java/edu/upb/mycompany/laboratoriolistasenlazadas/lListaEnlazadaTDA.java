/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.mycompany.laboratoriolistasenlazadas;

/**
 *
 * @author johan
 */
public interface lListaEnlazadaTDA {
    
    public void agregar(Nodo nuevo);
    public Nodo buscarPorIndice(int indice);
    public void eliminarPorIndice(int indice);
    public Nodo obtenerPrimero();
    public Nodo obtenerUltimo();
    public void eliminarPrimero();
    public void eliminarUltimo();
    public void vaciar();
        
}
