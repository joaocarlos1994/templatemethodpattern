package br.com.templatedmethodpattern;

public abstract class Calculadora {
	
	public double resultadoContaCalculadora(final int valor1, final int valor2){
		double result = resultadoConta(valor1, valor2);
		return result;
	}
	
	public abstract double resultadoConta(final int valor1, final int valor2);

}
