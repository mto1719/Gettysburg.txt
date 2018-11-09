
public class Gettysburg {

public static void main(String[] args);
    {
     ArrayList<String> GettysburgAddress = new ArrayList<String>();
     Scanner file = new Scanner(new File(filename));
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

        double average = 0;
        if (count > 0) {
            average = sum / count;
        }
        System.out.println("Average word length = " + average);
        }

}
