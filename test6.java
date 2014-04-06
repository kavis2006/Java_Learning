import java.util.Scanner;

public class test6 {
	public static void main (String args[]){
		Scanner bucky = new Scanner(System.in);
		
		int tuna = 5;
		System.out.println(tuna++);
		System.out.println(tuna++);
		System.out.println(tuna++);
		System.out.println(tuna);
		
		tuna += 5;
		System.out.println(tuna);
		tuna *= 666;
		System.out.println(tuna);
		tuna /= 666;
		System.out.println(tuna);
		}
}
