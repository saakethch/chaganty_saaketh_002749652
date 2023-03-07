/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LibrarianPanel;

import Business.Branch;
import Business.Business;
import Library.RentalRequest;
import Material.Book;
import Material.Magazine;
import Role.Role;
import UI.MainJFrame;
import UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15512
 */
public class LibrarianJFrame extends javax.swing.JFrame {

    private Business business;
    private Branch branch;
    private UserAccount useraccount;
    DefaultTableModel matTable;
    DefaultTableModel rrTable;
    /**
     * Creates new form SystemAdminJFrame
     */
    public LibrarianJFrame(Business business, Branch branch, UserAccount useraccount) {
        initComponents();
        this.setVisible(true);
        this.branch = branch;
        this.business = business;
        this.useraccount = useraccount;
        branchName.setText(branch.getName());
        librarianName.setText(branch.getLibrary().getLibrarian().getEmp_name());
        
        this.matTable = (DefaultTableModel) materialsTable.getModel();
        this.rrTable = (DefaultTableModel) rentalsTable.getModel();
        populateMaterial();
        populateRR();
    }

    public void populateRR() {
        rrTable.setRowCount(0);
        ArrayList<RentalRequest> rrs = this.branch.getLibrary().getRentalRequests().getRentalRequests();
        System.out.println("size - "+rrs.size());
        if (rrs.size() > 0) {
            for (RentalRequest rr : rrs) {
                Object[] row = new Object[6];
                row[0] = rr.getId();
                row[1] = rr.getPrice();
                row[2] = rr.getMaterial().getName();
                row[3] = rr.getDuration();
                row[4] = rr.getStatus();
                row[5] = rr.getCusId();
                rrTable.addRow(row);
            }
        }
    }
    
//    public void populateDropdown() {
//        itype.removeAllItems();
//        for (String rolename : Role.getAllRoles()) {
//            itype.addItem(rolename);
//        }
//    }
    
