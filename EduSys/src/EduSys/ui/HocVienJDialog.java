/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.ui;

import EduSys.DAO.ChuyenDeDAO;
import EduSys.DAO.HocVienDAO;
import EduSys.DAO.KhoaHocDAO;
import EduSys.DAO.NguoiHocDAO;
import EduSys.entity.ChuyenDe;
import EduSys.entity.HocVien;
import EduSys.entity.KhoaHoc;
import EduSys.entity.NguoiHoc;
import EduSys.utils.Auth;
import EduSys.utils.ExportExcel;
import EduSys.utils.MsgBox;
import EduSys.utils.XImage;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author DMX
 */
public class HocVienJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HocVienJDialog
     */
    public HocVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblKHHocVien = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        jPanel16 = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        tbpHocVien = new javax.swing.JTabbedPane();
        pnlHocVien = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnXoaKhoiKH = new javax.swing.JButton();
        btnCapNhatDiemKH = new javax.swing.JButton();
        btnExportExcel = new javax.swing.JButton();
        pnlNguoihoc = new javax.swing.JPanel();
        pnlTK = new javax.swing.JPanel();
        txtTimKiemHV = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblNguoiHocHV = new javax.swing.JTable();
        btnThemVaoKH = new javax.swing.JButton();
        btnExportNH = new javax.swing.JButton();
        lblCDHocVien = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản lý học viên");

        lblKHHocVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblKHHocVien.setText("KHÓA HỌC");

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lập trình Java cơ bản" }));
        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, 0, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        cboKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java1 (2020/02/02)" }));
        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, 0, 276, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "MÃ HV", "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane9.setViewportView(tblHocVien);

        btnXoaKhoiKH.setText("Xóa khỏi khóa học");
        btnXoaKhoiKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaKhoiKHActionPerformed(evt);
            }
        });

        btnCapNhatDiemKH.setText("Cập nhật điểm");
        btnCapNhatDiemKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatDiemKHActionPerformed(evt);
            }
        });

        btnExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportExcel.setText("Xuất Excel");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHocVienLayout = new javax.swing.GroupLayout(pnlHocVien);
        pnlHocVien.setLayout(pnlHocVienLayout);
        pnlHocVienLayout.setHorizontalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnExportExcel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaKhoiKH, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCapNhatDiemKH, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        pnlHocVienLayout.setVerticalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnXoaKhoiKH)
                    .addComponent(btnCapNhatDiemKH)
                    .addComponent(btnExportExcel))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbpHocVien.addTab("HỌC VIÊN", pnlHocVien);

        pnlTK.setBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm    "));

        txtTimKiemHV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTimKiemHVMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout pnlTKLayout = new javax.swing.GroupLayout(pnlTK);
        pnlTK.setLayout(pnlTKLayout);
        pnlTKLayout.setHorizontalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemHV)
                .addContainerGap())
        );
        pnlTKLayout.setVerticalGroup(
            pnlTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTKLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiemHV, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tblNguoiHocHV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL"
            }
        ));
        jScrollPane8.setViewportView(tblNguoiHocHV);

        btnThemVaoKH.setText("Thêm vào khóa học");
        btnThemVaoKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoKHActionPerformed(evt);
            }
        });

        btnExportNH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportNH.setText("Xuất Excel");
        btnExportNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportNHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoihocLayout = new javax.swing.GroupLayout(pnlNguoihoc);
        pnlNguoihoc.setLayout(pnlNguoihocLayout);
        pnlNguoihocLayout.setHorizontalGroup(
            pnlNguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlNguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlNguoihocLayout.createSequentialGroup()
                        .addGroup(pnlNguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlTK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(pnlNguoihocLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnExportNH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThemVaoKH, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))))
        );
        pnlNguoihocLayout.setVerticalGroup(
            pnlNguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlNguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVaoKH)
                    .addComponent(btnExportNH))
                .addContainerGap())
        );

        tbpHocVien.addTab("NGƯỜI HỌC", pnlNguoihoc);

        lblCDHocVien.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCDHocVien.setText("CHUYÊN ĐỀ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tbpHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCDHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblKHHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCDHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblKHHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tbpHocVien)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        // TODO add your handling code here:
        this.fillComboBoxKhoaHoc();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        // TODO add your handling code here:
        this.fillTableHocVien();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void btnXoaKhoiKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaKhoiKHActionPerformed
        // TODO add your handling code here:
        this.removeHocVien();
    }//GEN-LAST:event_btnXoaKhoiKHActionPerformed

    private void btnCapNhatDiemKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatDiemKHActionPerformed
        // TODO add your handling code here:
        this.updateDiem();
    }//GEN-LAST:event_btnCapNhatDiemKHActionPerformed

    private void btnThemVaoKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoKHActionPerformed
        // TODO add your handling code here:
        this.addHocVien();
    }//GEN-LAST:event_btnThemVaoKHActionPerformed

    private void txtTimKiemHVMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimKiemHVMouseReleased
        // TODO add your handling code here:
        this.fillTableNguoiHoc();
    }//GEN-LAST:event_txtTimKiemHVMouseReleased

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblHocVien);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportExcelActionPerformed

    private void btnExportNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportNHActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblNguoiHocHV);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportNHActionPerformed

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
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HocVienJDialog dialog = new HocVienJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatDiemKH;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnExportNH;
    private javax.swing.JButton btnThemVaoKH;
    private javax.swing.JButton btnXoaKhoiKH;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCDHocVien;
    private javax.swing.JLabel lblKHHocVien;
    private javax.swing.JPanel pnlHocVien;
    private javax.swing.JPanel pnlNguoihoc;
    private javax.swing.JPanel pnlTK;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHocHV;
    private javax.swing.JTabbedPane tbpHocVien;
    private javax.swing.JTextField txtTimKiemHV;
    // End of variables declaration//GEN-END:variables

    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();
    HocVienDAO hvdao = new HocVienDAO();

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());

        this.fillComboBoxChuyenDe();

        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);// Căn giữa cho cột

        TableColumnModel model = tblHocVien.getColumnModel();
        model.getColumn(0).setMaxWidth(40);// chỉnh dộ rộng của ô
        model.getColumn(1).setMaxWidth(50);
        model.getColumn(2).setMaxWidth(80);
        model.getColumn(4).setMaxWidth(50);

        model.getColumn(0).setCellRenderer(render);
        model.getColumn(1).setCellRenderer(render);//Căn giữa cho cột
        model.getColumn(4).setCellRenderer(render);
    }

    void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
        this.fillComboBoxKhoaHoc();
    }

    void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe chuyenDe = (ChuyenDe) cboChuyenDe.getSelectedItem();
        if (chuyenDe != null) {
            List<KhoaHoc> list = khdao.selectByChuyenDe(chuyenDe.getMaCD());
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
            this.fillTableHocVien();
        }
    }

    void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        if (khoaHoc != null) {
            List<HocVien> list = hvdao.selectByKhoaHoc(khoaHoc.getMaKH());
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoten = nhdao.selectById(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{
                    i + 1,
                    hv.getMaHV(),
                    hv.getMaNH(),
                    hoten,
                    hv.getDiem()
                });
            }
            this.fillTableNguoiHoc();
        }
    }

    void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHocHV.getModel();
        model.setRowCount(0);
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        String keyword = txtTimKiemHV.getText();
        List<NguoiHoc> list = nhdao.selectNotInCourse(khoaHoc.getMaKH(), keyword);
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{
                nh.getMaNH(),
                nh.getHoTen(),
                nh.isGioiTinh() ? "Nam" : "Nữ",
                nh.getNgaySinh(),
                nh.getDienThoai(),
                nh.getEmail()
            });
        }
    }

    void addHocVien() {
        KhoaHoc khoaHoc = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        int[] rows = tblNguoiHocHV.getSelectedRows();
        for (int row : rows) {
            String manh = (String) tblNguoiHocHV.getValueAt(row, 0);
            HocVien hv = new HocVien();
            hv.setMaKH(khoaHoc.getMaKH());
            hv.setDiem(0.0);
            hv.setMaNH(manh);
            hvdao.insert(hv);
        }
        this.fillTableHocVien();
        this.tbpHocVien.setSelectedIndex(0);
    }

    void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa học viên!");
        } else {
            int[] rows = tblHocVien.getSelectedRows();
            if (rows.length > 0
                    && MsgBox.confirm(this, "Bạn muốn xóa các học viên được chọn?")) {
                for (int row : rows) {
                    int mahv = (Integer) tblHocVien.getValueAt(row, 1);
                    hvdao.delete(mahv);
                }
                this.fillTableHocVien();
            }
        }
    }

    void updateDiem() {
        int n = tblHocVien.getRowCount();
        boolean fl = true;
        for (int i = 0; i < n; i++) {
            int mahv = (Integer) tblHocVien.getValueAt(i, 1);
            double diem = Double.parseDouble(tblHocVien.getValueAt(i, 4) + "");
            if (diem < 0 || diem > 10) {
                MsgBox.alert(this, "Điểm không hợp lệ!");
                fl = false;
            }

            if (fl == true) {
                HocVien hv = hvdao.selectById(mahv);
                hv.setDiem(diem);
                hvdao.update(hv);
            }
        }
        if (fl == true) {
            MsgBox.alert(this, "Cập nhật điểm thành công!");
        }

    }
}
