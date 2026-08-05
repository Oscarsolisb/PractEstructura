/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practestructura;

/**
 *
 * @authores  Oscar Solis Barrientos, Jose Antonio Zeledon Sanchez, Javier Mora Jimenez, Kevin Ruíz
 */
public class VectorVocales {
    private char[] vocales;
    private int totalVocales;

    public VectorVocales() {
        vocales = new char[4];
        totalVocales = 0;
    }

    public void extraerVocales(MatrizLetras objetoMatriz) {

        char[][] matriz = objetoMatriz.getMatriz();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                char letra = matriz[i][j];

                if (objetoMatriz.esVocal(letra)) {
                    vocales[totalVocales] = letra;
                    totalVocales++;
                }
            }
        }
    }

    public void mostrarVector() {
        System.out.println("Vector con solo las vocales:");

        for (int i = 0; i < totalVocales; i++) {
            System.out.println(
                    "Posicion " + i + ": " + vocales[i]
            );
        }
    }

    public char[] getVocales() {
        return vocales;
    }

    public int getTotalVocales() {
        return totalVocales;
    }
    
}
