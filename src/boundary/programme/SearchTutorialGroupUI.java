/**
 * @author CHUA CHUN YAN
 */

package boundary.programme;

import control.ManageProgramme;
import entity.Programme;
import entity.TutorialGroup;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import adt.ListInterface;
import utils.LengthAndIntegerRestrictedDocument;

public class SearchTutorialGroupUI extends javax.swing.JDialog {

    public SearchTutorialGroupUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public SearchTutorialGroupUI(java.awt.Frame parent, boolean modal, String title, boolean isRemovingTutorialGroup, Programme chosenProgramme) {
        super(parent, modal);
        initComponents();

        this.chosenProgramme = chosenProgramme;
        ListInterface<TutorialGroup> tutorialGroupList = chosenProgramme.getTutorialGroup();
        tutorialGroupList.sort("groupNo", "year", "semester");
        initSearchPanel(tutorialGroupList);

        this.setTitle(title);

        if (!isRemovingTutorialGroup) {
            jbtRemoveTutorialGroup.setVisible(false);
            jbtRemoveAllTutorialGroup.setVisible(false);
        }

        jlbNoOfResults.setHorizontalAlignment(SwingConstants.RIGHT);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlbYear = new javax.swing.JLabel();
        jlbGroupNo = new javax.swing.JLabel();
        searchScrollPane = new javax.swing.JScrollPane();
        searchPanel = new javax.swing.JPanel();
        jbtRemoveTutorialGroup = new javax.swing.JButton();
        jlbNoOfResults = new javax.swing.JLabel();
        jlbResultText = new javax.swing.JLabel();
        jcbSortAttribute = new javax.swing.JComboBox<>();
        jlbSortBy = new javax.swing.JLabel();
        jtfGroupNo = new javax.swing.JTextField();
        jbtDescSort = new javax.swing.JButton();
        jtfYear = new javax.swing.JTextField();
        jbtAscSort = new javax.swing.JButton();
        jbtRefresh = new javax.swing.JButton();
        jbtClose = new javax.swing.JButton();
        jbtClearInput = new javax.swing.JButton();
        jtfSemester = new javax.swing.JTextField();
        jlbSemester = new javax.swing.JLabel();
        jtfNoOfStudent = new javax.swing.JTextField();
        jlbNoOfStudent = new javax.swing.JLabel();
        jbtRemoveAllTutorialGroup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlbYear.setText("Year");

        jlbGroupNo.setText("Group No");

        searchScrollPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        searchScrollPane.setHorizontalScrollBar(null);
        searchScrollPane.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        searchScrollPane.setViewportView(null);

        searchPanel.setBackground(new java.awt.Color(255, 255, 255));
        searchPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        searchPanel.setLayout(new java.awt.GridLayout((int)(Math.ceil(((double)ManageProgramme.getProgrammeList().size())/4.0)), 4));
        searchScrollPane.setViewportView(searchPanel);

        jbtRemoveTutorialGroup.setText("Remove");
        jbtRemoveTutorialGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveTutorialGroupActionPerformed(evt);
            }
        });

        jlbNoOfResults.setText("0");
        jlbNoOfResults.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jlbNoOfResults.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jlbResultText.setText("result(s)");

        jcbSortAttribute.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Group No", "Year", "Semester", "No of Student" }));
        jcbSortAttribute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbSortAttributeActionPerformed(evt);
            }
        });

        jlbSortBy.setText("Sort by : ");

        jtfGroupNo.setDocument(new LengthAndIntegerRestrictedDocument(2));
        jtfGroupNo.setNextFocusableComponent(jtfYear);
        jtfGroupNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfGroupNoKeyReleased(evt);
            }
        });

        jbtDescSort.setText("DESC");
        jbtDescSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtDescSortActionPerformed(evt);
            }
        });

        jtfYear.setDocument(new LengthAndIntegerRestrictedDocument(1));
        jtfYear.setNextFocusableComponent(jtfSemester);
        jtfYear.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfYearKeyReleased(evt);
            }
        });

        jbtAscSort.setText("ASC");
        jbtAscSort.setEnabled(false);
        jbtAscSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAscSortActionPerformed(evt);
            }
        });

        jbtRefresh.setText("Refresh");
        jbtRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRefreshActionPerformed(evt);
            }
        });

        jbtClose.setText("Close");
        jbtClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCloseActionPerformed(evt);
            }
        });

        jbtClearInput.setText("Clear");
        jbtClearInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtClearInputActionPerformed(evt);
            }
        });

        jtfSemester.setDocument(new LengthAndIntegerRestrictedDocument(2));
        jtfSemester.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSemesterKeyReleased(evt);
            }
        });

        jlbSemester.setText("Semester");

        jtfNoOfStudent.setDocument(new LengthAndIntegerRestrictedDocument(3));
        jtfNoOfStudent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfNoOfStudentKeyReleased(evt);
            }
        });

        jlbNoOfStudent.setText("No of Student");

        jbtRemoveAllTutorialGroup.setText("Remove All");
        jbtRemoveAllTutorialGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtRemoveAllTutorialGroupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(searchScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jlbNoOfResults, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jlbResultText, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbtRefresh)
                        .addGap(31, 31, 31)
                        .addComponent(jlbSortBy, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jcbSortAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtAscSort)
                        .addGap(6, 6, 6)
                        .addComponent(jbtDescSort, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                        .addComponent(jbtRemoveAllTutorialGroup)
                        .addGap(12, 12, 12)
                        .addComponent(jbtRemoveTutorialGroup)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtClose)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbGroupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jtfGroupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jlbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jtfSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74)
                                .addComponent(jlbNoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jtfNoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbtClearInput)
                        .addGap(15, 15, 15))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jlbGroupNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jtfGroupNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jlbSemester, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jtfSemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfNoOfStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlbYear)
                                    .addComponent(jlbNoOfStudent)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jbtClearInput)))
                .addGap(18, 18, 18)
                .addComponent(searchScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbNoOfResults)
                    .addComponent(jlbResultText))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtRefresh)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jlbSortBy))
                    .addComponent(jcbSortAttribute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtAscSort)
                    .addComponent(jbtDescSort)
                    .addComponent(jbtRemoveAllTutorialGroup)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtRemoveTutorialGroup)
                        .addComponent(jbtClose)))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtRemoveTutorialGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveTutorialGroupActionPerformed
        TutorialGroup chosenTutorialGroup = getChosenTutorialGroup();

        // Check if user selected a tutorial group
        if (chosenTutorialGroup == null) {
            JOptionPane.showMessageDialog(this, "Please select a tutorial group!");
            return;
        }

        // Ask for confirmation
        int choice = JOptionPane.showConfirmDialog(this, "Confirm?", "Removing Tutorial Group", JOptionPane.YES_NO_OPTION);

        if (choice != JOptionPane.YES_OPTION) {
            return;
        }

        if (!ManageProgramme.removeTutorialGroupFromProgramme(chosenTutorialGroup, chosenProgramme)) {
            JOptionPane.showMessageDialog(this, "Invalid Programme!");
        } else {
            showSearchResult();
            JOptionPane.showMessageDialog(this, "Removed success!");
        }
    }//GEN-LAST:event_jbtRemoveTutorialGroupActionPerformed

    private void jcbSortAttributeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbSortAttributeActionPerformed
        // Sort result based on attribute when the combo box is changed
        String attributeName = (String) jcbSortAttribute.getSelectedItem();
        ListInterface<TutorialGroup> tutorialGroupList = chosenProgramme.getTutorialGroup();
        
        switch (attributeName) {
            case "Group No" ->
                tutorialGroupList.sort("groupNo", "year", "semester");
            case "Year" ->
                tutorialGroupList.sort("year", "groupNo", "semester");
            case "Semester" ->
                tutorialGroupList.sort("semester", "groupNo", "year");
            case "No of Student" ->
                tutorialGroupList.sort("getNoOfStudent", "groupNo", "year", "semester");
        }

        // Check whether is in descending order
        if (!jbtDescSort.isEnabled()) {
            tutorialGroupList.reverse();
        }

        showSearchResult();
    }//GEN-LAST:event_jcbSortAttributeActionPerformed

    private void jtfGroupNoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfGroupNoKeyReleased
        showSearchResult();
    }//GEN-LAST:event_jtfGroupNoKeyReleased

    private void jbtDescSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtDescSortActionPerformed
        chosenProgramme.getTutorialGroup().reverse();
        filteredTutorialGroup.reverse();

        jbtAscSort.setEnabled(true);
        jbtDescSort.setEnabled(false);

        initSearchPanel(filteredTutorialGroup);
    }//GEN-LAST:event_jbtDescSortActionPerformed

    private void jtfYearKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfYearKeyReleased
        showSearchResult();
    }//GEN-LAST:event_jtfYearKeyReleased

    private void jbtAscSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAscSortActionPerformed
        chosenProgramme.getTutorialGroup().reverse();
        filteredTutorialGroup.reverse();

        jbtAscSort.setEnabled(false);
        jbtDescSort.setEnabled(true);

        initSearchPanel(filteredTutorialGroup);
    }//GEN-LAST:event_jbtAscSortActionPerformed

    private void jbtRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRefreshActionPerformed
        showSearchResult();
    }//GEN-LAST:event_jbtRefreshActionPerformed

    private void jbtCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCloseActionPerformed
        chosenLabel = null;
        this.dispose();
    }//GEN-LAST:event_jbtCloseActionPerformed

    private void jbtClearInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtClearInputActionPerformed
        clearInput();

        showSearchResult();
    }//GEN-LAST:event_jbtClearInputActionPerformed

    private void jtfSemesterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSemesterKeyReleased
        showSearchResult();
    }//GEN-LAST:event_jtfSemesterKeyReleased

    private void jtfNoOfStudentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfNoOfStudentKeyReleased
        showSearchResult();
    }//GEN-LAST:event_jtfNoOfStudentKeyReleased

    private void jbtRemoveAllTutorialGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtRemoveAllTutorialGroupActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Confirm?", "Removing All Tutorial Group", JOptionPane.YES_NO_OPTION);

        if (choice != JOptionPane.YES_OPTION) {
            return;
        }

        ManageProgramme.removeAllTutorialGroupFromProgramme(chosenProgramme);
        initSearchPanel(chosenProgramme.getTutorialGroup());
    }//GEN-LAST:event_jbtRemoveAllTutorialGroupActionPerformed

    private void showSearchResult() {
        int groupNo = jtfGroupNo.getText().length() == 0 ? -1 : Integer.parseInt(jtfGroupNo.getText());
        int year = jtfYear.getText().length() == 0 ? -1 : Integer.parseInt(jtfYear.getText());
        int semester = jtfSemester.getText().length() == 0 ? -1 : Integer.parseInt(jtfSemester.getText());
        int noOfStudent = jtfNoOfStudent.getText().length() == 0 ? -1 : Integer.parseInt(jtfNoOfStudent.getText());

        ListInterface<TutorialGroup> filteredTutorialGroup = ManageProgramme.filterGroup(groupNo, year, semester, noOfStudent, chosenProgramme);

        initSearchPanel(filteredTutorialGroup);
    }

    private void initSearchPanel(ListInterface<TutorialGroup> tutorialGroupList) {
        searchPanel.removeAll();
        searchPanel.setLayout(new GridLayout((int) (Math.ceil(((double) tutorialGroupList.size()) / 4.0)), 4));
        filteredTutorialGroup = tutorialGroupList;

        tutorialGroupLabels = new JLabel[tutorialGroupList.size()];
        JLabel label;

        final String html = "<html><body style='width: 150px; padding-left: 5px'>%1s";

        for (int i = 0; i < tutorialGroupList.size(); i++) {
            label = new JLabel(String.format(html, tutorialGroupList.get(i).toString().replaceAll("\n", "<br>")));
            label.addMouseListener(programmeLabelMouseListener);
            label.setBorder(unchosenBorder);

            tutorialGroupLabels[i] = label;
            searchPanel.add(label);
        }

        searchPanel.revalidate();
        searchPanel.repaint();

        jlbNoOfResults.setText(tutorialGroupList.size() + "");
    }

    // Find which tutorial is clicked and selected
    public TutorialGroup getChosenTutorialGroup() {
        if (chosenLabel == null) {
            return null;
        }

        // Clicked label is compared to find the index of matching tutorial group
        for (int i = 0; i < tutorialGroupLabels.length; i++) {
            if (chosenLabel == tutorialGroupLabels[i]) {
                return filteredTutorialGroup.get(i);
            }
        }

        return null;
    }

    private void clearInput() {
        jtfGroupNo.setText("");
        jtfYear.setText("");
        jtfSemester.setText("");
        jtfNoOfStudent.setText("");
    }

    private class LabelMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // Change the label's border when it is clicked
            if (chosenLabel != null) {
                chosenLabel.setBorder(unchosenBorder);
            }

            chosenLabel = ((JLabel) e.getSource());
            chosenLabel.setBorder(chosenBorder);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
        }

        @Override
        public void mouseExited(MouseEvent e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtAscSort;
    private javax.swing.JButton jbtClearInput;
    private javax.swing.JButton jbtClose;
    private javax.swing.JButton jbtDescSort;
    private javax.swing.JButton jbtRefresh;
    private javax.swing.JButton jbtRemoveAllTutorialGroup;
    private javax.swing.JButton jbtRemoveTutorialGroup;
    private javax.swing.JComboBox<String> jcbSortAttribute;
    private javax.swing.JLabel jlbGroupNo;
    private javax.swing.JLabel jlbNoOfResults;
    private javax.swing.JLabel jlbNoOfStudent;
    private javax.swing.JLabel jlbResultText;
    private javax.swing.JLabel jlbSemester;
    private javax.swing.JLabel jlbSortBy;
    private javax.swing.JLabel jlbYear;
    private javax.swing.JTextField jtfGroupNo;
    private javax.swing.JTextField jtfNoOfStudent;
    private javax.swing.JTextField jtfSemester;
    private javax.swing.JTextField jtfYear;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JScrollPane searchScrollPane;
    // End of variables declaration//GEN-END:variables

    private javax.swing.JLabel[] tutorialGroupLabels;
    private javax.swing.JLabel chosenLabel;
    private MouseListener programmeLabelMouseListener = new LabelMouseListener();
    private Border unchosenBorder = BorderFactory.createLineBorder(Color.BLACK, 1);
    private Border chosenBorder = BorderFactory.createLineBorder(Color.RED, 2);
    private Programme chosenProgramme;

    private ListInterface<TutorialGroup> filteredTutorialGroup;
}