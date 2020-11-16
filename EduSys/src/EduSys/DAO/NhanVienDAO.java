/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.DAO;

import EduSys.entity.NhanVien;
import EduSys.utils.XHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author DMX
 */
public class NhanVienDAO extends EduSysDAO<NhanVien, String>{

    String INSERT_SQL = "INSERT INTO NHANVIEN(MaNV,HoTen,MatKhau,VaiTro)VALUES(?,?,?,?)";
    String UPDATE_SQL = "UPDATE NHANVIEN SET HOTEN=?,MATKHAU=?,VAITRO=? WHERE MANV=?";
    String DELETE_SQL = "DELETE FROM NHANVIEN WHERE MANV = ?";
    String SELECT_ALL_SQL="SELECT * FROM NHANVIEN";
    String SELECT_BY_ID_SQL="SELECT * FROM NHANVIEN WHERE MANV=?";
    
    @Override
    public void insert(NhanVien entity) {
        XHelper.update(INSERT_SQL, entity.getMaNV(),entity.getHoTen(),entity.getMatKhau(),entity.isVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        XHelper.update(UPDATE_SQL, entity.getHoTen(),entity.getMatKhau(),entity.isVaiTro(),entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        XHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectById(String id) {
      List<NhanVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
      if(list.isEmpty()){
          return null;
      }
      return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
         List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs= XHelper.query(sql, args);
            while (rs.next()) {                
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));          
                entity.setMatKhau(rs.getString("MatKhau"));   
                 entity.setHoTen(rs.getString("HoTen")); 
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
           rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
