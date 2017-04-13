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

/**
 *  
 * A Minute object implements ValidClass
 * it also has an isValid() method overrides interface,
 * setters and constructors can take integer, double and String.
 * changes all argument to integer.
 * checks to see if it is a valid minute, not negative, not <59 minutes, not over 60 minutes 
 * 
 * 
 * 
 * 
 * 
 * @param 	min         	    int
 * @param 	minuteinput			double
 * @param 	minuteinput			int
 * @param 	minuteinput			String
 * @param 	validminute 		boolean
 */

public class Minute implements ValidClass {
	private int min;
	
	private boolean validminute=false;

	public Minute(){
		validminute=false;
		min = 0;
	}
	public Minute(int minuteinput){
		setMin(minuteinput);
		
	}

	public Minute(double minuteinput){
		setMin((int)minuteinput);
		
	}
	public Minute(String minuteinput){
		String mlatch=minuteinput.replaceAll("[\\s\\-() ]", "");
		 if (mlatch.matches("[0-9]+")){
			 setMin(Integer.parseInt(minuteinput));
		 }
		else {			
				min = 1111;
				validminute=false;
		}
		
	}

	public void setMin(int mininput) {
		/*** 
		 * Takes mininput as input and uses if else conditions to check, if it is a valid Minute.
		 * if it is not validminute is false 
		 * 
		 * @param 	minuteinput			int
		 *
		 * @param 	validminute 		boolean
		 */
		
		
		if (mininput<=59 && mininput >=0){
			validminute=true;//could use dialog alerts and while loop
		
			min = mininput;}
		else {			
				min = 1111;
				validminute=false;
		}
		
	}
	public int getMin() {
		return min;
	}
	
	public String getMinString() {
		String minutedisplay="";
		if (min<=9){
			minutedisplay=("0"+Integer.toString(min));
		}
		else{
			minutedisplay=(Integer.toString(min));
		}
		
		return minutedisplay;
	}
	@Override
	public boolean isValid() {
		
		return validminute;
	}
}