    public void populateMaterial() {
        matTable.setRowCount(0);

        ArrayList<Book> books = this.branch.getLibrary().getBookDirectory().getBooks();
        ArrayList<Magazine> mags = this.branch.getLibrary().getMagDiretory().getMagazines();

        if (books.size() > 0) {
            for (Book b : books) {
                Object[] row = new Object[10];
                row[0] = b.getId();
                row[1] = b.getMaterialType();
                row[2] = b.getName();
                row[3] = b.getAuthor();
                row[4] = b.getGenre();
                row[5] = b.getPages();
                row[6] = "-";
                row[7] = "-";
                row[8] = b.getIsAvailable()?"YES":"NO";
                row[9] = b.getRegisteredDate();
                matTable.addRow(row);
            }
        }

        if (mags.size() > 0) {
            for (Magazine m: mags) {
                Object[] row = new Object[10];
                row[0] = m.getId();
                row[1] = m.getMaterialType();
                row[2] = "-";
                row[3] = "-";
                row[4] = "-";
                row[5] = "-";
                row[6] = m.getCompany();
                row[7] = m.getIssueType();
                row[8] = m.getIsAvailable()?"YES":"NO";
                row[9] = m.getRegisteredDate();
                matTable.addRow(row);
            }
        }
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
        backBtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        materialsTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        librarianName = new javax.swing.JLabel();
        branchName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addMag = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        company = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        author = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        pages = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        title = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();
        itype = new javax.swing.JComboBox<>();
        addBook = new javax.swing.JButton();
        rejectRentalReq = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        acceptRentalReq1 = new javax.swing.JButton();
        dateAdded = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        language = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        bindingTypeCombo = new javax.swing.JComboBox<>();
        magName = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        rentalsTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backBtn1.setBackground(new java.awt.Color(51, 255, 255));
        backBtn1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        backBtn1.setText("Log Out");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Penguin Libraries");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Materials");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 80, 20));

        materialsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Material Type", "Title", "Author", "Genre", "Pages", "Company", "Issue Type", "Is Available", "Date Added"
            }
        ));
        jScrollPane2.setViewportView(materialsTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 820, 200));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Date Added");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 110, 20));

        librarianName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        librarianName.setText("Librarian");
        jPanel1.add(librarianName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, 80, 20));

        branchName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        branchName.setText("Branch  ");
        jPanel1.add(branchName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 80, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Branch  ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 70, 20));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Company");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, 70, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Issue Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 70, -1));

        addMag.setBackground(new java.awt.Color(153, 255, 204));
        addMag.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addMag.setText("Add Magazine");
        addMag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMagActionPerformed(evt);
            }
        });
        jPanel1.add(addMag, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 120, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Librarian");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 70, 70, 20));

        company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                companyActionPerformed(evt);
            }
        });
        jPanel1.add(company, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 270, 100, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Author");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, 70, -1));

        author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorActionPerformed(evt);
            }
        });
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 120, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Pages");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 70, -1));

        pages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagesActionPerformed(evt);
            }
        });
        jPanel1.add(pages, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 120, 20));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Add Book");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 70, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("Title");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 40, -1));

        title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleActionPerformed(evt);
            }
        });
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 120, 20));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Genre");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 70, -1));

        genre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genreActionPerformed(evt);
            }
        });
        jPanel1.add(genre, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 120, 20));

        itype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Daily", "Weekly", "Monthly", "Yearly" }));
        jPanel1.add(itype, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 100, -1));

        addBook.setBackground(new java.awt.Color(153, 255, 204));
        addBook.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBook.setText("Add Book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        jPanel1.add(addBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, 30));

        rejectRentalReq.setBackground(new java.awt.Color(255, 153, 153));
        rejectRentalReq.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rejectRentalReq.setText("Reject");
        rejectRentalReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectRentalReqActionPerformed(evt);
            }
        });
        jPanel1.add(rejectRentalReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 80, -1));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Rental Requests");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, -1, -1));

        acceptRentalReq1.setBackground(new java.awt.Color(153, 255, 153));
        acceptRentalReq1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        acceptRentalReq1.setText("Accept");
        acceptRentalReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptRentalReq1ActionPerformed(evt);
            }
        });
        jPanel1.add(acceptRentalReq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));
        jPanel1.add(dateAdded, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Add Magazine");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, 110, 20));

        language.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageActionPerformed(evt);
            }
        });
        jPanel1.add(language, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 120, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("Language");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 70, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Binding");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 300, 70, -1));

        bindingTypeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paper Back", "Hard Cover", "Spiral ", " " }));
        jPanel1.add(bindingTypeCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, -1));

        magName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magNameActionPerformed(evt);
            }
        });
        jPanel1.add(magName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 100, 20));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel19.setText("Name");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 70, -1));

        rentalsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Price", "Material ", "Duration", "Status", "Customer"
            }
        ));
        jScrollPane3.setViewportView(rentalsTable);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 370, 170));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rejectRentalReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectRentalReqActionPerformed
        // TODO add your handling code here:
        int selectedRow = rentalsTable.getSelectedRow();
        String rr_id = (String) rentalsTable.getValueAt(selectedRow, 0);
        String u_id = (String) rentalsTable.getValueAt(selectedRow, 5);

        this.branch.getLibrary().rejectRentalReq(rr_id);
        this.business.rejectedReq(u_id);
        
        JOptionPane.showMessageDialog(null, "Customer Request accepted");
        populateRR();
    }//GEN-LAST:event_rejectRentalReqActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        String titleBook = title.getText();
        Date dateBook = dateAdded.getDate();
        String authorBook = author.getText();
        String genreBook = genre.getText();
        String pagesBook = pages.getText();
        String langBook = language.getText();
        String typeOfBindingBook = (String) bindingTypeCombo.getSelectedItem();

        //create author and genre, add them to respective directory, and return the author or genre
        branch.getLibrary().addToAuthorDirectory(authorBook);
        branch.getLibrary().addToGenreDirectory(genreBook);
        branch.getLibrary().getBookDirectory().addBook(titleBook, dateBook, authorBook, 
                genreBook, pagesBook, langBook, typeOfBindingBook, this.branch.getName());
        JOptionPane.showMessageDialog(null, "Book added");
        populateMaterial();
    }//GEN-LAST:event_addBookActionPerformed

    private void genreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genreActionPerformed

    private void titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleActionPerformed

    private void pagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagesActionPerformed

    private void authorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorActionPerformed

    private void companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_companyActionPerformed

    private void addMagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMagActionPerformed
        // TODO add your handling code here:
        String companyMag = company.getText();
        String issueMag = (String) itype.getSelectedItem();
        String magname = magName.getText();
        Date dateBook = dateAdded.getDate();
        
        //create author and genre, add them to respective directory, and return the author or genre
        branch.getLibrary().getMagDiretory().addMagazine(magname, dateBook,companyMag, issueMag, this.branch.getName());
        JOptionPane.showMessageDialog(null, "Magazine added");
        populateMaterial();
    }//GEN-LAST:event_addMagActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new MainJFrame(business, branch, useraccount);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void acceptRentalReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptRentalReq1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = rentalsTable.getSelectedRow();
        String rr_id = (String) rentalsTable.getValueAt(selectedRow, 0);
        String u_id = (String) rentalsTable.getValueAt(selectedRow, 5);
        this.branch.getLibrary().acceptRentalReq(rr_id);
        this.business.acceptedReq(u_id);
        JOptionPane.showMessageDialog(null, "Customer Request accepted");
        populateRR();
    }//GEN-LAST:event_acceptRentalReq1ActionPerformed

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_languageActionPerformed

    private void magNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_magNameActionPerformed

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
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibrarianJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new SystemAdminJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptRentalReq1;
    private javax.swing.JButton addBook;
    private javax.swing.JButton addMag;
    private javax.swing.JTextField author;
    private javax.swing.JButton backBtn1;
    private javax.swing.JComboBox<String> bindingTypeCombo;
    private javax.swing.JLabel branchName;
    private javax.swing.JTextField company;
    private com.toedter.calendar.JDateChooser dateAdded;
    private javax.swing.JTextField genre;
    private javax.swing.JComboBox<String> itype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField language;
    private javax.swing.JLabel librarianName;
    private javax.swing.JTextField magName;
    private javax.swing.JTable materialsTable;
    private javax.swing.JTextField pages;
    private javax.swing.JButton rejectRentalReq;
    private javax.swing.JTable rentalsTable;
    private javax.swing.JTextField title;
    // End of variables declaration//GEN-END:variables
}
