/**
 * Class PhoneBook for task 2
 *
 * @author Nadezhda Demyanik
 * @version dates Dec 23, 2017
 * @link https://github.com/GeraNius/StudyJava
 */

import java.util.*;
	 
public class PhoneBook {
	protected List<String[]> entries;    
	
	/* Constructor */
	public PhoneBook() {
		this.entries = new ArrayList<String[]>();
    }
	
	/* Method adds entry to phone book */
	public void add(String surname, String phone) {
		String[] newEntry =  {surname, phone};
		this.entries.add(newEntry);
    }

	/* Method gets phones from phone book for person's surname */
    public String get(String surname) {
		String phones = "";
		for (String[] entry : this.entries) {
			if (surname.equals(entry[0])) {
				if (!phones.isEmpty()) {
					phones += "; ";
				}
				phones += entry[1];
			}			
		}
        return phones;
    }
	
}