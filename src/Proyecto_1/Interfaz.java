package Proyecto_1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.swingViewer.ViewPanel;
import org.graphstream.ui.view.View;
import org.graphstream.ui.view.Viewer;

public class Interfaz extends javax.swing.JFrame {

    // LISTAS GLOBALES PARA CONTROLAR LOS CLIENTES Y LOS CAMINOS 
    private int controlObjeto = 0;  // FUE CREADO PARA LLEVAR UN CONTROL AL CARGAR UN .TXT DE CLIENTES Y CAMINOS
    public Lista listaClientes = new Lista();   // LISTA DE CLIENTES
    public Lista listaCaminos = new Lista();    // LISTA DE CAMINOS
    
   
    public Interfaz() {     // MEJORANDO LA INTERFAZ DE PROGRAMA
        initComponents();
        getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Button = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel22 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DeliverYa!");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage()
        );
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DeliverYa.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(145, 13, 230, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Inicio.gif"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Estructura de Datos - Proyecto 1 - Teoría de Grafos");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DataBase.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Estado de datos:");

        jLabel9.setText("N/A");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Archivo cargado:");

        jLabel11.setText("N/A");

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("v 1.0");

        jLabel28.setText(" Manuel Rodriguez");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel28)))
        );

        jTabbedPane1.addTab("Inicio", jPanel2);

        Button.setBackground(new java.awt.Color(51, 103, 214));
        Button.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        Button.setForeground(new java.awt.Color(255, 255, 255));
        Button.setText("Seleccionar archivo");
        Button.setFocusPainted(false);
        Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Elige el archivo a cargar:");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel18.setText("Cargar un archivo");

        jButton3.setBackground(new java.awt.Color(51, 103, 214));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Ver Grafico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grafos.png"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Lista1.png"))); // NOI18N

        jLabel15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel15.setText("Formas de vizualización");

        jButton5.setBackground(new java.awt.Color(51, 103, 214));
        jButton5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Ver Lista de adyacencia");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel4)
                                .addGap(4, 4, 4)
                                .addComponent(Button))
                            .addComponent(jLabel15)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel14)
                                .addGap(100, 100, 100)
                                .addComponent(jLabel6))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Button))
                .addGap(47, 47, 47)
                .addComponent(jLabel15)
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cargar", jPanel3);

        jPanel4.setPreferredSize(new java.awt.Dimension(480, 403));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel12.setText("Información acerca de las rutas");

        jButton1.setBackground(new java.awt.Color(51, 103, 214));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DataBaseGrande.png"))); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Origen", "Destino", "Distancia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel22.setText("<html> <p>Las rutas mostradas en la tabla est&aacute;n</p> <p>cargadas en memoria. Si pulsa en el</p> <p>bot&oacute;n \"Guardar\" se guardaran y se</p> <p>cargaran autom&aacute;ticamente la pr&oacute;xima</p> <p>vez que inicie el programa.</p>");
        jLabel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton1)))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel21)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel21)
                        .addGap(29, 29, 29))))
        );

        jTabbedPane1.addTab("Actualizar", jPanel4);

        jLabel19.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Recorrido en anchura (BFS)");

        jButton4.setBackground(new java.awt.Color(51, 103, 214));
        jButton4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Generar recorridos ");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel20.setText("Listas de Clientes a visitar");

        jLabel13.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Recorrido en profundidad (DFS)");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dirección"
            }
        ));
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Dirección"
            }
        ));
        jScrollPane2.setViewportView(jTable4);
        if (jTable4.getColumnModel().getColumnCount() > 0) {
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(10);
        }

        jButton7.setBackground(new java.awt.Color(51, 104, 213));
        jButton7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Agregar un Cliente");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 104, 213));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Ver Lista de Clientes");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton7)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))))
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton2))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Clientes a visitar", jPanel5);

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setText("Camino entre dos puntos");

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel24.setText("Origen:");

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel25.setText("Destino:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setText("1) Empresa");

        jButton6.setBackground(new java.awt.Color(51, 104, 213));
        jButton6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel26.setAutoscrolls(true);
        jLabel26.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Camino mediante recorrido en anchura (BFS)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        jLabel27.setAutoscrolls(true);
        jLabel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Camino mediante recorrido en profundidad (DFS)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox1, 0, 167, Short.MAX_VALUE)))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButton6)))
                .addGap(192, 239, Short.MAX_VALUE))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(21, 21, 21)
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Camino entre puntos", jPanel6);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(1, 60, 493, 412);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.PNG"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 500);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/DataBaseGrande.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(250, 370, 200, 221);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable3);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(30, 300, 160, 140);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonActionPerformed
        // SE PUEDE CARGAR UN ARCHIVO .TXT CON EL FORMATO CORRESPONDIENTE A CLIENTES Y CAMINOS
        
        listaClientes.eliminar();   // LIMPIAR LISTA CLIENTES
        listaCaminos.eliminar();    // LIMPIAR LISTA DE CAMINOS
        
        // LEER UN ARCHIVO DE TEXTO CON EL FORMATO QUE EXPLICAN EN EL PROYECTO .TXT
        JFileChooser Seleccionador = new JFileChooser();
        Seleccionador.showOpenDialog(null);
        File archivo = Seleccionador.getSelectedFile();
        System.out.println("\nSe esta cargando el archivo: " + archivo.getName() + "\n");
        try {
            FileReader Lector = new FileReader(archivo);
            BufferedReader Temporal = new BufferedReader(Lector);
            String texto = "";
            String linea = "";
            controlObjeto = 0;  // SETEANDO EL CONTROL EN 0 PARA PODER EMPEZAR A CARGAR CLIENTES Y CAMINOS A LAS LISTAS
            while (((linea = Temporal.readLine()) != null)) {
                texto += linea + "\n";
                this.generarObjeto(linea);      // ENVIANDO LA LINEA LEIDA DEL TXT A METODO generarObjeto EL CUAL LLENARA LAS LISTA DE CAMINOS Y CLIENTES
            }
            
            // ACTUALIZA LA TABLA DE RUTAS DE LA PESTAÑA "ACTUALIZAR"
            actualizarTabla();
            //GENERA EL GRAFICO INICIAL
            graficoInicial();
            // MENSAJE AVISANDO QUE ES NECESARIO GUARDAR LOS DATOS CARGADOS EN MEMORIA
            JOptionPane.showMessageDialog(this, "Es necesario guardar los datos. Por favor, entre \n en la pestaña de actualizar y pulse en el botón \n guardar de esta manera se guardaran todas \n las rutas mostradas en la lista que se encuentra \n en la parte superior al botón.");
 
        } catch (Exception e) {
            System.out.println("Error en función del botón de [Seleccionar un archivo]");
        }
    }//GEN-LAST:event_ButtonActionPerformed

    public void rutasInicial() throws FileNotFoundException, IOException, Exception{
        // SI EXISTE EL ARCHIVO DE RUTAS.TXT EN EL PROYECTO LAS CARGARA AUTOMATICAMENTE ¡¡¡FALTA QUE LAS CARGUE A LA LISTA RUTAS PERO ES SOLO HACER UNA MEDIO COPIA DEL METODO QUE YA EXISTE DE LEER .TXT!!!
        File archivo = new File("rutas.txt");
        if(!archivo.exists()){ // EN CASO DE QUE NO EXISTA SOLO ACTUALIZA VISTA AVISANDO DE QUE NO HAY ARCHIVO PREVIO
            jLabel9.setText("No se han cargado rutas previas.");
            jLabel11.setText("N/A");
        }else{  // EN CASO QUE SI EXISTA SE ACTUALIZA LA VISTA Y SE CARGA TODAS LAS RUTAS Y SE LLENAN LAS LISTAS AL INICIO
            System.out.println("Se esta cargando el archivo: " + archivo.getName() + "\n");
            jLabel9.setText("Hay rutas cargadas previamente.");
            jLabel11.setText("rutas.txt");
            FileReader Lector = new FileReader(archivo);
            BufferedReader Temporal = new BufferedReader(Lector);
            String texto = "";
            String linea = "";
            while (((linea = Temporal.readLine()) != null)) {
                texto += linea + "\n";
                this.generarObjeto(linea);  // SE LE ENVIA LINEA POR LINEA Y ESTE METODO LLENA LAS LISTAS
            }
            Temporal.close();
            Lector.close();
            // ACTUALIZA LA TABLA DE RUTAS DE LA PESTAÑA "ACTUALIZAR"
            actualizarTabla();
        }
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // GUARDA LAS RUTAS CARGADAS EN MEMORIA EN UN TXT EN LA CARPETA DEL PROYECTO CON EL MISMO FORMATO CON QUE SE IMPORTA PERO SIN CLIENTES
        File archivo;
        FileWriter escribir;
        PrintWriter linea;
        archivo = new File("rutas.txt");
        if (!archivo.exists()) {      // SI EXISTE O NO AL FINAL REMPLAZA Y LO VUELVE A CREAR CON LOS NUEVOS DATOS (HAY QUE REVISAR PORQUE TENIA UN PROBLEMITA) PERO FUNCIONA
            try {
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
       
                // SE ESTA GENERANDO UN ARCHIVO SIMILAR AL QUE SE CARGA PERO SACANDO TODOS LOS DATOS DE MEMORIA DESDE LAS LISTAS    
                
                linea.println("clientes");
                // PRIMERO SE LLENAN LOS CLIENTES 
                for (int i = 0; i < listaClientes.getTamano(); i++) {
                    Cliente cliente = (Cliente) listaClientes.getValor(i);
                    linea.println(cliente.getId() + "," + cliente.getNombre() + "," + cliente.getDireccion());
                }

                linea.println("caminos");
                // SE LLENAN LOS CAMINOS
                for (int i = 0; i < listaCaminos.getTamano(); i++) {
                    Camino camino = (Camino) listaCaminos.getValor(i);
                    linea.println(camino.getOrigen() + "," + camino.getDestino() + "," + camino.getDistancia());
                }
                linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(this, "Se ha guardado con exito!");

            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            try {
                archivo.delete();
                archivo.createNewFile();
                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);
                linea.println("clientes");

                for (int i = 0; i < listaClientes.getTamano(); i++) {
                    Cliente cliente = (Cliente) listaClientes.getValor(i);
                    linea.println(cliente.getId() + "," + cliente.getNombre() + "," + cliente.getDireccion());
                }

                linea.println("caminos");

                for (int i = 0; i < listaCaminos.getTamano(); i++) {
                    Camino camino = (Camino) listaCaminos.getValor(i);
                    linea.println(camino.getOrigen() + "," + camino.getDestino() + "," + camino.getDistancia());
                }
                linea.close();
                escribir.close();
                JOptionPane.showMessageDialog(this, "Se ha guardado con exito!");

            } catch (IOException ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // SIMPLEMENTE LLAMA A METODO PARA GENERAR EL GRAFICO INICIAL
        try {
            graficoInicial();
        } catch (Exception ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // GENERAR LOS BFS Y DFS EN LA VISTA DE CAMINOS A VISITAR
        ListaAdyacencia listaAdyacencia = new ListaAdyacencia(listaClientes.getTamano() + 1);
        try {
            for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);   
            int origen = camino.getOrigen();
            int destino = camino.getDestino();
            listaAdyacencia.cargarArista(origen, destino);
            }

            
// PARA REALIZAR PRUEBAS   
//
//            listaAdyacencia.cargarArista(0, 3);
//            listaAdyacencia.cargarArista(0, 4);
//            listaAdyacencia.cargarArista(3, 1);
//            listaAdyacencia.cargarArista(1, 5);
//            listaAdyacencia.cargarArista(4, 2);



            // RECORRIDO EN ANCHURA (BFS)
            System.out.println("\n\nBFS: ");
            int aux = 1;
            boolean visitadosBFS[] = new boolean[listaClientes.getTamano()+1];    // LLEVAR CONTRO DE VISITADOS
            Lista listaBFS = new Lista();   // LISTA PARA LUEGO IMPRIMIR CON MAS DETALLES

            Cola queue = new Cola();

            visitadosBFS[aux] = true;
            queue.insertar(aux);

            while (queue.tamano() != 0) {
                aux = (int) queue.extraer();
                System.out.print(aux + " ");
                listaBFS.agregarAlFinal(aux);

                Lista lista = listaAdyacencia.lista[aux];
                Nodo auxNodo = lista.primero;

                while (auxNodo != null) {

                    int n = (int) auxNodo.getValor();

                    if (!visitadosBFS[n]) {
                        visitadosBFS[n] = true;
                        queue.insertar(n);

                    }
                    auxNodo = auxNodo.getSiguiente();
                }
            }
            // EL RESULTADO LO MUESTRO EN UNA TABLA CON EL ORDEN DEL RECORRIDO Y MOSTRANDO LOS DATOS DE LOS CLIENTES
            DefaultTableModel tablaBFS = new DefaultTableModel();

            tablaBFS.addColumn("ID");
            tablaBFS.addColumn("Nombre");
            tablaBFS.addColumn("Dirección");
            for (int l=0; l<listaBFS.getTamano();l++) {
                for (int i = 0; i < listaClientes.getTamano(); i++) {
                    Cliente cliente = (Cliente) listaClientes.getValor(i);
                    if (listaBFS.getValor(l).equals(cliente.getId())) {
                        tablaBFS.addRow(new Object[]{cliente.getId(), cliente.getNombre(), cliente.getDireccion()});
                    }
                }
            }

            jTable2.setModel(tablaBFS);
            jTable2.getColumnModel().getColumn(0).setPreferredWidth(10);

            // RECORRIDO EN PROFUNDIDAD (DFS)
            System.out.println("\n\nDFS: ");
            aux = 1;
            boolean visitadosDFS[] = new boolean[listaClientes.getTamano() + 1];
                //DFS
            Lista listaDFS = new Lista();
            DFS(aux, visitadosDFS, listaAdyacencia,listaDFS);
            System.out.println("");
            
            // EL RESULTADO LO MUESTRO EN UNA TABLA CON EL ORDEN DEL RECORRIDO Y MOSTRANDO LOS DATOS DE LOS CLIENTES
            DefaultTableModel tablaDFS = new DefaultTableModel();

            tablaDFS.addColumn("ID");
            tablaDFS.addColumn("Nombre");
            tablaDFS.addColumn("Dirección");
            for (int l=0; l<listaDFS.getTamano();l++) {
                for (int i = 0; i < listaClientes.getTamano(); i++) {
                    Cliente cliente = (Cliente) listaClientes.getValor(i);
                    if (listaDFS.getValor(l).equals(cliente.getId())) {
                        tablaDFS.addRow(new Object[]{cliente.getId(), cliente.getNombre(), cliente.getDireccion()});
                    }
                }
            }

            jTable4.setModel(tablaDFS);
            jTable4.getColumnModel().getColumn(0).setPreferredWidth(10);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "¡Ops ha ocurrido un error! \n" + ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed
   
    public void DFS(int aux, boolean visitados[], ListaAdyacencia listaAdyacencia,Lista listaDFS) {
        
        
        visitados[aux] = true;
        System.out.print(aux + " ");
        
        listaDFS.agregarAlFinal(aux);
        

      
        
        Lista lista = listaAdyacencia.lista[aux];
        Nodo auxNodo = lista.primero;

        while (auxNodo != null) {

            int n = (int) auxNodo.getValor();

            if (!visitados[n]) {
                DFS(n, visitados, listaAdyacencia,listaDFS);

            }
            auxNodo = auxNodo.getSiguiente();
        }
        



    }
 
    public void actualizarClientes() throws Exception {
        jComboBox1.removeAllItems();
        for (int i = 1; i < listaClientes.getTamano(); i++) {
            Cliente cliente = (Cliente) listaClientes.getValor(i);
            jComboBox1.addItem(cliente.getId() + ")" +cliente.getNombre());
        }
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // GENERA LA MATRIZ DE ADYACENCIA PARA MOSTRARLA EN UNA MENSAJE
        ListaAdyacencia listaAdyacencia = new ListaAdyacencia(listaClientes.getTamano()+1);
        try{
            for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);   
            int origen = camino.getOrigen();
            int destino = camino.getDestino();
            listaAdyacencia.cargarArista(origen, destino);
            }
        
            //Mostrar la Matriz
            JOptionPane jopt = new JOptionPane();
            String result;
            result = listaAdyacencia.imprimirVariable();
            JLabel resLabel = new JLabel(result);
            resLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
            jopt.showMessageDialog( null, resLabel, "Lista de Adyacencia", JOptionPane.PLAIN_MESSAGE );
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "¡Ops ha ocurrido un error! \n" + ex );
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    public void generarMatriz(){
    // MUESTRA LA MATRIZ DE ADYACENCIA PERO SIN LA PONDERACIA DE LAS DISTANCIAS
        Camino camino = null;
        try {
            MatrizAdyacencia matriz = new MatrizAdyacencia(listaClientes.getTamano()+1);
            for (int i = 0; i < listaCaminos.getTamano(); i++) {
                try {
                    camino = (Camino) listaCaminos.getValor(i);
                } catch (Exception ex) {
                    Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
                }
                matriz.agregar(camino.getOrigen(), camino.getDestino(), camino.getDistancia());
            }
            //MUESTRA LA MATRIZ EN UN OPTION MESSAGE
            //            JOptionPane jopt = new JOptionPane();
            //            String result;
            //            result = matriz.imprimir();
            //            JLabel resLabel = new JLabel(result);
            //            resLabel.setFont(new Font("Monospaced", Font.PLAIN, 12));  // CONFIGURANDO EL TIPO DE FUENTE EN MONOESPACIO PARA QUE LA MATRIZ SE VEA BIEN
            //            jopt.showMessageDialog( null, resLabel, "Matriz de Adyacencia", JOptionPane.PLAIN_MESSAGE );

            matriz.printMatrix();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "¡Ops ha ocurrido un error! \n" + ex);
        }
    }
    
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
             
        System.out.println(jComboBox1.getSelectedItem());
        int idDestino; 
        String infoDestino = jComboBox1.getSelectedItem().toString();
        idDestino = Integer.parseInt(infoDestino.split("\\)")[0]);
        
        System.out.println(idDestino);
        
        
// GENERAR LOS BFS Y DFS EN LA VISTA DE CAMINOS A VISITAR
        ListaAdyacencia listaAdyacencia = new ListaAdyacencia(listaClientes.getTamano() + 1);
        try {
            for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);   
            int origen = camino.getOrigen();
            int destino = camino.getDestino();
            listaAdyacencia.cargarArista(origen, destino);
            }

            
