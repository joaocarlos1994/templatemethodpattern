package br.com.templatedmethodpattern.usecabeca.hook;
/**
 * Um gancho ou HOOK e um metodo que e declarado
 * na classe abstrata mas so recebe como padrao
 * uma implementacao vazia. Isto permite que as
 * subclasses usem o gancho para se conectarem
 * ao algoritmo em varios pontos, caso assim o
 * desejem; uma subclasse tambem pode simplesmente
 * ignorar o gancho.
 * 
 * Para usar um gancho basta altera-lo na subclasse.
 * Como no <code></code>
 * */
public abstract class CaffeineBeverageWithHook {
	final public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
	
	public abstract void brew();
	public abstract void addCondiments();

	private void boilWater() {
		System.out.println("Boiling water");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}
	
	protected boolean customerWantsCondiments() {
		return true;
	}	
	
}
