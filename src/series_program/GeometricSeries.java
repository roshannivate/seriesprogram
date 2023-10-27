package series_program;

public class GeometricSeries {

	public static void main(String[] args) {
		int n=10;
				double firstTerm=2.0;
				double commonRatio=3.0;
				System.out.println("Geometic series(frist"+n+"terms):");
				double term= firstTerm;
				for(int i=0; i<n; i++) {
					System.out.println(term+" ");
					term *= commonRatio;
				}

	}

}
