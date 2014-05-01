
public class test40 {
	public static void main (String args[]){
		test40_1 member1 = new test40_1("Megan","Fox");
		test40_1 member2 = new test40_1("Natalie","Portman");
		test40_1 member3 = new test40_1("Taylor","Swift");
		
		System.out.println();
		System.out.println(member1.getFirst());
		System.out.println(member1.getLast());
		System.out.println(member1.getMembers());
		System.out.println();
		System.out.println(member2.getFirst());
		System.out.println(member2.getLast());
		System.out.println(member2.getMembers());
		System.out.println();
		System.out.println(test40_1.getMembers());
		
	}
}
