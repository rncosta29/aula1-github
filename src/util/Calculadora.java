package util;


public class Calculadora {
		

	public static double area(double largura, double altura) {
		double area = largura * altura;
	
		return area;
	}
	
	public static double perimetro(double largura, double altura) {
		double perimetro = 2 * (largura + altura);
		
		return perimetro;
	}
	
	public static double diagonal(double largura, double altura) {
		double calculo = (largura * largura) + (altura * altura);
		double diagonal = Math.sqrt(calculo);
		
		return diagonal;
	}

	

}
