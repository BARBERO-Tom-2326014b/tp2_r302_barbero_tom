package liste_chaine;

public class Node {
	private int element;	
	private Node next;
	
	//create
	public Node(int s, Node n) {
		element = s;
		next = n;
	}
	//read
	public int getElement() {
		return element;
	}
	//read
	public Node getNext() {
		return next;
	}
	//update
	public void updateElement(int elem) {
		this.element = elem;
	}
	
	//update
	public void updateNext(Node next) {
		this.next = next;
		
		
	}
	
	


}
