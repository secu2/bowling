package bowling;

public class ComputeScore {
	
	public static int computeScore(int[] liste) throws IllegalArgumentException{
		
			return 0;
			//return score;
		}	
	
	
	private static boolean verify(int[] liste){
		
		for(int i = 0; i < liste.length; i++)
			if(liste[i] < 0 || liste[i] > 10) return false;
		
		return true;
	}
}
