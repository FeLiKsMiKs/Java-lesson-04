package ua.lviv.lgs.inheritence;

public class CoffeRobot extends Robot{
	private String name2;
	private String work2;

	public CoffeRobot(String work, String name) {
		super(work,name);
		work2 = work;
		name2 = name;
	}

	@Override
	public String toString() {
		return "CoffeRobot [Robot name=" + name2 + ", work=" + work2 + "]";
	}

	
	

}
