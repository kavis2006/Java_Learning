
public class test38_1 {
	private int day;
	private int month;
	private int year;
	
	public test38_1 (int d, int m, int y){
		day=d;
		month=m;
		year=y;
		
		System.out.printf("The constructor for this is %S\n", this);	
	}
	public String toString(){
		return String.format("%d/%d/%d", day, month, year);
	}
}
