package File_Handling;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ApachePOI_prac {

	public static void main(String[] args) throws IOException {
		
		FileInputStream f = new FileInputStream("D:\\Users\\Srivastav\\Desktop\\ZtoH\\apachePOIprac.xlsx");
		
		XSSFWorkbook w = new XSSFWorkbook(f);
		XSSFSheet s = w.getSheet("Sheet1");
		//Range usedRange= sheet.
		int rows=s.getLastRowNum();//Getting last row number to get number of rows in excel sheet
		
		int col=s.getRow(0).getLastCellNum(); //This is done to get no.of columns
		Object[][] objects = new Object[rows+1][col];//Array of objects(This array can store any type of datatypes and so we can use this to store all kinds of values from excel
		System.out.println(rows+"  "+col);//Printing rows and columns, row gives 1 less than than actual rows in excel as row size starts from 0
		
		for(int r=0;r<=rows;r++) {
			
			XSSFRow row = s.getRow(r);
			
			for(int c=0;c<col;c++) {
				
				XSSFCell cell = row.getCell(c);
				
				switch (cell.getCellType()) { //cell.getCellType() is used to get the datatype of the value inside the cell
				case STRING:
						
						objects[r][c]=cell.getStringCellValue();
						//System.out.println(cell.getStringCellValue());
						break;
				case NUMERIC:
					
					objects[r][c]=cell.getNumericCellValue();
					//System.out.println(cell.getNumericCellValue());
					break;
				case BOOLEAN:
					objects[r][c]=cell.getBooleanCellValue();
					//System.out.println(cell.getBooleanCellValue());
					break;
				
				default:
					System.out.println("invalid data type found");
					break;
				}
			}
			//System.out.println();
		}
		
		for(int i=0;i<=rows;i++) {
			
			for(int j=0;j<col;j++) {
				System.out.print(objects[i][j]+"   ");
			}
			System.out.println();
		}
		
		//Getting certain data
		for(int i=2;i<=3;i++) {//here we are trying to access row 3 and 4 data
			
			for(int j=0;j<col;j++) {
				System.out.print(objects[i][j]+"   ");
			}
			System.out.println();
		}
		
		for(int i=0;i<=rows;i++) {//here we are trying to access row 3 and 4 data
			
			for(int j=0;j<col;j++) {
				System.out.print(objects[i][j]+"   ");
			}
			System.out.println();
		}
		
	}

}
