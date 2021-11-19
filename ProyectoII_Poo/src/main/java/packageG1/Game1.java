/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageG1;
import GUI.Window;
import Classes.GameFunction;
import Classes.Stat;
import java.lang.Math;
/**
 *
 * @author jose_
 */
public class Game1 extends javax.swing.JInternalFrame implements GameFunction {

    /**
     * Creates new form MenuG1
     */
    public Game1() {
        initComponents();
        startG();
    }
    @Override
    public void startG() {  //it produces an operation to be solved
        labelExc.setVisible(false);
        labelGameOver.setVisible(false);
        String[] arr = {"*","-","+"};
        int score = 0;
        int num1,num2;    
        num1 =(int)(Math.random()*100);
        num2 = (int)(Math.random()*100);
        String k = arr[(int)(Math.random()*2)];
        labelNum1.setText(String.valueOf(num1));
        labelOp.setText(k);
        labelNum2.setText(String.valueOf(num2));  
    }
    public Stat getStats() {    //creates the object Stat
        Stat stat;
        if(textName.getText().isBlank()){
            stat = new Stat("Points1","default",Integer.valueOf(labelScore.getText()));
        }
        else{
            stat = new Stat("Points1",textName.getText(),Integer.valueOf(labelScore.getText()));
        }
        return stat;
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelG1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        labelNum1 = new javax.swing.JLabel();
        text = new javax.swing.JTextField();
        labelPoint = new javax.swing.JLabel();
        bOk = new javax.swing.JButton();
        labelScore = new javax.swing.JLabel();
        labelOp = new javax.swing.JLabel();
        labelNum2 = new javax.swing.JLabel();
        labelGameOver = new javax.swing.JLabel();
        labelExc = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textName = new javax.swing.JTextField();

        panelG1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setText("The result of:");
        panelG1.add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        labelNum1.setText("num1");
        panelG1.add(labelNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        text.setActionCommand("<Not Set>");
        text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textActionPerformed(evt);
            }
        });
        panelG1.add(text, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 64, -1));

        labelPoint.setText("Points:");
        panelG1.add(labelPoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        bOk.setText("Ok");
        bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOkActionPerformed(evt);
            }
        });
        panelG1.add(bOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        labelScore.setText("0");
        panelG1.add(labelScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        labelOp.setText("operator");
        panelG1.add(labelOp, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        labelNum2.setText("num2");
        panelG1.add(labelNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, -1, -1));
        panelG1.add(labelGameOver, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 160, 50));

        labelExc.setText("Digit a numeric value");
        panelG1.add(labelExc, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 120, 20));

        jLabel1.setText("Name: ");
        panelG1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        textName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNameActionPerformed(evt);
            }
        });
        panelG1.add(textName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 80, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelG1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelG1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_textActionPerformed

    private void bOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOkActionPerformed
        // TODO add your handling code here:
        // it verifies in the middle text if the result is correct
       
        int num1,num2,res;
        String op;
        num1 = Integer.valueOf(labelNum1.getText());
        num2 = Integer.valueOf(labelNum2.getText());
        op = labelOp.getText();
        if(op == "*")
            res = num1 * num2;
        else if(op == "+")
            res = num1 + num2;
        else
            res = num1 - num2;
        //it sums the points obtained if the answer is correct
        try{
        if (res == Integer.valueOf(text.getText())){//it sets the points 
            labelScore.setText(String.valueOf(Integer.valueOf(labelScore.getText())+5));
            //reset the text
            text.setText("");
            startG();
        }
        else{   //if the answer is wrong
            bOk.setEnabled(false);
            text.setEnabled(false);
            labelGameOver.setVisible(true);
            labelGameOver.setText("Game over, your score: "+labelScore.getText());
            Stat stat = getStats(); //creates the objects and write it in the txt file
            stat.writeArchive();
            //exit option left and the getscore()
        }
            }
        catch(NumberFormatException e){ //if there is letters in the text
            System.out.println("An error occurs, please digit numbers "+e);
            labelExc.setVisible(true);
        }     
    }//GEN-LAST:event_bOkActionPerformed

    private void textNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNameActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bOk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel labelExc;
    private javax.swing.JLabel labelGameOver;
    private javax.swing.JLabel labelNum1;
    private javax.swing.JLabel labelNum2;
    private javax.swing.JLabel labelOp;
    private javax.swing.JLabel labelPoint;
    private javax.swing.JLabel labelScore;
    private javax.swing.JPanel panelG1;
    private javax.swing.JTextField text;
    private javax.swing.JTextField textName;
    // End of variables declaration//GEN-END:variables

}
