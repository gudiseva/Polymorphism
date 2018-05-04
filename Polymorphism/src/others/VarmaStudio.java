package others;

import java.io.File;

public class VarmaStudio {

	public VarmaStudio() {}

	public static void main(String[] args) {

		File folder = new File("/Users/ArvindGudiseva/Desktop/SELECTED/BZA");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        //System.out.println("File " + listOfFiles[i].getName());
		        System.out.println(listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }


	}

}
