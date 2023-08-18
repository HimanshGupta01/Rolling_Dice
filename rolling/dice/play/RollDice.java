package rolling.dice.play;

import java.util.Random;
import java.util.Scanner;

import rolling.dice.main.Main;

public class RollDice {
    Random rand = new Random(); // rand object of random class
    Scanner sc = new Scanner(System.in); // sc object of Scanner class
    static int prv_position=0; // it holds the prveious position of player;
    
    // This method invoke while position = 100
	public void play(int position) {
		
		if(position==100) {
			System.out.println("Finished");
			return;
		}
		
		int num = (int)rand.nextInt(7); // define range 0 t0 7
		if(num==0) num++;
	
		String user = sc.nextLine();
		System.out.println("Dice Rolled :"+num);
		Main.count++;
		if(position+num <= 100) {
			prv_position=position;
			position=position+num;
		}
		
		System.out.println("(current postion , prvious position , dice value) : {"+position+","+prv_position+","+num+" }");
		System.out.println("-------------------------------");
		
		play(position);	
	}

}
