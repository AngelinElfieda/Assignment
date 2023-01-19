package week1.day1;

public class HelloSelenium {
	
	public static void fibonacciSeries() {
		int i = 1, n = 11, t1 = 0, t2 = 1;
		System.out.print("First " + n + " numbers series: ");	
		while (i <= n)
		{
			System.out.println(t1 + " ");
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			i++;
		}
}
	
	public static void IsPrime() {
		int n=8,i;
		for(i=2; i<=n-1;i++) {
			if(n%i==0) {
				System.out.print("NOT Prime");
				break;
			}
			if(i==n-1) {
				System.out.print("Prime");
			}
		}
		
	}
	
	
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
//		fibonacciSeries();
		IsPrime();
		
}
}
