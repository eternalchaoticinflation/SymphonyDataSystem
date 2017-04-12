package symphony.domain;

public class Conductor extends Person {
	private String conductorId;
	
	public Conductor(String id, String name, String address, String conductorphoneinput) {
		super(name, address, conductorphoneinput);
		conductorId = id;
	}	
	void setId(String id) {
		conductorId = id;
	}
	String getId() {
		return conductorId;
	}	
}
