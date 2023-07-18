package Basic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//set the path
		FileInputStream fis =new FileInputStream("C:\\Users\\Admin\\Desktop\\Book.xlsx");
		//open workbook in read mode
		Workbook book = WorkbookFactory.create(fis);
		//get the control to the sheet
		Sheet sh = book.getSheet("Sheet1");
		//get the control on row
		Row row = sh.getRow(1);
		//get the control on cell
		Cell cell = row.getCell(2);
		String data = cell.getStringCellValue();
		System.out.println(data);
		

	}

}
