/*
 * Matthew To
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
public class Gettysburg 
{
public static void main(String[] args) throws FileNotFoundException
{
int count = 0;
double sum = 0;
double average = 0;
int largestString = 0;
ArrayList<String> words = new ArrayList<String>();
Scanner in = new Scanner(new File("C:\\Users\\ThePC\\eclipse-workspace\\GettysburgProject\\src\\GettysburgAddress"));
while (in.hasNextLine())
{
words.add(in.nextLine());
}
while (in.hasNextLine()) 
{
String userInput = in.next();
double charNum = userInput.length();
sum = charNum + sum;
count++;
if (count > 0) 
{
average = sum / count;
}
for(int i = 0; i < words.size(); i++)
{
if(words.get(i).length() > largestString) 
{
largestString = words.get(i).length();
}
}
in.close();
System.out.println("Average word length = " + average);
System.out.println("The longest word is = " + largestString);
}
}
}
