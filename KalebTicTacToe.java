import java.util.Scanner;
/**
 * Program that is supposed to make a functioning tic-tac-toe game.
 *
 * @author Kaleb Haskell
 * @version 3/3/2020
 */
public class HaskellKalebTicTacToe
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        final char blank = '-';  
        final char X = 'x';  
        final char OH = 'o';   
        final int size = 3;//was 3 before edit
        int row=3;
        int col=3;
        char board[][] = new char[size][size]; 
        int xoro=0;
        row=0;
        col=0;
        for (int i=0;i<size;i++)
            for(int j=0;j<size;j++)
                board[i][j]=blank;
        
        System.out.println("Are you X or O? 1 for X, 2 for O. -1 to quit.");
        xoro=input.nextInt();
        while(xoro!=-1)
        {
            if (xoro==1)//was while
            {
                row=0;
                col=0;
                System.out.println("Which row do you want an X in?");
                row=input.nextInt();
                System.out.println("Which column do you want an X in?");
                col=input.nextInt();
                board[row][col]=X;
                for(int count=0;count<3;count++)
                {
                    for (int i=0;i<3;i++)
                    {
                        System.out.print(board[count][i]+" ");
                    }
                    System.out.println();
                }
                //System.out.println("Are you X or O? 1 for X, 2 for O. -1 to quit.");
                //xoro=input.nextInt();
            }
            if (xoro==2)//was while
            {
                row=0;
                col=0;
                System.out.println("Which row do you want an O in?");
                row=input.nextInt();
                System.out.println("Which column do you want an O in?");
                col=input.nextInt();
                board[row][col]=OH;
                for(int count=0;count<3;count++)
                {
                    for (int i=0;i<3;i++)
                    {
                        System.out.print(board[count][i]+" ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Are you X or O? 1 for X, 2 for O. -1 to quit.");
                xoro=input.nextInt();
        }
        //System.out.println("Are you X or O? 1 for X, 2 for O. -1 to quit.");
        //  xoro=input.nextInt();
        // return;
    }
}