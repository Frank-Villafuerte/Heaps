package clases;

public class Node <T>{
	
	private T dato;
	private Node<T> izquierda;
	private Node<T> derecha;
	
	
	public Node(T dato, Node<T> izquierdo, Node<T> derecho) {
		this.dato=dato;
		this.izquierda=izquierda;
		this.derecha=derecha;
		
	}
	public Node(T dato) {
		this(dato,null,null);
	}

	public T getDato() {
		return dato;
	}
	public Node<T> getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Node<T> izquierda) {
		this.izquierda = izquierda;
	}
	public Node<T> getDerecha() {
		return derecha;
	}
	public void setDerecha(Node<T> derecha) {
		this.derecha = derecha;
	}
	public void setDato(T dato) {
		this.dato = dato;
	}

	
	

	

 
}
