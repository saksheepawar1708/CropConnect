/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ViewDetails;

import Business.WorkQueue.BankLoanWorkRequest;
import java.awt.CardLayout;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JPanel;

/**
 *
 * @author suchita
 */
public class BankWRViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BankWRViewJPanel
     */
    private JPanel userProcessContainer;
    private BankLoanWorkRequest request;
    public BankWRViewJPanel(JPanel userProcessContainer,BankLoanWorkRequest request) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.request=request;
        populateDetails(request);
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
        jLabel6 = new javax.swing.JLabel();
        loanAmountJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agricultureLandAddJTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        loanReasonJTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        emailIdJTextField = new javax.swing.JTextField();
        annualIncomeJTextField = new javax.swing.JTextField();
        panCardPathJTextField = new javax.swing.JTextField();
        valueOfAgricultureLandJTextField = new javax.swing.JTextField();
        landUploadjButton = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        phoneNoJTextField1 = new javax.swing.JTextField();
        panUploadjButton1 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        bankNamejTextField1 = new javax.swing.JTextField();

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

        jLabel6.setText("Loan Amount");

        loanAmountJTextField.setEditable(false);

        jLabel7.setText("Pan Card/ID");

        agricultureLandAddJTextField.setEditable(false);

        jLabel8.setText("Reason for Loan");

        loanReasonJTextField1.setEditable(false);

        jLabel9.setText("Annual Income");

        jLabel10.setText("Address Of Agriculture Land");

        jLabel11.setText("Proof of Value Of Agriculture Land");

        jLabel12.setText("Email Id");

        emailIdJTextField.setEditable(false);

        annualIncomeJTextField.setEditable(false);

        panCardPathJTextField.setEditable(false);

        valueOfAgricultureLandJTextField.setEditable(false);

        landUploadjButton.setText("View");
        landUploadjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                landUploadjButtonActionPerformed(evt);
            }
        });

        jLabel13.setText("Phone No.");

        phoneNoJTextField1.setEditable(false);

        panUploadjButton1.setText("View");
        panUploadjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panUploadjButton1ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Details");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        bankNamejTextField1.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(backJButton)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel7))
                                .addGap(59, 59, 59))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(46, 46, 46)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panCardPathJTextField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(panUploadjButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(phoneNoJTextField1)
                                    .addComponent(emailIdJTextField)
                                    .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ageJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addressJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bankNamejTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loanAmountJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(loanReasonJTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annualIncomeJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(agricultureLandAddJTextField, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valueOfAgricultureLandJTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(landUploadjButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)))
                .addContainerGap(367, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(622, 622, 622)
                .addComponent(backJButton)
                .addGap(102, 102, 102))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ageJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(bankNamejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(loanAmountJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanReasonJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualIncomeJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(agricultureLandAddJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valueOfAgricultureLandJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(landUploadjButton)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailIdJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNoJTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(panUploadjButton1)
                    .addComponent(panCardPathJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    private void populateDetails(BankLoanWorkRequest request)
    {
        ageJTextField.setText(String.valueOf(request.getAge()));
        addressJTextField.setText(request.getAddress());
        bankNamejTextField1.setText(request.getBankName());
        loanAmountJTextField.setText(String.valueOf(request.getLoanAmount()));
        loanReasonJTextField1.setText(request.getAgricultureLandAdd());
        annualIncomeJTextField.setText(String.valueOf(request.getAnnualIncome()));
        agricultureLandAddJTextField.setText(request.getAgricultureLandAdd());
        valueOfAgricultureLandJTextField.setText(request.getAgricultureLandValue());
        emailIdJTextField.setText(request.getEmailId());
        phoneNoJTextField1.setText(String.valueOf(request.getPhoneNo()));
        panCardPathJTextField.setText(request.getPancardPath());
        nameJTextField.setText(request.getName());
    }
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void landUploadjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_landUploadjButtonActionPerformed
        // TODO add your handling code here:
        File f = new File(request.getAgricultureLandValue());
        File file = f.getAbsoluteFile();
          // What to do with the file, e.g. display it in a TextArea
          try{
          Desktop.getDesktop().open(file);
          }catch(Exception ex){
              System.out.println("Exception"+ex);
          }
    }//GEN-LAST:event_landUploadjButtonActionPerformed

    private void panUploadjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panUploadjButton1ActionPerformed
        // TODO add your handling code here:
        File f = new File(request.getPancardPath());
        File file = f.getAbsoluteFile();
          // What to do with the file, e.g. display it in a TextArea
          try{
          Desktop.getDesktop().open(file);
          }catch(Exception ex){
              System.out.println("Exception"+ex);
          }
    }//GEN-LAST:event_panUploadjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressJTextField;
    private javax.swing.JTextField ageJTextField;
    private javax.swing.JTextField agricultureLandAddJTextField;
    private javax.swing.JTextField annualIncomeJTextField;
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField bankNamejTextField1;
    private javax.swing.JTextField emailIdJTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton landUploadjButton;
    private javax.swing.JTextField loanAmountJTextField;
    private javax.swing.JTextField loanReasonJTextField1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField panCardPathJTextField;
    private javax.swing.JButton panUploadjButton1;
    private javax.swing.JTextField phoneNoJTextField1;
    private javax.swing.JTextField valueOfAgricultureLandJTextField;
    // End of variables declaration//GEN-END:variables
}