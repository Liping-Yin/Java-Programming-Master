package selfstudy;

public class StringBuilderClass {
/**
 * A string can be built up from smaller pieces using the + operator, but this is not always efficient.
 *  If str is a String and ch is a character, then executing the command "str = str + ch;" 
 *  involves creating a whole new string that is a copy of str, with the value of ch appended onto the end. 
 *  Copying the string takes some time. Building up a long string letter by letter would require a surprising amount of processing.
 *  The class StringBuilder makes it possible to be efficient about building up a long string from a number of smaller pieces. 
 * @param args
 */
	public static void main(String[] args) {
		StringBuilder  builder=new StringBuilder();
		String str="Happy birthday";
		builder.append(str);// it is possible to add new characters onto the end of a StringBuilder 
							//without continually making copies of the data that it already contains. 
		builder.append('a');
		builder.append('B');
		builder.toString();// return a copy of the string in the builder as an ordinary value of type String.
		System.out.println(builder);

	}

}
