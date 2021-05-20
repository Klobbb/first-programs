//Kaleb Haskell
//2/20/2020
//completed at 8:20AM

import java.util.Scanner; // program uses class Scanner
public class HaskellKalebInsertSort2202020
{
    public static void main(String args[])
    {
        int[] nums = new int[9];
        int name;
        int total=0;
        int high=0;
        int low=99999999;
        int range=0;
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );       

        for (int count = 0 ; count < nums.length; count++)
        {
            System.out.println("Please enter an integer.");
            nums[count] = input.nextInt();
            total+=nums[count];
            if (nums[count]<low)
            {
                low=nums[count];   
            }
            if (nums[count]>high)
            {
                high=nums[count];
            }
            range=high-low;
        }
        for (int j=0; j<nums.length; j++)
        {
            System.out.println(nums[j]);
        }
        // a is the name of the array
        // nElems stores the number of elements being sorted
        // This example is for sorting an array of ints
        int in, out;
        for(out=1; out<nums.length; out++) // out is dividing line 
        { 
            int dummy = nums[out]; // dummy Need to modify for sorting different types 
            in = out; // start shifts at out 
            while(in>0 && nums[in-1] >= dummy) // until one is smaller, 
            { 
                nums[in] = nums[in-1]; // Slide: shift item right, 
                in--; // go left one position 
            } 
            nums[in] = dummy; // Back: insert marked item 
        } // end for 
        System.out.println("The numbers in order...");
        for (int nam=0;nam<nums.length;nam++) // For each String nam in the array names.
        {System.out.println(nums[nam]);
        }
        System.out.println("The total is: "+total);
        System.out.println("The median is: "+nums[4]);
        System.out.println("The high is: "+high);
        System.out.println("The low is: "+low);
        System.out.println("The range is: "+range);
    }
}