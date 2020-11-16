/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.DAO;

import EduSys.entity.NguoiHoc;
import EduSys.utils.XHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author DMX
 */
public class NguoiHocDAO extends EduSysDAO<NguoiHoc, String>{

    String INSERT_SQL = "INSERT INTO NGUOIHOC(MANH,HOTEN,GIOITINH,NGAYSINH,DIENTHOAI,EMAIL,GHICHU,MANV)VALUES(?,?,?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE NGUOIHOC SET HOTEN=?,GIOITINH=?,NGAYSINH=?, DIENTHOAI=?,EMAIL=?,GHICHU=?,MANV=? WHERE MANH=?";
    String DELETE_SQL = "DELETE FROM NGUOIHOC WHERE MANH = ?";
    String SELECT_ALL_SQL="SELECT * FROM NGUOIHOC";
    String SELECT_BY_ID_SQL="SELECT * FROM NGUOIHOC WHERE MANH=?";
    @Override
    public void insert(NguoiHoc entity) {
        XHelper.update(INSERT_SQL, entity.getMaNH(),entity.getHoTen(),entity.isGioiTinh(),entity.getNgaySinh(),entity.getDienThoai(),entity.getEmail(),entity.getGhiChu(),entity.getMaNV());
    }

    @Override
    public void update(NguoiHoc entity) {
        XHelper.update(UPDATE_SQL,entity.getHoTen(),entity.isGioiTinh(),entity.getNgaySinh(),entity.getDienThoai(),entity.getEmail(),entity.getGhiChu(),entity.getMaNV(),entity.getMaNH());
    }

    @Override
    public void delete(String id) {
        XHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NguoiHoc> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NguoiHoc selectById(String id) {
      List<NguoiHoc> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NguoiHoc> selectBySql(String sql, Object... args) {
         List<NguoiHoc> list = new ArrayList<NguoiHoc>();
        try {
            ResultSet rs = XHelper.query(sql, args);
            while (rs.next()) {                
                NguoiHoc entity = new NguoiHoc();
                entity.setMaNH(rs.getString("MaNH"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setGioiTinh(rs.getBoolean("GioiTinh"));
                entity.setNgaySinh(rs.getDate("NgaySinh"));
                entity.setDienThoai(rs.getString("DienThoai"));
                entity.setEmail(rs.getString("Email"));
                entity.setGhiChu(rs.getString("GhiChu"));
                entity.setMaNV(rs.getString("MaNV"));
                entity.setNgayDK(rs.getDate("NgayDK"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<NguoiHoc> selectByKeyword(String key){
        String sql ="Select * from NguoiHoc where hoten like ?";
        return this.selectBySql(sql,"%"+key+"%");
    }
    
       public List<NguoiHoc> selectNotInCourse(int makh, String keyword) {// lấy danh sách người học chưa là học viên của khóa học đó
        String sql="SELECT * FROM NguoiHoc "
                + " WHERE HoTen LIKE ? AND "
                + " MaNH NOT IN (SELECT MaNH FROM HocVien WHERE MaKH=?)";
        return this.selectBySql(sql, "%"+keyword+"%", makh);
    }
    
}
