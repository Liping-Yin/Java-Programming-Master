package selfstudy;
import java.util.*;
public class UtilPackage {

	public static void main(String[] args) {
		int randNumber;
		int randNumber_Math;
	
		Random rand=new Random();
		randNumber=rand.nextInt(6)+1;
		 randNumber_Math=(int)(Math.random()*6)+1;
		 
		System.out.println(randNumber);
		System.out.println( randNumber_Math);
		System.out.println( new Date());
		
	}

}
