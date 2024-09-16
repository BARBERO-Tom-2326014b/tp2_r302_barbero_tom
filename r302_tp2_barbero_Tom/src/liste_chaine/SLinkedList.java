package liste_chaine;

public class SLinkedList {
		private Node head;
		
		
		public SLinkedList() {
			head = null;
			
		}
		public void setHead(Node head) {
			if(this.head == null) {
			this.head = head;
			
					}
			else {
				head.updateNext(this.head);
				this.head = head;
			}
			
		}
		public Node getHead() {
			return this.head;
		}
	
		
	
		
		public void affiche() {
	        Node temp = this.head;
	        while (temp != null) {
	            System.out.print(temp.getElement() + " - ");
	            temp = temp.getNext();
	        }
	        System.out.println("NULL");
	    }
		public int avantDernier() {
			Node curent = head;
			Node twoCurrent = head.getNext();
			Node threeCurrent = twoCurrent.getNext();
			while(threeCurrent !=null) {
				curent = twoCurrent;
				twoCurrent = threeCurrent;
				threeCurrent = threeCurrent.getNext();
				
				
				
			}
			return curent.getElement();

			}
		public void inverserListe() {
	        Node precedent = null;
	        Node current = head;
	        Node suivant = null;
	        
	        while (current != null) {
	            suivant = current.getNext();
	            current.updateNext(precedent);
	            precedent = current;
	            current = suivant;
	        }
	        
	        head = precedent;
	    }
		
		public void echangerNoeuds(int value1, int value2) {
		        if (head == null) return;
		        Node node1 = head, node2 = head;
		        
		        while (node1 != null && node1.getElement() != value1) {
		            node1 = node1.getNext();
		        }
		        while (node2 != null && node2.getElement() != value2) {
		            node2 = node2.getNext();
		        }

		        // SI on trouve pas un des 2 on sort
		        if (node1 == null || node2 == null) return;
		        int temp = node1.getElement();
		        node1.updateElement(node2.getElement());
		        node2.updateElement(temp);
		    }
		}
	
		 


