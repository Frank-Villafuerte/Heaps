package heap;

import java.util.ArrayList;
import clases.Node;
import myExceptions.ExceptionIsEmpty;
public class HeapTree<E extends Comparable<E>> implements Heap<E> {

	private ArrayList<Node<E>> datos=new ArrayList<Node<E>>();
	
	
	public HeapTree() {
		datos=new ArrayList<Node<E>>();
		
	}
	public void insert(E item) {
		
		datos.add(new Node<E>(item));
		if(datos.size()>1) {
			comparar(datos.size());
		}
	}
	public void comparar(int indice) {
		System.out.println(datos.get((indice/2)-1).getDato()+"-"+datos.get(indice-1).getDato()+" "+datos.get(indice-1).getDato().compareTo(datos.get((indice/2)-1).getDato()));//mostrar los elementos comparados
		System.out.println(indice+"i");
		if(indice>1&&datos.get(indice-1).getDato().compareTo(datos.get((indice/2)-1).getDato())==1) {
			
			Node aux=datos.get((indice-1));
			datos.set(indice-1, datos.get((indice/2)-1));
			datos.set((indice/2)-1,aux);
			
			comparar(indice/2);
		}
	}

	public void eliminar() throws ExceptionIsEmpty{
		if(isEmpty()) {
			throw new ExceptionIsEmpty("El arbol está vacio");
		}
		datos.remove(0);
		
	}
	public boolean isEmpty() {
		return datos.size()==0;
	}
	public ArrayList<Node<E>> getDatos() {
		return datos;
	}
}
