
public class Gettysburg {

public static void main(String[] args);{
    int count = 0;
    double sum = 0;
    double average = 0;

    while (sc.hasNext()) {

        String userInput = sc.next();

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
