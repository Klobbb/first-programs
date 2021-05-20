import java.util.Scanner;
import java.util.ArrayList;
/**
 * Program that will take 5 compliments and give a random one to the user.
 *
 * @author Kaleb Haskell
 * @version 3/12/2020
 */
public class HaskellKalebComplimentGenerator
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        
        ArrayList<String>  compliments = new ArrayList<String>();
	System.out.println("Would you like a compliment? -1 for no compliments :(");
	int uknowuwantit=0; uknowuwantit=input.nextInt();
	if (uknowuwantit==-1)
	{
	    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿");
	    System.out.println("⣿⣿⣿⣿⣿⣿⣿⡿⢿⣿⣿⣿⠀⣿⣿⣿⡿⠻⣿⣿⣿⣿⣿⣿⣿");
	    System.out.println("⣿⣿⣿⣿⣿⣿⣿⣷⡈⠻⣿⣿⠀⣿⣿⡟⢁⣾⣿⣿⣿⣿⣿⣿⣿");
	    System.out.println("⣿⣿⣿⡿⠏⠀⠙⣿⣿⣦⣿⣿⣿⣿⣿⣤⣿⣿⠋⠀⠹⢿⣿⣿⣿");
	    System.out.println("⣿⡿⠇⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠸⢿⣿");
	    System.out.println("⣿⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⣿");
	    System.out.println("⣿⠀⠀⠀⠀⠀⠀⠀⢸⣿⣿⣿⣿⣿⣿⣿⡇⠀⠀⠀⠀⠀⠀⠀⣿");
	    System.out.println("⣿⠀⠀⠀⠀⠀⠀⠀⠸⠛⠉⠉⠿⠉⠉⠛⠇⠀⠀⠀⠀⠀⠀⠀⣿");
	    System.out.println("⡏⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣴⣿⣦⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹");
	    System.out.println("⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿");
	    System.out.println("⣿⣧⠀⠀⠀⠀⠀⠀⣠⣾⣿⣿⣿⣿⣿⣷⣄⠀⠀⠀⠀⠀⠀⣼⣿");
	    System.out.println("⣿⣿⠀⠀⠀⠀⠀⠀⣿⣿⣿⣿⣿⣿⣿⣿⣿⠀⠀⠀⠀⠀⠀⣿⣿");
	    System.out.println("⣿⣿⣀⣀⣀⣀⣀⣿⣿⣿⣿⣿⣿⣿⣿⣿⣀⣀⣀⣀⣀⣀⣿⣿");
	   }
	while (uknowuwantit!=-1)
	{
	    compliments.add(new String("Your pockets look very useful today"));
	    compliments.add(new String("Your voice sounds like a thousand cats purring."));
	    compliments.add(new String("People at trivia night are terrified of you."));
	    compliments.add(new String("You think of the funniest names for wi-fi networks."));
	    compliments.add(new String("Your nose is very efficient."));
	    compliments.add(new String("Your eyebrows compliment your shoes."));
	    compliments.add(new String("Everyone at sleepovers thought you were the bravest during thunderstorms."));
	    compliments.add(new String("Your neck posture is good."));
	    compliments.add(new String("Be yourself, man.. Live your life"));
	    compliments.add(new String("Your humor is humorous."));
	    compliments.add(new String("Nice hair."));
	    compliments.add(new String("You have a unique personality."));
	    
	    String random= compliments.get((int)(compliments.size()*Math.random()));
	    System.out.println(random);
	    System.out.println("Would you like a compliment? -1 for no compliments :(");
	    uknowuwantit=input.nextInt();
	   }

    }
}
