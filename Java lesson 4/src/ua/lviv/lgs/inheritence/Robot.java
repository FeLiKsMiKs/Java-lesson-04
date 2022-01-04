package ua.lviv.lgs.inheritence;

public class Robot {
	private String name;
	private String work;
	
	Robot(String work, String name){

	this.work = work;
	this.name = name;

	}

	
	public String getWork() {
		return work;
	}


	public String getName() {
		return name;
	}


	@Override
	public String toString() {
		return "Robot [Robot name=" + name + ", work=" + work + "]";
	}


	
	
}
