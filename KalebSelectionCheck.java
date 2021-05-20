//Program to take 5  names and sort them
//Kaleb Haskell
//2/13/2020
import java.util.Scanner; // program uses class Scanner
public class HaskellKalebSelectionCheck
{
    public static void main(String args[])
    {
        String[] names = new String[5];
        String name;
        // create Scanner to obtain input from command window
        Scanner input = new Scanner( System.in );       

        for (int count = 0 ; count < names.length; count++)
        {
            System.out.println("Please enter a name");
            names[count] = input.next();
        }
        for (int j=0; j<names.length; j++)
        {
            System.out.println(names[j]);
        }
        //Insert Sort Code here
        //a changed into 'names'
        int pass, check, mark;
        String dummy;  
        for (pass=0; pass<names.length-1; pass++)  
        { 
            mark = pass;  
            for(check=pass+1; check<names.length; check++) 
            {
                if(names[check].compareTo(names[mark])<0)  
                    mark = check;
            }
            dummy = names[pass]; 
            names[pass] = names[mark];
            names[mark] = dummy;
            for (int s=0;s<names.length; s++)
            {
                System.out.print(names[s] +" ");
            }
            System.out.println();
        } // end for(pass) 

        System.out.println("The names ...");
        for (String temp: names) // For each String temp in the array names.
        {    
            System.out.println(temp);
        }
    }
}