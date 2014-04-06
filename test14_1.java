public class test14_1 {
	private String girlName;
	
	public test14_1(String name){
		girlName=name;
	}
	
	public String getName(){
		return girlName;
	}
	public void saying(){
		System.out.printf("Your best friend is %s\n", getName());
	}
}
