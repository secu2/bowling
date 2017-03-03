package genTriangleRectangle;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.contrib.theories.DataPoint;
import org.junit.contrib.theories.DataPoints;
import org.junit.contrib.theories.FromDataPoints;
import org.junit.contrib.theories.Theories;
import org.junit.contrib.theories.Theory;
import org.junit.runner.RunWith;

@RunWith(Theories.class)
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
	
/*	@Theory
	public void testFunctionTheory(@FromDataPoints("a values") float[] a, 
    		@FromDataPoints("b values") float[] b, 
    		@FromDataPoints("q values") float q) {
		
		float[] c = TriangleRectangle.GenTriangleRectangle(a, b, q);

		assertEquals(TriangleRectangle.getLongeurCarre(a, b) + TriangleRectangle.getLongeurCarre(a, c), TriangleRectangle.getLongeurCarre(b, c),0.0f);
	}
	
	@DataPoints("a values")
    public static float[][] floatsA(){
		return new float[][]{
			new float[]{
				8, 2
			},
			new float[]{
				7, 9
			},
			new float[]{
				0, 6
			}
		};
    }
	
	@DataPoints("b values")
    public static float[][] floatsB(){
		return new float[][]{
			new float[]{
				8, 2
			},
			new float[]{
				7, 9
			},
			new float[]{
				0, 6
			}
		};
    }
	
	@DataPoints("q values")
	public static float[] floatQ(){
		return new float[]{
			1, 8, 9
		};
	}
	   

    @Theory
    public void testTriangle(@FromDataPoints("a values") float[] a, 
    		@FromDataPoints("b values") float[] b, 
    		@FromDataPoints("q values") float q) {
    	
    	float[] c = TriangleRectangle.GenTriangleRectangle(a, b, q);
    	
    	
    	int x = 0;
    	int y = 1;
  
    	
    	// (xb-xa)²+(yb-ya)² + (xc-xa)²+(yc-ya)² = (xb-xc)²+(yb-yc)² 
    	assertTrue(
	    			c(b[x]-a[x]) + c(b[y]-a[y])
	    			+ c(c[x]-a[x]) + c(c[y]-a[y])
	    			== c(b[x]-c[x]) + c(b[y]-c[y])
    			);
	}
    
    *//**
     * Carré
     * @param x
     * @return carré de x
     *//*
    private float c(float x){
    	return x*x;
    }*/
}
