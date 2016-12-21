package br.com.templatedmethodpattern.usecabeca;

/**
 * O Padrao Template Method define o esqueleto
 * de um algoritmo dentro de um metodo, transferindo
 * alguns de seus passos para as subclasses. O
 * Template Method permite que as subclasses redefinam
 * certos passos de um algoritmo sem alterar a estrutura
 * do proprio algoritmo.
 * */
public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	public abstract void brew();
	
	public abstract void addCondiments();
	
	private void pourInCup() {
		System.out.println("Boiling water");
	}

	private void boilWater() {
		System.out.println("Pouring into cup");
	}

	
}
