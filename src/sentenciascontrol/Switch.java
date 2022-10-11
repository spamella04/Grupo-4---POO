/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciascontrol;

import javax.swing.JOptionPane;
import modelos.MSwitch;
/**
 *
 * @author Armando J. López L.
 */
public class Switch extends javax.swing.JInternalFrame {
MSwitch Switch=new MSwitch();
    /**
     * Creates new form Switch
     */
    public Switch() {
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

        Grupo1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEjer1 = new javax.swing.JTextArea();
        tfMes1 = new javax.swing.JTextField();
        bMostrar1 = new javax.swing.JButton();
        lEjer2 = new javax.swing.JLabel();
        tfMes2 = new javax.swing.JTextField();
        bMostrar2 = new javax.swing.JButton();
        lEjer3 = new javax.swing.JLabel();
        tfMes3 = new javax.swing.JTextField();
        bMostrar3 = new javax.swing.JButton();
        lEjer4 = new javax.swing.JLabel();
        pEstadoCivil = new javax.swing.JPanel();
        rbRaiz = new javax.swing.JRadioButton();
        rbResiduo = new javax.swing.JRadioButton();
        rbMenor = new javax.swing.JRadioButton();
        bCalcular4 = new javax.swing.JButton();
        lEjer5 = new javax.swing.JLabel();
        tfNum5 = new javax.swing.JTextField();
        bDeterminar5 = new javax.swing.JButton();

        setClosable(true);
        setTitle("Sentencia de Bifurcación switch de Java");

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
        taEjer1.setText("1. De acuerdo con el nombre del mes digitado, muestre si pertenece al grupo de 28 días, 29 días, 30 días o 31 días");
        taEjer1.setToolTipText("");
        taEjer1.setAutoscrolls(false);
        taEjer1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setViewportView(taEjer1);

        bMostrar1.setText("Mostar");
        bMostrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar1ActionPerformed(evt);
            }
        });

        lEjer2.setText("2. Según el número del mes, determine la época del año");

        bMostrar2.setText("Mostar");
        bMostrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar2ActionPerformed(evt);
            }
        });

        lEjer3.setText("3. Según el número del mes, determine el número de días");

        bMostrar3.setText("Mostar");
        bMostrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMostrar3ActionPerformed(evt);
            }
        });

        lEjer4.setText("4. Realice la tarea que indica la selección");

        pEstadoCivil.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú"));

        Grupo1.add(rbRaiz);
        rbRaiz.setText("Calcular la raíz de un número");

        Grupo1.add(rbResiduo);
        rbResiduo.setText("Calcular el residuo de una división entera");

        Grupo1.add(rbMenor);
        rbMenor.setText("Mostrar el menor de N números");

        bCalcular4.setText("Calcular");
        bCalcular4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCalcular4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pEstadoCivilLayout = new javax.swing.GroupLayout(pEstadoCivil);
        pEstadoCivil.setLayout(pEstadoCivilLayout);
        pEstadoCivilLayout.setHorizontalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbResiduo)
                            .addComponent(rbMenor)
                            .addComponent(rbRaiz)))
                    .addGroup(pEstadoCivilLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(bCalcular4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pEstadoCivilLayout.setVerticalGroup(
            pEstadoCivilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pEstadoCivilLayout.createSequentialGroup()
                .addComponent(rbRaiz)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbResiduo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbMenor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCalcular4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lEjer5.setText("5. Determinar si el número entero es par o impar");

        bDeterminar5.setText("Determinar");
        bDeterminar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeterminar5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar2))
                    .addComponent(lEjer3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bMostrar3))
                    .addComponent(lEjer4)
                    .addComponent(lEjer2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEjer5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bDeterminar5)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lEjer3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMes3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bMostrar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lEjer5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDeterminar5)
                    .addComponent(tfNum5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bMostrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar1ActionPerformed
        try{
        String num=(this.tfMes1.getText());
        String Mes=Switch.NombreMes(num);
        switch (Mes.toLowerCase()) {
  case "enero": case "marzo": case "mayo": case"julio": case "agosto": case "octubre": case"diciembre": 
    JOptionPane.showMessageDialog(this,"El mes tiene 31 dias","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
case "abril": case "junio": case "septiembre": case "noviembre":
   JOptionPane.showMessageDialog(this,"El mes tiene 30dias","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
  case "febrero":			
    JOptionPane.showMessageDialog(this,"El mes tiene 28 dias(o 29 si es bisiesto)","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;	
}
        // holaaa
        
}catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bMostrar1ActionPerformed

    private void bMostrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar2ActionPerformed
        try{
        int num=Integer.parseInt(this.tfMes2.getText());
        int epoca=Switch.Epoca(num);
        switch (epoca) {
  case 1: case 2: case 3: 
    JOptionPane.showMessageDialog(this,"Invierno","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
  case 4: case 5: case 6: 
   JOptionPane.showMessageDialog(this,"Primavera","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
  case 7: case 8: case 9:			
    JOptionPane.showMessageDialog(this,"Verano","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
    case 10: case 11: case 12:			
    JOptionPane.showMessageDialog(this,"Otonio","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
}
}catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }   
    }//GEN-LAST:event_bMostrar2ActionPerformed

    private void bMostrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMostrar3ActionPerformed
       try{
        int num=Integer.parseInt(this.tfMes3.getText());
        int NrMes=Switch.NrMes(num);
        switch (NrMes) {
  case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    JOptionPane.showMessageDialog(this,"El mes tiene 31 dias","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
  case 4: case 6: case 9: case 11:
   JOptionPane.showMessageDialog(this,"El mes tiene 30dias","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;
  case 2:			
    JOptionPane.showMessageDialog(this,"El mes tiene 28 dias(o 29 si es bisiesto)","Respuesta",JOptionPane.INFORMATION_MESSAGE);
    break;			
}
}catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_bMostrar3ActionPerformed

    private void bDeterminar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeterminar5ActionPerformed

      int num=Integer.parseInt(this.tfNum5.getText());
      int resultado=Switch.ParImpar(num);
      switch(resultado)
      {
          case 0:
          JOptionPane.showMessageDialog(this,"El numero es par","Respuesta",JOptionPane.INFORMATION_MESSAGE);
          break;
          case 1:
          JOptionPane.showMessageDialog(this,"El numero es impar","Respuesta",JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_bDeterminar5ActionPerformed

    private void bCalcular4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCalcular4ActionPerformed
        // Se recorren los controles del groupbox y se obtiene el de tipo radiobutton que esta checkeado
  /*RadioButton selected = Grupo1.Controls.OfType<RadioButton>().FirstOrDefault((radio) => radio.Checked == true);

  // Se establece el switch a partir del nombre del radiobutton
  switch (selected.Name)
  {
  case "rbRaiz":
   JOptionPane.showMessageDialog(null, "Calcular Raiz Seleccionado");
   break;

  case "rbResiduo":
   JOptionPane.showMessageDialog(null, "Calcular division entera Seleccionado");
   break;
  case "rbMenor":
   JOptionPane.showMessageDialog(null, "Calcular numero menor de n numeros Seleccionado");
   break;
  default:
   break;
  }*/

if(rbRaiz.isSelected()){

      String raiz=JOptionPane.showInputDialog("Ingrese numero a calcular");
      double Raiz=Switch.Seleccion(raiz);
      JOptionPane.showMessageDialog(null,"La raiz del numero es "+Raiz);
  }else if(rbResiduo.isSelected()){
      String n1=JOptionPane.showInputDialog("Ingrese n1");
      String n2=JOptionPane.showInputDialog("Ingrese n2");
      int divi=Switch.Division(Integer.valueOf(n1),Integer.valueOf(n2));
      JOptionPane.showMessageDialog(null, "El residuo de la division es "+divi);
  }else if(rbMenor.isSelected())
  {
      String Nnum=JOptionPane.showInputDialog("Cuantos numero va a ingresar?");
      int menor=Switch.menor(Integer.valueOf(Nnum));
      for(int i=0;i<Integer.valueOf(Nnum);i++)
      { 
          String tmp=JOptionPane.showInputDialog("Ingrese un numero");
          if(i==0){
              menor=Integer.valueOf(tmp);
          }else if (Integer.valueOf(tmp)<menor)
          {
              menor=Integer.valueOf(tmp);
          }
          
      }
      JOptionPane.showMessageDialog(null,"El numero menor es"+menor);
  }
  
    }//GEN-LAST:event_bCalcular4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JButton bCalcular4;
    private javax.swing.JButton bDeterminar5;
    private javax.swing.JButton bMostrar1;
    private javax.swing.JButton bMostrar2;
    private javax.swing.JButton bMostrar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEjer2;
    private javax.swing.JLabel lEjer3;
    private javax.swing.JLabel lEjer4;
    private javax.swing.JLabel lEjer5;
    private javax.swing.JPanel pEstadoCivil;
    private javax.swing.JRadioButton rbMenor;
    private javax.swing.JRadioButton rbRaiz;
    private javax.swing.JRadioButton rbResiduo;
    private javax.swing.JTextArea taEjer1;
    private javax.swing.JTextField tfMes1;
    private javax.swing.JTextField tfMes2;
    private javax.swing.JTextField tfMes3;
    private javax.swing.JTextField tfNum5;
    // End of variables declaration//GEN-END:variables
}
