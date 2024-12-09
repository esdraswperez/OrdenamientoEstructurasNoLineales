// Clase "Principal" para crear objetos de tipo "Nodo" ESTÁTICO y realizar el ordenamiento Pre, In y Post-Orden
public class Principal {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        arbol.insertar(43);
        arbol.insertar(10);
        arbol.insertar(8);
        arbol.insertar(54);
        arbol.insertar(15);
        arbol.insertar(50);
        arbol.insertar(53);
        
        System.out.println("PRE-ORDEN: ");
        arbol.dispararPreOrden();
        System.out.println("\nIN-ORDEN: ");
        arbol.dispararInOrden();
        System.out.println("\nPOST-ORDEN: ");
        arbol.dispararPostOrden();
        System.out.println("");
    }
}
