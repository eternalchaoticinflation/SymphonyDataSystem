package symphony.domain;

public class SymphonyChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPhoneValid();
		

	}

	private static void checkPhoneValid() {
		Phone number1= new Phone();
		Phone number2= new Phone("613 222-3333");
		Phone number3= new Phone("613 2223-3333");
		Phone number4= new Phone("613 two-thre");
		System.out.println("number1 is : "+number1.isvalidphonenumber()+"\n");
		System.out.println("number2 is : "+number2.isvalidphonenumber()+"\n");
		System.out.println("number3 is : "+number3.isvalidphonenumber()+"\n");
		System.out.println("number4 is : "+number4.isvalidphonenumber()+"\n");
		
		System.out.println("number4's number is : "+number4.getphonenumber().substring(2)+"\n");
		
	}

}
