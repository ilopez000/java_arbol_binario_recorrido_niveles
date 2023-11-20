class ArbolBinario {
    Nodo raiz;

    // Método para recorrer el árbol por niveles
    void recorridoPorNiveles() {
        if (raiz == null) {
            return;
        }

        Queue<Nodo> cola = new LinkedList<>();
        cola.add(raiz);

        while (!cola.isEmpty()) {
            Nodo tempNodo = cola.poll();
            System.out.print(tempNodo.valor + " ");

            if (tempNodo.izquierdo != null) {
                cola.add(tempNodo.izquierdo);
            }

            if (tempNodo.derecho != null) {
ara                cola.add(tempNodo.derecho);
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
