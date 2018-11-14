/*
 * Matthew To
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Gettysburg {

public static void main(String[] args) throws FileNotFoundException
    {
	int count = 0;
   	double sum = 0;
    	double average = 0;
	ArrayList<String> word = new ArrayList<String>();​
	Scanner file = new Scanner(new File("S:\\git\\GettysburgA.txt\\Gettysburg.txt\\src\\Gettysburg"));
	while (file.hasNext()) 
	{
	word = file.next();
	}  
	int wordL = word.length();
    while (file.hasNext()) 
    {
        String userInput = file.next();
        double charNum = userInput.length();
        sum = charNum + sum;
        count++;
        if (count > 0) 
        {
            average = sum / count;
        }
	int largestString = wordL;
	if(wordL > largestString) 
	{
        largestString = wordL;
    }
    	System.out.println("Average word length = " + average);
	System.out.println("the largest word is " + largestString);
    }
}
}
