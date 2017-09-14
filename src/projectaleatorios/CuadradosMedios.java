/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaleatorios;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author UAHC020
 */
public class CuadradosMedios extends javax.swing.JFrame {

    /**
     * Creates new form CuadradosMedios
     */
    public CuadradosMedios() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblresultados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtxtSemilla = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtnCalcular = new javax.swing.JButton();
        jtxtN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtnlimpiar = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtblresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Xn", "Semilla", "Semilla Cuadrado", "Digitos Centrales", "Un"
            }
        ));
        jScrollPane1.setViewportView(jtblresultados);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entradas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 51))); // NOI18N

        jtxtSemilla.setToolTipText("Semilla de 4 digitos");
        jtxtSemilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtSemillaKeyPressed(evt);
            }
        });

        jLabel1.setText("Semilla:");

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jtxtN.setToolTipText("Ingrese numero de iteraciones N");
        jtxtN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxtNKeyPressed(evt);
            }
        });

        jLabel4.setText("N");

        jbtnlimpiar.setText("Limpiar");
        jbtnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnCalcular, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jtxtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxtN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtSemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jbtnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnlimpiar)
                .addContainerGap())
        );

        jbtnMenu.setText("Menú");
        jbtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtnMenu)
                        .addGap(66, 66, 66)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 80, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int semilla, semillaaux, n, cuadrado, medios;
    float aleatorio;
    
   
    
    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        if(jtxtSemilla.getText().equals("")|| jtxtN.getText().equals(" ")){
        JOptionPane.showMessageDialog(null,"Falta ingresar datos para calcular.");
        }
        else if(jtxtSemilla.getText().length()!=4){
        JOptionPane.showMessageDialog(null, "La semilla deben ser exactamene 4 digitos.");
        }
        else{
        Calculos();}
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void jbtnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlimpiarActionPerformed
        jtxtSemilla.setText("");jtxtN.setText("");
        DefaultTableModel modelo= (DefaultTableModel)this.jtblresultados.getModel();
        for(int i = modelo.getRowCount()-1;i>=0; i--){
            modelo.removeRow(i);}

    }//GEN-LAST:event_jbtnlimpiarActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnMenuActionPerformed

    private void jtxtSemillaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtSemillaKeyPressed
       if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        jtxtSemilla.setEditable(true);
    } else {
        jtxtSemilla.setEditable(false);
    }
    }//GEN-LAST:event_jtxtSemillaKeyPressed

    private void jtxtNKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtNKeyPressed
         if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
        jtxtN.setEditable(true);
    } else {
        jtxtN.setEditable(false);
    }
    }//GEN-LAST:event_jtxtNKeyPressed

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
            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CuadradosMedios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CuadradosMedios().setVisible(true);
            }
        });
    }
    
    public void Calculos(){
        try{
             DefaultTableModel modelo= (DefaultTableModel)this.jtblresultados.getModel();
            semilla = Integer.parseInt(jtxtSemilla.getText());
    n=Integer.parseInt(jtxtN.getText());
    String cuadradoaux="";
    for(int i=0;i<=n;i++){
            cuadrado=(int)Math.pow(semilla,2);
            int tam=Integer.toString(cuadrado).length();
            switch(tam){
                case 8:
                    cuadradoaux=""+cuadrado;
                    break;
                case 7:
                    cuadradoaux="0"+cuadrado;                   
                    break;
                case 6:
                    cuadradoaux="00"+cuadrado;
                break;
                case 5:
                    cuadradoaux="000"+cuadrado;
                break;
                case 4:
                    cuadradoaux="0000"+cuadrado;
                break;
                case 3:
                    cuadradoaux="00000"+cuadrado;
                break;
                case 2:
                    cuadradoaux="000000"+cuadrado;
                break;
                case 1:
                    cuadradoaux="0000000"+cuadrado;
                break;
            }
            String medios=String.valueOf(cuadradoaux);
            semillaaux = Integer.parseInt(medios.substring(2, 6));
            aleatorio = (float)semillaaux/10000;
            modelo.addRow(new Object [] {i,semilla, cuadradoaux,semillaaux,aleatorio});
            semilla = semillaaux;
      }
        }
        catch(Exception e){
       JOptionPane.showMessageDialog(null, "No se calcularon los "+n+" numeros aleatorios solicitados \n debido a la semilla que ingreso "+jtxtSemilla.getText());
       }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnlimpiar;
    private javax.swing.JTable jtblresultados;
    private javax.swing.JTextField jtxtN;
    private javax.swing.JTextField jtxtSemilla;
    // End of variables declaration//GEN-END:variables
}
