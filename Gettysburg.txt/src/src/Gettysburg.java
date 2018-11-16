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
Scanner in = new Scanner(new File("Gettysburg"));
while (in.hasNext())
{
words.add(in.next());
}
while (in.hasNext()) 
{
String word = in.next();
double charNum = word.length();
sum = charNum + sum;
count++;
}
if (count > 0) 
{
average = sum / count;
}
for(int i = 0; i < word.size(); i++)
{
largestString = word.size();
}
System.out.println("Average word length = " + average);
System.out.println("The longest word is " + largestString);
}
}
