package selfstudy;

public class Constructor {
/**
 * only modifiers that can be used on a constructor definition are the access modifiers public, private, and protected. 
 * (In particular, a constructor can't be declared static.)
 * 
 * The system provides a default constructor for a class only if the class definition does not already include a constructor.
 * you can create many constructors inside a class with different statements in it,like design value to the instance variables or call subroutines
 * 
 * regard constructor call as a expression(new class_name(parameter_list)),since it returns a value to the reference. 
 * you can use this expression as a parameter in a subroutine call or as part of a more complex expression. 
 * Of course, if you don't save the reference in a variable, you won't have any way of referring to the object that was just created.
 * @param args
 */
	public static void main(String[] args) {
		PairOfDice test= new PairOfDice();//constructor allocate memory and initialize instance variables.
		System.out.printf("dice1 is %d and dice2 is %d \n", test.die1,test.die2);//if no constructor has been defined inside the class,then the value is default
		/**
		 *  the exact steps that the computer goes through to execute a constructor call:

1.First, the computer gets a block of unused memory in the heap, large enough to hold an object of the specified type.
2.It initializes the instance variables of the object. If the declaration of an instance variable specifies an initial value, then that value is computed and stored in the instance variable. Otherwise, the default initial value is used.
3.The actual parameters in the constructor, if any, are evaluated, and the values are assigned to the formal parameters of the constructor.
4.The statements in the body of the constructor, if any, are executed.
5.A reference to the object is returned as the value of the constructor call.
		 */
		test.roll();
		System.out.printf("dice1 is %d and dice2 is %d \n", test.die1,test.die2);
		

	}

}
