import java.util.HashMap;

/**
 * Represents the inventory of a physical grocery store.
 */
public class Inventory {

	private final String aName; // Unique
	private final HashMap<ItemInterface, Integer> aInventory = new HashMap<>();

	/**
	 * Creates a new inventory with no items in it, and identified uniquely with
	 * pName.
	 * 
	 * @param pName
	 *            A unique identifier for this inventory.
	 */
	public Inventory(String pName) {
		aName = pName;
	}

	/**
	 * @return The unique name of this inventory.
	 */
	public String getName() {
		return aName;
	}

	/**
	 * Adds pQuantity number of items to the inventory.
	 * 
	 * @param pItem
	 *            The type of item to add.
	 * @param pQuantity
	 *            The amount to add.
	 */
	public void stock(ItemInterface pItem, int pQuantity) {
		int amount = 0;
		if (aInventory.containsKey(pItem)) {
			amount = aInventory.get(pItem);
		}
		amount += pQuantity;
		aInventory.put(pItem, amount);
	}

	/**
	 * Removes pQuantity of items from the inventory, for example by selling
	 * them or tossing them in the garbage.
	 * 
	 * @param pItem
	 *            The type of item to dispose of
	 * @param pQuantity
	 *            The amount to dispose.
	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public void dispose(ItemInterface pItem, int pQuantity) {
		int amount = aInventory.get(pItem);
		amount -= pQuantity;
		aInventory.put(pItem, amount);
	}

	/**
	 * @param pItem
	 *            The item to check for availability.
	 * @return How many of the items are available in the inventory.
	 */
	public int pAvailable(ItemInterface pItem) {
		if (aInventory.containsKey(pItem)) {
			return aInventory.get(pItem);
		} else {
			return 0;
		}
	}

}
