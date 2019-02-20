package Simples;

public class FuncaoMatematica {
	
	public int soma(int x, int y) {
		return x+y;
	}
	
	public int subtracao(int x, int y) {
		return x-y;
	}
	
	public int multiplicacao(int x, int y) {
		return x*y;
	}
	
	public int divisao(int x, int y) {
		return x/y;
	}
	
	public double potenciacao(double x, double y) {
		return Math.pow(2, 6);
	}
	
	public static void main(String [] args) {
		FuncaoMatematica obj = new FuncaoMatematica();
		System.out.println(obj.soma(10, 20));
		System.out.println(obj.subtracao(100, 20));
		System.out.println(obj.multiplicacao(20, 10));
		System.out.println(obj.divisao(20, 10));
		System.out.println(obj.potenciacao(2, 6));
		
	}
	 

}
