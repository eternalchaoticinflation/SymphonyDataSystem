package symphony.domain;

public class Person {

private PersonalInfo info;

public Person(String name, String address, Phone phone) {
	info.setName(name);
	info.setAddress(address);
	info.setPhone(phone);
}

void setName(String name) {
	info.setName(name);
}
void setAddress(String address) {
	info.setAddress(address);
}
void setPhone(Phone phone) {
	info.setPhone(phone);
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
Phone getPhone() {
	return info.getPhone();
}
String getEmail() {
	return info.getEmail();
}
}
