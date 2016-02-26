import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestItemDecorator {

	private static ItemDecorator decoratedItem;

	@BeforeClass
	public static void setup() {
		Item item = new Item("Cereal", 1, 200);
		decoratedItem = new ItemDecorator(item);
	}

	@Test
	public void testGetName() {
		assertEquals("ITEM-Cereal", decoratedItem.getName());
	}

	@Test
	public void testGetId() {
		assertEquals(1, decoratedItem.getId());
	}

	@Test
	public void testGetPrice() {
		assertEquals(200, decoratedItem.getPrice());
	}

}
