package selfstudy;
/**
 * What happens when you mix static and non-static in the same class? 
 * In that case, it's legal for an instance method in the class to use static member variables or call static member subroutines.
 * An object knows what class it belongs to, and it can refer to static members of that class.
 * But there it only one copy of the static member, in the class itself.
 * Effectively, all the objects share one copy of the static member.
 * @author Gebruiker
 * Although there is an ID variable in each student object, there is only one nextUniqueID variable.
 * every student get his unique student ID,and can't be changed by others
 * however
 * In a multi-threaded program, it is possible that two threads are creating Student objects at exactly the same time, 
 * and it becomes possible for both objects to get the same ID number.
 *
 */
public class StudentWithStatic_and_nonStatic_Instance {
	 private String name;                 // Student's name.
	   public double test1, test2, test3;   // Grades on three tests.
	   
	   private int ID;  // Unique ID number for this student.

	   private static int nextUniqueID = 0;
	             // keep track of next available unique ID number
	   
	   public StudentWithStatic_and_nonStatic_Instance(String theName) {
	        // Constructor for Student objects; provides a name for the Student,
	        // and assigns the student a unique ID number.
	      name = theName;
	      nextUniqueID++;
	      ID = nextUniqueID;
	   }
	   
	   public String getName() {
	        // Getter method for reading the value of the private
	        // instance variable, name.
	      return name;
	   }
	   
	   public int getID() {
	        // Getter method for reading the value of ID.
	      return ID;
	   }
	   
	   public double getAverage() {  
	        // Compute average test grade.
	      return (test1 + test2 + test3) / 3;
	   }
}
