package symphony.domain;

public class Time {
private Hour hour;
private Minute min;

Time(int hour, int min) {
	this.hour.setHour(hour);
	this.min.setMin(min);
}
void setHour(int hour) {
	this.hour.setHour(hour);
}
void setMin(int min) {
	this.min.setMin(min);
}
int getHour() {
	return this.hour.getHour();
}
int getMin() {
	return this.min.getMin();
}
public String toString() {
	return getHour() + ":" + getMin();
}
}