// PARA REALIZAR PRUEBAS   
//
//            listaAdyacencia.cargarArista(0, 3);
//            listaAdyacencia.cargarArista(0, 4);
//            listaAdyacencia.cargarArista(3, 1);
//            listaAdyacencia.cargarArista(1, 5);
//            listaAdyacencia.cargarArista(4, 2);



            // RECORRIDO EN ANCHURA (BFS)
            System.out.println("\n\nBFS Completo: ");
            int aux = 1;
            boolean visitadosBFS[] = new boolean[listaClientes.getTamano()+1];    // LLEVAR CONTRO DE VISITADOS
            Lista listaBFS = new Lista();   // LISTA PARA LUEGO IMPRIMIR CON MAS DETALLES

            Cola queue = new Cola();

            visitadosBFS[aux] = true;
            queue.insertar(aux);

            while (queue.tamano() != 0) {
                aux = (int) queue.extraer();
                System.out.print(aux + " ");
                listaBFS.agregarAlFinal(aux);

                Lista lista = listaAdyacencia.lista[aux];
                Nodo auxNodo = lista.primero;

                while (auxNodo != null) {

                    int n = (int) auxNodo.getValor();

                    if (!visitadosBFS[n]) {
                        visitadosBFS[n] = true;
                        queue.insertar(n);

                    }
                    auxNodo = auxNodo.getSiguiente();
                }
            }
            // APLICANDO EL BFS CON LOS RESULTADOS DE LA LISTA MUESTRO HASTA EL DESTINO (SI HAY TIEMPO DEBEMOS HACER QUE GRAFIQUE)
            String recorrido = " "; 
            for (int i=0; i<listaBFS.getTamano();i++) {
                if((Integer)listaBFS.getValor(i) != idDestino){
                    recorrido = recorrido + (Integer)listaBFS.getValor(i);
                    recorrido = recorrido + " ➜ ";
                }else{
                    break; 
                }
            }
            recorrido = recorrido + idDestino;
            jLabel26.setText(recorrido);
            System.out.println("\n\nBFS hasta el destino:\n" + recorrido + "\n");
            
            

            // RECORRIDO EN PROFUNDIDAD (DFS)
            System.out.println("\n\nDFS completo: ");
            aux = 1;
            boolean visitadosDFS[] = new boolean[listaClientes.getTamano() + 1];
                //DFS
            Lista listaDFS = new Lista();
            DFS(aux, visitadosDFS, listaAdyacencia,listaDFS);
            System.out.println("");

            recorrido = " ";
            for (int i = 0; i < listaDFS.getTamano(); i++) {
                if ((Integer) listaDFS.getValor(i) != idDestino) {
                    recorrido = recorrido + (Integer) listaDFS.getValor(i);
                    recorrido = recorrido + " ➜ ";
                } else {
                    break;
                }
            }
            recorrido = recorrido + idDestino;
            jLabel27.setText(recorrido);
            System.out.println("\nDFS hasta el destino:\n" + recorrido + "\n");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "¡Ops ha ocurrido un error! \n" + ex);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // AGREGAR UN NUEVO CLIENTE
        try{
        String nombre = JOptionPane.showInputDialog(null,"Ingrese el nombre","Nuevo Cliente",JOptionPane.QUESTION_MESSAGE);
        String direccion = JOptionPane.showInputDialog(null,"Ingrese la dirección","Nuevo Cliente",JOptionPane.QUESTION_MESSAGE);
        Object aristas = JOptionPane.showInputDialog(null,"Seleccione el numero de conecciones que tendra","Nuevo Cliente", JOptionPane.QUESTION_MESSAGE, null,new Object[] { "Seleccione","1", "2", "3" },"Seleccione");
        
        int nAristas = Integer.parseInt(aristas.toString()) ;
        
        System.out.println(nAristas);
        
        String strClientes[]= new String[listaClientes.getTamano()+1];
        Cliente cliente ;
        Nodo aux = listaClientes.primero;
        for(int j=0;j<listaClientes.getTamano();j++){
            cliente = (Cliente)aux.getValor();
            strClientes[j]= cliente.getId() + ")" + cliente.getNombre();
            aux= aux.getSiguiente();
        }
        int idOrigen = listaClientes.getTamano() + 1;
        for(int i=0; i<nAristas; i++){
           Object destino = JOptionPane.showInputDialog(null,"Conexión n° " + i + "\nSeleccione el destino","Nuevo Cliente", JOptionPane.QUESTION_MESSAGE, null,  strClientes,"Seleccione");
           String distancia = JOptionPane.showInputDialog(null,"Conexión n° " + i + "\nIngrese la distancia en Km entre el nuevo cliente con el cliente:\n" + destino,"Nuevo Cliente",JOptionPane.QUESTION_MESSAGE);
           String stringDestino = destino.toString();
           int idDestino;
           idDestino = Integer.parseInt(stringDestino.split("\\)")[0]);
           int intDistancia = Integer.parseInt((String) distancia);
           Camino camino = new Camino(idOrigen, idDestino, intDistancia);
           listaCaminos.agregarAlFinal(camino);
           System.out.println("Nuevo Camino: \nID Origen: " + idOrigen + "\nID Destino: " + idDestino + "\nDistancia: " + intDistancia);

        }
        //System.out.println("Cliente: " + nombre + ". N° Aristas: " + aristas);
        Cliente nuevoCliente = new Cliente(listaClientes.getTamano()+1, nombre, direccion);
        listaClientes.agregarAlFinal(nuevoCliente);
        // ACTUALIZAR LA TABLA DE RUTAS
        actualizarTabla();
        // ACTUALIZAR LOS CLIENTES EN EL COMBOBOX DE LA VISTA DE -CAMINO ENTRE PUNTOS-
        actualizarClientes();
        
         } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "¡Ops ha ocurrido un error! \n" + ex);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // MOSTRAR LA LISTA DE CLIENTES EN UN MENSAJE
        try {
            String stringClientes = "<html>";
            for (int i = 0; i < listaClientes.getTamano(); i++) {
                Cliente cliente = (Cliente) listaClientes.getValor(i);
                stringClientes = stringClientes + cliente.getId() + ") " + cliente.getNombre() + " - " + cliente.getDireccion() + "<br>";
            }
            //Mostrar la Matriz
            JOptionPane jopt = new JOptionPane();
            String result;
            result = stringClientes;
            JLabel resLabel = new JLabel(result);
            resLabel.setFont(new Font("Dialog", Font.PLAIN, 12));
            jopt.showMessageDialog( null, resLabel, "Lista de Clientes", JOptionPane.PLAIN_MESSAGE );
        } catch (Exception ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    
    
    
   public void generarObjeto(String linea) {      
        String[] aux = linea.split(",");
        //Verificamos si hay un cambio de clientes
        if (aux.length == 1) {
            controlObjeto++;
        } else {
            if (controlObjeto == 1) {
                this.listaClientes.agregarAlFinal(new Cliente(Integer.parseInt(aux[0]), aux[1], aux[2]));
            } else {
                this.listaCaminos.agregarAlFinal(new Camino(Integer.parseInt(aux[0].trim()), Integer.parseInt(aux[1].trim()), Integer.parseInt(aux[2].trim())));
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    public void actualizarTabla() throws Exception{
       // ACTUALIZA LA TABLA DE LAS RUTAS
       DefaultTableModel tabla = new DefaultTableModel();
            
       tabla.addColumn("Origen");
       tabla.addColumn("Destino");
       tabla.addColumn("Distancia");
       
       for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);   
            tabla.addRow(new Object[]{camino.getOrigen(),camino.getDestino(),camino.getDistancia()});
        }

       jTable1.setModel(tabla);
      
    }
    

    public void graficoInicial() throws Exception {

        // Creación del Grafico
        Graph grafico = new SingleGraph("Grafico");
        grafico.setStrict(false);
        grafico.setAutoCreate( true );



        Lista listaNodos = new Lista();
        
        for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);   
            
            if(listaNodos.buscar(camino.getDestino()) == false){
                listaNodos.agregarAlFinal(camino.getDestino());
            }
            
            if(listaNodos.buscar(camino.getOrigen()) ==  false){
                listaNodos.agregarAlFinal(camino.getOrigen());
            }
        }
                
        for(int i=0; i<listaNodos.getTamano(); i++){
            grafico.addNode(listaNodos.getValor(i).toString());
            System.out.println("[" + i + "]Nodo: " + listaNodos.getValor(i).toString());
        }
        


        System.out.println("Tamaño de lista de Caminos: " + listaCaminos.getTamano() + "\n");
        
        String[] distancias = new String[listaCaminos.getTamano()];
        for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);             
            String distancia = Integer.toString(camino.getDistancia());
            distancias[i] = distancia;
            System.out.println("distancias["+i+"]="+distancia);
        }  

        for(int i=0; i<listaCaminos.getTamano(); i++){
            Camino camino = (Camino) listaCaminos.getValor(i);             
            String origen =  Integer.toString(camino.getOrigen());
            String destino = Integer.toString(camino.getDestino());
            String distancia = Integer.toString(camino.getDistancia());
            int cant = 0;
            for(int j=0; j<i; j++){
                if(distancia.equals(distancias[j])){
                    cant++;
                }
            }
            for(int k=0; k<cant; k++){
                distancia = distancia + " ";
            }
            System.out.println(" Añadiendo Edge n° " + i +"\n" + "Origen: " + origen + "\n" + "Destino: " + destino + "\n" + "Distancia: " + distancia + "\n");
            grafico.addEdge(distancia, origen, destino);            
        }   







        for (Node node : grafico) {
            node.addAttribute("ui.label", node.getId());
        }

        for (Edge edge : grafico.getEachEdge()) {
            edge.addAttribute("ui.label", edge.getId());
        }

        grafico.addAttribute("ui.quality");
        grafico.addAttribute("ui.antialias");

        // Preparación de la ventana para mostrar el Grafico
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout()) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(640, 480);
            }
        };
        panel.setBorder(BorderFactory.createLineBorder(Color.white, 5));
        Viewer viewer = new Viewer(grafico, Viewer.ThreadingModel.GRAPH_IN_GUI_THREAD);
        ViewPanel viewPanel = viewer.addDefaultView(false);
        viewer.enableAutoLayout();
        panel.add(viewPanel);
        frame.add(panel);
        frame.setTitle("Grafico");
        frame.setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage()
        );
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(HIDE_ON_CLOSE);
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Button;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
