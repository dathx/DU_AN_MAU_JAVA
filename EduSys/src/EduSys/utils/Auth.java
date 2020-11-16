/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.utils;

import EduSys.entity.NhanVien;

/**
 *
 * @author DMX
 */
// quản lý thông tin đăng nhập
public class Auth {
    
    public static NhanVien user = null;// duy trì user đăng nhập vào hệ thống
    
    public static void clear(){// xoa bỏ user đã đăng nhập tr đó
        Auth.user=null;
    }
    
    public static boolean isLogin(){// kiểm tra xem đăng nhập hay chưa
        return Auth.user !=null;
    }
  
    public static boolean isManager(){// kiểm tra xem người đó phải trưởng phòng ko
        return Auth.isLogin()&& user.isVaiTro();
    }
    
    
}
