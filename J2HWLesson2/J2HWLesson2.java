import java.io.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Class J2HW2 is for Java2 course HomeWork2 representing.
 *
 * @author Nadezhda Demyanik
 * @version dates Dec 23, 2017
 * @link https://github.com/GeraNius/StudyJava
 */
public class J2HWLesson2 {

    public static void main(String[] args) {
        System.out.println("Starting main method...");
		
		String[][] arr;
		int n = 0;		
		try (BufferedReader file = new BufferedReader(new FileReader(args[0]))) {
			/* Try to read file to list of arrays */
			String line = null;
			List<String[]> lines = new ArrayList<String[]>();
			while ((line = file.readLine()) != null) {
				String[] elems =  line.split(";");
				lines.add(elems);
				if (elems.length > n) 
					n = elems.length;
            }
			/* Trasforming list to two-dimensional string array*/
			arr = new String[lines.size()][n];
			int i = 0;
			for (String[] items : lines) {
			    for(int j=0;j<n;j++) {
					try {
						arr[i][j] = items[j];
					}
					catch(ArrayIndexOutOfBoundsException ex) {
						arr[i][j] = "0";
					}
				}				    
				i++;
			}
			/* Try to use sumArray method*/
		    try {
                System.out.println("Array sum = " + sumArray(arr));
		    } catch(Exception ex) {
			    System.out.println("Array sum can't be calculated because of " + ex);
		    }			
        } catch (IOException ex) {
            ex.printStackTrace();
        }		
        System.out.println("Main done!");
    }

    private static String sumArray (String[][] stringArray) {
        int n = 4;
        int arraySum = 0;
		String result = "";
        if (stringArray.length != n) {
            throw new ArrayIndexOutOfBoundsException("Array size is not right");
        } else {
            for (int i = 0; i < stringArray.length; i++) {
                if (stringArray[i].length != n) {
                    throw new ArrayIndexOutOfBoundsException("Array size is not right");
                } else {
                    for (int j = 0; j < stringArray[i].length; j++) {
                        try {
                            arraySum += Integer.parseInt(stringArray[i][j]);
                        } catch (NumberFormatException ex) {
							result += "Not int value in the cell " + (i + 1) + "," + (j + 1) + "; ";
                        }
                    }					
                }
            }
        }
		if (result.isEmpty())
            return String.valueOf(arraySum);
	    else
			throw new NumberFormatException(result);
    }
}
