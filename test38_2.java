
public class test38_2 {
	private String name;
	private test38_1 birthday;
	
	public test38_2(String theName, test38_1 theDate){
		name = theName;
		birthday = theDate;
	}
	public String toString(){
		return String.format("My name is %s, my birthday is %s", name, birthday);
	}
}
