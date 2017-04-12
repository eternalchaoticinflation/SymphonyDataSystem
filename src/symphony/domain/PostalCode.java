package symphony.domain;

public class PostalCode {
	String firstseg;
	String secondseg;
	String codelatch;
	String totalCode;
	boolean validCode;
	
	
	public PostalCode(){//no arg
		//default
		firstseg="invalid";
		secondseg="code";
		validCode=false;
		totalCode="invalid code!";
	}
	public PostalCode(String oneInput){
		codelatch=oneInput.replaceAll("[\\s\\-() *]", "");
		//uses codelatch.matches("[0-9a-zA-Z]+") from JavaRegex to check if it matches characters
		this.setCode(codelatch);
		
	}
	public PostalCode(String fir, String sec){
		codelatch=fir+sec;
		codelatch.replaceAll("[\\s\\-() *]", "");
		this.setCode(codelatch);
		
	}
	
	
	
	public void setCode(String inputCode){
		//totalCode is the one we are intrested in
		
		if (inputCode.length() == 6 && inputCode.matches("[0-9a-zA-Z]+")){
			//check further
			validCode=true;
			firstseg=inputCode.substring(0,3);
			secondseg=inputCode.substring(3);
			totalCode=firstseg+" "+secondseg;
		}
		else{
			firstseg="invalid";
			secondseg="code";
			totalCode="invalid code!";
			
			validCode=false;
			
			
		}
		
	}
	public boolean isValidCode(){
		return validCode;
		}
	
	public String getCode(){
	return totalCode;
	}
}
