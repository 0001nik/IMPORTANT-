package Selenium;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {

		// specify the location of excel file
		File src = new File("E:\\EDUCATION\\CORE JAVA\\Demo.xlsx");

		// Load File
		FileInputStream fis = new FileInputStream(src);

		// Load Workbook
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		// Load Worksheet
		XSSFSheet sh = wb.getSheet("DemoSheet");

		// print the name of loaded sheet
		System.out.println(sh.getSheetName());

		// print username from sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());

		// print p2 from sheet
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());
		
		//print total rows from sheet
		System.out.println("Total rows :- " +sh.getPhysicalNumberOfRows());
		
		//print total rows from sheet-2nd way
		System.out.println(sh.getLastRowNum()); 	 //here inder will work and o/p=5
		System.out.println(sh.getFirstRowNum());	 //here inder will work and o/p=0
		int rows = (sh.getLastRowNum() - sh.getFirstRowNum()) + 1 ;
		System.out.println("Total rows :- " + rows);  //6
		
		//print total rows from sheet-2nd way
		System.out.println(sh.getLastRowNum() + 1 );
		
		//print total no of columns -- 1st way
		System.out.println(sh.getRow(0).getPhysicalNumberOfCells());  //2
		
		//print total no of columns -- 2nd way
		System.out.println(sh.getRow(0).getLastCellNum());  //it will not work on basis of indexing
		
		//print total no of columns -- 3rd way
		int columns = sh.getRow(0).getLastCellNum();
		System.out.println("Total columns :-" +columns);
		
		//print all cells of excel sheet
		for(int i=0 ; i<rows ; i++) {
			for(int j=0 ; j<columns ; j++) {
				System.out.println(sh.getRow(i).getCell(j).getStringCellValue());
			}
		}
	}

}
