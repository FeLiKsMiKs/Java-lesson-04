package ua.lviv.lgs.inheritence;

public class RobotDancer extends Robot{
	private String name3;
	private String work3;

	public RobotDancer(String work, String name) {
		super(work,name);
		work3 = work;
		name3 = name;
	}

	@Override
	public String toString() {
		return "RobotDancer [Robot name=" + name3 + ", work=" + work3 + "]";
	}

	

	
}
