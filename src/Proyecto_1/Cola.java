
package Proyecto_1;

public class Cola {

    private Nodo primero;
    private Nodo ultimo;


    public Cola() {
        primero = null;
        ultimo = null;
    }


    public void insertar(Object dato) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(dato);
        nuevo.setSiguiente(null);
        if (primero == null & ultimo == null) {
            primero = nuevo;
            ultimo = nuevo;
        }else{
        ultimo.setSiguiente(nuevo);
        ultimo = ultimo.getSiguiente();
        }
    }


    public Object extraer() {
        
        
        Object dato = primero.getValor();
         if(primero== ultimo)
        {
            primero=ultimo=null;
            return dato;
        }
        
        primero = primero.getSiguiente();
        return dato;
    }


    public boolean estaVacia() {
        boolean cola = false;
        if (primero == null & ultimo == null) {
            cola = true;
        } else {
            cola = false;
        }
        return cola;
    }

    
        public int tamano() {
        int contador = 0;
        Nodo c = this.primero;
        if(estaVacia()){
           
            return contador;
        }
        if(primero == ultimo){
            contador = 1;
        }else{
        while (c != null) {
            contador++;
            c = c.getSiguiente();
        }
        }

        return contador;
    }


    public String toString() {
        Nodo aux = this.primero;
        String cola = "";
        while (aux != null) {
            cola = cola + aux.toString();
            aux = aux.getSiguiente();
        }
        return cola;
    }
}