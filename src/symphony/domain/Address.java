package symphony.domain;

public class Address {
private String address;
private PostalCode postal;

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
