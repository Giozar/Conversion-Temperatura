/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uam.pvoe.practica.formas;

import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import uam.pvoe.practica.operaciones.Celsius;
import uam.pvoe.practica.operaciones.Fahrenheit;
import uam.pvoe.practica.operaciones.Kelvin;

/**
 *
 * @author
 */
public class FrmConversiones extends javax.swing.JFrame {

    /**
     * Creates new form FrmConversiones
     */
    public FrmConversiones() {
        initComponents();
        asignarRadioButtomsTemperatura();
        CelsiusA();
        ejecutar();
        txtCentigrados.setVisible(false);
        
    }

    public void ejecutar() {
        spnrTemperatura.setModel(new SpinnerNumberModel(0, -100, 100, 0.01));
        spnrTemperatura.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                
                if(rbCelsius.isSelected()){
                    CelsiusA();
                }
                
                if(rbFahrenheit.isSelected()){
                    FahrenheitA();
                }
                
                if(rbKelvin.isSelected()){
                    KelvinA();
                }
            }
        });
    }

    public void CelsiusA() {
        double origen = Double.parseDouble(spnrTemperatura.getValue().toString());
        String kelvintxt = txtKelvin.getText();
        double kelvin;
        String celsiustxt = txtCentigrados.getText();
        double celsius;
        String fahrenheittxt = txtFarenheit.getText();
        double fahrenheit;
        try {
            kelvin = Double.parseDouble(kelvintxt);
            celsius = Double.parseDouble(celsiustxt);
            fahrenheit = Double.parseDouble(fahrenheittxt);
        } catch (NumberFormatException err) {
            kelvin = 0.0;
            celsius = 0.0;
            fahrenheit = 0.0;// Valor predeterminado en caso de que la conversión falle
            System.out.println("No se pudo convertir " + kelvintxt + " o " + celsiustxt + " o " + fahrenheittxt + " a un valor numérico válido");
        }
        Celsius cel = new Celsius();
        txtCentigrados.setText(origen + "");
        txtKelvin.setText(cel.kelvin(origen) + "");
        txtFarenheit.setText(cel.fahrenheit(origen) + "");
    }
    
    public void FahrenheitA() {
        
        double origen = Double.parseDouble(spnrTemperatura.getValue().toString());
        String kelvintxt = txtKelvin.getText();
        double kelvin;
        String celsiustxt = txtCentigrados.getText();
        double celsius;
        String fahrenheittxt = txtFarenheit.getText();
        double fahrenheit;
        try {
            kelvin = Double.parseDouble(kelvintxt);
            celsius = Double.parseDouble(celsiustxt);
            fahrenheit = Double.parseDouble(fahrenheittxt);
        } catch (NumberFormatException err) {
            kelvin = 0.0;
            celsius = 0.0;
            fahrenheit = 0.0;// Valor predeterminado en caso de que la conversión falle
            System.out.println("No se pudo convertir " + kelvintxt + " o " + celsiustxt + " o " + fahrenheittxt + " a un valor numérico válido");
        }
        Fahrenheit fa = new Fahrenheit();
        txtCentigrados.setText(fa.celsius(origen) + "");
        txtKelvin.setText(fa.kelvin(origen) + "");
        txtFarenheit.setText(origen + "");
    }
    
    public void KelvinA() {
        
        double origen = Double.parseDouble(spnrTemperatura.getValue().toString());
        String kelvintxt = txtKelvin.getText();
        double kelvin;
        String celsiustxt = txtCentigrados.getText();
        double celsius;
        String fahrenheittxt = txtFarenheit.getText();
        double fahrenheit;
        try {
            kelvin = Double.parseDouble(kelvintxt);
            celsius = Double.parseDouble(celsiustxt);
            fahrenheit = Double.parseDouble(fahrenheittxt);
        } catch (NumberFormatException err) {
            kelvin = 0.0;
            celsius = 0.0;
            fahrenheit = 0.0;// Valor predeterminado en caso de que la conversión falle
            System.out.println("No se pudo convertir " + kelvintxt + " o " + celsiustxt + " o " + fahrenheittxt + " a un valor numérico válido");
        }
        Kelvin ke = new Kelvin();
        txtCentigrados.setText(ke.celsius(origen) + "");
        txtKelvin.setText(origen+"");
        txtFarenheit.setText(ke.fahrenheit(origen) + "");
    }
    
    
    public void ce(){
        spnrTemperatura.setValue(Double.parseDouble(txtCentigrados.getText()));
    }
    public void fa(){
        spnrTemperatura.setValue(Double.parseDouble(txtFarenheit.getText()));
    }
    
    public void ke(){
        spnrTemperatura.setValue(Double.parseDouble(txtKelvin.getText()));
    }

    public void asignarRadioButtomsTemperatura() {
        rbGroupTemperatura.add(rbCelsius);
        rbGroupTemperatura.add(rbKelvin);
        rbGroupTemperatura.add(rbFahrenheit);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbGroupTemperatura = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        spnrTemperatura = new javax.swing.JSpinner();
        txtCentigrados = new javax.swing.JTextField();
        txtFarenheit = new javax.swing.JTextField();
        txtKelvin = new javax.swing.JTextField();
        lblCentigrados = new javax.swing.JLabel();
        lblFar = new javax.swing.JLabel();
        lblKelvin = new javax.swing.JLabel();
        lblOrigen = new javax.swing.JLabel();
        rbCelsius = new javax.swing.JRadioButton();
        rbFahrenheit = new javax.swing.JRadioButton();
        rbKelvin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversiones de Temperaturas");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        lblTitulo.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        lblTitulo.setText("Sistema de Conversiones");

        lblCentigrados.setText("Grados Centígrados");

        lblFar.setText("Grados  Fahrenheit");

        lblKelvin.setText("Grados Kelvin");

        lblOrigen.setText("Temperatura Origen");

        rbCelsius.setSelected(true);
        rbCelsius.setText("Grados Centígrados");
        rbCelsius.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCelsiusActionPerformed(evt);
            }
        });

        rbFahrenheit.setText("Grados Fahrenheit");
        rbFahrenheit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFahrenheitActionPerformed(evt);
            }
        });

        rbKelvin.setText("Grados Kelvin");
        rbKelvin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKelvinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblOrigen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCentigrados, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rbCelsius)
                            .addComponent(rbKelvin, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbFahrenheit, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCentigrados)
                            .addComponent(txtFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFar)
                            .addComponent(lblKelvin)
                            .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(spnrTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblOrigen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblCentigrados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCentigrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnrTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(lblFar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFarenheit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(rbCelsius)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbFahrenheit)
                        .addGap(55, 55, 55)
                        .addComponent(rbKelvin))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKelvin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtKelvin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbCelsiusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCelsiusActionPerformed
        // TODO add your handling code here:
        if(rbCelsius.isSelected()) {
            txtCentigrados.setVisible(false);
            txtFarenheit.setVisible(true);
            txtKelvin.setVisible(true);
            setVisible(true);
            ejecutar();
            ce();
        }
    }//GEN-LAST:event_rbCelsiusActionPerformed

    private void rbFahrenheitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFahrenheitActionPerformed
        // TODO add your handling code here:
        if(rbFahrenheit.isSelected()) {
            txtCentigrados.setVisible(true);
            txtFarenheit.setVisible(false);
            txtKelvin.setVisible(true);
            setVisible(true);
            ejecutar();
            fa();
        }
    }//GEN-LAST:event_rbFahrenheitActionPerformed

    private void rbKelvinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKelvinActionPerformed
        // TODO add your handling code here:
        if(rbKelvin.isSelected()) {
            txtCentigrados.setVisible(true);
            txtFarenheit.setVisible(true);
            txtKelvin.setVisible(false);
            setVisible(true);
            ejecutar();
            ke();
        }
    }//GEN-LAST:event_rbKelvinActionPerformed

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
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCentigrados;
    private javax.swing.JLabel lblFar;
    private javax.swing.JLabel lblKelvin;
    private javax.swing.JLabel lblOrigen;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbCelsius;
    private javax.swing.JRadioButton rbFahrenheit;
    private javax.swing.ButtonGroup rbGroupTemperatura;
    private javax.swing.JRadioButton rbKelvin;
    private javax.swing.JSpinner spnrTemperatura;
    private javax.swing.JTextField txtCentigrados;
    private javax.swing.JTextField txtFarenheit;
    private javax.swing.JTextField txtKelvin;
    // End of variables declaration//GEN-END:variables
}
