package ie.ucd.the.game.of.life;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Tree arbol = new Tree();
		// Node nodo = new Node("action", null, null);
		// System.out.print(nodo.getData());
		// System.out.print(nodo.getFirst());
		// System.out.print(nodo.getSecond());

		// Node n5 = new Node("finish", null, null);
		// Node n4 = new Node("normal", n5, null);
		// Node n3 = new Node("action", n5, null);
		// Node n2 = new Node("normal", n3, n4);
		// Node n1 = new Node("normal", n2, null);

		// Tree arbol = new Tree("Root");

		// System.out.printf("\n n1: \n");
		// System.out.print(n1.getData());
		// System.out.printf("\n");
		// System.out.print(n1.getFirst());
		// System.out.printf("\n");
		// System.out.print(n1.getSecond());

		// System.out.printf("\n n2: \n");
		// System.out.print(n2.getData());
		// System.out.printf("\n");
		// System.out.print(n2.getFirst());
		// System.out.printf("\n");
		// System.out.print(n2.getSecond());

		// System.out.printf("\n n3: \n");
		// System.out.print(n3.getData());
		// System.out.printf("\n");
		// System.out.print(n3.getFirst());
		// System.out.printf("\n");
		// System.out.print(n3.getSecond());

		// System.out.printf("\n n4: \n");
		// System.out.print(n4.getData());
		// System.out.printf("\n");
		// System.out.print(n4.getFirst());
		// System.out.printf("\n");
		// System.out.print(n4.getSecond());

		// System.out.printf("\n n5: \n");
		// System.out.print(n5.getData());
		// System.out.printf("\n");
		// System.out.print(n5.getFirst());
		// System.out.printf("\n");
		// System.out.print(n5.getSecond());
		// System.out.printf("\n");
		// System.out.printf("\n root: \n");
		// System.out.print(arbol.getRoot());

		// Tree:
		// main and secondary for PATH (not for node branches).
		/*

		*/
		//Tree t = new Tree("begin");
		// t.addNode("A", "main");
		// t.split_path();
		// t.addNode("B", "main");
		// t.addNode("C", "main");
		// t.addNode("D", "secondary"); //it knows that it should go to the split point
		// t.addNode("E", "secondary");
		// t.join_path();
		// t.addNode("end", "secondary");

		//t.printTree(t.getRoot());

		// Board:
		Player p1 = new Player();
		Player p2 = new Player();
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		
		Board b = new Board(players);
		/*System.out.printf("Player moves forward: %d	", 100);
		b.moveForward(25, p1);
		System.out.printf("Player position: ");
		System.out.print(p1.getPosition().getData());
		System.out.printf("\n\n");
		/*b.nextBlock(players.get(0));
		System.out.printf("Player position: ");
		System.out.print(p1.getPosition().getData());
		System.out.printf("\n\n");
		//b.nextBlock(players.get(0));
		System.out.printf("Player position: ");
		System.out.print(p1.getPosition().getData());
		System.out.printf("\n\n");
		//b.nextBlock(players.get(0));
		System.out.printf("Player position: ");
		System.out.print(p1.getPosition().getData());
		System.out.printf("\n\n");
		*/
		b.getPath().print(b.getPath().getRoot());
		//b.getPath().printTree(b.getPath().getRoot());
	}

}
