/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentasion;

import javax.swing.JOptionPane;
import Negocio.ArbolBinario;
import Entidades.Impresora;
import Negocio.ExcepcionPersonalizada;
import javax.swing.JFrame;

/**
 *
 * @author Gorte
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Insertar insertar;
    BusquedaEliminacion busquedaEliminacion;
    Recorrer recorrer;
    MostrarArbol mostrarArbol;
    ArbolBinario arbolImpresoras = new ArbolBinario();
    
    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCerrar = new javax.swing.JButton();
        BtnInsertar = new javax.swing.JButton();
        BtnBusqueda = new javax.swing.JButton();
        BtnRecorridos = new javax.swing.JButton();
        BtnGraficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú principal");
        setResizable(false);

        BtnCerrar.setBackground(new java.awt.Color(255, 204, 204));
        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BtnInsertar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BtnInsertar.setText("Insertar impresora");
        BtnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertarActionPerformed(evt);
            }
        });

        BtnBusqueda.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BtnBusqueda.setText("Buscar y eliminar impresoras");
        BtnBusqueda.setActionCommand("");
        BtnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBusquedaActionPerformed(evt);
            }
        });

        BtnRecorridos.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BtnRecorridos.setText("Recorrer y ordenar");
        BtnRecorridos.setActionCommand("");
        BtnRecorridos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecorridosActionPerformed(evt);
            }
        });

        BtnGraficar.setFont(new java.awt.Font("Segoe UI Symbol", 0, 14)); // NOI18N
        BtnGraficar.setText("Graficar arbol");
        BtnGraficar.setActionCommand("");
        BtnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGraficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnCerrar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 60, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(BtnInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(BtnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(BtnRecorridos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BtnGraficar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(BtnCerrar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    private void BtnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertarActionPerformed
        try {
            if (insertar == null || !insertar.isDisplayable()) {
                insertar = new Insertar(MenuPrincipal.this);
                insertar.setVisible(true);
                BtnInsertar.setEnabled(false);
            }  
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede abrir opción de registrar impresora", "Error", JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_BtnInsertarActionPerformed

    private void BtnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBusquedaActionPerformed
        try {
            if (busquedaEliminacion == null || !busquedaEliminacion.isDisplayable()) {
                busquedaEliminacion = new BusquedaEliminacion(MenuPrincipal.this);
                busquedaEliminacion.setVisible(true);
                BtnBusqueda.setEnabled(false);
            }  
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede abrir opción de buscar impresora", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBusquedaActionPerformed

    private void BtnRecorridosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecorridosActionPerformed
        try {
            if (recorrer == null || !recorrer.isDisplayable()) {                
                recorrer = new Recorrer(MenuPrincipal.this);                
                recorrer.setVisible(true);
                BtnRecorridos.setEnabled(false);                
            }  
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede abrir opción de mostrar recorridos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnRecorridosActionPerformed

    private void BtnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGraficarActionPerformed
        try {
            if (mostrarArbol == null || !mostrarArbol.isDisplayable()) {                
                mostrarArbol = new MostrarArbol("Mostrar arbol", MenuPrincipal.this, arbolImpresoras.getRaiz());  
                //GraficarArbol ga = new GraficarArbol(arbolImpresoras.getRaiz());
               // mostrarArbol.add(ga);
                mostrarArbol.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
                mostrarArbol.setSize(800, 600);
                mostrarArbol.setVisible(true);
                BtnGraficar.setEnabled(false);                
            }  
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "No se puede abrir opción de mostrar arbol: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnGraficarActionPerformed
 
    public void setInsertarBtnEnabled(boolean enabled) {
        BtnInsertar.setEnabled(enabled);
    }
  
    public void setBusquedaBtnEnabled(boolean enabled) {
        BtnBusqueda.setEnabled(enabled);
    }

    public void setrecorrerBtnEnabled(boolean enabled) {
        BtnRecorridos.setEnabled(enabled);
    }
    
    public void agregarImpresora (Impresora impresora) throws ExcepcionPersonalizada {
        arbolImpresoras.insertar(impresora);
    }
    
    public void setMostrarBtnEnabled(boolean enabled) {
        BtnGraficar.setEnabled(enabled);
    }
    
    public Impresora buscarImpresora (int ID){
        try {
            return arbolImpresoras.busqueda(ID);
        } 
        catch (ExcepcionPersonalizada ex) {
            JOptionPane.showMessageDialog(this, "No se puede buscar impresora: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "No se puede buscar impresora debido a un error ", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public void eliminarImpresora (int ID){
        try {
            arbolImpresoras.eliminar(ID);
        } 
        catch (ExcepcionPersonalizada ex) {
            JOptionPane.showMessageDialog(this, "No se puede eliminar impresora: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(this, "No se puede eliminar impresora debido a un error ", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    public String recorrerArbol (int tipo) throws ExcepcionPersonalizada{
        return arbolImpresoras.Recorrido(tipo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBusqueda;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JButton BtnGraficar;
    private javax.swing.JButton BtnInsertar;
    private javax.swing.JButton BtnRecorridos;
    // End of variables declaration//GEN-END:variables
}
