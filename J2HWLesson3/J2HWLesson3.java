/**
 * Class J2HWLesson3 is for Java2 course HomeWork3 representing.
 *
 * @author Nadezhda Demyanik
 * @version dates Dec 23, 2017
 * @link https://github.com/GeraNius/StudyJava
 */

import java.util.*;

public class J2HWLesson3 {
	/* Array for task 1 */
    static final String[] sarray = {"круглосуточный", "сетевой", "нестандартный", "взаимный", "обоюдный", "центральный", "нестандартный", "умный", "динамичный", "уполномоченный", "трудный", "чистый", "умный", "центральный", "умный", "сетевой", "фирменный", "нестандартный", "умный", "сетевой"};
	
	public static void main(String[] args) {
		/* Executing method for task 1 */
		System.out.println("Task 1. String array");
	    countArray(sarray);
		/* task 2 */
		System.out.println("Task 2. Phone book");
		PhoneBook pb = new PhoneBook();
		/* Filling of phone book */
		pb.add("Smith","+7(123)4567890");
		pb.add("Smith","44793874923847");
		pb.add("Brown","+7(246)8101214");
		/* Getting phone number */
		String sn = "Smith";
		String ph = pb.get(sn);
		System.out.println("Phone number(s) for " + sn + (ph.isEmpty() ? " not found" : ":" + ph));
	}
	
	/* Method prints quantities of array elements */
	static void countArray(String[] array) {        
		/* Create HashMap */ 
		Map<String, Integer> hm = new HashMap<>();
		/* Loop in array */
		for(int i = 0; i < array.length; i++) {
			int count;
			/* If array element found in hashmap... */
			try {
				count = hm.get(array[i]);
				/* ...then increase value */
				hm.put(array[i],++count);
			}
			catch (NullPointerException ex) {
				/* ...else put element into hashmap */
				hm.put(array[i],1);
			}	
		}
		System.out.println(hm);		
    }

}