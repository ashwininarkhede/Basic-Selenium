package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritedataExcel {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis=new FileInputStream(".\\\\src\\\\test\\\\resources\\\\TestData.xlsx.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.createSheet("New");
		Row rw = sh.createRow(4);
		Cell cl = rw.createCell(6);
		cl.setCellValue("Qspider");
		
		FileOutputStream fos=new FileOutputStream(".\\\\\\\\src\\\\\\\\test\\\\\\\\resources\\\\\\\\TestData.xlsx.xlsx");
		wb.write(fos);
		System.out.println("data addede successfully");
		
		
	

}


}
