
public enum test39_1 {
	bucky("nice", "22"),
	kelsey("good", "10"),
	julia("bigmistake", "12");
	
	private final String desc;
	private final String year;
	
	test39_1(String description, String birthday){
		desc = description;
		year = birthday;
	}
	public String getDesc(){
		return desc;
	}
	public String getYear(){
		return year;
	}
}
