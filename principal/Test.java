package principal;
import heap.HeapTree;
import colaPrioridad.PriorityQueueHeap;
import myExceptions.ExceptionIsEmpty;
public class Test {

	public static void main(String[] args) throws ExceptionIsEmpty {
		
		
		PriorityQueueHeap<String> colaPrioridad=new PriorityQueueHeap<String>();
		colaPrioridad.enqueue("p=1", 1);
		colaPrioridad.enqueue("p=5", 5);
		colaPrioridad.enqueue("p=2", 2);
		colaPrioridad.enqueue("p=9", 9);
		colaPrioridad.enqueue("p=8", 8);
		colaPrioridad.enqueue("p=4", 4);
		colaPrioridad.enqueue("p=3", 3);
		colaPrioridad.enqueue("p=15", 15);
		System.out.println(colaPrioridad);
		colaPrioridad.dequeue();
		
		System.out.println(colaPrioridad);
		System.out.println("frente: "+colaPrioridad.front());
		System.out.println("ultimo: "+colaPrioridad.back());
		/*HeapTree<Integer> arbol=new HeapTree<Integer>();
		arbol.insert(7);
		p(arbol);
		arbol.insert(4);
		p(arbol);
		arbol.insert(8);
		p(arbol);
		
		arbol.insert(16);
		p(arbol);
		arbol.insert(9);
		p(arbol);
		arbol.insert(3);
		p(arbol);
		arbol.insert(13);
		p(arbol);
		arbol.insert(12);
		p(arbol);
		arbol.insert(1);
		p(arbol);
		arbol.insert(15);
		p(arbol);
		
		p(arbol);
		arbol.eliminar();
		p(arbol);*/
	}
	public static void p(HeapTree arbol) {
		
		for(int i=0;i<arbol.getDatos().size();i++) {
			System.out.print(arbol.getDatos().get(i)+" ");
		}
		System.out.println();
	}
}
