package apachePoi;

import jdk.swing.interop.SwingInterOpUtils;
import org.apache.poi.ss.usermodel.*;

import java.io.*;

public class ReadingPoi {

    public static void main(String[] args) throws IOException {

        File file = new File("C:\\fileWriting\\myExcelFile.xlsx");
        FileInputStream fileInputStream = new FileInputStream(file);

        Workbook workbook = WorkbookFactory.create(file);

        Sheet sheet = workbook.getSheet("0");

        for(Row row : sheet){

            for(Cell cell : row){

                switch (cell.getCellType())
                {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\\t");
                        break;
                    case BLANK:
                        System.out.print("Blank values"+ "\\t");
                }
            }
            System.out.println();
        }




//        Row row0 = sheet.getRow(0);
//        Cell cell0 = row0.getCell(0);
//
//        System.out.println(cell0);

        fileInputStream.close();
    }

}
