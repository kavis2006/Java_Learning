
public class test21 {
	public static void main (String args[]){
		double amount;
		double principal = 10000;
		double rate = .01;
		for(int day=1;day<=1200;day++){
			amount=principal*Math.pow(1+rate, day);
			System.out.println(day + "   " + amount);
		}
	}
}
