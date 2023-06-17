package colaPrioridad;
import heap.HeapTree;
import myExceptions.ExceptionIsEmpty;
import clases.Elemento;
public class PriorityQueueHeap<E> implements PriorityQueue<E>{

	private HeapTree<Elemento<E>> arbol=new HeapTree<Elemento<E>>();
	
	public void enqueue(E x, int p) {
		arbol.insert(new Elemento(x,p));
	}
	public E dequeue() throws ExceptionIsEmpty{
		if(arbol.isEmpty()) {
			throw new ExceptionIsEmpty("La cola está vacía") ;	
		}
		E aux=arbol.getDatos().get(0).getDato();
		arbol.eliminar();
		return aux;
	}
	
	
	
	
	public E front() throws ExceptionIsEmpty{
		if(arbol.isEmpty()) {
			throw new ExceptionIsEmpty("La cola está vacía") ;	
		}
		return arbol.getDatos().get(0).getDato();
	}

	
	public E back() throws ExceptionIsEmpty{
		if(arbol.isEmpty()) {
			throw new ExceptionIsEmpty("La cola está vacía") ;	
		}
		return arbol.getDatos().get(arbol.getDatos().size()-1).getDato();
	}


	
	public String toString() {
		return arbol.toString();
	}

}
