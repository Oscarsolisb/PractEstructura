
package practestructura;

/**
 *
 * @authores  Oscar Solis Barrientos, Jose Antonio Zeledon Sanchez, Javier Mora Jimenez, Kevin Ruíz
 */
public class ListaDobleCircular {
    private Nodo inicio;
    private Nodo fin;

    // Nodo interno de la lista
    private class Nodo {

        char letra;
        Nodo siguiente;
        Nodo anterior;

        public Nodo(char letra) {
            this.letra = letra;
            siguiente = null;
            anterior = null;
        }
    }

    public ListaDobleCircular() {
        inicio = null;
        fin = null;
    }

    // Agregar una letra al final de la lista
    public void agregar(char letra) {

        Nodo nuevo = new Nodo(letra);

        // Si la lista está vacía
        if (inicio == null) {

            inicio = nuevo;
            fin = nuevo;

            inicio.siguiente = inicio;
            inicio.anterior = inicio;

        } else {

            nuevo.anterior = fin;
            nuevo.siguiente = inicio;

            fin.siguiente = nuevo;
            inicio.anterior = nuevo;

            fin = nuevo;
        }
    }

    // Copiar las vocales almacenadas en el vector
    public void copiarVocales(VectorVocales objetoVector) {

        char[] vocales = objetoVector.getVocales();
        int total = objetoVector.getTotalVocales();

        for (int i = 0; i < total; i++) {
            agregar(vocales[i]);
        }
    }

    // Copiar las consonantes almacenadas en el árbol
    public void copiarConsonantes(
            ArbolConsonantes objetoArbol
    ) {

        char[] consonantes =
                objetoArbol.obtenerConsonantes();

        for (int i = 0;
                i < consonantes.length;
                i++) {

            agregar(consonantes[i]);
        }
    }

    // Mostrar la lista desde el inicio hasta regresar al inicio
    public void mostrarLista() {

        System.out.println(
                "Elementos de la lista doble circular:"
        );

        if (inicio == null) {

            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo actual = inicio;

        do {

            System.out.print(actual.letra + " ");

            actual = actual.siguiente;

        } while (actual != inicio);

        System.out.println();
    }

    // Mostrar la lista en sentido contrario
    public void mostrarInversa() {

        System.out.println(
                "Lista recorrida de atras hacia adelante:"
        );

        if (fin == null) {

            System.out.println("La lista esta vacia.");
            return;
        }

        Nodo actual = fin;

        do {

            System.out.print(actual.letra + " ");

            actual = actual.anterior;

        } while (actual != fin);

        System.out.println();
    }
}
