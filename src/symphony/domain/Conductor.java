package symphony.domain;

public class Conductor extends Person {
	private String id;
	
	public Conductor(String id, String name, String address, Phone phone) {
		super(name, address, phone);
		this.id = id;
	}	
	void setId(String id) {
		this.id = id;
	}
	String getId() {
		return this.id;
	}	
}
