import java.util.Scanner;
public class test12 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		test12_1 testObject = new test12_1 ();
		System.out.println("Enter your name: ");
		String name = input.nextLine();
		testObject.simpleMessage(name);
	}
}
