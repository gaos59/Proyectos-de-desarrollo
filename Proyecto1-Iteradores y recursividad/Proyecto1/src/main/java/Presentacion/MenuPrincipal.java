/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

/**
 *
 * @author Gorte
 */

import javax.swing.JOptionPane;
import Negocio.Pedidos;
import Entidades.Pedido;
import java.awt.HeadlessException;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    
    RegistroPedido registroPedido;
    MostrarEditarPedidos mostrarEditarPedidos;
    final Pedidos pedidos;
    
    public MenuPrincipal() {
        initComponents();
        pedidos = new Pedidos();
    }
    
    public int GetCantidadPedidos (){
        return pedidos.CantidadPedidos();
    }
    
    public void BuscarPedidosPorTelefono (String numeroTelefonico) {
        
        try {          
            Pedidos pedidosT = new Pedidos();
            for (int i = 0; i < pedidos.CantidadPedidos(); i++) {
                Pedido pedido = pedidos.ObtenerPedido(i+1);
                if (pedido.getTelefonoCliente() == null ? numeroTelefonico == null : pedido.getTelefonoCliente().equals(numeroTelefonico)) {
                    pedidosT.AgregarPedido(pedido);
                }
            }

            if (pedidosT.IsEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay pedidos con ese número telefonico", "Telefono no encontrado", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if (mostrarEditarPedidos != null) {
                mostrarEditarPedidos.LimpiarTabla();
                mostrarEditarPedidos.RefrescarPedidos(pedidosT);
                JOptionPane.showMessageDialog(null,"Se encontraron: \n" + pedidosT.CantidadPedidos() + " Pedidos", "Información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (HeadlessException e){
            JOptionPane.showMessageDialog(PBotones, "Por un error no se logro buscar pedidos con el número de telefono brindado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void AgregarPedido (Pedido pedido) {
        try {
            pedidos.AgregarPedido(pedido);
           
            if (mostrarEditarPedidos != null) {
                mostrarEditarPedidos.RefrescarPedidos(pedidos); 
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(PBotones, "Por un error no se logro guardar el pedido", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } 
    
    public void EditarPedido (Pedido pedido) {
        try {
            pedidos.EditarPedido(pedido.getId()-1, pedido);
           
            if (mostrarEditarPedidos != null) {
                mostrarEditarPedidos.RefrescarPedidos(pedidos); 
            }
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(PBotones, "Por un error no se logro editar el pedido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LDescripcionMenu = new javax.swing.JLabel();
        LMenu = new javax.swing.JLabel();
        BtnCerrar = new javax.swing.JButton();
        PBotones = new javax.swing.JPanel();
        BRealizarPedido = new javax.swing.JButton();
        BMostrarPedidos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("XDesing");
        setResizable(false);

        LDescripcionMenu.setText("Acá puedes escoger entre realizar un nuevo pedido, buscar o editar pedidos anteriores");

        LMenu.setFont(new java.awt.Font("Javanese Text", 0, 18)); // NOI18N
        LMenu.setText("Aplicación pedidos XDesign");

        BtnCerrar.setBackground(new java.awt.Color(255, 204, 204));
        BtnCerrar.setText("Cerrar");
        BtnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCerrarActionPerformed(evt);
            }
        });

        BRealizarPedido.setLabel("Realizar Pedido");
        BRealizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRealizarPedidoActionPerformed(evt);
            }
        });

        BMostrarPedidos.setLabel("Mostrar pedidos");
        BMostrarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMostrarPedidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PBotonesLayout = new javax.swing.GroupLayout(PBotones);
        PBotones.setLayout(PBotonesLayout);
        PBotonesLayout.setHorizontalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PBotonesLayout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BMostrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        PBotonesLayout.setVerticalGroup(
            PBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PBotonesLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(BRealizarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(BMostrarPedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        BRealizarPedido.getAccessibleContext().setAccessibleName("BRealizarPedido");
        BRealizarPedido.getAccessibleContext().setAccessibleDescription("");
        BMostrarPedidos.getAccessibleContext().setAccessibleName("BMostrarPedidos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnCerrar)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LDescripcionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(248, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LDescripcionMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(BtnCerrar)
                .addGap(19, 19, 19))
        );

        LDescripcionMenu.getAccessibleContext().setAccessibleName("LDescripcionMenu");
        LMenu.getAccessibleContext().setAccessibleName("LMenu");
        BtnCerrar.getAccessibleContext().setAccessibleName("BCerrar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCerrarActionPerformed

    public void setRegistrarPedidoBtnEnabled(boolean enabled) {
        BRealizarPedido.setEnabled(enabled);
    }
    
    public void setMostrarEditarPedidosBtnEnabled(boolean enabled) {
        BMostrarPedidos.setEnabled(enabled);
    }
    
    private void BRealizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRealizarPedidoActionPerformed
        try {
            if (registroPedido == null || !registroPedido.isDisplayable()) {
                registroPedido = new RegistroPedido(MenuPrincipal.this);
                registroPedido.setVisible(true);
                BRealizarPedido.setEnabled(false);
            }  
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(PBotones, "No se puede abrir obción de registrar pedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BRealizarPedidoActionPerformed
    
    private void BMostrarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMostrarPedidosActionPerformed
        try {
            if (pedidos.IsEmpty()) {
                JOptionPane.showMessageDialog(null, "No existen pedidos registrados favor registrar algún pedido", "Cuidado", JOptionPane.WARNING_MESSAGE);
            } 
            else {
                if (mostrarEditarPedidos == null || !mostrarEditarPedidos.isDisplayable()) {
                    mostrarEditarPedidos = new MostrarEditarPedidos(MenuPrincipal.this, pedidos);
                    mostrarEditarPedidos.setVisible(true);
                    BMostrarPedidos.setEnabled(false);
                }
            }   
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(PBotones, "No se puede abrir obción de mostrar y editar pedidos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BMostrarPedidosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BMostrarPedidos;
    private javax.swing.JButton BRealizarPedido;
    private javax.swing.JButton BtnCerrar;
    private javax.swing.JLabel LDescripcionMenu;
    private javax.swing.JLabel LMenu;
    private javax.swing.JPanel PBotones;
    // End of variables declaration//GEN-END:variables
}
