import java.util.Scanner;
/**
 * Program made to calculate the number of times a pair of 6-sided-dice 
 * were rolled.
 *
 * @author Kaleb Haskell
 * @version 2/6/2020
 */
public class HaskellKalebTallyAway
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int [ ] tally = new int [13];
        int roll1=0;
        int roll2=0;
        int roll=0;
        for (int count=0; count<1000;count++)
        {
         roll1 = (int)(6*Math.random())+1;
         roll2 = (int)(6*Math.random())+1;
         roll=roll1+roll2;
         tally[roll]++;
        }
        for (int count=2;count<=12;count++)
        {
        System.out.println("starting at 2 and going up to 12, this is how many times each number was rolled: \n "+tally[count]);
        }
        }
}
