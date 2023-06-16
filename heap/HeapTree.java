package heap;

import java.util.ArrayList;
import clases.Node;
import myExceptions.ExceptionIsEmpty;
public class HeapTree<E> implements Heap{

	ArrayList<Node<E>> datos;
	
	public HeapTree() {
		datos=new ArrayList<Node<E>>();
	}
	public void insert(Object item) {
		
		
	}

	public void eliminar() throws ExceptionIsEmpty{
		if(isEmpty()) {
			throw new ExceptionIsEmpty("El arbol está vacío");
		}
		
	}
	public boolean isEmpty() {
		return datos.size()==0;
	}

}
