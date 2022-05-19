package aaa.practiceJava.Object_Oriented_Programming2;

abstract class Player {
	
	boolean pause;
	int currentPos;
	
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player {
	void play(int pos) {
		System.out.println(pos);
	}
	void stop() {System.out.println("stop");}
}

public class AbstractEx{

	public static void main(String[] args){
		
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
		
	}
}