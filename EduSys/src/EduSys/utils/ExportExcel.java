/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EduSys.utils;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author DMX
 */
public class ExportExcel {
    public static void exportTable(JTable table) throws IOException {
        TableModel model = table.getModel();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Table Sheet");
        Row row;
        Cell cell;
        try {
            // write the column headers
            row = sheet.createRow(0);
            for (int j = 0; j < model.getColumnCount(); j++) {
                cell = row.createCell(j);
                cell.setCellValue(model.getColumnName(j));
            }
            for (int i = 0; i < model.getRowCount(); i++) {
                row = sheet.createRow(i + 1);

                for (int j = 0; j < model.getColumnCount(); j++) {
                    cell = row.createCell(j);
                    cell.setCellValue(model.getValueAt(i, j).toString());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        FileOutputStream excelFIS;
        try {
            String ten=JOptionPane.showInputDialog("Nhập tên file muốn lưu:");
            excelFIS = new FileOutputStream(ten+".xlsx");
            workbook.write(excelFIS);
            workbook.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
