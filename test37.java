
public class test37 {
	public static void main(String args[]){
		test37_1 testObject = new test37_1();
		test37_1 testObject2 = new test37_1(5);
		test37_1 testObject3 = new test37_1(5,13);
		test37_1 testObject4 = new test37_1(5,13,17);
		
		System.out.printf("%s\n", testObject.toMilitary());
		System.out.printf("%s\n", testObject2.toMilitary());
		System.out.printf("%s\n", testObject3.toMilitary());
		System.out.printf("%s\n", testObject4.toMilitary());
	}
}
