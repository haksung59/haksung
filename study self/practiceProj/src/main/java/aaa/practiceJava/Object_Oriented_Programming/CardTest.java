package aaa.practiceJava.Object_Oriented_Programming;

public class CardTest {

	public static void main(String[] args) {
		
		System.out.println("카드 가로 : " + Card.width);
		System.out.println("카드 세로 : " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 1;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 9;
		
		System.out.println("c1 카드 크기 : 가로-" + c1.width + ", 세로-"+c1.height);
		System.out.println("c2 카드 크기 : 가로-" + c2.width + ", 세로-"+c2.height);

		c1.width = 50;
		c1.height = 80;
		
		System.out.println("-----c1 카드 크기 변경-----");
		
		System.out.println("c1 카드 크기 : 가로-" + c1.width + ", 세로-"+c1.height);
		System.out.println("c2 카드 크기 : 가로-" + c2.width + ", 세로-"+c2.height);		//static(클래스변수)이므로 width, height c2에도 공유
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 100;
	static int height = 250;
}