/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practestructura;

public class VectorVocales {

    
    public char[] vocales = new char[4];
    public int totalVocales = 0;

   
    public void extraerVocales(MatrizLetras objetoMatriz, char[][] matriz) {
        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                
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
            System.out.println("Posicion " + i + ": " + vocales[i]);
        }
    }
}
