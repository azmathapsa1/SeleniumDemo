package frameworkdemo.genericmethod;

import java.security.PublicKey;

import javax.annotation.processing.FilerException;
import javax.crypto.EncryptedPrivateKeyInfo;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class XL {
public static  int getRowCount(String path,String sheet) {

	int rc=-1;
	try {
		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		
		rc=wb.getSheet(sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return rc;
}
public  static int getCellCount(String path,String sheet)
{
	int cc=-1;
	try
	{

		Workbook wb=WorkbookFactory.create(new FileInputStream(path));
		cc=wb.getSheet(sheet).getRow(0).getLastCellNum();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return cc;
}

 public static String getdata(String path,String sheet,int r,int c)
 {
	 String v=" ";
	 try
	 {
	Workbook wb=WorkbookFactory.create(new FileInputStream(path));
	 v = wb.getSheet(sheet).getRow(r).getCell(c).toString();
	 System.out.println("Cell Value  "+v);
 }
 catch(Exception e)
	{
		e.printStackTrace();
	}
	return v;
}
 
	
	
}

