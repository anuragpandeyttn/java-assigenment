/* Q1) Write a class with FirstName, LastName & age field. Print Firstname, LastName & 
 * age using static block, static method & static variable respectively.

*/
public class firstcode {
	static String FirstName = "Anurag";
	static String LastName = "Pandey";
	static int age = 22;
	static {
		System.out.println(FirstName);
		System.out.println(LastName);
		System.out.println(age);
	}

	static void Name() {
		System.out.println(FirstName + " " + LastName + " " + age);
	}

	public static void main(String[] args) {
		System.out.println(FirstName + " " + LastName + " " + age);
		Name();
	}

}
