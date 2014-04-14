
public class test27 {
	public static void main (String args[]){
		int array[]={22,34,65,23,54,23};
		double sum=0;
		
		for (int counter=0; counter<array.length; counter++){
			sum+=array[counter];
		}
		System.out.println("The sum of these numbers is " + sum);
		System.out.println("The avarage of these numbers is " + sum/array.length);
	}
	
}
