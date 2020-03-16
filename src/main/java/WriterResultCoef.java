//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class WriterResultCoef {
//    static void writerResultCoef() throws IOException {
//        FileInputStream fis = new FileInputStream("H:\\javaIDEA\\NeuralSet\\weightResultCoef.xls");
//
//        // Finds the workbook instance for XLS file
//        HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);
//
//        // Return first sheet from the XLS workbook
//        HSSFSheet mySheet = myWorkBook.getSheetAt(0);
//
//        Map<String, Object [] > data = new HashMap<String, Object [] >();
//        data.put("1", new Object[] {1d, CountEuclid.arrResultWeightCoef1.get(1), CountEuclid.arrResultWeightCoef1.get(2),
//                CountEuclid.arrResultWeightCoef1.get(3), CountEuclid.arrResultWeightCoef1.get(4), CountEuclid.arrResultWeightCoef1.get(5),
//                CountEuclid.arrResultWeightCoef1.get(6), CountEuclid.arrResultWeightCoef1.get(7), CountEuclid.arrResultWeightCoef1.get(8),
//                CountEuclid.arrResultWeightCoef1.get(9), CountEuclid.arrResultWeightCoef1.get(10), CountEuclid.arrResultWeightCoef1.get(11),
//                CountEuclid.arrResultWeightCoef1.get(12)});
//        data.put("2", new Object[] {2d, CountEuclid.arrResultWeightCoef2.get(1), CountEuclid.arrResultWeightCoef2.get(2),
//                CountEuclid.arrResultWeightCoef2.get(3), CountEuclid.arrResultWeightCoef2.get(4), CountEuclid.arrResultWeightCoef2.get(5),
//                CountEuclid.arrResultWeightCoef2.get(6), CountEuclid.arrResultWeightCoef2.get(7), CountEuclid.arrResultWeightCoef2.get(8),
//                CountEuclid.arrResultWeightCoef2.get(9), CountEuclid.arrResultWeightCoef2.get(10), CountEuclid.arrResultWeightCoef2.get(11),
//                CountEuclid.arrResultWeightCoef2.get(12)});
//        data.put("3", new Object[] {3d, CountEuclid.arrResultWeightCoef3.get(1), CountEuclid.arrResultWeightCoef3.get(2),
//                CountEuclid.arrResultWeightCoef3.get(3), CountEuclid.arrResultWeightCoef3.get(4), CountEuclid.arrResultWeightCoef3.get(5),
//                CountEuclid.arrResultWeightCoef3.get(6), CountEuclid.arrResultWeightCoef3.get(7), CountEuclid.arrResultWeightCoef3.get(8),
//                CountEuclid.arrResultWeightCoef3.get(9), CountEuclid.arrResultWeightCoef3.get(10), CountEuclid.arrResultWeightCoef3.get(11),
//                CountEuclid.arrResultWeightCoef3.get(12)});
//
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
//        FileOutputStream os = new FileOutputStream("H:\\javaIDEA\\NeuralSet\\weightResultCoef.xls");
//        myWorkBook.write(os);
//    }
//}
