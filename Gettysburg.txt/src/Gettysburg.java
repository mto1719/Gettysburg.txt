
public class Gettysburg {

public static void main(String[] args);
    {
     ArrayList<String> GettysburgAddress = new ArrayList<String>();
     Scanner file = new Scanner(new File(GettysburgAddress));
      while (file.hasNext()) 
	{
	 word = file.next();
	 } 
    int count = 0;
    double sum = 0;
    double average = 0;

    while (file.hasNext()) {

        String userInput = file.next();

        double charNum = userInput.length();
        sum = charNum + sum;
        count++;
        if (count > 0) {
            average = sum / count;
        }
	int largestString = Str.get(0).length();
	int index = 0;
	if(Str.get(i).length() > largestString) 
	{
        largestString = Str.get(i).length();
        index = i;
        }
        System.out.println("Average word length = " + average);
	System.out.println("Index " + index + " "+ Str.get(index) + " " + "is the largest and is size " + largestString);
        }

}
