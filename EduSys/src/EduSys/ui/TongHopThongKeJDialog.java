/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.ui;

import EduSys.DAO.KhoaHocDAO;
import EduSys.DAO.ThongKeDAO;
import EduSys.entity.KhoaHoc;
import EduSys.utils.Auth;
import EduSys.utils.ExportExcel;
import EduSys.utils.MsgBox;
import EduSys.utils.XImage;
import java.io.IOException;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DMX
 */
public class TongHopThongKeJDialog extends javax.swing.JDialog {

    /**
     * Creates new form TongHopThongKeJDialog
     */
    public TongHopThongKeJDialog(java.awt.Frame parent, boolean modal) {
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

        lblTHTK = new javax.swing.JLabel();
        tbpTHTK = new javax.swing.JTabbedPane();
        pnlBangDiem = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tblBangDiemTHTK = new javax.swing.JTable();
        lblKH = new javax.swing.JLabel();
        cboKhoaHocTHTK = new javax.swing.JComboBox<>();
        btnExportBangDiem = new javax.swing.JButton();
        pnlNguoiHoc = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblNguoiHocTHTK = new javax.swing.JTable();
        btnExportNH = new javax.swing.JButton();
        pnlDiemCD = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDiemCDTHTK = new javax.swing.JTable();
        btnExportDiemChuyenDe = new javax.swing.JButton();
        pnlDoanhThu = new javax.swing.JPanel();
        cboNamDoanhThu = new javax.swing.JComboBox<>();
        lblNam = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tblDoanhThuTHTK = new javax.swing.JTable();
        btnExportDoanhThu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Tổng hợp và thống kê");

        lblTHTK.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTHTK.setForeground(new java.awt.Color(0, 0, 255));
        lblTHTK.setText("TỔNG HỢP THỐNG KÊ");

        tblBangDiemTHTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ));
        jScrollPane10.setViewportView(tblBangDiemTHTK);

        lblKH.setText("Khóa học:");

        cboKhoaHocTHTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocTHTKActionPerformed(evt);
            }
        });

        btnExportBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportBangDiem.setText("Xuất Excel");
        btnExportBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportBangDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBangDiemLayout = new javax.swing.GroupLayout(pnlBangDiem);
        pnlBangDiem.setLayout(pnlBangDiemLayout);
        pnlBangDiemLayout.setHorizontalGroup(
            pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(pnlBangDiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKH, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboKhoaHocTHTK, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBangDiemLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportBangDiem)
                .addGap(52, 52, 52))
        );
        pnlBangDiemLayout.setVerticalGroup(
            pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangDiemLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKH)
                    .addComponent(cboKhoaHocTHTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnExportBangDiem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpTHTK.addTab("BẢNG ĐIỂM", pnlBangDiem);

        tblNguoiHocTHTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NĂM", "SỐ NGƯỜI HỌC", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ));
        jScrollPane11.setViewportView(tblNguoiHocTHTK);

        btnExportNH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportNH.setText("Xuất Excel");
        btnExportNH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportNHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoiHocLayout = new javax.swing.GroupLayout(pnlNguoiHoc);
        pnlNguoiHoc.setLayout(pnlNguoiHocLayout);
        pnlNguoiHocLayout.setHorizontalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportNH)
                .addGap(69, 69, 69))
        );
        pnlNguoiHocLayout.setVerticalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExportNH)
                .addContainerGap())
        );

        tbpTHTK.addTab("NGƯỜI HỌC", pnlNguoiHoc);

        tblDiemCDTHTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "SL HỌC VIÊN", "ĐIỂM TN", "ĐIỂM CN", "ĐIỂM TB"
            }
        ));
        jScrollPane12.setViewportView(tblDiemCDTHTK);

        btnExportDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportDiemChuyenDe.setText("Xuất Excel");
        btnExportDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportDiemChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDiemCDLayout = new javax.swing.GroupLayout(pnlDiemCD);
        pnlDiemCD.setLayout(pnlDiemCDLayout);
        pnlDiemCDLayout.setHorizontalGroup(
            pnlDiemCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDiemCDLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportDiemChuyenDe)
                .addGap(52, 52, 52))
        );
        pnlDiemCDLayout.setVerticalGroup(
            pnlDiemCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiemCDLayout.createSequentialGroup()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnExportDiemChuyenDe)
                .addContainerGap())
        );

        tbpTHTK.addTab("ĐIỂM CHUYÊN ĐỀ", pnlDiemCD);

        cboNamDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamDoanhThuActionPerformed(evt);
            }
        });

        lblNam.setText("NĂM:");

        tblDoanhThuTHTK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KH", "SỐ HV", "DOANH THU", "HP THẤP NHẤT", "HP CAO NHẤT", "HP TRUNG BÌNH"
            }
        ));
        jScrollPane13.setViewportView(tblDoanhThuTHTK);

        btnExportDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Excel.png"))); // NOI18N
        btnExportDoanhThu.setText("Xuất Excel");
        btnExportDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportDoanhThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblNam, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cboNamDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
            .addComponent(jScrollPane13)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExportDoanhThu)
                .addGap(49, 49, 49))
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboNamDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNam))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExportDoanhThu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbpTHTK.addTab("DOANH THU", pnlDoanhThu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbpTHTK, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTHTK, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTHTK, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tbpTHTK)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboKhoaHocTHTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocTHTKActionPerformed
        // TODO add your handling code here:
        this.fillTableBangDiem();
    }//GEN-LAST:event_cboKhoaHocTHTKActionPerformed

    private void cboNamDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamDoanhThuActionPerformed
        // TODO add your handling code here:
        this.fillTableDoanhThu();
    }//GEN-LAST:event_cboNamDoanhThuActionPerformed

    private void btnExportDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportDoanhThuActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblDoanhThuTHTK);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportDoanhThuActionPerformed

    private void btnExportBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportBangDiemActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblBangDiemTHTK);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportBangDiemActionPerformed

    private void btnExportNHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportNHActionPerformed
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblNguoiHocTHTK);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportNHActionPerformed

    private void btnExportDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportDiemChuyenDeActionPerformed
        // TODO add your handling code here:
         try {
            // TODO add your handling code here:
            ExportExcel.exportTable(tblDiemCDTHTK);
            MsgBox.alert(this, "Lưu dữ liệu thành công");
        } catch (IOException ex) {
            MsgBox.alert(this, "Lỗi lưu trữ !");
        }
    }//GEN-LAST:event_btnExportDiemChuyenDeActionPerformed

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
            java.util.logging.Logger.getLogger(TongHopThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TongHopThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TongHopThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TongHopThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TongHopThongKeJDialog dialog = new TongHopThongKeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExportBangDiem;
    private javax.swing.JButton btnExportDiemChuyenDe;
    private javax.swing.JButton btnExportDoanhThu;
    private javax.swing.JButton btnExportNH;
    private javax.swing.JComboBox<String> cboKhoaHocTHTK;
    private javax.swing.JComboBox<String> cboNamDoanhThu;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JLabel lblKH;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblTHTK;
    private javax.swing.JPanel pnlBangDiem;
    private javax.swing.JPanel pnlDiemCD;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JTable tblBangDiemTHTK;
    private javax.swing.JTable tblDiemCDTHTK;
    private javax.swing.JTable tblDoanhThuTHTK;
    private javax.swing.JTable tblNguoiHocTHTK;
    private javax.swing.JTabbedPane tbpTHTK;
    // End of variables declaration//GEN-END:variables

      ThongKeDAO dao = new ThongKeDAO();
      KhoaHocDAO khdao = new KhoaHocDAO();

    void init() {
        setLocationRelativeTo(null);
        fillComboBoxKhoaHoc();
        fillTableBangDiem();
        fillTableLuongNguoiHoc();        
        fillTableDiemChuyenDe();
        
        fillComboBoxNam();
        fillTableDoanhThu();
        
        this.selectTab(0);
        if(!Auth.isManager()){// nếu ko phải trưởng phòng thì xóa Tab Doanh thu
            tbpTHTK.remove(3);
        }
        
        tblBangDiemTHTK.getColumnModel().getColumn(0).setMaxWidth(100);// căn chỉnh độ ngang tối đa
        tblBangDiemTHTK.getColumnModel().getColumn(2).setMaxWidth(70);
        tblBangDiemTHTK.getColumnModel().getColumn(3).setMaxWidth(120);
        
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.CENTER);// Căn giữa nội dung
        tblBangDiemTHTK.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        
        tblNguoiHocTHTK.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);
        tblNguoiHocTHTK.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblNguoiHocTHTK.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblNguoiHocTHTK.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        
        tblDiemCDTHTK.getColumnModel().getColumn(0).setMinWidth(250);
        tblDiemCDTHTK.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        tblDiemCDTHTK.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblDiemCDTHTK.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblDiemCDTHTK.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        
        tblDoanhThuTHTK.getColumnModel().getColumn(0).setMinWidth(250);
        tblDoanhThuTHTK.getColumnModel().getColumn(1).setCellRenderer(cellRenderer);
        tblDoanhThuTHTK.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
        tblDoanhThuTHTK.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        tblDoanhThuTHTK.getColumnModel().getColumn(4).setCellRenderer(cellRenderer);
        tblDoanhThuTHTK.getColumnModel().getColumn(5).setCellRenderer(cellRenderer);
        tblDoanhThuTHTK.getColumnModel().getColumn(6).setCellRenderer(cellRenderer);
    }
    
    public void selectTab(int index){
        tbpTHTK.setSelectedIndex(index);
    }
    
    void fillComboBoxKhoaHoc(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHocTHTK.getModel();
        model.removeAllElements();
        List<KhoaHoc> list = khdao.selectAll();
        for(KhoaHoc kh : list){
            model.addElement(kh);
        }
    }
    void fillTableBangDiem(){
        DefaultTableModel model = (DefaultTableModel) tblBangDiemTHTK.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cboKhoaHocTHTK.getSelectedItem();
        List<Object[]> list = dao.getBangDiem(kh.getMaKH());
        for(Object[] row : list){
            double diem = (double) row[2];
            model.addRow(new Object[]{ row[0], row[1], diem, getXepLoai(diem) });
        }
    }
    String getXepLoai(double diem){
        if(diem < 5){
            return "Chưa đạt";
        }
        if(diem < 6.5){
            return "Trung bình";
        }
        if(diem < 7.5){
            return "Khá";
        }
        if(diem < 9){
            return "Giỏi";
        }
        return "Xuất sắc";
    }
    
    void fillTableLuongNguoiHoc(){
        DefaultTableModel model = (DefaultTableModel) tblNguoiHocTHTK.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getLuongNguoiHoc();
        for(Object[] row : list){
            model.addRow(row);
        }
    }

    void fillTableDiemChuyenDe() {
        DefaultTableModel model = (DefaultTableModel) tblDiemCDTHTK.getModel();
        model.setRowCount(0);
        List<Object[]> list = dao.getDiemChuyenDe();
        for(Object[] row : list){
            model.addRow(new Object[]{row[0], row[1], row[2], row[3], String.format("%.1f", row[4])});
        }
    }
            
    void fillComboBoxNam(){
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNamDoanhThu.getModel();
        model.removeAllElements();
        List<Integer> list = khdao.selectYears();
        for(Integer year : list){
            model.addElement(year);
        }
    }
    void fillTableDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThuTHTK.getModel();
        model.setRowCount(0);
        int nam = (Integer)cboNamDoanhThu.getSelectedItem();
        List<Object[]> list = dao.getDoanhThu(nam);
        for(Object[] row : list){
            model.addRow(row);
        }
    }
}
