
public class MainDeclration {

	public static void main(String[] args) {
		Overriding obj1 = new Overriding();// with parent object you can call only parent methods
		Child obj2 = new Child();// with child object you can call both parent and child methods
		Overriding obj3 = new Child();// Run time polymorphism
		obj3.f(15, 10);
		obj2.Ishan();

	}
}
