import java.util.Scanner;
/**
 * Write a description of class HaskellKalebArrayProgram1 here.
 *
 * @author Kaleb Haskell
 * @version 2/3/2020
 */
public class HaskellKalebArrayProgram1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int [ ] scores = new int [10];
        for (int score=0;score<scores.length; score++) 
        {
            System.out.println("Enter your scores below, one at a time.");
            scores[score] = input.nextInt();
        }
        for (int score=1; score<11;score++)
        {
            System.out.println(scores[scores.length-score]);
        }
    }
}
