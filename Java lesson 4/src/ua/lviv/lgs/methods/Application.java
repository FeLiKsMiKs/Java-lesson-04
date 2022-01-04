package ua.lviv.lgs.methods;

public class Application {

	public static void main(String[] args) {
		

		Animal a1 = new Animal("Leopard", 10, 4);
		System.out.println(a1);
		a1.changeSpeed(20);
		a1.changeAge(7);
		System.out.println(a1);
		System.out.println("Age: "+ a1.getAge(5)+" Speed:"+ a1.getSpeed(3));
		Animal a2 = new Animal("Bull", 1, 10);
		System.out.println(a2);
		a2.changeSpeed(2);
		a2.changeAge(14);
		System.out.println(a2);
		System.out.println("Age: "+ a2.getAge(5)+" Speed:"+ a2.getSpeed(3));
	}

}
