package series_program;

public class FibonacciSeries {

	public static void main(String[] args) {
	int n= 10;
	long[] series =new long[n];
	
	series[0]=0;
	series[1]=1;
	
	for(int i=2; i<n; i++) {
		series[i]=series[i-1]+series[i-2];
	}
   System.out.println("fibonacci Series(first"+n+" terms):");
   for(int i=0;i<n;i++) {
	   System.out.println(series[i]+" ");
   }
	}

}
