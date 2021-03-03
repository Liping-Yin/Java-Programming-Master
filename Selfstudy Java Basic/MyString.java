package selfstudy;

public class MyString {

	public static void main(String[] args) {
	   String myString="\u0044";//Unicode can also be used inside the literals of string type
	   ;//only the";" without actual blocks  means doing nothing in java;
	   //strings are immutable, once it is created it can't be changed
	   myString=myString+"good";// actually new strings are created,the old one is discarded.
	   //this kind of concatenation is not efficient
	   
	   System.out.println(myString);
	   System.out.println("test word".contains(" "));
	   System.out.println("test word".replaceAll("\\s","").contains(" "));
	   System.out.println("test word".replaceAll("\\s","").length()>=6&&"test word".contains(" "));
	   System.out.println("test word".replaceAll("\\s","").length()<6||"test word".contains(" "));
	   System.out.println("test word".replaceAll("\\s","").length());
	   
	}

}
