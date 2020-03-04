package Poker;

public class Poker {

	public static int anzKarten = 13;
	public static int anzFarben = 4;
	
	public static int deck = 5;
	
	public static void befüllen (int[]hand) {
		for (int i = 0; i < hand.length; i++) {
				hand[i]=i;
		}
	}
	
	public static int[]ziehen(int[]hand) {
		int[] zieh = new int[deck];
		for (int i = 0; i < deck; i++) {
			int randomZahl =hand[((int) (Math.random()*(anzKarten*anzFarben - i)))];
			zieh[i]= hand[randomZahl];
		}
		return zieh;
	}
	
	public static int farbe(int hand) {
		return hand/anzFarben;
	}
	
	public static int wert(int hand) {
		return hand%anzKarten;
	}
	
	public static boolean onePair(int[]newHand) {
		for (int i = 0; i < newHand.length; i++) {
			for (int j = 1; j < newHand.length+1; j++) {
				if(newHand[i] == newHand[j]) {
					return true;
				}
			}
		}
		return false;
	}
	
	 public static int AnzahlDoppeltWert (int newHand[]) {
	        int AnzahlDoppelt = 0;
	        for (int i = 0; i < newHand.length; i++) {
	            for (int j = 0; j < newHand.length; j++) {
	                if ((newHand[i] % anzKarten == newHand[j] % anzKarten) && i != j) {
	                	AnzahlDoppelt++;
	                }
	            }
	        }
	        return AnzahlDoppelt;
	    }
	 
	 public static int AnzahlDoppeltTyp (int newHand[]) {
	        int AnzahlDoppelt = 0;
	        for (int i = 0; i < newHand.length; i++) {
	            for (int j = 0; j < newHand.length; j++) {
	                if ((newHand[i] / anzKarten == newHand[j] / anzKarten) && i != j) {
	                	AnzahlDoppelt++;
	                }
	            }
	        }
	        return AnzahlDoppelt;
	    }
	
	    public static boolean EinPaar(int[] newHand) {
	        return AnzahlDoppeltWert(newHand) == 2;
	    }
	        
	    public static boolean ZweiPaar(int[] newHand) {
	        return AnzahlDoppeltWert(newHand) == 4;
	    }
	    
	    public static boolean Drlling(int[] newHand) {
	        return AnzahlDoppeltWert(newHand) == 6;
	    }
	    
	    public static boolean Vierling(int[] newHand) {
	        return AnzahlDoppeltWert(newHand) == 8;
	    }
	    
	    public static boolean FullHouse(int[] newHand) {
	        return AnzahlDoppeltTyp(newHand) == 8;
	    }
	    
	    
	public static void main(String[] args) {
		int[] hand = new int [anzKarten * anzFarben];
		befüllen(hand);
		for (int i = 0; i < hand.length; i++) {
			System.out.println(hand[i]);
		}
		
		int[]zug = ziehen(hand);
		for (int i = 0; i < deck; i++) {
			System.out.printf(zug[i] + " ");
		}
		
	}

}
