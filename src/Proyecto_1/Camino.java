
package Proyecto_1;

public class Camino {
//  Para Caminos:
//  cliente origen, cliente destino, distancia en Km.
    public int origen;
    public int destino;
    public int distancia;

    public Camino(int origen, int destino, int distancia) {
        this.origen = origen;
        this.destino = destino;
        this.distancia = distancia;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    
    
    
}
