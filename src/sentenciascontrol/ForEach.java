/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import javax.swing.JOptionPane;
import modelos.MForEach;
/**
 *
 * @author Armando J. López L.
 */
public class ForEach extends javax.swing.JInternalFrame {
MForEach Foreach=new MForEach();
    /**
     * Creates new form ForEach
     */
    public ForEach() {
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
        taEjer1 = new javax.swing.JTextArea();
        bCalcular1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEjer2 = new javax.swing.JTextArea();
        bCalcular2 = new javax.swing.JButton();

        setTitle("Sentencia de Repetición for...each de Java");

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setHorizontalScrollBar(null);

        taEjer1.setEditable(false);
        taEjer1.setBackground(new java.awt.Color(240, 240, 240));
        taEjer1.setColumns(20);
        taEjer1.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taEjer1.setLineWrap(true);
        taEjer1.setRows(5);
        taEjer1.setText("1. Calcule la longitud de cada nombre, utilizando el siguiente arreglo de cadenas:\n    String[] nombres={\"Juan\", \"María\", \"Miguel\", \"Susana\"};");
        taEjer1.setToolTipText("");
        taEjer1.setAutoscrolls(false);
        taEjer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(taEjer1);

        bCalcular1.setText("Calcular");
        bCalcular1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular1ActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane2.setHorizontalScrollBar(null);

        taEjer2.setEditable(false);
        taEjer2.setBackground(new java.awt.Color(240, 240, 240));
        taEjer2.setColumns(20);
        taEjer2.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        taEjer2.setLineWrap(true);
        taEjer2.setRows(5);
        taEjer2.setText("2. Calcule el menor de los números de un arreglo con los siguientes valores:\n     {5,8,3,7,9,0,3,2,1,4,6}");
        taEjer2.setToolTipText("");
        taEjer2.setAutoscrolls(false);
        taEjer2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(taEjer2);

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular2)
                            .addComponent(bCalcular1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular2)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCalcular1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular1ActionPerformed
        // TODO add your handling code here:
        String nombre[] = {"Juan","Maria","Miguel","Susana"};
        int tamanio = 0;
        int i = 1;
        /*
        for(String Elements : nombre)
            tamanio++;
        */
        
        for(String Elements : nombre){
          tamanio = Foreach.longi(Elements);
         JOptionPane.showMessageDialog(this,"Tamanio elemento #"+i+": "+tamanio+" ","Respuesta", JOptionPane.INFORMATION_MESSAGE);
         i++;
        }
        
    }//GEN-LAST:event_bCalcular1ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
        // TODO add your handling code here:
      int[] numeros = new int[] { 5,8,3,7,9,0,3,2,1,4,6 };
      int menor = Foreach.calcularMenor(numeros);
                                             
      JOptionPane.showMessageDialog(this,"El numero menor del arreglo es "+menor,"Respuesta", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bCalcular2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular1;
    private javax.swing.JButton bCalcular2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea taEjer1;
    private javax.swing.JTextArea taEjer2;
    // End of variables declaration//GEN-END:variables
}
