package series_program;

public class Arithmeticseries {

	private static final int CommonDifference = 0;

	public static void main(String[] args) {
	int n=10;
	int fristTerm=2;
	int CommonDifferrance=3;
	System.out.println("arithmetic Series(first"+n+"terms):");
	for(int i=0;i< n;i++) {
		int firstTerm = 0;
		int term = firstTerm + i* CommonDifference;
		System.out.println(term +" ");
	}

	}

}
