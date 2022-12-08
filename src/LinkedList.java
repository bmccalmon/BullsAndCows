/**
 * Linked implementation of the List Interface
 * @author benmccalmon
 *
 * @param <ItemType>
 */

public class LinkedList<ItemType> implements ListInterface<ItemType> {
	
	Node<ItemType> headNode;
	int size;
	
	public LinkedList() {
		headNode = null;
		size = 0;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getLength() {
		return size;
	}

	public boolean remove(int pos) {
		if (pos > size || pos <= 0)
			return false;
		if (pos == 1) {
			headNode.setItem(null);
			headNode = headNode.getNext();
			size--;
			return true;
		}
		Node<ItemType> currNode = headNode;
		int count = pos;
		while (count > 2) {
			currNode = currNode.getNext();
			count--;
		}
		currNode.getNext().setItem(null);
		currNode.setNext(currNode.getNext().getNext());
		size--;
		return true;
	}

	public void clear() {
		int x = size;
		for (int i = 0; i < x; i++) {
			remove(1);
		}
	}
	
	public boolean add(ItemType item) {
		insert(size+1, item);
		return true;
	}

	public boolean insert(int newPos, ItemType item) {
		if (newPos > size+1 || newPos < 1)
			return false;
		if (newPos == 1) {
			Node<ItemType> temp = headNode;
			headNode = new Node<ItemType>(item,temp);
			size++;
			return true;
		}
		Node<ItemType> currNode = headNode;
		int count = newPos-1;
		while (count > 1) {
			currNode = currNode.getNext();
			count--;
		}
		Node<ItemType> temp = currNode.getNext();
		currNode.setNext(new Node<ItemType>(item,temp));
		size++;
		return true;
	}

	public ItemType getEntry(int pos) {
		if (pos > size || pos <= 0)
			return null;
		Node<ItemType> currNode = headNode;
		int count = pos;
		while (count > 1) {
			currNode = currNode.getNext();
			count--;
		}
		return currNode.getItem();
	}

	public ItemType replace(int pos, ItemType item) {
		if (pos > size || pos <= 0)
			return null;
		Node<ItemType> currNode = headNode;
		int count = pos;
		while (count > 1) {
			currNode = currNode.getNext();
			count--;
		}
		ItemType temp = currNode.getItem();
		currNode.setItem(item);
		return temp;
	}
	
	public boolean contains(ItemType item) {
		if (size == 0)
			return false;
		Node<ItemType> currNode = headNode;
		while (currNode != null) {
			if (currNode.getItem() == item)
				return true;
			currNode = currNode.getNext();
		}
		return false;
	}
	
	public void printList() {
		System.out.print("[");
		if (isEmpty())
			return;
		Node<ItemType> currNode = headNode;
		System.out.print(currNode.getItem() + " ");
		while (currNode.getNext() != null) {
			currNode = currNode.getNext();
			System.out.print(currNode.getItem());
			if (currNode.getNext() != null)
				System.out.print(" ");
		}
		System.out.print("]\n");
	}

}
