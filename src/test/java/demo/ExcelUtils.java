package demo;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectpath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		getRowCount();
		getCellData();
	}
	
	public static void getRowCount() {
		
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath + "\\Data\\TestData.xlsx");
			sheet = workbook.getSheet("Sheet1");
			int rowcount = sheet.getPhysicalNumberOfRows();
			System.out.println("Number of rows: "+rowcount);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void getCellData() {
		try {
			projectpath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectpath + "\\Data\\TestData.xlsx");
			sheet = workbook.getSheet("Sheet1");
			String celldata = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(celldata);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

	
}
