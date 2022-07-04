/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hrms;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import hrms.HRMS.ShadowPane;
import static hrms.HRMS.getConnection;
import static hrms.Home.selectedProf;
import java.awt.Font;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author AYSHA AQUINO
 */
public class AddArchive extends javax.swing.JDialog {

    /**
     * Creates new form NewJFrame
     */
    
    public AddArchive(java.awt.Frame parent, boolean modal) {
        setModalityType(ModalityType.APPLICATION_MODAL);
        //setContentPane(new ShadowPane());
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JButton();
        arcField = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));
        jPanel1.setForeground(new java.awt.Color(255, 51, 0));

        jLabel2.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ARCHIVE EMPLOYEE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        close.setBackground(new java.awt.Color(0, 51, 204));
        close.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("CLOSE");
        close.setFocusPainted(false);
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        arcField.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        arcField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        arcField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 204), 2, true));
        arcField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                arcFieldieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                arcFieldFocusLost(evt);
            }
        });
        arcField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arcFieldieldActionPerformed(evt);
            }
        });

        ok.setBackground(new java.awt.Color(0, 51, 204));
        ok.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        ok.setForeground(new java.awt.Color(255, 255, 255));
        ok.setText("OK");
        ok.setFocusPainted(false);
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Input Employee's ID Number");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addComponent(arcField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(arcField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(close)
                    .addComponent(ok))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        setSize(new java.awt.Dimension(307, 177));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        HRMS a = new HRMS();
//        //JOptionPane.showMessageDialog(null, selectedProf);
//        try {
//            PreparedStatement ps = getConnection().prepareStatement("select * from employees where id = ?");
//            ps.setString(1, selectedProf);
//            ResultSet rs = ps.executeQuery();
//            String program = null;
//            
//            while (rs.next()) {
//                String nm = rs.getString("lastname")+", "+rs.getString("firstname")+" "+rs.getString("middlename");
//                if (rs.getInt("program") == 0)
//                    program = "Bachelor of Science in Chemical \nEngineering";
//                else if (rs.getInt("program") == 1)
//                    program = "Bachelor of Science in Civil \nEngineering";    
//                else if (rs.getInt("program") == 2)
//                    program = "Bachelor of Science in Computer \nEngineering";        
//                else if (rs.getInt("program") == 3)
//                    program = "Bachelor of Science in Electrical \nEngineering";
//                else if (rs.getInt("program") == 4)
//                    program = "Bachelor of Science in Electronics and \nCommunication Engineering";
//                else if (rs.getInt("program") == 5)
//                    program = "Bachelor of Science in Mechanical \nEngineering";
//                
//                name.setText(nm);
//                idno.setText(rs.getString("id"));
//                bday.setText(rs.getString("bday"));
//                gend.setText(rs.getString("gender"));
//                email.setText(rs.getString("email"));
//                phone.setText(rs.getString("phone"));
//                prg.append(program);
//                absent.setText(rs.getString("absent"));
//                late.setText(rs.getString("late"));
//                pic.setIcon(a.resizer(rs.getString("photo") , pic));
//            }
//        }
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
    }//GEN-LAST:event_formWindowOpened

    private void arcFieldieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arcFieldieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arcFieldieldActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        try { 
            String name = null;
            String fname = null;
            String lname = null;
            String mname = null;
            String gend = null;
            int id = 0;
            int prog = 0;
            
            PreparedStatement find = getConnection().prepareStatement("select * from employees where id = ?");
            find.setString(1, arcField.getText());
            ResultSet rs = find.executeQuery();
                
            while(rs.next()) {
                name = rs.getString("lastname")+", "+rs.getString("firstname")+" "+rs.getString("middlename");
                fname = rs.getString("firstname");
                lname = rs.getString("lastname");
                mname = rs.getString("middlename");
                id = rs.getInt("id");
                gend = rs.getString("gender");
                prog = rs.getInt("program");
            }
            
            String insert = "INSERT INTO archive(lastname,firstname,middlename,gender,program) "
                            + "VALUES (?,?,?,?,?)";
            PreparedStatement ins = getConnection().prepareStatement(insert);
            ins.setString(1, lname);
            ins.setString(2, fname);
            ins.setString(3, mname);
            ins.setString(4, gend);
            ins.setInt(5, prog);
            
            PreparedStatement del = getConnection().prepareStatement("DELETE FROM employees WHERE id = ?");
            del.setString(1, arcField.getText());
            
            if (id != 0) {
                String label = "<html>Are you sure you want to archive <br/><b>" + name 
                        + "</b> with ID No.  <b>" + id + "</b> ? </html>";
                JLabel mess = new JLabel(label);
                mess.setFont(new Font ("Corbel", Font.PLAIN,16));
                
                Object[] opt = {"Yes", "No"};
                int n = JOptionPane.showOptionDialog(new JFrame(), mess, "",
                        JOptionPane.YES_NO_CANCEL_OPTION, 
                        JOptionPane.QUESTION_MESSAGE, null, opt, opt[1]);

                if (n==0) {
                    try {
                        ins.executeUpdate();
                        del.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Archived Successfully!");
                    }
                    catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }

                if (n==1) {

                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Employee not found on database!");
            }
            
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_okActionPerformed

    private void arcFieldieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arcFieldieldFocusGained
       
    }//GEN-LAST:event_arcFieldieldFocusGained

    private void arcFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_arcFieldFocusLost
        
    }//GEN-LAST:event_arcFieldFocusLost

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
            java.util.logging.Logger.getLogger(AddArchive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddArchive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddArchive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddArchive.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                AddArchive dialog = new AddArchive(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing (WindowEvent e) {
                        System.exit(0);
                    }
                });
            dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arcField;
    private static javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}