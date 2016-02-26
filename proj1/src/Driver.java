/**
 * Utility class with a driver program and some sample items and inventories.
 */
public final class Driver {

	private static final ItemInterface ITEM_CEREAL = new Item("Cereal", 1, 200);
	private static final ItemInterface ITEM_JAM = new Item("Jam", 2, 400);
	private static final ItemInterface ITEM_BUTTER = new Item("Butter", 3, 250);
	private static final ItemInterface[] ITEMS = { ITEM_CEREAL, ITEM_JAM, ITEM_BUTTER };

	private Driver() {
	}

	/**
	 * @param pArgs
	 *            Not used
	 */
	public static void main(String[] pArgs) {
		for (ItemInterface item : ITEMS) {
			System.out.println(item.getName());
		}
	}

}
