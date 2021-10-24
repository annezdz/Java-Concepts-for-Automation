package apachePoi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingExcel {

    public static void main(String[] args) throws IOException {

        //Create Workbook

        XSSFWorkbook workbook = new XSSFWorkbook();

        //Create sheet
        XSSFSheet sheet0 = workbook.createSheet("firstSheet");

        //Create Roll
        Row row0 = sheet0.createRow(0);

        //Create Cell
        Cell cellA = row0.createCell(0); // mundando esses numeros ele apenas muda a células na planilha
        Cell cellB = row0.createCell(1);


        //Set cells
        cellA.setCellValue("first cell");
        cellB.setCellValue("second cell");

        //Creating 10 coluns and 10 rows with for


        for(int rows = 0; rows < 10; rows++){
            Row row = sheet0.createRow(rows);
            for(int cols = 0; cols < 10; cols ++){
                Cell cell = row.createCell(cols);
                cell.setCellValue(Math.random() * 100);
            }
        }

        //Connecting Streams
        File file = new File("C:\\fileWriting\\myExcelFile.xlsx");
        FileOutputStream outputStream = new FileOutputStream(file);

        workbook.write(outputStream);

        outputStream.close();

        System.out.println("File Created !");

    }
}
