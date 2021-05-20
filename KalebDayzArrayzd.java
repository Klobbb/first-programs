
/**
 * Write a description of class DayzArrayzd here.
 *  This program is to fill a 5 x 5 array with random values that 
 *  range from 1 t0 50
 *  Then... Show all of the values from the array in a grid
 *  Then..
 *  Go through the array and find and show the highest value in an array
 * @author Mr. Smith
 * @version 0.952   3/5/2020
 */
public class HaskellKalebDayzArrayzd
{
    public static void main(String [] args)
    {
        int biggie=0;
        int grid[][] = new int[5][5];
        for(int row=0;row<5;row++)
        {
            for (int col=0;col<5;col++) 
            {
                grid[row][col] =(int)(50*Math.random()) + 1;

                System.out.println(grid[row][col]);

                //for row = 0 to 5 
                //for col = 0 to 5 
                if (grid[row][col]>biggie)
                { biggie=grid[row][col];
                }
            }
        }
        System.out.println("The highest value is "+biggie);
    }
}