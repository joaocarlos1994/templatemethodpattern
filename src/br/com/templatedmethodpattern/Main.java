package br.com.templatedmethodpattern;

public class Main {

	public static void main(String[] args) {

		Calculadora calculadoraSoma = new CalculadoraSoma();
		Calculadora calculadoraSubtracao = new CalculadoraSubtracao();
		
		System.out.println(calculadoraSoma.resultadoContaCalculadora(10, 10));
		System.out.println(calculadoraSubtracao.resultadoContaCalculadora(10, 5));

	}

}
