import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

class Parser {
    private static ArrayList<Double> arrValueX = new ArrayList<Double>();
    static  double [][] arrValue = new double[(int) Main.kolString][(int) Main.kolColumn];

    static void parse() throws IOException {
        FileInputStream fis = new FileInputStream("H:\\javaIDEA\\NeuralSet\\neuralSet.xls");

        HSSFWorkbook myWorkBook = new HSSFWorkbook(fis);

        HSSFSheet mySheet = myWorkBook.getSheetAt(0);

        for (Row row : mySheet) {
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        arrValueX.add(cell.getNumericCellValue());
                        break;
                    case  Cell.CELL_TYPE_FORMULA:
                        arrValueX.add(cell.getNumericCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        break;
                    default:
                }
            }
            System.out.println("");
        }

      int k = (int) Main.startCell;
            for (int i = 0; i < Main.kolString; i++) {
                for (int j = 0; j < Main.kolColumn; j++) {
                    if (arrValueX.size() > k) {
                        arrValue[i][j] = arrValueX.get(k);
                        k = k + 1;
                    }
                }
                k= (int) (k+Main.passCell);
        }

        for (int i =0; i< arrValue.length; i++){
            for (int j =0; j< arrValue[i].length; j++){
                System.out.println(i +" " +" "+j+ " " +arrValue[i][j] + "\t");
            }
            System.out.println("\n");
        }
    }
}







