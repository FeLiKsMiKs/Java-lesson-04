package ua.lviv.lgs.inheritence;

public class Application {
public static void main(String[] args) {

Robot r = new Robot( " ������ ������", " Robot");
System.out.println(r);
CoffeRobot r2 = new CoffeRobot(" ���� ����"," CoffeRobot" );
System.out.println(r2);
RobotDancer r3 = new RobotDancer(" ������ ������"," RobotDancer" );
System.out.println(r3);
RobotCooker r4 = new RobotCooker(" ������ �����", " RobotCooker" );
System.out.println(r4);
}

}
