package symphony.domain;

public class Person {

private PersonalInfo info;

public Person(){
	info.setName("");
	info.setAddress("");
	info.setPhone("");
}

public Person(String name, String address, String phonenumberinput) {
	info.setName(name);
	info.setAddress(address);
	info.setPhone(phonenumberinput);
}

void setName(String name) {
	info.setName(name);
}
void setAddress(String address) {
	info.setAddress(address);
}
void setPhone(String phonenumberinput) {
	info.setPhone(phonenumberinput);
}
void setEmail(String email) {
	info.setEmail(email);
}
String getName() {
	return info.getName();
	
}
String getAddress() {
	return info.getAddress();
}
String getPhone() {
	return info.getPhone();
}
String getEmail() {
	return info.getEmail();
}
}
