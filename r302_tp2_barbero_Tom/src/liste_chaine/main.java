package liste_chaine;

public class main {

	public static void main(String[] args) {
		Node test2 = new Node(2,null);
		Node test = new Node(1,null);
		Node test3 = new Node(3,null);
		Node test4 = new Node(4,null);
		Node test5 = new Node(5,null);
		
		
		SLinkedList list = new SLinkedList();
		list.setHead(test2);
		test2.updateNext(test);
		test.updateNext(test4);
		list.setHead(test3);
		list.affiche();
		list.setHead(test5);
		list.affiche();
		System.out.println("L'avant dernier est "+list.avantDernier()+'\n');
		
		
		list.inverserListe();
		System.out.println("La liste inverser est : ");list.affiche();
		
		list.echangerNoeuds(1, 3);
		list.affiche();
		System.out.println("LISTE DOUBLEMENT CHAINE \n");
		DNListe listeD = new DNListe();
		DNode node1 = new DNode(1);
		DNode node2 = new DNode(2);
		DNode node3 = new DNode(3);
		DNode node4 = new DNode(4);
		DNode node5 = new DNode(5);
		DNode node6 = new DNode(6);
		
		listeD.setHead(node1);
		listeD.setHead(node2);
		listeD.setHead(node3);
		listeD.setHead(node4);
		listeD.setHead(node5);
		listeD.setHead(node6);
		
		listeD.afficher();
		listeD.echangerValeurs(3, 5);
		System.out.println("Liste apres échange des valeurs 3 et 5: \n");
		listeD.afficher();

		DNListe listeDC= new DNListe();
		DNode node10 = new DNode(1);
		DNode node11 = new DNode(2);
		DNode node12= new DNode(3);
		DNode node13= new DNode(4);
		node10.next=node11;
		node11.next=node12;
		node12.next=node13;		
		node13.next=node10;
		listeDC.setHead(node10);
		System.out.println("Nombre de noeud dans la liste doublement chainé : 1-2-3-4-1 \n");
		System.out.println(listeDC.countCircularNodes());
		
		
		
	}

}
