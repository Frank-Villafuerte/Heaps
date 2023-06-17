package colaPrioridad;

import myExceptions.ExceptionIsEmpty;

public interface PriorityQueue<E> {
	void enqueue (E x, int p); 
	E dequeue() throws ExceptionIsEmpty; 
	E front() throws ExceptionIsEmpty; 
	E back()throws ExceptionIsEmpty;
}
