package cfranc.hanoi;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisqueTest {

	@Test
	public void testCompareTo() {
		Disque petit = new Disque(1);
		Disque moyen = new Disque(2);
		Disque grand = new Disque(3);
                Disque grand2 = new Disque(3);
		assertEquals(-1, petit.compareTo(moyen));
		assertEquals(-1, moyen.compareTo(grand));
		assertEquals(1, moyen.compareTo(petit));
		assertEquals(1, grand.compareTo(moyen));
        assertEquals(0, grand.compareTo(grand2));
	}

}