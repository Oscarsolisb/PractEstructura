/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practestructura;

/**
 *
 * @author Jose Antonio
 */
public class PractEstructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("=== PASO 1 ===");
        
        MatrizLetras objetoMatriz = new MatrizLetras();
        objetoMatriz.llenar();
        objetoMatriz.mostrar();
        objetoMatriz.clasificar();

        
        System.out.println("\n=== PASO 2 ===");
        
        VectorVocales objetoVector = new VectorVocales();
        
        
        char[][] matrizDatos = {
            {'A', 'B'},
            {'E', 'C'}
        };
        
        // Ejecutamos tu método para buscar las vocales
        objetoVector.extraerVocales(objetoMatriz, matrizDatos);
        
        // Mostramos el vector con las vocales encontradas
        objetoVector.mostrarVector();
    }
}