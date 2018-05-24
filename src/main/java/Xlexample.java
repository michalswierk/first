import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Xlexample {

  private static final String FILE_NAME = "C:\\Users\\Ania\\Desktop\\plik.xls";
  private String name;

  public static void main(String[] args) {

    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("kolimn");
    ArrayList<ArrayList<String>> kolumn = new ArrayList<>();
    ArrayList<String> tytuly = new ArrayList<>();




    Map<String,String> rows = new HashMap<>();
    rows.put("eeee","sssss");




    /*Object[][] datatypes = {
        {"Datatype", "Type", "Size(in bytes)"},
        {"int", "Primitive", 2},
        {"float", "Primitive", 4},
        {"double", "Primitive", 8},
        {"char", "Primitive", 1},
        {"String", "Non-Primitive", "No fixed size"}
    };*/

    int rowNum = 0;
    System.out.println("Creating excel");

    for (ArrayList<String> datatype : kolumn) {
      Row row = sheet.createRow(rowNum++);
      int colNum = 0;
      for (Object field : datatype) {
        Cell cell = row.createCell(colNum++);
        if (field instanceof String) {
          cell.setCellValue((String) field);
        } else if (field instanceof Integer) {
          cell.setCellValue((Integer) field);
        }
      }
    }

    try {
      FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
      workbook.write(outputStream);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("Done");


  }


public static void tabelka(String imie,String nazwisko,String adress  ){
    
}
}

