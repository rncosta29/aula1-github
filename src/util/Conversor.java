package util;

public class Conversor {
	
	public static double IOF = 0.06;
	public static double dolarReal(double quantidade, double precoDolar) {
		
		return quantidade * precoDolar * (1.0 + IOF);
	}
	
}
