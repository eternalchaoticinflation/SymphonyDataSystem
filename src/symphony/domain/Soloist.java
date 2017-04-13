package symphony.domain;

import symphony.domain.Address;

import symphony.domain.Person;
import symphony.domain.Phone;

public class Soloist extends Person {
	
	/**
	 *  
	 * A Soloist is a Person object, therefore have a Name object associated with it
	 * it also has an Address
	 * also a phone
	 * 
	 * An Address Class and Address Class and a Phone Class should be made 
	 * 
	 * 
	 * @param 	inputname			String
	 * @param 	inputaddress	    String
	 * @param 	inputphone			Phone
	 * @param 	inputexpertise		String
	 */
	
	private String soloistId;
	private String soloexpertise; // this is the specalization.
	//could have arry or Hashmap to check if vaild expert
	public Soloist(){
		super();
	}
	
	public Soloist(String inputid, String inputname, String inputaddress, String inputphone) {
		//so first you have to make a Person with a name and an address and a Phone, before making a 
		//Soloist
		super(inputname, inputaddress, inputphone);
		soloistId = inputid;
		
	}
	
	public void setId(String inputid) {
		soloistId  = inputid;
	}

	public String getId() {
		/**
		 * returns the id of the Soloist
		 * 
		 *
		 * @param 	id		String
		 */
		return soloistId;
	}
	
	public void setSoloistexpertise(String expertiseInput){
		//Input the soloist's expertise
		soloexpertise=expertiseInput;
		
	}
	
	public String getSoloistexpertise(){
		/**
		 * returns specialization of Soloist
		 * if none, then assgins Generalist
		 *
		 *
		 * @return  soloexpertise    String
		 */
		//Input the soloist's expertise
		if (soloexpertise.isEmpty()){
			soloexpertise="Generalist";
		}
		
		return soloexpertise;
		
	}



}



