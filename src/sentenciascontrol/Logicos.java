/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import javax.swing.JOptionPane;
import modelos.MLogico;

/**
 *
 * @author Armando J. López L.
 */
public class Logicos extends javax.swing.JInternalFrame {
     
    MLogico logico = new MLogico();
    /**
     * Creates new form Logicos
     */
    public Logicos() {
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

        tfNum1 = new javax.swing.JTextField();
        lEjer1 = new javax.swing.JLabel();
        lvs1 = new javax.swing.JLabel();
        tfNum2 = new javax.swing.JTextField();
        bVerificar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfNum3 = new javax.swing.JTextField();
        lvs2 = new javax.swing.JLabel();
        tfNum4 = new javax.swing.JTextField();
        bCalcular2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        lvs3 = new javax.swing.JLabel();
        tfNum6 = new javax.swing.JTextField();
        bCalcular3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        tfNum7 = new javax.swing.JTextField();
        lcompara4 = new javax.swing.JLabel();
        tfNum8 = new javax.swing.JTextField();
        bCalcular4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum9 = new javax.swing.JTextField();
        lcompara5 = new javax.swing.JLabel();
        tfNum10 = new javax.swing.JTextField();
        bCalcular5 = new javax.swing.JButton();
        lEjer6 = new javax.swing.JLabel();
        tfCaracter1 = new javax.swing.JTextField();
        lvs5 = new javax.swing.JLabel();
        tfCaracter2 = new javax.swing.JTextField();
        bVerificar6 = new javax.swing.JButton();
        lEjer7 = new javax.swing.JLabel();
        tfCaracter3 = new javax.swing.JTextField();
        lvs6 = new javax.swing.JLabel();
        tfCaracter4 = new javax.swing.JTextField();
        bVerificar7 = new javax.swing.JButton();
        lEjer8 = new javax.swing.JLabel();
        tfCadena2 = new javax.swing.JTextField();
        lvs7 = new javax.swing.JLabel();
        bVerificar8 = new javax.swing.JButton();
        tfCadena1 = new javax.swing.JTextField();
        lEjer9 = new javax.swing.JLabel();
        tfCadena3 = new javax.swing.JTextField();
        tfCadena4 = new javax.swing.JTextField();
        bCalcular9 = new javax.swing.JButton();
        lvs8 = new javax.swing.JLabel();
        lEjer10 = new javax.swing.JLabel();
        tfNum11 = new javax.swing.JTextField();
        bVerificar10 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Operadores Lógicos de Java");

        lEjer1.setText("1. Introduzca dos números para verificar si son iguales");

        lvs1.setText("vs.");

        bVerificar1.setText("Verificar");
        bVerificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Introduzca dos números para calcular al mayor");

        lvs2.setText("vs.");

        bCalcular2.setText("Calcular");
        bCalcular2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Introduzca dos números para calcular al menor");

        lvs3.setText("vs.");

        bCalcular3.setText("Calcular");
        bCalcular3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Introduzca dos números para calcular el valor de verdad");

        lcompara4.setText(">=");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        lEjer5.setText("5. Introduzca dos números para calcular el valor de verdad");

        lcompara5.setText("<=");

        bCalcular5.setText("Calcular");
        bCalcular5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular5ActionPerformed(evt);
            }
        });

        lEjer6.setText("6. Introduzca dos caracteres para verificar si son iguales");

        lvs5.setText("vs.");

        bVerificar6.setText("Verificar");
        bVerificar6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar6ActionPerformed(evt);
            }
        });

        lEjer7.setText("7. Introduzca dos caracteres para verificar si son diferentes");

        lvs6.setText("vs.");

        bVerificar7.setText("Verificar");
        bVerificar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar7ActionPerformed(evt);
            }
        });

        lEjer8.setText("8. Introduzca dos cadenas de caracteres para verificar si son iguales");

        lvs7.setText("vs.");

        bVerificar8.setText("Verificar");
        bVerificar8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar8ActionPerformed(evt);
            }
        });

        lEjer9.setText("9. Introduzca dos cadenas de caracteres para calcular la mayor");

        bCalcular9.setText("Calcular");
        bCalcular9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular9ActionPerformed(evt);
            }
        });

        lvs8.setText("vs.");

        lEjer10.setText("10. Introduzca un número para verificar si es positivo o negativo");

        bVerificar10.setText("Verificar");
        bVerificar10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bVerificar10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEjer1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bVerificar1))
                    .addComponent(lEjer5)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcompara5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCalcular5))
                    .addComponent(lEjer4)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lcompara4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCalcular4))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCalcular3))
                    .addComponent(lEjer2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bCalcular2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lEjer6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCaracter1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCaracter2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bVerificar6))
                    .addComponent(lEjer7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCaracter3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCaracter4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bVerificar7))
                    .addComponent(lEjer8)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCadena1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCadena2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bVerificar8))
                    .addComponent(lEjer9)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCadena3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lvs8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCadena4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCalcular9))
                    .addComponent(lEjer10)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bVerificar10)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs1)
                            .addComponent(tfNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bVerificar1)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCaracter1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs5)
                            .addComponent(tfCaracter2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bVerificar6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs2)
                            .addComponent(tfNum4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCaracter3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs6)
                            .addComponent(tfCaracter4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bVerificar7))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs3)
                            .addComponent(tfNum6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCadena2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs7)
                            .addComponent(bVerificar8)
                            .addComponent(tfCadena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcompara4)
                            .addComponent(tfNum8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCadena4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular9)
                            .addComponent(tfCadena3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lvs8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lcompara5)
                            .addComponent(tfNum10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCalcular5)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lEjer10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNum11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bVerificar10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bVerificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar1ActionPerformed
        // TODO add your handling code here:
        
        try{
            double num1 = Double.parseDouble(tfNum1.getText());
            double num2 = Double.parseDouble(tfNum2.getText());

            boolean resp = logico.sonIguales(num1, num2);


           if(resp){
               JOptionPane.showMessageDialog(this, "Son iguales", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
           } else{
               JOptionPane.showMessageDialog(this, "No son iguales", "Respuesta", JOptionPane.WARNING_MESSAGE);
           }
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar1ActionPerformed

    private void bCalcular2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular2ActionPerformed
        // TODO add your handling code here:
        try{
            double num1 = Double.parseDouble(tfNum3.getText());
            double num2 = Double.parseDouble(tfNum4.getText());
            
            double resp = logico.numeroMayor(num1, num2);
            
            JOptionPane.showMessageDialog(this, "El numero mayor es "+resp, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular2ActionPerformed

    private void bCalcular3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular3ActionPerformed
        // TODO add your handling code here:
        try{
            double num1 = Double.parseDouble(tfNum5.getText());
            double num2 = Double.parseDouble(tfNum6.getText());
            
            double resp = logico.numeroMenor(num1, num2);
            
            JOptionPane.showMessageDialog(this, "El numero menor es "+resp, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular3ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        // TODO add your handling code here:
         try{
            double num1 = Double.parseDouble(tfNum7.getText());
            double num2 = Double.parseDouble(tfNum8.getText());
            
            boolean resp = logico.mayorOIgual(num1, num2);
            
            if(resp){
               JOptionPane.showMessageDialog(this, "El numero  "+num1 + " es mayor o igual a " + num2, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "El numero  "+num1 + " no es mayor o igual a " + num2, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular4ActionPerformed

    private void bCalcular5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular5ActionPerformed
        // TODO add your handling code here:
        try{
            double num1 = Double.parseDouble(tfNum9.getText());
            double num2 = Double.parseDouble(tfNum10.getText());
            
            boolean resp = logico.menorOIgual(num1, num2);
            
            if(resp){
               JOptionPane.showMessageDialog(this, "El numero  "+num1 + " es menor o igual a " + num2, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "El numero  "+num1 + " no es menor o igual a " + num2, "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular5ActionPerformed

    private void bVerificar6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar6ActionPerformed
        // TODO add your handling code here:
         try{
            String char1 = this.tfCaracter1.getText();
            String char2 = this.tfCaracter2.getText();
          
            
            boolean resp = logico.caracteresIguales(char1, char2);
            
            if(resp){
               JOptionPane.showMessageDialog(this, "Son iguales", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "Son diferentes", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar6ActionPerformed

    private void bVerificar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar7ActionPerformed
        // TODO add your handling code here:
         try{
            String char1 = this.tfCaracter3.getText();
            String char2 = this.tfCaracter4.getText();
          
            
            boolean resp = logico.caracteresDiferentes(char1, char2);
            
            if(!resp){
               JOptionPane.showMessageDialog(this, "Son diferentes", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "Son iguales", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar7ActionPerformed

    private void bVerificar8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar8ActionPerformed
        // TODO add your handling code here:
        try{
            String cadena1 = this.tfCadena1.getText();
            String cadena2 = this.tfCadena2.getText();
          
            
            boolean resp = logico.cadenasIguales(cadena1, cadena2);
            
            if(resp){
               JOptionPane.showMessageDialog(this, "Son iguales", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "Son diferentes", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar8ActionPerformed

    private void bCalcular9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular9ActionPerformed
        // TODO add your handling code here:
        try{
            String cadena1 = this.tfCadena3.getText();
            String cadena2 = this.tfCadena4.getText();
          
            
            boolean resp = logico.cadenaMayor(cadena1, cadena2);
            
            if(resp){
               JOptionPane.showMessageDialog(this, "La cadena "+cadena1+" es mayor", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "La cadena "+cadena2+" es mayor", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCalcular9ActionPerformed

    private void bVerificar10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bVerificar10ActionPerformed
        // TODO add your handling code here:
        try{
           
            double numero = Double.parseDouble(tfNum11.getText());
            boolean resp = logico.numPositivoNegativo(numero);
            
            if(resp){
               JOptionPane.showMessageDialog(this, "El numero "+numero+" es positivo", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            } else{
                 JOptionPane.showMessageDialog(this, "El numero "+numero+" es negativo", "Respuesta", JOptionPane.INFORMATION_MESSAGE);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Dejo un campo vacio", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bVerificar10ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCalcular2;
    private javax.swing.JButton bCalcular3;
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bCalcular5;
    private javax.swing.JButton bCalcular9;
    private javax.swing.JButton bVerificar1;
    private javax.swing.JButton bVerificar10;
    private javax.swing.JButton bVerificar6;
    private javax.swing.JButton bVerificar7;
    private javax.swing.JButton bVerificar8;
    private javax.swing.JLabel lEjer1;
    private javax.swing.JLabel lEjer10;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JLabel lEjer6;
    private javax.swing.JLabel lEjer7;
    private javax.swing.JLabel lEjer8;
    private javax.swing.JLabel lEjer9;
    private javax.swing.JLabel lcompara4;
    private javax.swing.JLabel lcompara5;
    private javax.swing.JLabel lvs1;
    private javax.swing.JLabel lvs2;
    private javax.swing.JLabel lvs3;
    private javax.swing.JLabel lvs5;
    private javax.swing.JLabel lvs6;
    private javax.swing.JLabel lvs7;
    private javax.swing.JLabel lvs8;
    private javax.swing.JTextField tfCadena1;
    private javax.swing.JTextField tfCadena2;
    private javax.swing.JTextField tfCadena3;
    private javax.swing.JTextField tfCadena4;
    private javax.swing.JTextField tfCaracter1;
    private javax.swing.JTextField tfCaracter2;
    private javax.swing.JTextField tfCaracter3;
    private javax.swing.JTextField tfCaracter4;
    private javax.swing.JTextField tfNum1;
    private javax.swing.JTextField tfNum10;
    private javax.swing.JTextField tfNum11;
    private javax.swing.JTextField tfNum2;
    private javax.swing.JTextField tfNum3;
    private javax.swing.JTextField tfNum4;
    private javax.swing.JTextField tfNum5;
    private javax.swing.JTextField tfNum6;
    private javax.swing.JTextField tfNum7;
    private javax.swing.JTextField tfNum8;
    private javax.swing.JTextField tfNum9;
    // End of variables declaration//GEN-END:variables
}
