package symphony.domain;

public class Contact {
private Phone phone;
private String email;

void setPhone(String phonenumberin) {
	
	phone = new Phone(phonenumberin);
}
void setEmail(String email) {
	this.email = email;
}
String getPhone() {
	
	return phone.getphonenumber();
}
String getEmail() {
	return email;
}
}
