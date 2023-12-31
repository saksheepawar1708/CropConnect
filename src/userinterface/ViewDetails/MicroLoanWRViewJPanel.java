/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ViewDetails;

import Business.WorkQueue.MicroLoanWorkRequest;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JPanel;

/**
 *
 * @author suchita
 */
public class MicroLoanWRViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MicroLoanWRViewJPanel
     */
    private JPanel userProcessContainer;
    private MicroLoanWorkRequest request;
    public MicroLoanWRViewJPanel(JPanel userProcessContainer, MicroLoanWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        populateDetails(request);
    }
    
    private void populateDetails(MicroLoanWorkRequest request)
    {
        nameJTextField.setText(request.getName());
        ageJTextField.setText(String.valueOf(request.getAge()));
        addressJTextField.setText(request.getAddress());
        bankNameJTextField.setText(request.getBankName());
        loanAmountJTextField.setText(String.valueOf(request.getLoanAmount()));
        emailIdJTextField.setText(request.getEmailId());
        phoneNoJTextField1.setText(String.valueOf(request.getPhoneNo()));
        panCardPathJTextField.setText(request.getPancardPath());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ageJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addressJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bankNameJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        loanAmountJTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        emailIdJTextField = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        phoneNoJTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        panCardPathJTextField = new javax.swing.JTextField();
        panUploadjButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 170, 122));

        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        nameJTextField.setEditable(false);

        jLabel3.setText("Age");

        ageJTextField.setEditable(false);

        jLabel4.setText("Address");

        addressJTextField.setEditable(false);

        jLabel5.setText("Bank Name");

        bankNameJTextField.setEditable(false);

        jLabel6.setText("Loan Amount");

        loanAmountJTextField.setEditable(false);

        jLabel12.setText("Email Id");

        emailIdJTextField.setEditable(false);

        jLabel13.setText("Phone No.");

        phoneNoJTextField1.setEditable(false);

        jLabel8.setText("Pan Card/ID");

        panCardPathJTextField.setEditable(false);

        panUploadjButton.setText("View");
        panUploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panUploadjButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(371, 371, 371)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nameJTextField)
                            .addComponent(ageJTextField)
                            .addComponent(addressJTextField)
                            .addComponent(bankNameJTextField)
                            .addComponent(loanAmountJTextField)
                            .addComponent(emailIdJTextField)
                            .addComponent(phoneNoJTextField1)
                            .addComponent(panCardPathJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(51, 51, 51)
                        .addComponent(panUploadjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(495, 495, 495)
                        .addComponent(jLabel7)))
                .addGap(83, 347, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bankNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loanAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneNoJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(panCardPathJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panUploadjButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)))
                .addGap(31, 31, 31)
                .addComponent(backJButton)
                .addContainerGap(442, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void panUploadjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panUploadjButtonActionPerformed
        // TODO add your handling code here:
        File f = new File(request.getPancardPath());
        File file = f.getAbsoluteFile();
          // What to do with the file, e.g. display it in a TextArea
          try{
          Desktop.getDesktop().open(file);
          }catch(Exception ex){
              System.out.println("Exception"+ex);
          }
    }//GEN-LAST:event_panUploadjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bankNameJTextField;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField loanAmountJTextField;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField panCardPathJTextField;
    private javax.swing.JButton panUploadjButton;
    private javax.swing.JTextField phoneNoJTextField1;
    // End of variables declaration//GEN-END:variables
}
