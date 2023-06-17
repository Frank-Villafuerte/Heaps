package clases;

public class Elemento<E> implements Comparable<Elemento<E>>{

	private E dato;
	private int prioridad;
	
	public Elemento(E dato, int prioridad) {
		this.dato=dato;
		this.prioridad=prioridad;
	}
	public int compareTo(Elemento<E> elemento) {
		if(this.prioridad>elemento.prioridad) {
			return 1;
		}
		else if(this.prioridad<elemento.prioridad) {
			return -1;
		}
		else {
			return 0;
		}
		
	}
	public E getDato() {
		return dato;
	}
	
	public String toString() {
		return ""+dato;
	}
	
	
}
