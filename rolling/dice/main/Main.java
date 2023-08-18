package rolling.dice.main;

import rolling.dice.play.RollDice;
/*
 * count variable define how many times you reached at postion(100)
 * but initially zero
 */
public class Main {
 public static int count=0;
	public static void main(String[] args) {
		RollDice roll = new RollDice();
	    roll.play(0);  
	    System.out.println("Number of counts :"+count);
	}

}
