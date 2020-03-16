//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class WriterNormalTable {
//static void writerNormal() throws IOException {
//    FileInputStream fis = new FileInputStream("H:\\javaIDEA\\NeuralSet\\normalTable.xls");
//
//    // Finds the workbook instance for XLS file
//    HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);
//
//    // Return first sheet from the XLS workbook
//    HSSFSheet mySheet = myWorkBook.getSheetAt(0);
//
//    Map<String, Object[]> data = new HashMap<String, Object[]>();
////    for (int i = 0; i < Normalize.arrNorm.length; i++) {
////        for (int j = 0; j <  Normalize.arrNorm[i].length; j++) {
//            data.put("1", new Object[]{1d, Normalize.arrNorm});
//
////        }
////    }
//    // Set to Iterate and add rows into XLS file
//    Set<String> newRows = data.keySet();
//
//    // get the last row number to append new data
//    int rownum = mySheet.getLastRowNum();
//
//    for (String key : newRows) {
//        Row row = mySheet.createRow(rownum++);
//        Object[] objArr = data.get(key);
//        int cellnum = 0;
//        for (Object obj : objArr) {
//            Cell cell = row.createCell(cellnum++);
//            if (obj instanceof String) {
//                cell.setCellValue((String) obj);
//            } else if (obj instanceof Boolean) {
//                cell.setCellValue((Boolean) obj);
//            } else if (obj instanceof Date) {
//                cell.setCellValue((Date) obj);
//            } else if (obj instanceof Double) {
//                cell.setCellValue((Double) obj);
//            }
//        }
//    }
//
//    // open an OutputStream to save written data into XLSX file
//    FileOutputStream os = new FileOutputStream("H:\\javaIDEA\\NeuralSet\\normalTable.xls");
//    myWorkBook.write(os);
//   }
//}