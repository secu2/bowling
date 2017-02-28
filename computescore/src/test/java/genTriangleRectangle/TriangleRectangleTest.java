package genTriangleRectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleRectangleTest {
	@Test(expected = IllegalArgumentException.class)
	public void testExceptionArgument() {
		TriangleRectangle.GenTriangleRectangle(new float[] {1}, new float [] {2,3}, 5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testExceptionSamePoint() {	
		System.out.println(TriangleRectangle.GenTriangleRectangle(new float[] {1,2}, new float [] {1,2}, 5));
	}
	
	@Test
	public void testFunction() {
		float[] a = {1.598F, 2.55F};
		float[] b = new float [] {4.5F, 3.1F};
		float q = 5;
		
		float[] c = TriangleRectangle.GenTriangleRectangle(a, b, q);

		assertEquals(TriangleRectangle.getLongeurCarre(a, b) + TriangleRectangle.getLongeurCarre(a, c), TriangleRectangle.getLongeurCarre(b, c),0.0f);
	}
}
