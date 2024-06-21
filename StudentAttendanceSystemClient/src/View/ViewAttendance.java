/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Attendance;
import Model.Classs;
import Model.Student;
import Services.AttendanceServices;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ZIPTECH LTD
 */
public class ViewAttendance extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewAttendance
     */
    public ViewAttendance() {
        initComponents();
        allRetrived();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        allEnrollements = new javax.swing.JTable();
        searchTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        searchType = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel1.setText("Attendance");

        allEnrollements.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "StudentID", "Names", "Class", "Present", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        allEnrollements.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                allEnrollementsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(allEnrollements);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-search-24.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        searchType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student-Id", "Class-id" }));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel7.setText("Search Type:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Icons/icons8-print-24.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(496, 496, 496)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchType, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(searchTxt)
                            .addComponent(jLabel7)
                            .addComponent(searchType))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void allRetrived() {
        DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
        try {
            Registry theReg = LocateRegistry.getRegistry("127.0.0.1", 81);
            AttendanceServices service = (AttendanceServices) theReg.lookup("attendance");
            List<Attendance> allStudents = service.allAttendances();
            tbModel.setRowCount(0);
            for (Attendance study : allStudents) {
                Integer id = study.getId();
                Integer stId = study.getTheStudent().getStudentId();
                String stNames = study.getTheStudent().getNames();
                Integer clId = study.getTheClass().getClassId();
                String clName = study.getTheClass().getName();
                String clDay = study.getTheClass().getDay();
                boolean ispresent = study.isAttendanded();
                Date theDate = study.getDate();
                String clTeacher = study.getTheClass().getTheTeacher().getNames();
                tbModel.addRow(new Object[]{
                    id, stId, stNames, clName, ispresent, theDate});
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void allEnrollementsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_allEnrollementsMouseClicked
//        int selectedRow = allEnrollements.getSelectedRow();
//        DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
        //
        //        searchStudentId.setText(tbModel.getValueAt(selectedRow, 1).toString());
        //        studentName.setText(tbModel.getValueAt(selectedRow, 2).toString());
        //        searchClassId.setText(tbModel.getValueAt(selectedRow, 3).toString());
        //        className.setText(tbModel.getValueAt(selectedRow, 4).toString());
    }//GEN-LAST:event_allEnrollementsMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (searchTxt.getText().trim().isEmpty() || !searchTxt.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(this, "Search not valid\nOnly Search Ids");
        } else {
            try {
                Registry theReg = LocateRegistry.getRegistry("127.0.0.1", 81);
                AttendanceServices service = (AttendanceServices) theReg.lookup("attendance");

                Attendance attd = new Attendance();
                int theId = Integer.parseInt(searchTxt.getText());
                List<Attendance> attObj = null;

                if (searchType.getSelectedIndex() == 0) {
                    Student st = new Student();
                    st.setStudentId(theId);
                    attd.setTheStudent(st);
                    attObj = service.searchAttByStudent(attd);

                } else if (searchType.getSelectedIndex() == 1) {
                    Classs cl = new Classs();
                    cl.setClassId(theId);
                    attd.setTheClass(cl);
                    attObj = service.searchAttByClass(attd);
                }

                if (attObj.size() != 0) {
                    DefaultTableModel tbModel = (DefaultTableModel) allEnrollements.getModel();
                    tbModel.setRowCount(0);

                    for (Attendance study : attObj) {
                        Integer id = study.getId();
                        Integer stId = study.getTheStudent().getStudentId();
                        String stNames = study.getTheStudent().getNames();
                        Integer clId = study.getTheClass().getClassId();
                        String clName = study.getTheClass().getName();
                        String clDay = study.getTheClass().getDay();
                        boolean ispresent = study.isAttendanded();
                        Date theDate = study.getDate();
                        String clTeacher = study.getTheClass().getTheTeacher().getNames();
                        tbModel.addRow(new Object[]{
                            id, stId, stNames, clName, ispresent, theDate});
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No Results");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            allEnrollements.print();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable allEnrollements;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JComboBox<String> searchType;
    // End of variables declaration//GEN-END:variables
}
