/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author DMX
 */
public class XImage {
    
    public static Image getAppIcon(){// gắn icon cho app
        URL url= XImage.class.getResource("/EduSys/Icon/LogoBee.png");
        return new ImageIcon(url).getImage();
    }
    
    public static void save(File src){// copy file cất vào thư mục của ứng dụng
        File dst = new File("logos",src.getName());
        if(!dst.getParentFile().exists()){
            dst.getParentFile().mkdirs();// tạo thư mục logos nếu chưa tồn tại
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from,to,StandardCopyOption.REPLACE_EXISTING);// copy file vào thư mục logo
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public static ImageIcon read(String fileName){//đọc --> hiển thị hình lên label
        File path = new File("logos",fileName);
        return new ImageIcon(path.getAbsolutePath());
    }
}
