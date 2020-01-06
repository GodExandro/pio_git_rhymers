package edu.kis.vh.nursery.list;


/**
 *  Klasa Node- element klasy intLinkedList, ktory jest lista jednokierunkowa
 */

public final class Node {

	/**
	 * value - wartosc wezla w Node
	 * prev - referencja do poprzedniego Node'a
	 * next - referencja do nastepnego Node'a
	 */


	int value;
	public Node prev, next;


	/**
	 * Konstruktor klasy Node
	 * @param i - zmienna ktora podczas tworzenia klasy zostanie przypisana do wartosci wezla Node'a
	 */

	public Node(int i) {
		value = i;
	}


}
