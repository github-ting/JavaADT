/**
 *
 * @author NG YOO SIN
 */
package boundary.tutorialGroup;

import adt.ListInterface;
import control.ManageTutorial;
import javax.swing.JOptionPane;
import entity.*;
import javax.swing.table.DefaultTableModel;

public class RemoveStd extends javax.swing.JFrame {

    /**
     * Creates new form RemoveStd
     */
    public RemoveStd() {
        initComponents();
        removeId.grabFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        removeId = new javax.swing.JTextField();
        jbtBacktoTut = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        removeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Remove Studnet From Tutorial Group");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Remove Student From Tutorial Group");
        jLabel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel11.setText("Enter Student ID : ");

        removeId.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        removeId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                removeIdKeyReleased(evt);
            }
        });

        jbtBacktoTut.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jbtBacktoTut.setText("Back to Tutorial Group Menu");
        jbtBacktoTut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtBacktoTutActionPerformed(evt);
            }
        });

        removeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tutorial Group", "Student Name", "Student ID"
            }
        ));
        removeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(removeTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(removeId, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(jbtBacktoTut)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeId, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jbtBacktoTut, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtBacktoTutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtBacktoTutActionPerformed
        this.setVisible(false);
        new TutorialGroup().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbtBacktoTutActionPerformed

    private void removeIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_removeIdKeyReleased
        DefaultTableModel table = (DefaultTableModel) removeTable.getModel();
        table.setRowCount(0);

        ManageTutorial mt = new ManageTutorial();
        if (!removeId.getText().equals("")) { 
            if (!removeId.getText().matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Student ID must be integer!");
                removeId.setText("");
            }
            ListInterface<Student> student = mt.searchContains(Integer.parseInt((String) removeId.getText())); 
            for (int i = 0; i < student.size(); i++) { 
                ListInterface<Integer> grp = mt.grpSearch(student.get(i).getStdID()); 

                for (int j = 0; j < grp.size(); j++) {
                    String data[] = {"" + grp.get(j), "" + student.get(i).getStdName(), "" + student.get(i).getStdID()};
                    table.addRow(data);
                }
            }
        }
    }//GEN-LAST:event_removeIdKeyReleased

    private void removeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) removeTable.getModel();
        ManageTutorial mt = new ManageTutorial();
        int row = removeTable.getSelectedRow();
        String stdId = (String) model.getValueAt(row, 2);
        String stdName = (String) model.getValueAt(row, 1);
        String grpNo = (String) model.getValueAt(row, 0);
        Student std = new Student(Integer.parseInt(stdId), stdName);
        int choice = JOptionPane.showConfirmDialog(this, "Are you sure ?", "Delete?", JOptionPane.YES_NO_OPTION);
        if (choice == JOptionPane.YES_OPTION) {
            ManageTutorial.removeStudentFromTutorialGroup(std, Integer.parseInt(grpNo));
            JOptionPane.showMessageDialog(this, "Student ID " + stdId + " is deleted from tutorial group!");
            model.removeRow(row);
            if (model.getRowCount() == 0) {
                removeId.setText("");
            }
        }
        removeId.grabFocus();
    }//GEN-LAST:event_removeTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtBacktoTut;
    private javax.swing.JTextField removeId;
    private javax.swing.JTable removeTable;
    // End of variables declaration//GEN-END:variables
}
