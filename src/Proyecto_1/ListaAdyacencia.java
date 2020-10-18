
package Proyecto_1;

public class ListaAdyacencia {
    
    int vertices;
    Lista lista[];

    public ListaAdyacencia(int vertices) {
        this.vertices = vertices;
        lista = new Lista[vertices];
        for (int i = 0; i <vertices ; i++) {
            lista[i] = new Lista();
        }
    }

    public void cargarArista(int origen, int destino){
        lista[origen].agregarAlFinal(destino);
        lista[destino].agregarAlFinal(origen);
    }

    
    public String imprimirVariable() throws Exception{
        String Lista = "<html>";
        for (int i = 0; i <vertices ; i++) {
            if(lista[i].getTamano()>0) {
                Lista = Lista + "Nodo " + i + " esta conectado a: ";
                for (int j = 0; j < lista[i].getTamano(); j++) {
                    Lista = Lista + lista[i].getValor(j) + " ";
                }
                Lista = Lista + "<br>";
            }
        }
        return Lista;
    }
    
    public String adyecentes() throws Exception{
        String Lista = "";
        for (int i = 0; i <vertices ; i++) {
            if(lista[i].getTamano()>0) {
                Lista = Lista + "Nodo " + i + " esta conectado a: ";
                for (int j = 0; j < lista[i].getTamano(); j++) {
                    Lista = Lista + lista[i].getValor(j) + " ";
                }
                Lista = Lista + "<br>";
            }
        }
        return Lista;
    }


    
}
    

