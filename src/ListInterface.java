/**
 * List ADT interface
 * @author benmccalmon
 */

public interface ListInterface<ItemType> {
	/**
	 * Checks if the list is empty
	 * @return True if it's empty, false if not
	 */
	boolean isEmpty();
	/**
	 * Gets the length of the list
	 * @return An int of the current length of the list
	 */
	int getLength();
	/**
	 * Removes an entry from the given position
	 * @param pos - An index from 1 to getLength()
	 * @return True if successful, false if entry could not be found
	 */
	boolean remove(int pos);
	/**
	 * Clears the entire list
	 */
	void clear();
	/**
	 * Inserts an item into the given position
	 * @param newPos - An index from 1 to getLength() + 1
	 * @param item
	 * @return True if successful, false if the newPos is out of bounds
	 */
	boolean insert(int newPos, ItemType item);
	/**
	 * Adds an item to the end of the list
	 * @param item
	 * @return True if successful
	 */
	boolean add(ItemType item);
	/**
	 * Gets an entry from the requested position
	 * @param pos - An index from 1 to getLength()
	 * @return An entry
	 */
	ItemType getEntry(int pos);
	/**
	 * Replaces an entry at the given position with a new entry
	 * @param pos - An index from 1 to getLength()
	 * @param item
	 * @return The entry that was replaced
	 */
	ItemType replace(int pos, ItemType item);
	/**
	 * Checks if the list contains an item
	 * @param item
	 * @return True if found, false if not
	 */
	boolean contains(ItemType item);
}
