package symphony.domain;

import symphony.domain.Address;
//import symphony.domain.Name;
import symphony.domain.Person;
import symphony.domain.Phone;

public class Soloist extends Person {
	
	/**
	 * A Soloist is a Person object, therefore have a Name object associated with it
	 * it also has an Address
	 * also a phone
	 * 
	 * @param 	name			Name
	 * @param 	address			Address
	 * @param 	phone			Phone
	 * @param 	expertise		String
	 */
	
	private int id;
	
	public Soloist(int id, String name, String address, Phone phone) {
		super(name, address, phone);
		this.id = id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}
}

/*
public class Soloist extends Person {
	
	
	
	/**
	 * Soloist uses the super constructor from person to set Name, Address, and Phone.
	 * It makes use of Name, Address, and Phone.
	 * This constructor also sets expertise which is a String.
	 * 
	 * @param 	name			Name
	 * @param 	address			Address
	 * @param 	phone			Phone
	 * @param 	expertise		String
	 */
	//public Soloist(Name name, Address address, Phone phone, String expertise) {
	//	super(name, address, phone);
	//	this.expertise = expertise;
//	}


	
	/**
	 * Get a String that holds the expertise of the Soloist.
	 * 
	 * @return	String
	 */
	//public String getExpertise() {
	//	return this.expertise;
	//}

	
	/**
	 * Set the String that holds the expertise of the Soloist.
	 * 
	 * @param 	expertise	String
	 */
	//public void setExpertise(String expertise) {
	//	this.expertise = expertise;
	////}

											

	
	//private String expertise;


//}	

