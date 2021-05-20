import java.util.ArrayList;
import java.util.Scanner;
/**
 * Program to collect an unknown amount of names then print them backwards using an Arraylist.
 *
 * @author Kaleb Haskell
 * @version 3/10/2020
 */
public class HaskellKaleb1stArrayList
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        ArrayList <String> names = new ArrayList<String>();
        String name;
        System.out.println("Enter a name. -1 to stop.");
        name = input.next();

        while (!name.equals("-1"))
        {
            names.add(name);
            System.out.println("Enter a name. -1 to stop.");
            name = input.next();
        }
        for(int count = names.size()-1;count>=0;count--)
            System.out.println(names.get(count));
    }
}