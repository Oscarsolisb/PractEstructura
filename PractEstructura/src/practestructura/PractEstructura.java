/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practestructura;

/**
 *
 * @authores  Oscar Solis Barrientos, Jose Antonio Zeledon Sanchez, Javier Mora Jimenez, Kevin Ruíz
 */
public class PractEstructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        // PASO 1: MATRIZ DE LETRAS
    

        System.out.println(
                "=== PASO 1: MATRIZ ==="
        );

        MatrizLetras objetoMatriz =
                new MatrizLetras();

        objetoMatriz.llenar();
        objetoMatriz.mostrar();
        objetoMatriz.clasificar();


       
        // PASO 2: VECTOR DE VOCALES
      

        System.out.println(
                "\n=== PASO 2: VECTOR DE VOCALES ==="
        );

        VectorVocales objetoVector =
                new VectorVocales();

        objetoVector.extraerVocales(objetoMatriz);
        objetoVector.mostrarVector();


       
        // PASO 3: ÁRBOL DE CONSONANTES
        

        System.out.println(
                "\n=== PASO 3: ARBOL DE CONSONANTES ==="
        );

        ArbolConsonantes objetoArbol =
                new ArbolConsonantes();

        objetoArbol.extraerConsonantes(
                objetoMatriz
        );

        objetoArbol.mostrarArbol();


       
        // PASO 4: LISTA DOBLE CIRCULAR
     

        System.out.println(
                "\n=== PASO 4: LISTA DOBLE CIRCULAR ==="
        );

        ListaDobleCircular objetoLista =
                new ListaDobleCircular();

        // se copian las vocales
        objetoLista.copiarVocales(objetoVector);

        //se copian las consonantes
        objetoLista.copiarConsonantes(
                objetoArbol
        );

        objetoLista.mostrarLista();
        objetoLista.mostrarInversa();
    }
    
}
