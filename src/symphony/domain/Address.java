package symphony.domain;

public class Address {
private String address;
private PostalCode postal;

public Address(){
	address="invalid address";
	postal = new PostalCode ("invalid address");
}

public Address(String constructaddress, String constructPostal){
	this.setAddress(constructaddress);;
	this.setPostal(constructPostal);
}

void setAddress(String inaddress) {
	this.address = inaddress;
}
void setPostal(String inpostalCode) {
	postal = new PostalCode (inpostalCode);
}
String getAddress() {
	return address;
}
String getPostal() {
	
	return postal.getCode();
}
}
