package ua.lviv.lgs.inheritence;

public class RobotCooker extends Robot{
	private String name4;
	private String work4;

	public RobotCooker(String work, String name) {
		super(work,name);
		work4 = work;
		name4 = name;
	}

	@Override
	public String toString() {
		return "RobotDancer [Robot name=" + name4 + ", work=" + work4 + "]";
	}

	
}
