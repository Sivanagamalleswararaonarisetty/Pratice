package Pratice;

public class fib {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int sum=0;
		for (int i = 0; i <=10; i++) {
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			
		}
	}

}
