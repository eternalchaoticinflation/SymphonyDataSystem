package symphony.domain;

public class Contact {
private Phone phone;
private String email;

void setPhone(Phone phone) {
	this.phone = phone;
}
void setEmail(String email) {
	this.email = email;
}
Phone getPhone() {
	
	return phone;
}
String getEmail() {
	return email;
}
}
