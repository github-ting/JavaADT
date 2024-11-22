/**
 *
 * @author NG YOO SIN
 */
package boundary.tutorialGroup;

public class TutorialGroup extends javax.swing.JFrame {


    /**
     * Creates new form TutorialGroup
     */
    public TutorialGroup() {
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

        jLabel1 = new javax.swing.JLabel();
        jbtAddStudent = new javax.swing.JButton();
        jbtRemoveStd = new javax.swing.JButton();
        jbtModifyTutGrp = new javax.swing.JButton();
        jbtSearchStd = new javax.swing.JButton();
        jbtTutGrpList = new javax.swing.JButton();
        jbtTutReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tutorial Group Management");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tutorial Group Management");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jbtAddStudent.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jbtAddStudent.setText("Add Student into Tutorial Group");
        jbtAddStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddStudentActionPerformed(evt);
            }
        });

        jbtRemoveStd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jbtRemoveStd.setText("Remove Student From Tutorial Group");
        jbtRemoveStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveStdActionPerformed(evt);
            }
        });

        jbtModifyTutGrp.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jbtModifyTutGrp.setText("Modify Tutorial Group' s Student");
        jbtModifyTutGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtModifyTutGrpActionPerformed(evt);
            }
        });

        jbtSearchStd.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jbtSearchStd.setText("Search Student");
        jbtSearchStd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSearchStdActionPerformed(evt);
            }
        });

        jbtTutGrpList.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jbtTutGrpList.setText("Display All Tutorial Group's Student");
        jbtTutGrpList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTutGrpListActionPerformed(evt);
            }
        });

        jbtTutReport.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        jbtTutReport.setText("Generate Report");
        jbtTutReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtTutReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(329, 329, 329))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jbtAddStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtModifyTutGrp, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE))
                    .addComponent(jbtTutReport, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtRemoveStd, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                    .addComponent(jbtSearchStd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtTutGrpList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtAddStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtRemoveStd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtModifyTutGrp, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtSearchStd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtTutGrpList, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtTutReport, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddStudentActionPerformed
        AddStdToGrp addStd = new AddStdToGrp();
        addStd.setVisible(true);
        this.dispose(); // to close the current JFrame
    }//GEN-LAST:event_jbtAddStudentActionPerformed

    private void jbtRemoveStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveStdActionPerformed
        RemoveStd removeStd = new RemoveStd();
        removeStd.setVisible(true);
        this.dispose(); // to close the current JFrame
    }//GEN-LAST:event_jbtRemoveStdActionPerformed

    private void jbtModifyTutGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtModifyTutGrpActionPerformed
        ModifyGrp modifyGrp = new ModifyGrp();
        modifyGrp.setVisible(true);
        this.dispose(); // to close the current JFrame
    }//GEN-LAST:event_jbtModifyTutGrpActionPerformed

    private void jbtSearchStdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSearchStdActionPerformed
        SearchStd searchStd = new SearchStd();
        searchStd.setVisible(true);
        this.dispose(); // to close the current JFrame
    }//GEN-LAST:event_jbtSearchStdActionPerformed

    private void jbtTutGrpListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTutGrpListActionPerformed
        DisplayTutorialList displayTutList = new DisplayTutorialList();
        displayTutList.setVisible(true);
        this.dispose(); // to close the current JFrame
    }//GEN-LAST:event_jbtTutGrpListActionPerformed

    private void jbtTutReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtTutReportActionPerformed
        ReportTutorial reportTutorial = new  ReportTutorial();
        reportTutorial.setVisible(true);
        this.dispose(); // close the current frame
    }//GEN-LAST:event_jbtTutReportActionPerformed


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
            java.util.logging.Logger.getLogger(TutorialGroup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TutorialGroup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TutorialGroup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TutorialGroup.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TutorialGroup().setVisible(true);
            }
        });   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbtAddStudent;
    private javax.swing.JButton jbtModifyTutGrp;
    private javax.swing.JButton jbtRemoveStd;
    private javax.swing.JButton jbtSearchStd;
    private javax.swing.JButton jbtTutGrpList;
    private javax.swing.JButton jbtTutReport;
    // End of variables declaration//GEN-END:variables

}
