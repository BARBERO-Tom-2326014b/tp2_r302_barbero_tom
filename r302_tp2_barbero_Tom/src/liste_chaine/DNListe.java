package liste_chaine;

public class DNListe {
	private DNode head;
	
	public DNListe() {
		head = null;
	}
    public void setHead(DNode newNode) {
        if (head != null) {
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head = newNode;
    }

    // Afficher la liste
    public void afficher() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + " <---> ");
            temp = temp.getNext();
        }
        System.out.println("NULL");
    }
	
	public void echangerValeurs(int value1, int value2) {
        if (value1 == value2) return;

        DNode node1 = head, node2 = head;

        while (node1 != null && node1.getElement() != value1) {
            node1 = node1.getNext();
        }

        while (node2 != null && node2.getElement() != value2) {
            node2 = node2.getNext();
        }

        if (node1 == null || node2 == null) return;

        // Échange des éléments
        int temp = node1.getElement();
        node1.element = node2.getElement();
        node2.element = temp;
    }
	
	  public int countCircularNodes() {
	        if (head == null) return 0;

	        DNode temp = head;
	        int count = 1;

	        while (temp.getNext() != head) {
	            count++;
	            temp = temp.getNext();
	            if (temp==null) break;
	        }

	        return count;
	    }
	  
	  public boolean equals(Object obj) {
	        if (this == obj) return true;
	        if (obj == null || getClass() != obj.getClass()) return false;

	        DNListe other = (DNListe) obj;
	        DNode current1 = this.head;
	        DNode current2 = other.head;

	        while (current1 != null && current2 != null) {
	            if (current1.getElement() != current2.getElement()) {
	                return false;
	            }
	            current1 = current1.getNext();
	            current2 = current2.getNext();
	        }

	        return current1 == null && current2 == null;
	    }


}
