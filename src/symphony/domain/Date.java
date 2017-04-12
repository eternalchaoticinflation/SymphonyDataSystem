package symphony.domain;

public class Date {
private Year year;
private Month month;
private Day day;
private Time time;

Date(int year, int month, int day, Time time) {
	setYear(year);
	setMonth(month);
	setDay(day);
	this.time = time;
}
void setYear(int year) {
	this.year.setYear(year);
}
void setMonth(int month) {
	this.month.setMonth(month);
}
void setDay(int day) {
	this.day.setDay(day);
}

int getYear() {
	return this.year.getYear();
}
int getMonth() {
	return this.month.getMonth();
}
int getDay() {
	return this.day.getDay();
}
public String toString() {
	return getMonth() + "/" + getDay() + "/" + getYear();
}
}
