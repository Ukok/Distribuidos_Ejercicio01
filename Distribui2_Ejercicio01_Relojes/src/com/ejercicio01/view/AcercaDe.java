
package com.ejercicio01.view;

/**
 *
 * @author mario
 */
public class AcercaDe extends javax.swing.JFrame {

   /**
    * Creates new form AcercaDe
    */
   public AcercaDe() {
      initComponents();
   }

   /**
    * This method is called from within the constructor to initialize
    * the form. WARNING: Do NOT modify this code. The content of this
    * method is always regenerated by the Form Editor.
    */
   @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setTitle("Acerca de");
        setAlwaysOnTop(true);
        setMaximumSize(new java.awt.Dimension(200, 150));
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("<html> <center> Instituto Politécnico Nacional<br> Escuela Superior de Cómputo<br>   <br> Sistemas distribuidos<br> <br> Equipo 5 <br> <br> Ejercicio: Aplicación que muestra cinco relojes digitales<br> </center> </html>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("<html>\n<center>\nInstituto Politécnico Nacional<br>\nEscuela Superior de Cómputo<br>\n<br>\nSistemas distribuidos<br><br>\nEjercicio: Aplicacion Cliente-Servidor que permite<br>\nla conexion a gestores de BD y visualizar la información<br>\nde cualquier base de datos existente en el gestor.<br>\n</center>\n</html>");

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
