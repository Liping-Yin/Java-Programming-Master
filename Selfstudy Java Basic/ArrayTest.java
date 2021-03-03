package selfstudy;

public class ArrayTest {

	public static void main(String[] args) {
		/**
		 * understand what pointers and objects are related
		 * map them with the memory locations when you create everything
		 */
		int[] list= new int[3]; //arrays are object,int[] is an array type,array is a class type
		int[] newlist;
		list[1]=3;
		newlist=list;  // they point to the same object(the same memory location)
		newlist[1]=7;
		System.out.println(list[1]);//output will be 7, since the newlist points to the same object
		
		/**
		 * the base type of an array can be a type of class
		 * (String is a class type)
		 * @author Gebruiker
		 * class in a class
		 * we store pointers in a array class
		 */
		Student[] classlist;//declare a variable of type Student[]<array> 
		
		classlist=new Student[30];// variable now points to the array class(may include 30 element os type Student)
		
		for (int i=0;i<30;i++) {
			classlist[i]= new Student();//each classlist[i] points to an object of type Student.
		}
		/*
		 * The array has 30 elements, classlist[0], classlist[1], ... classlist[29].
		 *  When the array is created, it is filled with the default initial value, which for an object type is null. 
		 *  So, although we have 30 array elements of type Student, we don't yet have any actual Student objects!
		 *   All we have is 30 nulls. If we want student objects, we have to create them:
		 */
	
	
	}

}
