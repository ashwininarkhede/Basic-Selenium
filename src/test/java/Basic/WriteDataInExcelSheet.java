package Basic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcelSheet {

	public static void main(String[] args) throws Throwable, IOException {
		//set the path
		FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\Desktop\\Book2.xlsx");
		//open workbook in read mode
		Workbook book = WorkbookFactory.create(fis);
		//get the control to the sheet
		Sheet sh = book.getSheet("Sheet2");
		//get the control on row
		Row row = sh.getRow(4);
		Cell cell = row.createCell(4);
		 cell.setCellValue("Oppo");
		 FileOutputStream fos=new FileOutputStream("C:\\Users\\Admin\\Desktop\\Book2.xlsx");
		 book.write(fos);
		// book.close();

	}

}
