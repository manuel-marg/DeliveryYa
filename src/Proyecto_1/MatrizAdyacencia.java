
package Proyecto_1;

import java.util.Locale;

public class MatrizAdyacencia {
    private int n;
    private int[][] matriz;
    
    public MatrizAdyacencia(int n) {
        this.n = n;
        matriz = new int[this.n][this.n];
        for(int i=0; i< n; i++){            
            for(int j=0; j< n; j++){
                matriz[i][j] = 0;
            }            
        }
    }
    
    public int getMatriz(int i, int j){
        return matriz[i][j];
    }
    
    public int tamano(){
        return n;
    }
    
    public void agregar(int i, int j, int distancia){
        matriz[i][j] = distancia;
        matriz[j][i] = distancia;
    }
    
    public void remover(int i, int j){
        if(matriz[i][j]>0)
            matriz[i][j] -= 1;
    }
    
        public String imprimir(){
        String matrizTexto = "<html> ";
        for(int x=0 ; x<n ; x++){
            if(x<10){
                matrizTexto += "  " + x;
            }else{
                matrizTexto += " " + x;
            }
        }
        matrizTexto += "<br>";
        for(int i=0; i< n; i++){
            if(i<10){
                matrizTexto += i + "  ";
            }else{
                matrizTexto += i + " ";
            }
            for(int j=0; j< n; j++){
                matrizTexto +=  matriz[i][j] + "  ";      
            }
            matrizTexto += "<br>";
        }  
        return matrizTexto;
        
    }

    
public void printMatrix() {
   System.out.printf("%4s","N");
    for(int i=0;i<n;i++){
       System.out.printf("%4d", i); 
    }
    System.out.println("");
    for (int row = 0; row < matriz.length; row++) {
        System.out.printf("%4d", row);
        for (int col = 0; col < matriz[row].length; col++) {
            System.out.printf("%4d", matriz[row][col]);
        }
        System.out.println();
    }
}





}