/*********************************************************************
 Author : Kierstin Matsuda
 Course : OS section. COP 3767 Section RVC
 Professor : Caryl Rahn
 Program #1 : Assignment 1
             This program prints a 10 by 10 table where the numbers
             in the table are the product of its row and column. 
             There are stats printed after the table about the sum
             of the table, and odd rows in the table.

 Due Date  : 09/24/2017

 Certification: 
 I hereby certify that this work is my own and none of it is the work of any other person. 
 ..........{ Kierstin Matsuda }..........
*********************************************************************/
//import java.util.Array;
/**
 * 
 * @author Kierstin
 */
public class ArrayMath
{
    public static int ROW = 10;
    public static int COLUMN = 10;

    /**
     * 
     * @param args 
     * @author Kierstin
     */
    public static void main(String[] args)
    {
        
        int[][] anArray = new int[ROW][COLUMN];

        Array(anArray);
        
    }


    /**
     * This method will print a title for a table,
     * then in a nested for loop, fill the two-dimensional array
     * with the product of each location's row and column. Then, print it
     * to the table, then add it to the arrayTotal (sum of every number
     * in the array) 
     * The last thing the method does is calculate the odd columns sum
     * and print it below it, followed by some stats about the table.
     * @param 
     * @author Kierstin
     */
    public static void Array(int[][] array)
    {   
        String line = "___________________________________";
        int row = 0;
        int column = 0;
        int arrayTotal = 0;

        System.out.println("\n Table of sum of row and column");
        System.out.println(line);

        for(row = 0; row < ROW; row++)
        {
            for(column = 0; column < COLUMN; column++)
            {
                //filling array
                array[row][column] = row * column;
                //printing array in table
                System.out.printf("%5d", array[row][column]);
                //adding total of contents of array
                arrayTotal += array[row][column];

            }
            System.out.println("");
        }

        System.out.println("\n Totals of Odd Columns");
        System.out.println(line);

        int oddColumnTotal = 0;
        //add all values in odd columns, print total below its column
        for(column = 0; column < COLUMN; column++)
        {
            if(column % 2 == 1)
            {
                for(row = 0; row < ROW; row++)
                {
                    oddColumnTotal += array[row][column];
                }
                System.out.printf("%10d", oddColumnTotal);
                oddColumnTotal = 0;
            }       
        } 

        System.out.println("\n" + line);
        System.out.println("Sum of all numbers in the array: " + arrayTotal);
        System.out.println("\n Kierstin Matsuda, PID# 5656529");
          
    }
}