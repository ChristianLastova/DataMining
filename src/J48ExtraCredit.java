import java.io.File;
import java.util.Scanner;

import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;
import weka.core.Instances;
import java.io.BufferedReader;
import java.io.FileReader;

public class J48ExtraCredit {

	public static void main(String[] args) throws Exception {
//		System.out.println("Enter a data set name: ");
//		Scanner console = new Scanner(System.in);
//		String temp = console.next().toUpperCase();
//		System.out.println("tempname: " + temp);
//		String filename = "";
//		if (temp.equals("IRIS")) {
//			filename = "iris.txt";
//			System.out.println("filename: "+filename);
//		} else if (temp.equals("WINE")) {
//			filename = "wine.data";
//		} else {
//			System.out.println("No file found, restart and try again.");
//		}

		// WekaJ48 dataSet = new WekaJ48(WekaJ48.getReader(filename));
		//
		// List dataList = new ArrayList<String>(dataSet.weka("Iris-setosa",
		// filename));

		// System.out.println(dataList);

		// output usage

		
		
//		File file = new File("wine.data");
//		Scanner fileScanner = new Scanner(file);
//
//		Instances instances = DataSource.read("wine.data");
//		
//		System.out.println(instances);
		

		 
		 BufferedReader reader = new BufferedReader(
		                              new FileReader("iris.arff"));
		 Instances data = new Instances(reader);
		 reader.close();
		 // setting class attribute
		 data.setClassIndex(data.numAttributes() - 1);
	}

}
