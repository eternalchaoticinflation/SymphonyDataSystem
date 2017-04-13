/* **************************************************************
 
 * CST 8288  Project 1 
 * 
 * Author: Wei Cui
 * Student #: 040875956
 * Phone class
 *
 *  
 * **************************************************************/

package symphony.domain;

public class Time implements ValidClass {
private Hour hour;
private Minute min;


public Time() {
	hour=new Hour(0);
	min=new Minute(0);
	hour.setHour(0);
	min.setMin(0);
}

public Time(int hourcon, int mincon) {
	this.hour=new Hour(hourcon);
	this.min=new Minute(mincon);
	min.setMin(mincon);
	hour.setHour(hourcon);

}
public Time(Hour ohour, Minute omin) {
	hour=ohour;
	min= omin;
	
}

public Time(int hourcon, Minute omin) {
	hour=new Hour();
	hour.setHour(hourcon);
	min= omin;
	
}

public Time(Hour ohour, int mincon) {
	hour=ohour;
	min=new Minute();
	min.setMin(mincon);
	
}

void setHour(int hourinput) {
	hour.setHour(hourinput);
}
void setMin(int mininput) {
	min.setMin(mininput);
}
int getHour() {
	return hour.getHour();
}
int getMin() {
	return min.getMin();
}
@Override
public String toString() {
	//contains methods that will display this like 19:09
	return hour.getHourString() + ":" + min.getMinString();
}
@Override
public boolean isValid() {
	hour.setHour(hour.getHour());
	return hour.isValid()&&min.isValid();
}
}
