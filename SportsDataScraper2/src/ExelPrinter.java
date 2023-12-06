
/**
 * 
 */

/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.apache.

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class ExelPrinter {

	/**
	 * 
	 */
	public ExelPrinter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {

		printer("TestInput.txt");

	}

	public static void printer(String input) throws FileNotFoundException {
		File inputFile = new File(input);

		Scanner inputReader = new Scanner(inputFile);
		ArrayList<ArrayList<String>> file = new ArrayList<ArrayList<String>>();
		do {
			ArrayList<String> CLine = new ArrayList<String>();
			String next = inputReader.nextLine();
			System.out.println(next);
			while (next.indexOf(" ") != -1) {
				//System.out.print("x");
				CLine.add(next.substring(0, next.indexOf(" ")));
				next=next.substring(next.indexOf(" ")+1);
				//System.out.println(next);

			}
			CLine.add(next);

			file.add(CLine);

		} while (inputReader.hasNextLine());
		inputReader.close();
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet spreadsheet = workbook.createSheet(" Output data ");

		for (int i = 0; i < file.size(); i++) {
			XSSFRow row = spreadsheet.createRow(i);
			// System.out.println(i);
			for (int ii = 0; ii < file.get(i).size(); ii++) {
				Cell cell = row.createCell(ii);
				cell.setCellValue(file.get(i).get(ii));
			}

		}

		FileOutputStream out = new FileOutputStream(new File("Output/Data.xlsx"));
//System.out.println("ff");
		try {
			workbook.write(out);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
