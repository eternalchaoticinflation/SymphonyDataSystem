package symphony.domain;
/**
 * 
 * 
 * @author Richard
 *
 */
public class PersonalInfo {
private String name;
private Address address;
private Contact contact;

PersonalInfo() {}

void setName(String name) {
	this.name = name;
}
void setAddress(String address) {
	this.address.setAddress(address);
}
void setPhone(String phonenumin) {
	contact.setPhone(phonenumin);
}
void setEmail(String email) {
	contact.setEmail(email);
}
String getName() {
	return this.name;
}
String getAddress() {
	return this.address.getAddress();
}
String getPhone() {
	return this.contact.getPhone();
}
String getEmail() {
	return this.contact.getEmail();
}
}
