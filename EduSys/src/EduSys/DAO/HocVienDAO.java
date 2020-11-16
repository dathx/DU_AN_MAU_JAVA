/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.DAO;

import EduSys.entity.HocVien;
import EduSys.utils.XHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DMX
 */
public class HocVienDAO extends EduSysDAO<HocVien, Integer>{

    String INSERT_SQL = "INSERT INTO HOCVIEN(MAKH,MANH,DIEM)VALUES(?,?,?)";// mã hv tự động tăng
    String UPDATE_SQL = "UPDATE HOCVIEN SET MaKH=?,MANH=?,DIEM=? WHERE MAHV=?";
    String DELETE_SQL = "DELETE FROM HOCVIEN WHERE MAHV = ?";
    String SELECT_ALL_SQL="SELECT * FROM HOCVIEN";
    String SELECT_BY_ID_SQL="SELECT * FROM HOCVIEN WHERE MAHV=?";
    
    @Override
    public void insert(HocVien entity) {
        XHelper.update(INSERT_SQL, entity.getMaKH(),entity.getMaNH(),entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
       XHelper.update(UPDATE_SQL, entity.getMaKH(),entity.getMaNH(),entity.getDiem(),entity.getMaHV());
    }

    @Override
    public void delete(Integer id) {
        XHelper.update(DELETE_SQL,id);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectById(Integer id) {
         List<HocVien> list = this.selectBySql(SELECT_BY_ID_SQL, id);
         return list.size() > 0 ? list.get(0) : null;
    }

    @Override
     protected List<HocVien> selectBySql(String sql, Object...args){
        List<HocVien> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = XHelper.query(sql, args);
                while(rs.next()){
                    HocVien entity=new HocVien();
                    entity.setMaHV(rs.getInt("MaHV"));
                    entity.setMaKH(rs.getInt("MaKH"));
                    entity.setMaNH(rs.getString("MaNH"));
                    entity.setDiem(rs.getDouble("Diem"));
                    list.add(entity);
                }
            } 
            finally{
                rs.getStatement().getConnection().close();
            }
        } 
        catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }
     public List<HocVien> selectByKhoaHoc(int maKH) {// lấy những học viên của khóa học theo MaKH
        String sql="SELECT * FROM HocVien WHERE MaKH=?";
        return this.selectBySql(sql, maKH);
    }
    
}
