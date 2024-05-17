/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formatoHabeasCorpus;

import java.util.LinkedList;

/**
 *
 * @author USUARIO
 */
public class Historial {
     private LinkedList<Formato> formatosGuardados;
    
    public Historial() {
        this.formatosGuardados = new LinkedList<>();
    }
    
    public LinkedList<Formato> getFormatosGuardados() {
        return formatosGuardados;
    }
    
    public void guardarFormato(Formato formato) {
        formatosGuardados.add(formato);
    }
    
    public void actualizarFormato(int index, Formato formato) {
        eliminarFormatoGuardado(index);
        formatosGuardados.add(index, formato);
    }
    
    public Formato getFormatoGuardado(int index) {
        return formatosGuardados.get(index);
    }
    
    public void eliminarFormatoGuardado(int index) {
        formatosGuardados.remove(index); 
    }
}
