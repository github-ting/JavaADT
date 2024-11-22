/**
 * @author CHUA CHUN YAN
 */

package boundary.programme;

import entity.Programme;

public class ProgrammeManagementUI extends javax.swing.JFrame {

    public ProgrammeManagementUI() {
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

        jlbTutorialGroup3 = new javax.swing.JLabel();
        jbtAddProgramme = new javax.swing.JButton();
        jbtRemoveProgramme = new javax.swing.JButton();
        jbtListTutorialGroupInProgramme = new javax.swing.JButton();
        jbtProgrammeReport = new javax.swing.JButton();
        jbtAddTutorialGroupToProgramme = new javax.swing.JButton();
        jbtRemoveTutorialGroupFromProgramme = new javax.swing.JButton();
        jlbProgrammeTitle = new javax.swing.JLabel();
        jbtAmendProgramme = new javax.swing.JButton();
        jbtListProgramme = new javax.swing.JButton();
        jbtExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jlbTutorialGroup3.setText("Semester :");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Programme");

        jbtAddProgramme.setText("Add Programme");
        jbtAddProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddProgrammeActionPerformed(evt);
            }
        });

        jbtRemoveProgramme.setText("Remove Programme");
        jbtRemoveProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveProgrammeActionPerformed(evt);
            }
        });

        jbtListTutorialGroupInProgramme.setText("List Tutorial Group in Programme");
        jbtListTutorialGroupInProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListTutorialGroupInProgrammeActionPerformed(evt);
            }
        });

        jbtProgrammeReport.setText("Programme Report");
        jbtProgrammeReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtProgrammeReportActionPerformed(evt);
            }
        });

        jbtAddTutorialGroupToProgramme.setText("Add Tutorial Group to Programme");
        jbtAddTutorialGroupToProgramme.setToolTipText("");
        jbtAddTutorialGroupToProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAddTutorialGroupToProgrammeActionPerformed(evt);
            }
        });

        jbtRemoveTutorialGroupFromProgramme.setText("Remove Tutorial Group from Programme");
        jbtRemoveTutorialGroupFromProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveTutorialGroupFromProgrammeActionPerformed(evt);
            }
        });

        jlbProgrammeTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlbProgrammeTitle.setText("Programme Management");

        jbtAmendProgramme.setText("Amend Programme");
        jbtAmendProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAmendProgrammeActionPerformed(evt);
            }
        });

        jbtListProgramme.setText("List Programme");
        jbtListProgramme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtListProgrammeActionPerformed(evt);
            }
        });

        jbtExit.setText("Exit");
        jbtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jlbProgrammeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbtAddProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jbtRemoveProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jbtAmendProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jbtListProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jbtProgrammeReport, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jbtAddTutorialGroupToProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jbtRemoveTutorialGroupFromProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jbtListTutorialGroupInProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jbtExit)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbProgrammeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtAddProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtRemoveProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAmendProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtListProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtProgrammeReport, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtAddTutorialGroupToProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtRemoveTutorialGroupFromProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jbtListTutorialGroupInProgramme, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jbtExit)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtAddProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddProgrammeActionPerformed
        new ProgrammeInputUI(this, false).setVisible(true);
    }//GEN-LAST:event_jbtAddProgrammeActionPerformed

    private void jbtRemoveProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveProgrammeActionPerformed
        // Open a search programme dialog, let user choose a programme and remove that programme
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("Select a programme to remove");
        config.setIsRemovingProgramme(true);

        // Display the search dialog
        new SearchProgrammeUI(this, true, config).setVisible(true);
    }//GEN-LAST:event_jbtRemoveProgrammeActionPerformed

    private void jbtListTutorialGroupInProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListTutorialGroupInProgrammeActionPerformed
        // Open a search programme dialog, let user choose a programme
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("Select a programme");
        config.setIsListingTutorialGroup(true);

        // Display the search dialog
        new SearchProgrammeUI(this, false, config).setVisible(true);
    }//GEN-LAST:event_jbtListTutorialGroupInProgrammeActionPerformed

    private void jbtAddTutorialGroupToProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAddTutorialGroupToProgrammeActionPerformed
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("Select a programme");
        config.setIsAddingTutorialGroup(true);

        // Display the search dialog
        new SearchProgrammeUI(this, true, config).setVisible(true);
    }//GEN-LAST:event_jbtAddTutorialGroupToProgrammeActionPerformed

    private void jbtRemoveTutorialGroupFromProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveTutorialGroupFromProgrammeActionPerformed
        // Open a search programme dialog, let user choose a programme
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("Select a programme");
        config.setIsRemovingTutorialGroup(true);

        // Display the search dialog
        new SearchProgrammeUI(this, true, config).setVisible(true);
    }//GEN-LAST:event_jbtRemoveTutorialGroupFromProgrammeActionPerformed

    private void jbtListProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtListProgrammeActionPerformed
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("All Programme");

        new SearchProgrammeUI(this, false, config).setVisible(true);
    }//GEN-LAST:event_jbtListProgrammeActionPerformed

    private void jbtAmendProgrammeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAmendProgrammeActionPerformed
        // Open a search programme dialog, let user choose a programme to edit it
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("Select a programme to edit");
        config.setIsEditingProgramme(true);

        // Display the search dialog
        new SearchProgrammeUI(this, true, config).setVisible(true);
    }//GEN-LAST:event_jbtAmendProgrammeActionPerformed

    private void jbtProgrammeReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtProgrammeReportActionPerformed
        // Open a search programme dialog, let user choose a programme and generate report for that specific programme
        SearchProgrammeConfig config = new SearchProgrammeConfig();
        config.setTitle("Select a programme for reporting");
        config.setIsGeneratingReport(true);

        // Display the search dialog
        new SearchProgrammeUI(this, true, config).setVisible(true);
    }//GEN-LAST:event_jbtProgrammeReportActionPerformed

    private void jbtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExitActionPerformed
        //close this frame
        this.dispose();
    }//GEN-LAST:event_jbtExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtAddProgramme;
    private javax.swing.JButton jbtAddTutorialGroupToProgramme;
    private javax.swing.JButton jbtAmendProgramme;
    private javax.swing.JButton jbtExit;
    private javax.swing.JButton jbtListProgramme;
    private javax.swing.JButton jbtListTutorialGroupInProgramme;
    private javax.swing.JButton jbtProgrammeReport;
    private javax.swing.JButton jbtRemoveProgramme;
    private javax.swing.JButton jbtRemoveTutorialGroupFromProgramme;
    private javax.swing.JLabel jlbProgrammeTitle;
    private javax.swing.JLabel jlbTutorialGroup3;
    // End of variables declaration//GEN-END:variables
}
