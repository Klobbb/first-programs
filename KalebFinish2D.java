
/**
 * Write a description of class Finish2D here.
 *  This progam is to find the total and average of all the elements in a 2D array.
 *  
 * @author Kaleb Haskell - Smith
 * @version 1.0 3/9/2020
 */
public class HaskellKalebFinish2D
{
    public static void main(String [] args)
    {
        int [][] grid = {{3,2,7},{5,6, 10},{2,1,6},{8, 4, 3}};
        int total=0;
        int avg=0;
        System.out.println();
        for (int row = 0; row< grid.length; row++)
        { 
            for (int col = 0; col<grid[0].length; col++)
               { System.out.print(grid[row][col] + " ");
                total+=grid[row][col];
            avg=total/12;}
            System.out.println();
        }
        System.out.printf("Total: %d", total);
        System.out.println();
        System.out.printf("Average: %d", avg);
    }
    
    
}