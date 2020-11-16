/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.entity;

import EduSys.utils.MsgBox;
import javax.swing.JOptionPane;

/**
 *
 * @author DMX
 */
public class ChuyenDe {
    String maCD;
    String tenCD;
    double hocPhi;
    int thoiLuong;
    String hinh;
    String moTa;
    
       @Override
    public String toString(){// lấy tên để hiển thị trong combobox
        return this.tenCD;
    }
    
    @Override
    public boolean equals(Object obj){// lấy mã chuyên đề để so sáng 2 chuyên đề
        ChuyenDe other = (ChuyenDe)obj;
        return other.getMaCD().equals(this.getMaCD());
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTenCD() {
        return tenCD;
    }

    public void setTenCD(String tenCD) {
        this.tenCD = tenCD;
    }

    public double getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    
   
 
}
