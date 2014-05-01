
public class test41_1 {
	private int sum;
	private final int NUMBER;
	
	public test41_1(int x){
		NUMBER = x;
	}
	public void add(){
		sum+=NUMBER;
	}
	public String toString(){
		return String.format("sum = %d\n", sum);
	}
}
