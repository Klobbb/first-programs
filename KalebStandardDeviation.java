import java.util.Scanner;
/**
 * Program to get hiscore,loscore,avg,and number of scores within 3 of avg
 *
 * @author Kaleb Haskell
 * @version 2/4/2020
 */
public class HaskellKalebStandardDeviation
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int [ ] scores = new int [10];
        int high=0;
        int low=99999999;
        double avg=0;
        int total=0;
        for (int score=0;score<10; score++) 
        {
            System.out.println("Enter your scores below, one at a time.");
            scores[score] = input.nextInt();
            if (scores[score]>high)
            {
                high=(scores[score]);
            }
            if (scores[score]<low)
            {
                low=(scores[score]);
            }
            total+=scores[score];
            avg=(total/10);

            if ((scores[score]<avg+3)&&(scores[score]>avg-3))      
            {
                System.out.println("Numbers within 3 of avg:  " +scores[score]);
            }
            
        }
        System.out.println("AVG: " +avg);
        System.out.println("high: " +high);
        System.out.println("low: " +low);

    }
}
