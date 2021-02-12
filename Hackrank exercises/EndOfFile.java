import java.io.*;
import java.util.*;

public class EndOfFile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        System.out.println("input a file: " );
        int i = 0;
        while(scan.hasNextLine()){
            System.out.println(++i + " " + scan.nextLine());
        }
    }
}