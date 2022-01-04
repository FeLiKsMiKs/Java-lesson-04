package ua.lviv.lgs.inheritence;

public class Application {
public static void main(String[] args) {

Robot r = new Robot( " просто працюю", " Robot");
System.out.println(r);
CoffeRobot r2 = new CoffeRobot(" варю каву"," CoffeRobot" );
System.out.println(r2);
RobotDancer r3 = new RobotDancer(" просто танцюю"," RobotDancer" );
System.out.println(r3);
RobotCooker r4 = new RobotCooker(" просто готую", " RobotCooker" );
System.out.println(r4);
}

}
