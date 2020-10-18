
package Proyecto_1;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.spriteManager.Sprite;
import org.graphstream.ui.spriteManager.SpriteManager;
import org.graphstream.ui.view.Viewer;


public class Proyecto_1 {

  
    public static void main(String[] args) throws Exception {
    
        
        Interfaz Formulario = new Interfaz();
        Formulario.setVisible(true);
        Formulario.rutasInicial();
        Formulario.actualizarClientes();
        

    }
    
}
