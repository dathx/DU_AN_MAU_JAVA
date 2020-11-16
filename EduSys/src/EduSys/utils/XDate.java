/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author DMX
 */
public class XDate {// xử lý dữ liệu thời gian
    static SimpleDateFormat format = new SimpleDateFormat();
    
   
    public static Date  toDate(String date, String pattern) {
        try {
            format.applyPattern(pattern);
            java.util.Date date1 = format.parse(date);
            java.sql.Date myDate = new java.sql.Date(date1.getTime());
            return myDate;
        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public static String toString(Date date,String pattern){// chuyển ngày hiện tại thành chuỗi now,"dd-MM-yyyy"
        format.applyPattern(pattern);
        return format.format(date);
    }
    
    public static Date addDays(Date date,long days){ //bổ sung ngày vào trong ngày hiện tại
        date.setTime(date.getTime()+days*24*60*60*1000);
        return date;
    }
}
