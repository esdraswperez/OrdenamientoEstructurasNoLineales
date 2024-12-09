// Clase para crear un objeto tipo "Nodo" para Esctructura No Lineal o Arbol Binario

public class NodoArbol {

    // Atriutos
    private int valor;
    private NodoArbol nodoIzquierdo; // Variable o atributo recursivo
    private NodoArbol nodoDerecho; // Variable o atributo recursivo

    // Método constructor
    public NodoArbol(int valor) {
        this.valor = valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }

    // Métodos Get y Set de la variable o atributo "valor"
    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }

    // Métodos Getters de las variables o atributos recursivos
    public NodoArbol getNodoIzquierdo() {
        return nodoIzquierdo;
    }

    public NodoArbol getNodoDerecho() {
        return nodoDerecho;
    }
    
    
    // Método recursivo
    public void insertar(int _valor){
        if (_valor < this.valor) {
            // Insertar en lado izquierdo
            if (this.nodoIzquierdo == null) {
                this.nodoIzquierdo = new NodoArbol(_valor);
            } else {
                this.nodoIzquierdo.insertar(_valor);
            }
        } else {
            // Insterar en Lado derecho
            if (this.nodoDerecho == null) {
                this.nodoDerecho = new NodoArbol(_valor);
            } else {
                this.nodoDerecho.insertar(_valor);
            }
        }
    }
}
