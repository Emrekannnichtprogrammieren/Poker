package Poker;

public class Poker {

	public static int anzKarten = 13;
	public static int anzFarben = 4;
	
	public static void befüllen (int[]hand) {
		for (int i = 0; i < hand.length; i++) {
				hand[i]=i;
		}
	}
	
	public static int[]ziehen(int[]hand) {
		for (int i = 0; i < anzFarben; i++) {
			hand[i]=hand[((int) (Math.random()*anzKarten))];
			ziehen[i]= hand[i];
		}
		return ziehen;
	}
	
	public static int farbe(int hand) {
		return hand/anzFarben;
	}
	
	public static int wert(int hand) {
		return hand%anzFarben;
	}
	
	public static void onePair(newHand[]) {
		for (int i = 0; i < newHand.length; i++) {
			for (int j = 1; j < newHand.length+1; j++) {
				if(newHand[i]==newHand[j]) {
					return true;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] hand = new int [anzKarten * anzFarben];
		befüllen(hand);
	/*	for (int i = 0; i < hand.length; i++) {
			System.out.println(hand[i]);
		}*/
	}

}
