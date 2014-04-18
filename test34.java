
public class test34 {
	public static void main (String args[]){
		test34_1 testObject = new test34_1();
		System.out.println(testObject.toMilitary());
		testObject.setTime(13, 27, 6);
		System.out.println(testObject.toMilitary());
	}
}
