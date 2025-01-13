package examen3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Vector2Dtest {

	public Vector2D v1 = new Vector2D(0, 0);
	public Vector2D v2 = new Vector2D(0, 0);
	public Vector2D v3 = new Vector2D(0, 0);
	@Before
	public void setUp() {
		 this.v1 = new Vector2D(-2, 4);
		 this.v2 = new Vector2D(1, 2);
		 this.v3 = new Vector2D(2, 1);
	}
	
	@Test
	public void testDotProduct() {
		assertEquals(6, v1.dotProduct(v2));
		assertEquals(0, v1.dotProduct(v3));
	}

	@Test
	public void testIsOrthogonalTo() {
		assertTrue(v1.isOrthogonalTo(v3));
		assertFalse(v2.isOrthogonalTo(v3));
	}


}
