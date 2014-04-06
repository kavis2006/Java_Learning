import java.util.Scanner;
public class test13 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		test13_1 testObject = new test13_1();
		System.out.println("Enter name of first gf: ");
		String temp = input.nextLine();
		testObject.setName(temp);
		testObject.saying();
		
	}
}
