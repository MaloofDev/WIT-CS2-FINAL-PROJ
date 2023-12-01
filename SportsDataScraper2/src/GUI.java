import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class GUI {

	public GUI() {

	}

	public static void main(String[] args) throws FileNotFoundException {
		Sort("TestInput.txt", 2);
	}

	public static void Sort(String input, int column) throws FileNotFoundException {
		File inputFile=new File(input);
		Scanner fileReader = new Scanner(inputFile);
		ArrayList<Float> vals = new ArrayList<Float>();
		 //System.out.println(fileReader.nextLine());

		while (fileReader.hasNextLine() == true) {
			for (int i = 0; i < column; i++) {
				//fileReader.next(" ");
				fileReader.next();
				//fileReader.nextFloat();
			}
			vals.add(fileReader.nextFloat());
			fileReader.nextLine();

		}
		float[] valorder = new float[vals.size()];
		int order = 0;
		for (int i = 0; i < valorder.length; i++) {
			valorder[i] = order;
			order++;
		}
		for (int i = 0; i < vals.size(); i++) {

			for (int ii = 0; ii < vals.size(); ii++) {
				//System.out.println(vals.size()+" "+i+" "+ii);
				if(vals.get(i)>vals.get(ii)) {
					float temp=vals.get(i);
					vals.set(i, vals.get(ii));
					vals.set(ii, temp);
					
					float ordertemp =valorder[i];
					valorder[i]= valorder[ii];
					valorder[ii]= ordertemp;
				}

			}

		}
		for (int i = 0; i < vals.size(); i++) {
			//System.out.println(vals.get(i));
			//System.out.println(valorder[i]);
			Scanner newReader = new Scanner(inputFile);
			//System.out.println(newReader.nextLine());
			for(int ii=0;ii<=valorder[i];ii++) {
				//System.out.println(newReader.nextLine());
				newReader.nextLine();
			}
			System.out.println(newReader.nextLine());
		}

	}

}
