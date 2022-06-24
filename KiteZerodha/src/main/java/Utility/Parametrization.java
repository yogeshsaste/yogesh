package Utility;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parametrization {

	
	
	public static String getdata(String SheetName, int row , int cell ) throws Exception {
	
	
	FileInputStream file = new FileInputStream("C:\\Yogesh\\eclipse\\Yogesh.xlsx");
	
	String value = WorkbookFactory.create(file).getSheet(SheetName).getRow(row).getCell(cell).getStringCellValue();
	return value;
}
	
	//public static void main(String[] args) throws Exception {
		
		//Parametrization obj = new Parametrization ();
		
		//String user = Parametrization.getdata("one",0,1);
		//System.out.println(user);
		
	//}
}


