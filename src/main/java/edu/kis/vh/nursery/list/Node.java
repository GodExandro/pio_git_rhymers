package edu.kis.vh.nursery.list;

/**
 *  Klasa która jest elementem klasy IntLinkedList oraz jest wykorzystana jako lista jednokierunkowa
 */


public final class Node {


	/**
	 * value -  wartość węzła
	 * prev -  referencję do poprzedniego Node'a
	 * next - referencję do następnego Node'a
	 */


	int value;
	public Node prev, next;


	/**
	 * Konstruktor klasy Node
	 * @param i - zmienna ktora podczas tworzenia klasy Node zostanie przypisana pod wartosc wezla
	 */

	public Node(int i) {
		value = i;
	}
	
}
