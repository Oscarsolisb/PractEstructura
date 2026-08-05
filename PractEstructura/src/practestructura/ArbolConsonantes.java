/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practestructura;

/**
 *
 * @authores  Oscar Solis Barrientos, Jose Antonio Zeledon Sanchez, Javier Mora Jimenez, Kevin Ruíz
 */
public class ArbolConsonantes {
    private Nodo raiz;
    private int totalConsonantes;

    // Nodo interno del árbol
    private class Nodo {

        char letra;
        Nodo izquierda;
        Nodo derecha;

        public Nodo(char letra) {
            this.letra = letra;
            izquierda = null;
            derecha = null;
        }
    }

    public ArbolConsonantes() {
        raiz = null;
        totalConsonantes = 0;
    }

    // Recorrer la matriz y extrae únicamente las consonantes
    public void extraerConsonantes(MatrizLetras objetoMatriz) {

        char[][] matriz = objetoMatriz.getMatriz();

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                char letra = matriz[i][j];

                if (!objetoMatriz.esVocal(letra)) {
                    insertar(letra);
                }
            }
        }
    }

    //para insertar una letra en el árbol
    public void insertar(char letra) {
        raiz = insertarRecursivo(raiz, letra);
        totalConsonantes++;
    }

    // Buscar la posición de la letra dentro del árbol
    private Nodo insertarRecursivo(Nodo actual, char letra) {

        if (actual == null) {
            return new Nodo(letra);
        }

        if (letra < actual.letra) {
            actual.izquierda = insertarRecursivo(
                    actual.izquierda, letra
            );
        } else {
            actual.derecha = insertarRecursivo(
                    actual.derecha, letra
            );
        }

        return actual;
    }

    // Mostrar las letras utilizando el recorrido inorden
    public void mostrarArbol() {

        System.out.println(
                "Consonantes almacenadas en el arbol:"
        );

        recorrerInOrden(raiz);

        System.out.println();
    }

    private void recorrerInOrden(Nodo actual) {

        if (actual != null) {

            recorrerInOrden(actual.izquierda);

            System.out.print(actual.letra + " ");

            recorrerInOrden(actual.derecha);
        }
    }

    
    public char[] obtenerConsonantes() {

        char[] consonantes = new char[totalConsonantes];
        int[] posicion = {0};

        copiarInOrden(raiz, consonantes, posicion);

        return consonantes;
    }

    private void copiarInOrden(
            Nodo actual,
            char[] consonantes,
            int[] posicion
    ) {

        if (actual != null) {

            copiarInOrden(
                    actual.izquierda,
                    consonantes,
                    posicion
            );

            consonantes[posicion[0]] = actual.letra;
            posicion[0]++;

            copiarInOrden(
                    actual.derecha,
                    consonantes,
                    posicion
            );
        }
    }

    public int getTotalConsonantes() {
        return totalConsonantes;
    }
}
