//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.*;
//
//public class WriterCoef {
//    static void writer() throws IOException {
//
//        FileInputStream fis = new FileInputStream("H:\\javaIDEA\\NeuralSet\\weightCoef.xls");
//
//        // Finds the workbook instance for XLS file
//        HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);
//
//        // Return first sheet from the XLS workbook
//        HSSFSheet mySheet = myWorkBook.getSheetAt(0);
//
//        Map<String, Object [] > data = new HashMap<String, Object [] >();
//      //  for (int i = 0; i < WeightCoef.arrWeightCoef.length; i++) {  //строки
//
//            for (int j = 0; j < WeightCoef.arrWeightCoef.length; j++) { //столбцы
//                data.put("1", new Object[]{1d, WeightCoef.arrWeightCoef[0][j]});
//                data.put("2", new Object[]{2d, WeightCoef.arrWeightCoef[1][j]});
//                data.put("3", new Object[]{3d, WeightCoef.arrWeightCoef[2][j]});
//            }
//        // Set to Iterate and add rows into XLS file
//        Set<String> newRows = data.keySet();
//
//        // get the last row number to append new data
//        int rownum = mySheet.getLastRowNum();
//
//        for (String key : newRows) {
//
//            // Creating a new Row in existing XLSX sheet
//            Row row = mySheet.createRow(rownum++);
//            Object [] objArr = data.get(key);
//            int cellnum = 0;
//            for (Object obj : objArr) {
//                Cell cell = row.createCell(cellnum++);
//                if (obj instanceof String) {
//                    cell.setCellValue((String) obj);
//                } else if (obj instanceof Boolean) {
//                    cell.setCellValue((Boolean) obj);
//                } else if (obj instanceof Date) {
//                    cell.setCellValue((Date) obj);
//                } else if (obj instanceof Double) {
//                    cell.setCellValue((Double) obj);
//                }
//            }
//        }
//
//        // open an OutputStream to save written data into XLSX file
//        FileOutputStream os = new FileOutputStream("H:\\javaIDEA\\NeuralSet\\weightCoef.xls");
//        myWorkBook.write(os);
//    }
//}
