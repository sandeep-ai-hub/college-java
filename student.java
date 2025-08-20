import java.util.Scanner;

// write a program to print your identity card details using the scanner class
class student {

	void details() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		System.out.println("Enter your id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your program");
		String program = sc.nextLine();
		System.out.println("Enter your school");
		String school = sc.nextLine();
		System.out.println("Enter your batch");
		String batch = sc.nextLine();

		System.out.println("\nNAME " + name);
		System.out.println("\nSAP ID " + id);
		System.out.println("\nSCHOOL " + school);
		System.out.println("\nPROGRAM " + program);
		System.out.println("\nBATCH " + batch);
	}

	public static void main(String[] args) {
		student s1 = new student();
		s1.details();

	}
}
