import java.util.Scanner;
/**
 * Bubble sort!! :D
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HaskellKalebBubbleSort
{
    public static void main(String args[])
    {   
        Scanner input = new Scanner(System.in);
        int [ ] array = new int [100];
        int dummy=0;
        int roll=0;
        for(int countyboi=0;countyboi<array.length-1;countyboi++)
        {
            roll = (int)(50*Math.random())+1;
            array[countyboi]=roll;
            System.out.println(array[countyboi]+" ");
            
        }
        
        for (int pass=0; pass<array.length-1;pass++)
        {

            for (int check=0;check<array.length-1;check++)
            {
                if(array[check]>array[check+1])
                {
                    dummy=array[check];
                    array[check]=array[check+1];
                    array[check+1]=dummy;
                }

            }   
        }
        for (int finalprint=0; finalprint<99;finalprint++)
        {
            System.out.println(array[finalprint]+" "); 
        }
    }
}
