public class ItemDecorator implements ItemInterface {

	private final ItemInterface aItem;

	public ItemDecorator(ItemInterface pItem) {
		aItem = pItem;
	}

	@Override
	public String getName() {
		return "ITEM-" + aItem.getName();
	}

	@Override
	public int getId() {
		return aItem.getId();
	}

	@Override
	public int getPrice() {
		return aItem.getPrice();
	}

}
