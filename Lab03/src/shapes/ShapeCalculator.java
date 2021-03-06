/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;
import javax.swing.JComboBox;

/**
 *
 * @author 01748792
 */
public class ShapeCalculator extends javax.swing.JFrame {
    String output;
    Shape[] shapeList = {new Circle(), new Rectangle(), new Triangle(), new Cylinder(), new RectPrism(), new TriPrism(), new Sphere()};
    String[] shapeListStr = {"Circle", "Rectangle", "Triangle", "Cylinder", "RectPrism", "TriPrism", "Sphere"};
    /**
     * Creates new form ShapeCalculator
     */
    public ShapeCalculator() {
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

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        cmbBoxOptions = new JComboBox(shapeListStr);
        jPanel1 = new javax.swing.JPanel();
        lblInput1 = new javax.swing.JLabel();
        txtInput1 = new javax.swing.JTextField();
        lblInput2 = new javax.swing.JLabel();
        txtInput2 = new javax.swing.JTextField();
        lblInput3 = new javax.swing.JLabel();
        txtInput3 = new javax.swing.JTextField();
        lblInput4 = new javax.swing.JLabel();
        txtInput4 = new javax.swing.JTextField();
        btnCalculate = new javax.swing.JButton();
        lblResults = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choose a shape");

        /*Netbeans is looking to fight by not letting me edit.
        cmbBoxOptions.setModel(new javax.swing.DefaultComboBoxModel<>(shapeList));
        */
        cmbBoxOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxOptionsActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(4, 2));

        lblInput1.setText("Enter a radius");
        jPanel1.add(lblInput1);

        txtInput1.setMinimumSize(new java.awt.Dimension(30, 20));
        txtInput1.setPreferredSize(new java.awt.Dimension(30, 20));
        jPanel1.add(txtInput1);

        lblInput2.setText("-");
        jPanel1.add(lblInput2);
        jPanel1.add(txtInput2);

        lblInput3.setText("-");
        jPanel1.add(lblInput3);
        jPanel1.add(txtInput3);

        lblInput4.setText("-");
        jPanel1.add(lblInput4);
        jPanel1.add(txtInput4);

        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(cmbBoxOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblResults)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCalculate)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbBoxOptions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblResults)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBoxOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxOptionsActionPerformed
        if(shapeList[cmbBoxOptions.getSelectedIndex()] instanceof Circle) {
            lblInput1.setText("Enter a radius");
            lblInput2.setText("-");
            lblInput3.setText("-");
            lblInput4.setText("-");
        } else if (shapeList[cmbBoxOptions.getSelectedIndex()] instanceof Rectangle) {
            lblInput1.setText("Enter a length");
            lblInput2.setText("Enter a width");
            lblInput3.setText("-");
            lblInput4.setText("-");
        } else if (shapeList[cmbBoxOptions.getSelectedIndex()] instanceof Triangle) {
            lblInput1.setText("Enter side 1");
            lblInput2.setText("Enter side 2");
            lblInput3.setText("Enter side 3");
            lblInput4.setText("-");
        }
        if (shapeList[cmbBoxOptions.getSelectedIndex()] instanceof ThreeDObject) 
            lblInput4.setText("Enter a height");
    }//GEN-LAST:event_cmbBoxOptionsActionPerformed

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        switch (cmbBoxOptions.getSelectedIndex()) {
            case 0:
                ((Circle)shapeList[0]).setRadius(Double.parseDouble(txtInput1.getText()));
                output = "Perimeter: " + shapeList[0].getPerimeter() + "\nArea: " + shapeList[0].getArea();
                break;
            case 1:
                ((Rectangle)shapeList[1]).setLength(Double.parseDouble(txtInput1.getText()));
                ((Rectangle)shapeList[1]).setWidth(Double.parseDouble(txtInput2.getText()));
                output = "Perimeter: " + shapeList[1].getPerimeter() + "\nArea: " + shapeList[1].getArea();
                break;
            case 2:
                ((Triangle)shapeList[2]).setS1(Double.parseDouble(txtInput1.getText()));
                ((Triangle)shapeList[2]).setS2(Double.parseDouble(txtInput2.getText()));
                ((Triangle)shapeList[2]).setS3(Double.parseDouble(txtInput3.getText()));
                output = "Perimeter: " + shapeList[2].getPerimeter() + "\nArea" + shapeList[2].getArea();
                break;
            case 3:
                ((Cylinder)shapeList[3]).setRadius(Double.parseDouble(txtInput1.getText()));
                ((Cylinder)shapeList[3]).setHeight(Double.parseDouble(txtInput4.getText()));
                output = "Lateral Area : " + ((ThreeDObject)shapeList[3]).getLateralArea() + "\nSurface Area: " + ((ThreeDObject)shapeList[3]).getSurfaceArea() + "Volume: " + ((ThreeDObject)shapeList[3]).getVolume();
                break;
            case 4:
                ((RectPrism)shapeList[4]).setLength(Double.parseDouble(txtInput1.getText()));
                ((RectPrism)shapeList[4]).setWidth(Double.parseDouble(txtInput2.getText()));
                ((RectPrism)shapeList[4]).setHeight(Double.parseDouble(txtInput4.getText()));
                output = "Lateral Area : " + ((ThreeDObject)shapeList[4]).getLateralArea() + "\nSurface Area: " + ((ThreeDObject)shapeList[4]).getSurfaceArea() + "Volume: " + ((ThreeDObject)shapeList[4]).getVolume();
                break;
            case 5:
                ((TriPrism)shapeList[5]).setS1(Double.parseDouble(txtInput1.getText()));
                ((TriPrism)shapeList[5]).setS2(Double.parseDouble(txtInput2.getText()));
                ((TriPrism)shapeList[5]).setS3(Double.parseDouble(txtInput3.getText()));
                ((TriPrism)shapeList[5]).setHeight(Double.parseDouble(txtInput4.getText()));
                output = "Lateral Area : " + ((ThreeDObject)shapeList[5]).getLateralArea() + "\nSurface Area: " + ((ThreeDObject)shapeList[5]).getSurfaceArea() + "Volume: " + ((ThreeDObject)shapeList[5]).getVolume();
                break;
            case 6:
                ((Sphere)shapeList[6]).setRadius(Double.parseDouble(txtInput1.getText()));
                output = "Surface Area: " + ((Sphere)shapeList[6]).getSurfaceArea() + "Volume: " + ((Sphere)shapeList[6]).getVolume();
                break;
        }
        
        lblResults.setText(output);
    }//GEN-LAST:event_btnCalculateActionPerformed

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
            java.util.logging.Logger.getLogger(ShapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapeCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JComboBox<String> cmbBoxOptions;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInput1;
    private javax.swing.JLabel lblInput2;
    private javax.swing.JLabel lblInput3;
    private javax.swing.JLabel lblInput4;
    private javax.swing.JLabel lblResults;
    private javax.swing.JTextField txtInput1;
    private javax.swing.JTextField txtInput2;
    private javax.swing.JTextField txtInput3;
    private javax.swing.JTextField txtInput4;
    // End of variables declaration//GEN-END:variables
}
