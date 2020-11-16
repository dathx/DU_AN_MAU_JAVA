/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.ui;

import EduSys.utils.Auth;
import EduSys.utils.MsgBox;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import EduSys.utils.XImage;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author DMX
 */
public class EduSysJFrame extends javax.swing.JFrame {

    /**
     * Creates new form PolyProMain
     */
    public EduSysJFrame() {
        initComponents();
        this.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        ToolBar = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        btnKetThuc = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnChyenDe = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        BtnHuongDan = new javax.swing.JButton();
        btnSendEmail = new javax.swing.JButton();
        lblHinh = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        lblDongHo = new javax.swing.JLabel();
        lblHoTro = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MnuHeThong = new javax.swing.JMenu();
        MniDangNhap = new javax.swing.JMenuItem();
        MniDangXuat = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MniDoiMatKhau = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MniKetThuc = new javax.swing.JMenuItem();
        MnuQuanLy = new javax.swing.JMenu();
        MniChuyende = new javax.swing.JMenuItem();
        MniKhoaHoc = new javax.swing.JMenuItem();
        MniNguoiHoc = new javax.swing.JMenuItem();
        MniHocVien = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        MniNhanVien = new javax.swing.JMenuItem();
        MnuThongKe = new javax.swing.JMenu();
        MniBangDiem = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MniLuongNguoiHoc = new javax.swing.JMenuItem();
        MniDiemChuyenDe = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MniDoanhThu = new javax.swing.JMenuItem();
        MnuTroGiup = new javax.swing.JMenu();
        MniHDSD = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MniGTSP = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");

        ToolBar.setForeground(new java.awt.Color(255, 255, 255));

        btnDangXuat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnDangXuat.setForeground(new java.awt.Color(255, 0, 0));
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Logout.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        ToolBar.add(btnDangXuat);

        btnKetThuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKetThuc.setForeground(new java.awt.Color(255, 0, 0));
        btnKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/cancel-icon.png"))); // NOI18N
        btnKetThuc.setText("Kết thúc");
        btnKetThuc.setFocusable(false);
        btnKetThuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKetThuc.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnKetThuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        ToolBar.add(btnKetThuc);
        ToolBar.add(jSeparator6);

        btnChyenDe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnChyenDe.setForeground(new java.awt.Color(255, 0, 0));
        btnChyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Computer.png"))); // NOI18N
        btnChyenDe.setText("Chuyên đề");
        btnChyenDe.setFocusable(false);
        btnChyenDe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChyenDe.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnChyenDe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChyenDeActionPerformed(evt);
            }
        });
        ToolBar.add(btnChyenDe);

        btnNguoiHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnNguoiHoc.setForeground(new java.awt.Color(255, 0, 0));
        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Clien list.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        ToolBar.add(btnNguoiHoc);

        btnKhoaHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnKhoaHoc.setForeground(new java.awt.Color(255, 0, 0));
        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/khoahoc.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        ToolBar.add(btnKhoaHoc);

        btnHocVien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnHocVien.setForeground(new java.awt.Color(255, 0, 0));
        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/User group.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        ToolBar.add(btnHocVien);
        ToolBar.add(jSeparator7);

        BtnHuongDan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BtnHuongDan.setForeground(new java.awt.Color(255, 0, 0));
        BtnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Online.png"))); // NOI18N
        BtnHuongDan.setText("Hướng dẫn");
        BtnHuongDan.setFocusable(false);
        BtnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnHuongDan.setMargin(new java.awt.Insets(15, 15, 15, 15));
        BtnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHuongDanActionPerformed(evt);
            }
        });
        ToolBar.add(BtnHuongDan);

        btnSendEmail.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSendEmail.setForeground(new java.awt.Color(255, 0, 0));
        btnSendEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Letter.png"))); // NOI18N
        btnSendEmail.setText("Email");
        btnSendEmail.setFocusable(false);
        btnSendEmail.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSendEmail.setMargin(new java.awt.Insets(20, 20, 20, 20));
        btnSendEmail.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSendEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendEmailActionPerformed(evt);
            }
        });
        ToolBar.add(btnSendEmail);

        lblHinh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/lgo.png"))); // NOI18N

        lblDongHo.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        lblDongHo.setForeground(new java.awt.Color(204, 0, 51));
        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Clock.png"))); // NOI18N
        lblDongHo.setText("       ");

        lblHoTro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Info.png"))); // NOI18N
        lblHoTro.setText("Hệ quản lý đào tạo");

        MnuHeThong.setText("Hệ Thống");
        MnuHeThong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        MniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Unlock.png"))); // NOI18N
        MniDangNhap.setText("Đăng nhập");
        MniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDangNhapActionPerformed(evt);
            }
        });
        MnuHeThong.add(MniDangNhap);

        MniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        MniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Logout.png"))); // NOI18N
        MniDangXuat.setText("Đăng xuất");
        MniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDangXuatActionPerformed(evt);
            }
        });
        MnuHeThong.add(MniDangXuat);
        MnuHeThong.add(jSeparator1);

        MniDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Reload.png"))); // NOI18N
        MniDoiMatKhau.setText("Đổi mật khẩu");
        MniDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDoiMatKhauActionPerformed(evt);
            }
        });
        MnuHeThong.add(MniDoiMatKhau);
        MnuHeThong.add(jSeparator2);

        MniKetThuc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        MniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/cancel-icon.png"))); // NOI18N
        MniKetThuc.setText("Kết thúc");
        MniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniKetThucActionPerformed(evt);
            }
        });
        MnuHeThong.add(MniKetThuc);

        MenuBar.add(MnuHeThong);

        MnuQuanLy.setText("Quản Lý");
        MnuQuanLy.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MniChuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.CTRL_MASK));
        MniChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Computer.png"))); // NOI18N
        MniChuyende.setText("Chuyên đề");
        MniChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniChuyendeActionPerformed(evt);
            }
        });
        MnuQuanLy.add(MniChuyende);

        MniKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.CTRL_MASK));
        MniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/khoahoc.png"))); // NOI18N
        MniKhoaHoc.setText("Khóa học");
        MniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniKhoaHocActionPerformed(evt);
            }
        });
        MnuQuanLy.add(MniKhoaHoc);

        MniNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.CTRL_MASK));
        MniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Clien list.png"))); // NOI18N
        MniNguoiHoc.setText("Người học");
        MniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniNguoiHocActionPerformed(evt);
            }
        });
        MnuQuanLy.add(MniNguoiHoc);

        MniHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.CTRL_MASK));
        MniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/User group.png"))); // NOI18N
        MniHocVien.setText("Học viên");
        MniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniHocVienActionPerformed(evt);
            }
        });
        MnuQuanLy.add(MniHocVien);
        MnuQuanLy.add(jSeparator9);

        MniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_MASK));
        MniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Boy.png"))); // NOI18N
        MniNhanVien.setText("Nhân viên");
        MniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniNhanVienActionPerformed(evt);
            }
        });
        MnuQuanLy.add(MniNhanVien);

        MenuBar.add(MnuQuanLy);

        MnuThongKe.setText("Thống Kê");
        MnuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MniBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, java.awt.event.InputEvent.SHIFT_MASK));
        MniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Properties.png"))); // NOI18N
        MniBangDiem.setText("Bảng điểm");
        MniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniBangDiemActionPerformed(evt);
            }
        });
        MnuThongKe.add(MniBangDiem);
        MnuThongKe.add(jSeparator3);

        MniLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, java.awt.event.InputEvent.SHIFT_MASK));
        MniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Statistics.png"))); // NOI18N
        MniLuongNguoiHoc.setText("Lượng người học");
        MniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniLuongNguoiHocActionPerformed(evt);
            }
        });
        MnuThongKe.add(MniLuongNguoiHoc);

        MniDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, java.awt.event.InputEvent.SHIFT_MASK));
        MniDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Diagram.png"))); // NOI18N
        MniDiemChuyenDe.setText("Điểm chuyên đề");
        MniDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDiemChuyenDeActionPerformed(evt);
            }
        });
        MnuThongKe.add(MniDiemChuyenDe);
        MnuThongKe.add(jSeparator4);

        MniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.SHIFT_MASK));
        MniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Coins.png"))); // NOI18N
        MniDoanhThu.setText("Doanh thu");
        MniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDoanhThuActionPerformed(evt);
            }
        });
        MnuThongKe.add(MniDoanhThu);

        MenuBar.add(MnuThongKe);

        MnuTroGiup.setText("Trợ Giúp");
        MnuTroGiup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MniHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        MniHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Online.png"))); // NOI18N
        MniHDSD.setText("Hướng dẫn sử dựng");
        MniHDSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniHDSDActionPerformed(evt);
            }
        });
        MnuTroGiup.add(MniHDSD);
        MnuTroGiup.add(jSeparator5);

        MniGTSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EduSys/Icon/Address book.png"))); // NOI18N
        MniGTSP.setText("Giới thiệu sản phẩm");
        MniGTSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniGTSPActionPerformed(evt);
            }
        });
        MnuTroGiup.add(MniGTSP);

        MenuBar.add(MnuTroGiup);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE)
            .addComponent(jSeparator8)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblHoTro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(ToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblHoTro, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lblDongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_MniDangXuatActionPerformed

    private void MniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDangNhapActionPerformed
        // TODO add your handling code here:
        if(!Auth.isLogin()){
            new DangNhapJDiaLog(this,true).setVisible(true);
        }else{
            MsgBox.alert(this,"Bạn đã đăng nhập rồi!\nĐể đổi tài khoản vui lòng đăng xuất!");
        }
    }//GEN-LAST:event_MniDangNhapActionPerformed

    private void MniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_MniNguoiHocActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        this.dangXuat();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void MniHDSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniHDSDActionPerformed
        // TODO add your handling code here:
        this.openHuongDan();
    }//GEN-LAST:event_MniHDSDActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void BtnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHuongDanActionPerformed
        // TODO add your handling code here:
        this.openHuongDan();
    }//GEN-LAST:event_BtnHuongDanActionPerformed

    private void MniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniNhanVienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_MniNhanVienActionPerformed

    private void MniChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniChuyendeActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_MniChuyendeActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openNguoiHoc();
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void btnChyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChyenDeActionPerformed
        // TODO add your handling code here:
        this.openChuyenDe();
    }//GEN-LAST:event_btnChyenDeActionPerformed

    private void MniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniKhoaHocActionPerformed
        // TODO add your handling code here:
        this.openKhoaHoc();
    }//GEN-LAST:event_MniKhoaHocActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        // TODO add your handling code here:
        this.openHocVien();
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void MniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniHocVienActionPerformed
        // TODO add your handling code here:
        this.openHocVien();
    }//GEN-LAST:event_MniHocVienActionPerformed

    private void MniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniBangDiemActionPerformed
        // TODO add your handling code here:
        this.openTongHopThongKe(0);
    }//GEN-LAST:event_MniBangDiemActionPerformed

    private void MniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniLuongNguoiHocActionPerformed
        // TODO add your handling code here:
        this.openTongHopThongKe(1);
    }//GEN-LAST:event_MniLuongNguoiHocActionPerformed

    private void MniDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDiemChuyenDeActionPerformed
        // TODO add your handling code here:
        this.openTongHopThongKe(2);
    }//GEN-LAST:event_MniDiemChuyenDeActionPerformed

    private void MniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDoanhThuActionPerformed
        // TODO add your handling code here:
         this.openTongHopThongKe(3);
    }//GEN-LAST:event_MniDoanhThuActionPerformed

    private void MniGTSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniGTSPActionPerformed
        // TODO add your handling code here:
        this.openGioiThieuSP();
    }//GEN-LAST:event_MniGTSPActionPerformed

    private void MniDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDoiMatKhauActionPerformed
        // TODO add your handling code here:
         this.openDoiMatKhau();
    }//GEN-LAST:event_MniDoiMatKhauActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc(); 
        
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void MniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_MniKetThucActionPerformed

    private void btnSendEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendEmailActionPerformed
        // TODO add your handling code here:
        this.openSendEmail();
    }//GEN-LAST:event_btnSendEmailActionPerformed

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
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduSysJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduSysJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHuongDan;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem MniBangDiem;
    private javax.swing.JMenuItem MniChuyende;
    private javax.swing.JMenuItem MniDangNhap;
    private javax.swing.JMenuItem MniDangXuat;
    private javax.swing.JMenuItem MniDiemChuyenDe;
    private javax.swing.JMenuItem MniDoanhThu;
    private javax.swing.JMenuItem MniDoiMatKhau;
    private javax.swing.JMenuItem MniGTSP;
    private javax.swing.JMenuItem MniHDSD;
    private javax.swing.JMenuItem MniHocVien;
    private javax.swing.JMenuItem MniKetThuc;
    private javax.swing.JMenuItem MniKhoaHoc;
    private javax.swing.JMenuItem MniLuongNguoiHoc;
    private javax.swing.JMenuItem MniNguoiHoc;
    private javax.swing.JMenuItem MniNhanVien;
    private javax.swing.JMenu MnuHeThong;
    private javax.swing.JMenu MnuQuanLy;
    private javax.swing.JMenu MnuThongKe;
    private javax.swing.JMenu MnuTroGiup;
    private javax.swing.JToolBar ToolBar;
    private javax.swing.JButton btnChyenDe;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnKetThuc;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JButton btnSendEmail;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblHoTro;
    // End of variables declaration//GEN-END:variables

    public void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new ChaoJDiaLog(this,true).setVisible(true);
        new DangNhapJDiaLog(this,true).setVisible(true);
  
        //set đồng hồ hệ thống
        new Timer(1000, new ActionListener() {
            @Override
           public void actionPerformed(ActionEvent e){
                Date now = new Date();
                SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss a ");
                String text = fm.format(now);
                lblDongHo.setText(text);
            }
        }).start();
    }

    private void openNguoiHoc() {
        if(Auth.isLogin()==false){
            MsgBox.alert(this, "Bạn chưa đăng nhập!");
        }else{
        new NguoiHocJDialog(this,true).setVisible(true);
        }
    }

    private void openKhoaHoc() {
        if(Auth.isLogin()==false){
            MsgBox.alert(this, "Bạn chưa đăng nhập!");
        }else{
        new KhoaHocJDialog(this, true).setVisible(true);
        }
    }

 

    private void openNhanVien() {
        if(Auth.isLogin()==false){
            MsgBox.alert(this, "Bạn chưa đăng nhập!");
        }else{
            new NhanVienJDialog(this, true).setVisible(true);
        }
        
    }

    private void openChuyenDe() {
        if(Auth.isLogin()==false){
            MsgBox.alert(this, "Bạn chưa đăng nhập!");
        }else{
            new ChuyenDeJDialog(this, true).setVisible(true);
        }
        
    }

    private void openHocVien() {
        if(Auth.isLogin()==false){
            MsgBox.alert(this, "Bạn chưa đăng nhập!");
        }else{
            new HocVienJDialog(this, true).setVisible(true);
        }
        
    }

    private void openTongHopThongKe(int index) {
        if(Auth.isLogin()==false){
            MsgBox.alert(this, "Bạn chưa đăng nhập!");
        }
        else if(Auth.isLogin()){
            if(index==3&&!Auth.isManager()){
                MsgBox.alert(this, "Bạn không có quyền xem thông tin doanh thu!");
            }else{
                TongHopThongKeJDialog tkwin=new TongHopThongKeJDialog(this, true);
                tkwin.selectTab(index);
                tkwin.setVisible(true);
            }
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }
      
    }

    private void openDoiMatKhau() {
        if(Auth.isLogin()){
         new DoiMatKhauJDialog(this, true).setVisible(true);   
        }else{
            MsgBox.alert(this, "Vui lòng đăng nhập!");
        }  
    }
    
     private void openGioiThieuSP() {
        new GioiThieuJDialog(this, true).setVisible(true);
    }

    private void ketThuc() {
        if(MsgBox.confirm(this, "Bạn thực sự muốn thoát chương trình? ")){
           System.exit(0); 
        }
     
    }

    private void dangXuat() {
        Auth.clear();
        new DangNhapJDiaLog(this, true).setVisible(true);
    }

    private void openHuongDan() {
        try {
            Desktop.getDesktop().browse(new File("help/index.html").toURI());
        } 
        catch (IOException ex) {
            MsgBox.alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }
    private void openSendEmail(){
        new SendGmailJFrame().setVisible(true);
    }
}
