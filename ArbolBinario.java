public class ArbolBinario {
     Nodo raiz;

    // Método para recorrer el árbol por niveles
    void recorridoPorNiveles() {
        if (raiz == null) {
            return;
        }

        Stack<Nodo> pila = new Stack<>();
        pila.push(raiz);

        while (!pila.isEmpty()) {
            Nodo tempNodo = pila.pop();
            

            if (tempNodo.izquierdo != null) {
                pila.push(tempNodo.izquierdo);
            }

            if (tempNodo.derecho != null) {
               pila.push(tempNodo.derecho);
            }
            
            System.out.print(tempNodo.valor + " ");
        }
    }

    // Método para recorrer el árbol en profundidad usando una pila
    void recorridoEnProfundidad() {
        if (raiz == null) {
            return;
        }

        Stack<Nodo> pila = new Stack<>();
        pila.push(raiz);

        while (!pila.isEmpty()) {
            Nodo nodoActual = pila.pop();
            System.out.print(nodoActual.valor + " ");

            // Primero el hijo derecho y luego el izquierdo para que el izquierdo se procese primero
            if (nodoActual.derecho != null) {
                pila.push(nodoActual.derecho);
            }
            if (nodoActual.izquierdo != null) {
                pila.push(nodoActual.izquierdo);
            }
        }
    }
        
    // Método para agregar nodos de manera iterativa
    void agregar(int valor) {
        Nodo nuevoNodo = new Nodo(valor);

        if (raiz == null) {
            raiz = nuevoNodo;
            return;
        }

        Nodo actual = raiz;
        while (true) {
            if (valor < actual.valor) {
                if (actual.izquierdo == null) {
                    actual.izquierdo = nuevoNodo;
                    break;
                } else {
                    actual = actual.izquierdo;
                }
            } else if (valor > actual.valor) {
                if (actual.derecho == null) {
                    actual.derecho = nuevoNodo;
                    break;
                } else {
                    actual = actual.derecho;
                }
            } else {
                // En caso de que el valor ya exista en el árbol
                break;
            }
        }
    }  

   
}
