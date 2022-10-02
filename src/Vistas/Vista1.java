
package Vistas;


import java.util.HashMap;
import laboratoriotp3grupo4.Cliente;


public class Vista1 extends javax.swing.JFrame {
    
   // public static HashMap<Long,Cliente> direc = new HashMap();
    
    public Vista1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        btCerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        opAgregarCliente = new javax.swing.JMenuItem();
        opBuscarCliente = new javax.swing.JMenuItem();
        opBorrarCliente = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu TP3");

        escritorio.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("TRABAJO PRACTICO N°3");

        btCerrar.setText("Cerrar");
        btCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCerrarActionPerformed(evt);
            }
        });

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        escritorio.setLayer(btCerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btCerrar)
                .addContainerGap())
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                .addComponent(btCerrar)
                .addContainerGap())
        );

        jButton1.setText("jButton1");

        jMenu1.setText("Menu");

        opAgregarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        opAgregarCliente.setText("Agregar cliente");
        opAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opAgregarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(opAgregarCliente);

        opBuscarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        opBuscarCliente.setText("Buscar cliente");
        opBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBuscarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(opBuscarCliente);

        opBorrarCliente.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        opBorrarCliente.setText("Borrar cliente");
        opBorrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opBorrarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(opBorrarCliente);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opAgregarClienteActionPerformed
        AgregarCliente ad = new AgregarCliente();
        escritorio.add(ad);
        ad.show();
    }//GEN-LAST:event_opAgregarClienteActionPerformed

    private void opBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBuscarClienteActionPerformed
        BusquedaCliente bus= new BusquedaCliente();
        escritorio.add(bus);
        bus.show();
    }//GEN-LAST:event_opBuscarClienteActionPerformed

    private void opBorrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opBorrarClienteActionPerformed
        BorrarCliente bor=new BorrarCliente();
        escritorio.add(bor);
        bor.show();
    }//GEN-LAST:event_opBorrarClienteActionPerformed

    private void btCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btCerrarActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCerrar;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem opAgregarCliente;
    private javax.swing.JMenuItem opBorrarCliente;
    private javax.swing.JMenuItem opBuscarCliente;
    // End of variables declaration//GEN-END:variables
}
