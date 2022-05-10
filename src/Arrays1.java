import java.util.Arrays;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {

        String[] AnswersOne = {"Bicycle","Car","Scooter","Train"};
        String[] AnswersTwo = {"0","1","2","3","4","5","6","7","8","9","10"};
        String[] AnswersThree = {"AnnaKarenina","CrimeandPunishment","NotesfromtheUnderground","TheKaramazovBrothers"};
        String[][] Answers = {AnswersOne,AnswersTwo,AnswersThree};
        String[] Questions = {"What is my favourite mode of transport?","How many pets did I have before?","Which item in this list is the odd one out?"};
        String[] CorrectAnswers = {"Bicycle","8","Anna Karenina"};
        String[] UserAnswers = {"","",""};
        String ans = "";
        Scanner input = new Scanner(System.in);
        int CorrectAnswersCount = 0;
        int i = 0;

        System.out.println("Welcome to my questionnaire!");
        do
        {
            System.out.println("1. " + Questions[i] + "\nPossible Answers:"); // Iterating through each question
            for (int j = 0; j < Answers[i].length; j++) // Iterating through each possible answer
            {
                System.out.println(Answers[i][j]);
            }
            //System.out.println("\n");
            ans = input.next();
            //System.out.println(ans);
            //System.out.println(Arrays.toString(Answers[i]));
            int index = Arrays.binarySearch(Answers[i], ans);   // Looking for the answer in the answer array.
            //System.out.println(index);
            if (index <= 0)
            {
                UserAnswers[i] = ans;
                i++;
            }
            else
            {
                if (i > 0) i--;
                System.out.println("Your answer is not an option.");
            }
        } while (i < 3);

        for (int k = 0; k < 3;k++)
        {
            if (UserAnswers[k].equals(CorrectAnswers[k]))
            {
                CorrectAnswersCount++;
            }
        }
        System.out.printf("You have scored %s out of 3 answers correct!",CorrectAnswersCount);
    }
}