
public class test29 {
	public static void main (String args[]){
		int array[]={1,2,3,4,5,6,7};
		int total=0;
		
		for (int x: array){
			total+=x;
		}
		System.out.println("The sum of these numbers is " + total);
	}
}
