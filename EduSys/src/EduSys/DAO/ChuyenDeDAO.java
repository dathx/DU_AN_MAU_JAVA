/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.DAO;

import EduSys.entity.ChuyenDe;
import EduSys.utils.XHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author DMX
 */
public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String>{

    String INSERT_SQL = "INSERT INTO CHUYENDE(MACD,TENCD,HOCPHI,THOILUONG,HINH,MOTA)VALUES(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE CHUYENDE SET TENCD=?,HOCPHI=?,THOILUONG=?, HINH=?,MOTA=? WHERE MACD=?";
    String DELETE_SQL = "DELETE FROM CHUYENDE WHERE MACD = ?";
    String SELECT_ALL_SQL="SELECT * FROM CHUYENDE";
    String SELECT_BY_ID_SQL="SELECT * FROM CHUYENDE WHERE MACD=?";
    
    @Override
    public void insert(ChuyenDe entity) {
        XHelper.update(INSERT_SQL,entity.getMaCD(),entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        XHelper.update(UPDATE_SQL,entity.getTenCD(),entity.getHocPhi(),entity.getThoiLuong(),entity.getHinh(),entity.getMoTa(),entity.getMaCD());
    }

    @Override
    public void delete(String id) {
        XHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectById(String id) {
        List<ChuyenDe> list = this.selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<ChuyenDe>();
        try {
            ResultSet rs = XHelper.query(sql, args);
            while (rs.next()) {                
                ChuyenDe entity=new ChuyenDe();
                    entity.setMaCD(rs.getString("MaCD"));
                    entity.setHinh(rs.getString("Hinh"));
                    entity.setHocPhi(rs.getDouble("HocPhi"));
                    entity.setMoTa(rs.getString("MoTa"));
                    entity.setTenCD(rs.getString("TenCD"));
                    entity.setThoiLuong(rs.getInt("ThoiLuong"));
                    list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    
}
