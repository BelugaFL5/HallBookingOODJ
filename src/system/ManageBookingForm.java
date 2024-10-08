/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIOW HAN BIN
 */
public class ManageBookingForm extends javax.swing.JFrame {

    /**
     * Creates new form ManagebookingForm
     */
    public ManageBookingForm() {
        initComponents();
         loadBookingData();
        loginForm login = new loginForm();
            usernameLbl.setText(login.getusername());
    }
  // Load booking data from file into the table
    private void loadBookingData() {
        DefaultTableModel model = (DefaultTableModel) bookingTbl.getModel();
        model.setRowCount(0); // Clear existing rows
        try (BufferedReader br = new BufferedReader(new FileReader("booking.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] bookingDetails = line.split(";");
                model.addRow(new Object[]{bookingDetails[0], bookingDetails[1], bookingDetails[2], bookingDetails[3], bookingDetails[4], bookingDetails[5], bookingDetails[6], bookingDetails[7], bookingDetails[8]});
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error loading booking data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

   
    public String getSelectedbookingID() {
        int selectedRow = bookingTbl.getSelectedRow();
        if (selectedRow != -1) {
            return (String) bookingTbl.getValueAt(selectedRow, 0); // Get bookingID from the first column
        }
        return null; // Return null if no row is selected
    }
    // Getter to retrieve the bookingname of the selected row
    public String getSelectedbookingname() {
        int selectedRow = bookingTbl.getSelectedRow();
        if (selectedRow != -1) {
            return (String) bookingTbl.getValueAt(selectedRow, 1); // Get bookingname from the second column
        }
        return null; // Return null if no row is selected
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogout = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookingTbl = new javax.swing.JTable();
        searchBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        searchTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        showUpcomingBookingbtn = new javax.swing.JToggleButton();
        showPastBookingbtn = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogout.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 220, 26));
        jPanel1.setForeground(new java.awt.Color(255, 102, 51));

        jLabel1.setBackground(new java.awt.Color(255, 220, 26));
        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 48)); // NOI18N
        jLabel1.setText("View Booking");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setText("Welcome to Booking Details");

        usernameLbl.setText("Hi");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(usernameLbl)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        bookingTbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookingTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "BookingID", "username", "Hall Type", "Booking Date", "Start Time", "End Time", "Total Cost", "Status", "Remarks"
            }
        ));
        jScrollPane1.setViewportView(bookingTbl);

        searchBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Search by bookingID, username, hallType, bookingDate, or status");

        showUpcomingBookingbtn.setText("Show Upcoming Booking");
        showUpcomingBookingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showUpcomingBookingbtnActionPerformed(evt);
            }
        });

        showPastBookingbtn.setText("Show Past Booking");
        showPastBookingbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPastBookingbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(searchBtn)
                .addGap(34, 34, 34)
                .addComponent(clearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(showUpcomingBookingbtn)
                .addGap(176, 176, 176)
                .addComponent(showPastBookingbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showUpcomingBookingbtn)
                    .addComponent(showPastBookingbtn))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        new loginForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        new adminDashboardForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        String search = searchTxt.getText().trim(); // Get the input from the search field
    if (search.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a search term.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    DefaultTableModel model = (DefaultTableModel) bookingTbl.getModel();
    model.setRowCount(0); // Clear current table data

    try (BufferedReader br = new BufferedReader(new FileReader("booking.txt"))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] bookingDetails = line.split(";");

            // Extend the search to additional fields (hallType, status, etc.)
            if (bookingDetails[0].contains(search) || bookingDetails[1].contains(search) || 
                bookingDetails[2].contains(search) || bookingDetails[3].contains(search) || 
                bookingDetails[7].contains(search)) { // Search by bookingID, username, hallType, bookingDate, or status
                
                model.addRow(new Object[]{bookingDetails[0], bookingDetails[1], bookingDetails[2], bookingDetails[3], bookingDetails[4], bookingDetails[5], bookingDetails[6], bookingDetails[7], bookingDetails[8]});
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error searching bookings: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_searchBtnActionPerformed

private void showUpcomingBookings() {
    DefaultTableModel model = (DefaultTableModel) bookingTbl.getModel();
    model.setRowCount(0); // Clear current table data
    try (BufferedReader br = new BufferedReader(new FileReader("booking.txt"))) {
        String line;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        while ((line = br.readLine()) != null) {
            String[] bookingDetails = line.split(";");
            Date bookingDate = sdf.parse(bookingDetails[3]); // Parse the booking date
            if (bookingDate.after(currentDate)) { // Show only upcoming bookings
                model.addRow(new Object[]{bookingDetails[0], bookingDetails[1], bookingDetails[2], bookingDetails[3], bookingDetails[4], bookingDetails[5], bookingDetails[6], bookingDetails[7], bookingDetails[8]});
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error filtering upcoming bookings: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

private void showPastBookings() {
    DefaultTableModel model = (DefaultTableModel) bookingTbl.getModel();
    model.setRowCount(0); // Clear current table data
    try (BufferedReader br = new BufferedReader(new FileReader("booking.txt"))) {
        String line;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        while ((line = br.readLine()) != null) {
            String[] bookingDetails = line.split(";");
            Date bookingDate = sdf.parse(bookingDetails[3]); // Parse the booking date
            if (bookingDate.before(currentDate)) { // Show only past bookings
                model.addRow(new Object[]{bookingDetails[0], bookingDetails[1], bookingDetails[2], bookingDetails[3], bookingDetails[4], bookingDetails[5], bookingDetails[6], bookingDetails[7], bookingDetails[8]});
            }
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error filtering past bookings: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
            searchTxt.setText("");
            // Reload the table to show all customer staff (without any filter)
    loadBookingData();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void showPastBookingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPastBookingbtnActionPerformed
        // TODO add your handling code here:
        showPastBookings();
    }//GEN-LAST:event_showPastBookingbtnActionPerformed

    private void showUpcomingBookingbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showUpcomingBookingbtnActionPerformed
        // TODO add your handling code here:
        showUpcomingBookings();
    }//GEN-LAST:event_showUpcomingBookingbtnActionPerformed

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
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageBookingForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageBookingForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookingTbl;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTxt;
    private javax.swing.JToggleButton showPastBookingbtn;
    private javax.swing.JToggleButton showUpcomingBookingbtn;
    private javax.swing.JLabel usernameLbl;
    // End of variables declaration//GEN-END:variables
}
