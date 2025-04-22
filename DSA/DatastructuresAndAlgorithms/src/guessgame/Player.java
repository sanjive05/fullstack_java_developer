package guessgame;

public class Player {
	String name;
	int guess;
	
	
	public Player(String name) {
		super();
		this.name = name;
	}


	void makeGuess() {
		this.guess =(int) (Math.random()*10);
		System.out.println(name+" is guessing : "+guess);
	}

}
