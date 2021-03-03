package selfstudy;
/**
 * whenever the object is created,every time a new PairOfDice is created,
 *  the dice are initialized to random values, as if a new pair of dice were being thrown onto the gaming table. 
 * @author Gebruiker
 *
 */
public class PairOfDice {


	    public int die1 = (int)(Math.random()*6) + 1;
	    public int die2 = (int)(Math.random()*6) + 1;
	 
	    public void roll() {
	         die1 = (int)(Math.random()*6) + 1;
	         die2 = (int)(Math.random()*6) + 1;
	    }
	    
	} // end class PairOfDice


