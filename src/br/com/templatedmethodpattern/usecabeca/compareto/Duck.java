package br.com.templatedmethodpattern.usecabeca.compareto;

public class Duck implements Comparable<Duck> {

	private String name;
	private int weight;
	
	public Duck(final String name, final int weight) {
		super();
		this.name = name;
		this.weight = weight;
	}

	@Override
	public int compareTo(final Duck otherDuck) {
		
		if (this.weight < otherDuck.weight) {
			return -1;
		} else if (this.weight == otherDuck.weight) {
			return 0;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		return name + "weighs " + weight;
	}

}
