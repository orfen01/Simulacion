/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectaleatorios;
import javax.script.ScriptEngine; 
import javax.script.ScriptEngineManager; 
import javax.script.ScriptException; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class InputsOutputs extends javax.swing.JFrame {
    
    int n;
    String formulaT, formulaG;
    double Xo, Un;
    
    static int roundDenominador(double numero){ 
        String letra = String.valueOf(numero); 
        String total = letra.substring(letra.indexOf(".")+1); 
        int totalInt = (int) Math.pow(10,total.length()); 
        return totalInt; 
    }
    
    static String fraccion(Integer num, Integer den){ 
        int cont=1; 
        do{     
            num = num%cont == 0 ? num/cont : num; 
            den = den%cont == 0 ? den/cont : den; 
            cont++; 
        }while(num%cont == 0 && den%cont == 0); 
 
        return "Fracción: "+ num +"/"+den.toString(); 
    }

    public void Calculos(){
        
        //if (!jtxtTX.getText().equals("(X+2)/(X*X)")){
        //    JOptionPane.showMessageDialog(null,"Error en la formula ingresada para TX, debe ingresar: (X+2)/(X*X)");
        //}
        //else if(!jtxtGx.getText().equals("X/33")){
        //JOptionPane.showMessageDialog(null,"Error en la formula ingresada para GX, debe ingresar: X/33");
        //}
        /*else*/ 
        if(jtxtXo.getText().equals("")|| jtxtN.getText().equals("")){
        JOptionPane.showMessageDialog(null,"Debe ingresar Xo y N");
        }
        else{
        
        //Tabla - Matriz
       DefaultTableModel modelo= (DefaultTableModel)this.jtblresultados.getModel();
       
       //Clase que interpreta string T(x)
       ScriptEngineManager managerT = new ScriptEngineManager(); 
       ScriptEngine interpreteT = managerT.getEngineByName("js");
       //Clase que interpreta string G(x)
       ScriptEngineManager managerG = new ScriptEngineManager(); 
       ScriptEngine interpreteG = managerG.getEngineByName("js");

       
       Xo = Integer.parseInt(jtxtXo.getText());
       int  max = Integer.parseInt(jtxtN.getText());
       for (n=0;n<max;n++){
           try {
               //Obtener lo que se ingresa en cajas de texto. 
               //Formula T(x), G(x) y Xo
               formulaT = jtxtTX.getText(); 
               formulaG = jtxtGx.getText();
               
               //Se interpreta el valor de X en el string para T(x)
               interpreteT.put("X", Xo); 
               //Guardar Resultado de formula T 
               Object resultT = interpreteT.eval(formulaT);
               //Agregar resultado a Tabla - Matriz
               int auxsubn = n;
               auxsubn++;
               modelo.addRow(new Object [] {"X" + auxsubn, resultT});
               //Nuevo Xo
               //Pasar resultT a Xo
               Xo       = (double)resultT;
               //Hallar *Un* con formula de G(x)
               interpreteG.put("X", Xo);
               Object resultG = interpreteG.eval(formulaG);   
               Un       = (double)resultG;
               //Convertir de decimal a Francción
                //**Intento Fallido**//
                //int denominador = roundDenominador(Un);
                //int intnumerador = (int) (Un * denominador);
                //denominador = denominador * 1;
                //String UnString       = fraccion(intnumerador, denominador);
                //Agregar valor de Un en la ultima columna de Tabla/Matriz
               modelo.setValueAt(Un, n, 2);
               
        //System.out.println("Resultado = "+ interprete.eval(formulaT)); 
        } catch(ScriptException se) { 
           se.printStackTrace(); 
          }
           
       }
     }
 
    }

    /**
     * Creates new form InputsOutputs
     */
    public InputsOutputs() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtblresultados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtxtTX = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxtXo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtGx = new javax.swing.JTextField();
        jbtnCalcular = new javax.swing.JButton();
        jtxtN = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtnlimpiar = new javax.swing.JButton();
        jbtnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jtblresultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Xn", "T(X) Value", "G(X) Un"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtblresultados);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Entradas ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 51, 51))); // NOI18N

        jtxtTX.setText("(X+2)/(X*X)");
        jtxtTX.setToolTipText("Ingrese la formula: (X+2)/(X*X)");

        jLabel1.setText("T (x)");

        jLabel2.setText("G (x)");

        jtxtXo.setText("2");
        jtxtXo.setToolTipText("Ingrese Xo");

        jLabel3.setText("Xo");

        jtxtGx.setText("X/33");
        jtxtGx.setToolTipText("Ingrese la formula: X/33");

        jbtnCalcular.setText("Calcular");
        jbtnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCalcularActionPerformed(evt);
            }
        });

        jtxtN.setToolTipText("Ingrese numero de iteraciones N");

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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtTX, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jtxtN, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxtGx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                    .addComponent(jtxtXo, javax.swing.GroupLayout.Alignment.TRAILING)))))
                    .addComponent(jbtnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtTX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxtGx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtxtXo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
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
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jbtnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jbtnMenu)
                .addGap(58, 58, 58)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCalcularActionPerformed
        Calculos();
    }//GEN-LAST:event_jbtnCalcularActionPerformed

    private void jbtnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnlimpiarActionPerformed
      DefaultTableModel modelo= (DefaultTableModel)this.jtblresultados.getModel();
        for(int i = modelo.getRowCount()-1;i>=0; i--){
            modelo.removeRow(i);}
       
    }//GEN-LAST:event_jbtnlimpiarActionPerformed

    private void jbtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMenuActionPerformed
        Menu menu = new Menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtnMenuActionPerformed

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
            java.util.logging.Logger.getLogger(InputsOutputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputsOutputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputsOutputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputsOutputs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputsOutputs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnCalcular;
    private javax.swing.JButton jbtnMenu;
    private javax.swing.JButton jbtnlimpiar;
    private javax.swing.JTable jtblresultados;
    private javax.swing.JTextField jtxtGx;
    private javax.swing.JTextField jtxtN;
    private javax.swing.JTextField jtxtTX;
    private javax.swing.JTextField jtxtXo;
    // End of variables declaration//GEN-END:variables
}
