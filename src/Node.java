/**
 * Node implementation
 * @author benmccalmon
 *
 * @param <ItemType>
 */

public class Node<ItemType> {
	
	private ItemType item;
	private Node<ItemType> nextNode;
	
	// Default constructor
	public Node() {
		nextNode = null;
	}
	
	// Constructor
	public Node(ItemType item) {
		this.item = item;
		nextNode = null;
	}
	
	// Constructor
	public Node(ItemType item, Node<ItemType> nextNode) {
		this.item = item;
		this.nextNode = nextNode;
	}
	
	public ItemType getItem() {
		return item;
	}
	
	public Node<ItemType> getNext() {
		return nextNode;
	}
	
	public void setItem(ItemType item) {
		this.item = item;
	}
	
	public void setNext(Node<ItemType> nextNode) {
		this.nextNode = nextNode;
	}
}
