package guessgame;

public class Game {
	private int expectedGuess;
	Player p1,p2,p3;
	
	public Game(String name1,String name2,String name3) {
		p1 = new Player(name1);
		p2 = new Player(name2);
		p3 = new Player(name3);
	}
	private boolean checkWin() {
		if(p1.guess == expectedGuess) {
			System.out.println(p1.name+" wins!");
			return true;
		}
		else if(p2.guess == expectedGuess) {
			System.out.println(p2.name+" wins!");
			return true;
		}
		else if(p3.guess == expectedGuess) {
			System.out.println(p3.name+" wins!");
			return true;
		}
		else {
			return false;
		}
	}
	
	public void start() {
		System.out.println("Welcome to Game : "+p1.name+" "+ p2.name+"  "+p3.name);
		expectedGuess = (int)(Math.random()*10);
		System.out.println("Number to Guess is : "+expectedGuess);
		
		while(true) {
			p1.makeGuess();
			p2.makeGuess();
			p3.makeGuess();
			boolean isWin = checkWin();
			if(isWin) {
				System.out.println("Game Over!!!");
				break;
			}
			else {
				expectedGuess = (int)(Math.random()*10);
				System.out.println("Number to Guess is : "+expectedGuess);
			}
		}
	}
}
