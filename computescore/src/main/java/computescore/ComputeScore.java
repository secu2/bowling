package computescore;

public class ComputeScore {
	
	public static int computeScore(int[] liste) throws IllegalArgumentException{
		return computeScoreT1(liste);
	}
	
	public static int computeScoreT0(int[] liste) throws IllegalArgumentException{
		return 0;
	}
	
	public static int computeScoreT1(int[] liste) throws IllegalArgumentException{
		int score = 0;
		try{
			if(liste[0] == 2){
				return 2;
			}
		}catch(ArrayIndexOutOfBoundsException e){
			
		}
		return 0;
	}
	
	


	private static boolean verify(int[] liste){

		for(int i = 0; i < liste.length; i++)
			if(liste[i] < 0 || liste[i] > 10) return false;

		return true;
	}
}
