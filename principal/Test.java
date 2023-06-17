package principal;
import heap.HeapTree;
import myExceptions.ExceptionIsEmpty;
public class Test {

	public static void main(String[] args) throws ExceptionIsEmpty {
		
		HeapTree arbol=new HeapTree();
		arbol.insert(16);
		p(arbol);
		arbol.insert(14);
		p(arbol);
		arbol.insert(10);
		p(arbol);
		arbol.insert(8);
		p(arbol);
		arbol.insert(7);
		p(arbol);
		arbol.insert(9);
		p(arbol);
		arbol.insert(3);
		p(arbol);
		arbol.insert(2);
		p(arbol);
		arbol.insert(4);
		p(arbol);
		arbol.insert(1);
		p(arbol);
		arbol.insert(15);
		p(arbol);
		
		
		
		
	}
	public static void p(HeapTree arbol) {
		
		for(int i=0;i<arbol.getDatos().size();i++) {
			System.out.print(arbol.getDatos().get(i)+" ");
		}
		System.out.println();
	}
}
