package selfstudy;
/**
 * these comments are used as notes to my understanding not java doc for project
 * @author Gebruiker
 *
 */
public class MyMethod {

	//try to understand class ,variables,statements,methods,expressions,blocks,conditions
	// the OOP is designed to make things much more conveniently and efficiently for using 
	// once class and methods are created you can reuse them forever.
	public static void main(String[] args) {
		setScore(50);//choice 1: to call the method with a direct designated parameter.
		int score=50;
		setScore(score);//choice 2:declare a variable and assign a value to it ,them parse the variable to the method.

		int finalScore;
		finalScore=getScore(50);//this is how the return value used;
		System.out.println(finalScore);
	}
	/*
	 * @param by using parameters, values can be parsed into the method,that can make use of method more efficiently
	 * which means you don't need to created this inside every method ,besides variables inside a method can't be reached 
	 * and changed from outside without parameters.
	 */
	public static void setScore(int score) {
		int finalScore=score*12;// declare variables inside a method much like the local variables,
									//it will be destroyed after the method is excuted
		System.out.println(finalScore);
	}
	
	public static int getScore(int score) {
		int finalScore;// declare variables inside a method much like the local variables,
									//it will be destroyed after the method is excuted
		if (score>=90)
		{
			finalScore=score*12;
			return finalScore;// be careful inside the block there is a return type,but you still need to make sure 
			//this method could get return value in the end 
		}
		return -1;//just make sure the syntax is right ,I just put -1 to represent fail score.
		/*
		 * else { finalScore=score*8; return finalScore; } // this can also work ,just make sure the method has return value;
		 */
		
	}
	
	
	

}
