package genTriangleRectangle;

import java.util.Arrays;

public class TriangleRectangle {
	 public static float[] GenTriangleRectangle (float[] a, float[] b, float q){
		 if (a.length != 2 || b.length != 2 || Arrays.equals(a, b)) throw new IllegalArgumentException();
		 return new float[] {(float) (a[0]+(a[1]-b[1])/Math.sqrt(q)),(float) (a[1]+(b[0]-a[0])/Math.sqrt(q))};
	 }

	 public static float getLongeurCarre(float [] a , float [] b) {
		 return (float) (Math.pow(a[0]-b[0], 2) + Math.pow(a[1]-b[1], 2));
	 }
}
