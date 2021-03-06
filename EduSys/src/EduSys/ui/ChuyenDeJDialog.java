/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.ui;

import EduSys.DAO.ChuyenDeDAO;
import EduSys.entity.ChuyenDe;
import EduSys.utils.Auth;
import EduSys.utils.ExportExcel;
import EduSys.utils.MsgBox;
import EduSys.utils.XImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DMX
 */
public class ChuyenDeJDialog extends javax.swing.JDialog {

    ChuyenDeDAO dao = new ChuyenDeDAO();
    private int row;

    /**
     * Creates new form ChuyenDeJDialog
     */
    public ChuyenDeJDialog(java.awt.Frame parent, boolean modal) {
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

        fileChoose = new javax.swing.JFileChooser();
        lblTTChuyenDe = new javax.swing.JLabel();
        TbpChuyenDe = new javax.swing.JTabbedPane();
        pnlCapNhatCD = new javax.swing.JPanel();
        lblHinhCD = new javax.swing.JLabel();
        lblMaCD = new javax.swing.JLabel();
        txtMaCD = new javax.swing.JTextField();
        lblTenCD = new javax.swing.JLabel();
        txtTenCD = new javax.swing.JTextField();
        lblThoiLuongCD = new javax.swing.JLabel();
        txtThoiLuongCD = new javax.swing.JTextField();
        lblHocPhiCD = new javax.swing.JLabel();
        txtHocPhiCD = new javax.swing.JTextField();
        lblMoTaCD = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMoTaCD = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        btnThemCD = new javax.swing.JButton();
        btnSuaCD = new javax.swing.JButton();
        btnXoaCD = new javax.swing.JButton();
        btnMoiCD = new javax.swing.JButton();
        btnFirstCD = new javax.swing.JButton();
        btnPrevCD = new javax.swing.JButton();
        btnNextCD = new javax.swing.JButton();
        btnLastCD = new javax.swing.JButton();
        pnlDanhSachCD = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDanhSachCD = new javax.swing.JTable();
        btnExportExcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản lý chuyên đề");

        lblTTChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTTChuyenDe.setForeground(new java.awt.Color(0, 0, 255));
        lblTTChuyenDe.setText("QUẢN LÝ CHUYÊN ĐỀ");

        lblHinhCD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        lblHinhCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhCDMouseClicked(evt);
            }
        });

        lblMaCD.setText("Mã chuyên đề");

        lblTenCD.setText("Tên chuyên đề");

        lblThoiLuongCD.setText("Thời lượng (Giờ)");

        lblHocPhiCD.setText("Học phí");

        lblMoTaCD.setText("Mô tả chuyên đề");

        txtMoTaCD.setColumns(20);
        txtMoTaCD.setRows(5);
        jScrollPane3.setViewportView(txtMoTaCD);

        btnThemCD.setText("Thêm");
        btnThemCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemCDActionPerformed(evt);
            }
        });

        btnSuaCD.setText("Sửa");
        btnSuaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaCDActionPerformed(evt);
            }
        });

        btnXoaCD.setText("Xóa");
        btnXoaCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaCDActionPerformed(evt);
            }
        });

        btnMoiCD.setText("Mới");
        btnMoiCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiCDActionPerformed(evt);
            }
        });

        btnFirstCD.setText("|<");
        btnFirstCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstCDActionPerformed(evt);
            }
        });

        btnPrevCD.setText("<<");
        btnPrevCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevCDActionPerformed(evt);
            }
        });

        btnNextCD.setText(">>");
        btnNextCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextCDActionPerformed(evt);
            }
        });

        btnLastCD.setText(">|");
        btnLastCD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastCDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThemCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSuaCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoaCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoiCD)
                .addGap(48, 48, 48)
                .addComponent(btnFirstCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPrevCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNextCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLastCD)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemCD)
                    .addComponent(btnSuaCD)
                    .addComponent(btnXoaCD)
                    .addComponent(btnMoiCD)
                    .addComponent(btnFirstCD)
                    .addComponent(btnPrevCD)
                    .addComponent(btnNextCD)
                    .addComponent(btnLastCD))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCapNhatCDLayout = new javax.swing.GroupLayout(pnlCapNhatCD);
        pnlCapNhatCD.setLayout(pnlCapNhatCDLayout);
        pnlCapNhatCDLayout.setHorizontalGroup(
            pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatCDLayout.createSequentialGroup()
                .addGroup(pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlCapNhatCDLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblHinhCD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaCD)
                            .addComponent(lblTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenCD)
                            .addComponent(lblThoiLuongCD, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtThoiLuongCD)
                            .addComponent(lblHocPhiCD, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtHocPhiCD, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                    .addGroup(pnlCapNhatCDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMoTaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnlCapNhatCDLayout.setVerticalGroup(
            pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatCDLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCapNhatCDLayout.createSequentialGroup()
                        .addComponent(lblMaCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTenCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThoiLuongCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtThoiLuongCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHocPhiCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhiCD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinhCD, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMoTaCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TbpChuyenDe.addTab("CẬP NHẬT", pnlCapNhatCD);

        tblDanhSachCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ CĐ", "TÊN CĐ", "HỌC PHÍ", "THỜI LUỢNG", "HÌNH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhSachCD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachCDMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblDanhSachCD);

        btnExportExcel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportExcel.setText("Xuất Excel");
        btnExportExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportExcelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDanhSachCDLayout = new javax.swing.GroupLayout(pnlDanhSachCD);
        pnlDanhSachCD.setLayout(pnlDanhSachCDLayout);
        pnlDanhSachCDLayout.setHorizontalGroup(
            pnlDanhSachCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachCDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachCDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportExcel)
                .addGap(74, 74, 74))
        );
        pnlDanhSachCDLayout.setVerticalGroup(
            pnlDanhSachCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachCDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportExcel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TbpChuyenDe.addTab("DANH SÁCH", pnlDanhSachCD);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTTChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(TbpChuyenDe)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTTChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TbpChuyenDe))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblHinhCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhCDMouseClicked
        // TODO add your handling code here:
        this.selectImage();
    }//GEN-LAST:event_lblHinhCDMouseClicked

    private void btnThemCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemCDActionPerformed
        // TODO add your handling code here:
        this.insert();
    }//GEN-LAST:event_btnThemCDActionPerformed

    private void btnSuaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaCDActionPerformed
        // TODO add your handling code here:
        this.update();
    }//GEN-LAST:event_btnSuaCDActionPerformed

    private void btnXoaCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaCDActionPerformed
        // TODO add your handling code here:
        this.delete();
    }//GEN-LAST:event_btnXoaCDActionPerformed

    private void btnMoiCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiCDActionPerformed
        // TODO add your handling code here:
        this.clearForm();
    }//GEN-LAST:event_btnMoiCDActionPerformed

    private void btnFirstCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstCDActionPerformed
        // TODO add your handling code here:
        this.first();
    }//GEN-LAST:event_btnFirstCDActionPerformed

    private void btnPrevCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevCDActionPerformed
        // TODO add your handling code here:
        this.prev();
    }//GEN-LAST:event_btnPrevCDActionPerformed

    private void btnNextCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextCDActionPerformed
        // TODO add your handling code here:
        this.next();
    }//GEN-LAST:event_btnNextCDActionPerformed

    private void btnLastCDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastCDActionPerformed
        // TODO add your handling code here:
        this.last();
    }//GEN-LAST:event_btnLastCDActionPerformed

    private void tblDanhSachCDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachCDMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            this.row = tblDanhSachCD.getSelectedRow();
            this.edit();
        }
    }//GEN-LAST:event_tblDanhSachCDMouseClicked

    private void btnExportExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportExcelActionPerformed
        try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblDanhSachCD);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportExcelActionPerformed

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
            java.util.logging.Logger.getLogger(ChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChuyenDeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ChuyenDeJDialog dialog = new ChuyenDeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JTabbedPane TbpChuyenDe;
    private javax.swing.JButton btnExportExcel;
    private javax.swing.JButton btnFirstCD;
    private javax.swing.JButton btnLastCD;
    private javax.swing.JButton btnMoiCD;
    private javax.swing.JButton btnNextCD;
    private javax.swing.JButton btnPrevCD;
    private javax.swing.JButton btnSuaCD;
    private javax.swing.JButton btnThemCD;
    private javax.swing.JButton btnXoaCD;
    private javax.swing.JFileChooser fileChoose;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblHinhCD;
    private javax.swing.JLabel lblHocPhiCD;
    private javax.swing.JLabel lblMaCD;
    private javax.swing.JLabel lblMoTaCD;
    private javax.swing.JLabel lblTTChuyenDe;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblThoiLuongCD;
    private javax.swing.JPanel pnlCapNhatCD;
    private javax.swing.JPanel pnlDanhSachCD;
    private javax.swing.JTable tblDanhSachCD;
    private javax.swing.JTextField txtHocPhiCD;
    private javax.swing.JTextField txtMaCD;
    private javax.swing.JTextArea txtMoTaCD;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtThoiLuongCD;
    // End of variables declaration//GEN-END:variables
        ChuyenDe cd = new ChuyenDe();

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());

        this.fillTable();
        this.row = -1;
        this.updateStatus();
        this.setForm(cd);

    }

    void selectImage() {
        JFileChooser chooser = new JFileChooser("D:\\DuAnMau\\EduSys\\logos");
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {// khi mở  hộp thoại và bấm ok
            File file = chooser.getSelectedFile();//lấy file người ta đã chọn
            XImage.save(file);// lưu hình vào thư mục logos
            ImageIcon icon = XImage.read(file.getName());// đọc hình từ logos
            lblHinhCD.setIcon(icon); // hiển thị ảnh lên lb
            lblHinhCD.setToolTipText(file.getName());// giữ tên hình trong tooltip
        }
    }

    void setForm(ChuyenDe cd) {
        txtMaCD.setText(cd.getMaCD());
        txtTenCD.setText(cd.getTenCD());
        txtHocPhiCD.setText(String.valueOf(cd.getHocPhi()));
        txtThoiLuongCD.setText(String.valueOf(cd.getThoiLuong()));
        if (cd.getHinh() != null) {
            lblHinhCD.setToolTipText(cd.getHinh());
            lblHinhCD.setIcon(XImage.read(cd.getHinh()));
        } else {
            lblHinhCD.setIcon(null);
        }
        txtMoTaCD.setText(cd.getMoTa());
    }

    ChuyenDe getForm() {
        ChuyenDe cd = new ChuyenDe();
        cd.setMaCD(txtMaCD.getText());
        cd.setTenCD(txtTenCD.getText());
        cd.setHocPhi(Double.valueOf(txtHocPhiCD.getText()));
        cd.setThoiLuong(Integer.valueOf(txtThoiLuongCD.getText()));
        cd.setHinh(lblHinhCD.getToolTipText());// lấy tên thị từ tooltip của label chứa hình
        cd.setMoTa(txtMoTaCD.getText());
        return cd;
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhSachCD.getModel();
        model.setRowCount(0);//xóa tất cả các hàng trên table
        try {
            List<ChuyenDe> list = dao.selectAll();// đọc dữ liệu từ CSDL
            for (ChuyenDe cd : list) {
                Object[] row = {cd.getMaCD(),
                    cd.getTenCD(),
                    cd.getHocPhi(),
                    cd.getThoiLuong(),
                    cd.getHinh()
                };
                model.addRow(row);// thêm 1 hàng vao table
            }
        } catch (Exception e) {
            MsgBox.alert(this, "lỗi truy vấn dữ liệu!");
        }
    }

    private void updateStatus() {
        boolean edit = (this.row >= 0); // người ta đang chọn hàng ở đâu đó 
        boolean first = (this.row == 0);//đabg ở bản ghi đầu tiên
        boolean last = (this.row == tblDanhSachCD.getRowCount() - 1);// đnag ở vị trí cuối cùng
        // trạng thái forrm
        txtMaCD.setEditable(!edit);// sửa khi nhập mới
        btnThemCD.setEnabled(!edit);// thêm khi ko chọn hàng nào
        btnSuaCD.setEnabled(edit);// khi chọn hàng thì cho phép sua
        btnXoaCD.setEnabled(edit);//khi chọn hàng thì cho phép xoa

        // trạng thái điều hương
        btnFirstCD.setEnabled(edit && !first);// khi đang chọn hàng và ko phải hàng đầu
        btnPrevCD.setEnabled(edit && !first);// khi đang chọn hàng và ko phải hàng đầu
        btnNextCD.setEnabled(edit && !last);// khi đang chọn hàng và ko phải hàng cuối
        btnLastCD.setEnabled(edit && !last);// khi đang chọn hàng và ko phải hàng cuôi
    }

    private void first() {
        this.row = 0;
        this.edit();
    }

    private void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    private void next() {
        if (this.row < tblDanhSachCD.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    private void last() {
        this.row = tblDanhSachCD.getRowCount() - 1;
        this.edit();
    }

    private void edit() {
        String manv = (String) tblDanhSachCD.getValueAt(this.row, 0);
        ChuyenDe nv = dao.selectById(manv);
        this.setForm(nv);
        TbpChuyenDe.setSelectedIndex(0);
        this.updateStatus();
    }

    void insert() {
        ChuyenDe cd = getForm();
        if (cd.getMaCD().equals("")) {
            MsgBox.alert(this, "Bạn chưa nhập mã chuyên đề!");
            txtMaCD.requestFocus();
        }else if(cd.getTenCD().equals("")){
            MsgBox.alert(this, "Bạn chưa nhập tên chuyên đề!");
            txtTenCD.requestFocus();
        }else if(cd.getHocPhi()<0){
            MsgBox.alert(this, "Học phí phải lớn hơn 0 !");
            txtHocPhiCD.requestFocus();
        }else if(cd.getThoiLuong()<0){
            MsgBox.alert(this, "Thời lượng phải lớn hơn 0 !");
            txtThoiLuongCD.requestFocus();
        }else if(lblHinhCD.getIcon()==null){
            MsgBox.alert(this, "Bạn chưa thêm hình!"); 
        }
        else {
            try {

                dao.insert(cd);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công!");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại!");
            }
        }

    }

    private void update() {
        ChuyenDe cd = getForm();
        try {
            dao.update(cd);
            this.fillTable();
            MsgBox.alert(this, "Cập nhật thành công!");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại!");
        }
    }

    private void delete() {
        if (!Auth.isManager()) {// nếu ko phải truong phong ko cho xoa
            MsgBox.alert(this, "Bạn không có quyền xóa chuyên đề!");
        } else {
            String macd = txtMaCD.getText();
            if (MsgBox.confirm(this, "Bạn thực sự muốn xóa chuyên đề này?")) {
                try {
                    dao.delete(macd);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công!");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại!");
                }
            }
        }
    }

    private void clearForm() {
        ChuyenDe cd = new ChuyenDe();
        this.setForm(cd);
        this.row = -1;
        this.updateStatus();
    }

}
