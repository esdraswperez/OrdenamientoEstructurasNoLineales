// Clase recursiva "Arbol"
public class Arbol {
    NodoArbol inicial;
    
    // Método para crear el Arbol Binario vacío
    public Arbol(){
        this.inicial = null;
    }
    
    // Método para insertar valores en el Arbol Binario
    public void insertar(int valor){
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }
    
    // Método para el recorrido PRE-ORDEN
    public void dispararPreOrden(){
        this.preOrden(this.inicial);
    }
    
    // Método para llamar y mostrar en PRE-ORDEN al Arbol Binario
    public void preOrden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detener recursividad caso base
        } else {
            System.out.print(nodo.getValor()+", ");
            preOrden(nodo.getNodoIzquierdo());
            preOrden(nodo.getNodoDerecho());
        }
        
    }
    
    // Método para el recorrido IN-ORDEN
    public void dispararInOrden(){
        this.inOrden(this.inicial);
    }
    
    // Método para llamar y mostrar en IN-ORDEN al Arbol Binario
    public void inOrden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detener recursividad caso base
        } else {
            inOrden(nodo.getNodoIzquierdo());
            System.out.print(nodo.getValor()+", ");
            inOrden(nodo.getNodoDerecho());
        }
    }
    
    // Método para el recorrido POST-ORDEN
    public void dispararPostOrden(){
        this.postOrden(this.inicial);
    }
    
    // Método para llamar y mostrar en POST-ORDEN al Arbol Binario
    public void postOrden(NodoArbol nodo){
        if (nodo == null) {
            return; // Detener recursividad caso base
        } else {
            postOrden(nodo.getNodoIzquierdo());
            postOrden(nodo.getNodoDerecho());
            System.out.print(nodo.getValor()+", ");
        }
    }
}
