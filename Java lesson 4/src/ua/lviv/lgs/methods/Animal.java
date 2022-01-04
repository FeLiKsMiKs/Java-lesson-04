package ua.lviv.lgs.methods;

public class Animal {
private String name;
private int speed;
private int age;

public Animal(String name, int speed, int age) {
	super();
	this.name = name;
	this.speed = speed;
	this.age = age;
}
public void changeSpeed(int NewSpeed) {
	this.speed = NewSpeed;
}
public void changeAge(int NewAge) {
	this.age = NewAge;
}

public int getSpeed(int NewAge) {
	return this.speed + NewAge;
}
public int getAge(int AgeN) {
	return this.age + AgeN;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSpeed() {
	return speed;
}
public void setSpeed(int speed) {
	this.speed = speed;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Animal [name=" + name + ", Speed=" + speed + ", age=" + age + "]";
}

}
