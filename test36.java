
public class test36 {
	public static void main  (String args[]){
		test36_1 testObject = new test36_1();
		System.out.println(testObject.bananas);
		System.out.println(testObject.apples);
		testObject.bananas=7;
		testObject.apples=3; // Can`t use a private anything from another class, must use public
		System.out.println(testObject.bananas);
		System.out.println(testObject.apples);
	}
}
