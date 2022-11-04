package aaa.practiceJava.Object_Oriented_Programming2;

public class Deck {

	public static void main(String[] args) {
		
		CardDeck cd = new CardDeck();
		Card c = cd.pick(51);
		System.out.println(c);
		
		cd.shuffle();
		c = cd.pick(51);
		System.out.println(c);

	}

}

class CardDeck {
	
	final int card_num = 52;
	Card[] cardArr = new Card[card_num];
	
	CardDeck() {	//기본 순서
		int i = 0;
		
		for(int k = Card.kind_max; k >0; k--) {
			for(int n=1; n<Card.num_max+1; n++) {
				cardArr[i++] = new Card(k, n);
			}
		}
	}
	
	Card pick(int index) {
		return cardArr[index];
	}
	
	Card pick() {
		int index = (int)(Math.random() * card_num);
		return pick(index);
	}
	
	void shuffle() {
		for(int i=0; i<cardArr.length; i++) {
			int r = (int)(Math.random() * card_num);
			
			Card temp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = temp;
		}
	}
	
}

class Card {
	
	static final int kind_max = 4;
	static final int num_max = 13;
	
	static final int spade = 4;
	static final int diamond = 3;
	static final int heart = 2;
	static final int clover = 1;
	
	int kind;
	int number;
	
	public Card() {
		System.out.println("카드 뽑으소");
	}

	public Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}

	@Override
	public String toString() {
		
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK"; //10 = X
		
		return "Card [kind=" + kinds[this.kind] + ", number=" + numbers.charAt(this.number) + "]";
	}
	
	
}