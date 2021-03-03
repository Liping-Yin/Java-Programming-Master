package selfstudy;

public class PrimitiveTypes {

	public static void main(String[] args) {
		//java use wrapper class for all eight primitive types
		int myMinIntValue=Integer.MIN_VALUE ;// 4 bytes,minimum integer
		int myMaxIntValue=Integer.MAX_VALUE ;
		int myMinIntValueTest=-2_147_483_649;//test if a number is underflow /minimum number-1;
											//you can use underscore to demonstrate numbers / maximum number +1;
		int myMaxIntValueTest=2147483648;//test if a number is overflow */ 
		char myUnicodeChar='\u0044';// using"\u" to get unicode to represent a char; char 2 bytes
		char myChar='D';// using unicode to represent a char
		
		boolean myTrueBoolean =true;//1 bit;
		
	
		long myLong=123L;//8 bytes
		System.out.printf("%,d",myMinIntValue);//format printout
		System.out.println("the maximum integer is :"+myMaxIntValue);
		System.out.println(" "+myTureBoolean);
		System.out.println(myUnicodeChar);
		System.out.println(myChar);
		//System.out.println(myString);
		//System.out.println(""+myByte);
}
}
