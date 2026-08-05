/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practestructura;

/**
 *
 * @authores  Oscar Solis Barrientos, Jose Antonio Zeledon Sanchez, Javier Mora Jimenez, Kevin Ruíz
 */
public class MatrizLetras {
    private char[][] matriz;

    public MatrizLetras() {
        matriz = new char[2][2];
    }

    public void llenar() {
        matriz[0][0] = 'A';
        matriz[0][1] = 'B';
        matriz[1][0] = 'E';
        matriz[1][1] = 'C';
    }

    public void mostrar() {
        System.out.println("Matriz 2x2:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }

    public boolean esVocal(char letra) {

        return letra == 'A' || letra == 'E'
                || letra == 'I' || letra == 'O'
                || letra == 'U' || letra == 'a'
                || letra == 'e' || letra == 'i'
                || letra == 'o' || letra == 'u';
    }

    public void clasificar() {
        System.out.println("Clasificacion de letras:");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                char letra = matriz[i][j];

                if (esVocal(letra)) {
                    System.out.println(letra + " -> Vocal");
                } else {
                    System.out.println(letra + " -> Consonante");
                }
            }
        }
    }

    // Permite que las otras clases utilicen la misma matriz
    public char[][] getMatriz() {
        return matriz;
    }
    
}
