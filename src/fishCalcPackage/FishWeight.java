package fishCalcPackage;

public class FishWeight {
	
	// Equations found in Wisconsin Fishing Regulations Book
	
	// Panfish Equation
	public static double getPanfish(double length, double girth) {
	    return (length * length * length) / 1200;
	  }
	
	// Bass Equation
	public static double getBass(double length, double girth) {
	    return (length * length * girth) / 1200;
	  }
	
	// Trout Equation
	public static double getTrout(double length, double girth) {
	    return (length * girth * girth) / 800;
	  }
	
	// Walleye Equation
	public static double getWalleye(double length, double girth) {
	    return (length * length * length) / 2700;
	  }
	
	// Pike Equation
		public static double getPike(double length, double girth) {
		    return (length * length * length) / 3500;
		  }

}
