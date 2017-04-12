/* **************************************************************
 
 * CST 8288  Project 1 
 * 
 * Author: Wei Cui
 * Student #: 040875956
 * Phone class
 *
 *  
 * **************************************************************/
package symphony.domain;

public class Phone {
	
	private String phonenumber;
	private boolean validphonenumber=false;
	
	/** This class makes a phone and checks to see if it is valid
	 * the validphonenumber checks it is 
	 * 
	 * @param phonenumber
	 * @param validphonenumber
	 *  
	 *************************************************************/
	public Phone(){//null constructor
		//will have a valid phone number, can be parsed to check if valid
		this.phonenumber ="6131234567" ; 
	}
	
	public Phone(String coninputnumber	){
		
		
		this.phonenumber = coninputnumber.replaceAll("[\\s\\-() ]", "");
	}

	/* ACCESSORS	-----------------------------------------------------	*/
	
	/**
	 * Returns the phonenumber whether true or false
	 * @return phonenumber 
	 *************************************************************/
	public String getphonenumber() {
		return (phonenumber.substring(0, 3)+" "+phonenumber.substring(3, 6)+"-"+phonenumber.substring(6));
	}
	
	
	
	/**
	 * gets the inputer number replaces space \\ - () to make a real number
	 * @param inputnumber
	 *************************************************************/
	public void setPhone(String inputnumber) {
		this.phonenumber = inputnumber.replaceAll("[\\s\\-() ]", "");;
	}	
	
	public boolean isvalidphonenumber(){
		
		/**
		 * check a real phonenumber length 10 containing only numbers
		 * else returns false.
		 * @param inputnumber
		 * @return validphonenumber 
		 *************************************************************/
		if (phonenumber.matches("[0-9]+") && phonenumber.length() == 10 ){
			//check further
			validphonenumber=true;
		}
		else{
			validphonenumber=false;
		}
		
		return validphonenumber;
	}
	
	
}	
