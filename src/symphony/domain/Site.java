package symphony.domain;

public class Site extends Address{
	private int totalseats;
	/**
	 * 
	 *Site
 	 *has some total seats extends Address most important to have postal code and seats available
	 * 
	 * Should Construct site with a valid address, valid postal code 
	 * 
	 * 
	 * @param 	constructaddress			String
	 * @param 	constructPostal	 		   	String
	 * @param 	seats						int
	 * @param 	inputexpertise				String
	 */
	public Site(){
		super();
		totalseats=0;
		
	}
	public Site(int seats){
		super();
		totalseats=seats;
		
	}
	public Site(String constructaddress, String constructPostal,int seats){		
		super(constructaddress, constructPostal);//public Address(String constructaddress, String constructPostal)
		totalseats=seats;
		
	}
	public void setSeats(int seatsIn){
		totalseats=seatsIn;
	}
	public int getSeats(){
		return totalseats;
	}

}
